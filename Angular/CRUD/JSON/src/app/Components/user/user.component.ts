import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common'; 
import { UserService } from '../../Services/user.service';
import { ToastrService } from 'ngx-toastr';
import { UserModel } from '../../Model/user';

@Component({
  selector: 'app-user',
  standalone: true,
  imports: [ReactiveFormsModule, CommonModule], 
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css'],
})
export class UserComponent implements OnInit {
  userList: UserModel[] = [];
  editMode: boolean = false;

  userForm!: FormGroup;

  departmentList: string[] = ['IT', 'HR', 'Sales', 'Accounts', 'Management'];

  constructor(
    private userService: UserService,
    private toastrService: ToastrService
  ) {}

  ngOnInit(): void {
    this.getUserList();
    
    this.userForm = new FormGroup({
      id: new FormControl(null), 
      department: new FormControl('', Validators.required),
      name: new FormControl('', Validators.required),
      mobile: new FormControl('', [Validators.required, Validators.pattern('^[0-9]{10}$')]),
      email: new FormControl('', [Validators.required, Validators.email]),
      gender: new FormControl('male', Validators.required),
      doj: new FormControl('', Validators.required),
      city: new FormControl('', Validators.required),
      salary: new FormControl(0, [Validators.required, Validators.min(1)]),
      address: new FormControl('', Validators.required),
      status: new FormControl(false)
    });
  }

  getUserList() {
    this.userService.getUsers().subscribe((res) => {
      this.userList = res;
    });
  }

  onSubmit(): void {
    if (this.editMode) {
      this.userService.updateUser(this.userForm.value).subscribe((res) => {
        this.getUserList();
        this.editMode = false;
        this.userForm.reset();
        this.toastrService.success('User updated successfully!', 'Success');
      });
    } else {
      this.userService.addUser(this.userForm.value).subscribe((res) => {
        this.getUserList();
        this.userForm.reset();
        this.toastrService.success('User added successfully!', 'Success');
      });
    }
  }

  onReset() {
    this.userForm.reset();
    this.editMode = false;
    this.getUserList();
  }

  onEdit(userData: UserModel) {
    this.userForm.patchValue(userData);
    this.editMode = true;
  }

  onDelete(id: any) {
    const isConfirm = confirm("Are you sure you want to delete this user?");
    if (isConfirm) {
      this.userService.deleteUser(id).subscribe((res) => {
        this.toastrService.error('User deleted successfully!', 'Deleted');
        this.getUserList();
      });
    }
  }
}
