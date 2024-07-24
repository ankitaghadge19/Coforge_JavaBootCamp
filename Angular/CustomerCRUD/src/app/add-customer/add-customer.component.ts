import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import {Customer} from '../customer';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { error } from 'console';
@Component({
  selector: 'app-add-customer',
  standalone: true,
  imports: [],
  templateUrl: './add-customer.component.html',
  styleUrl: './add-customer.component.css'
})
export class AddCustomerComponent implements OnInit{
  CustomerEmail: any;
  CustomerName: any;
  CustomerProduct: any;
  product: any;
  constructor(private customerservice:CustomerService){
      }
      customer:Customer=new Customer();
      submitted=false;
ngOnInit() {
  this.submitted=false;
 
}
 
customersaveform = new FormGroup({
  cust_name:new FormControl("",[Validators.required,Validators.minLength(5)]),
  cust_email:new FormControl("",[Validators.required,Validators.email]),
  product:new FormControl()
});
saveCustomer(saveCustomer: any){
  this.customer=new Customer();
  this.customer.cust_name=this.CustomerName.value;
  this.customer.cust_email=this.CustomerEmail.value;
  this.product=this.CustomerProduct.value;
  this.submitted=true;
  this.save();
 
}
 
save(){
  this.customerservice.createCustomer(this.customer)
  .subscribe({next:(data) => console.log(data),error:(e) =>console.log(e)});
  this.customer=new Customer();
}
 
getCustomerName(){
  return this.customersaveform.get('cust_name');
}
 
getCustomerEmail(){
  return this.customersaveform.get('cust_email');
}
 
getCustomerProduct(){
  return this.customersaveform.get('product');
 }
addCustomerForm()
{
this.submitted=false;
this.customersaveform.reset();
}
 
}
 