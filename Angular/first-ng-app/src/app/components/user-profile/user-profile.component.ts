import { CommonModule } from '@angular/common';
import { booleanAttribute, Component, EventEmitter, Input, numberAttribute, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';

function formatName(value: String){
  return "Hi " + value
}

@Component({
  selector: 'app-user-profile',
  standalone: true,
  imports: [FormsModule, CommonModule],
  templateUrl: './user-profile.component.html',
  styleUrl: './user-profile.component.css'
})

export class UserProfileComponent {

  @Input({alias: "username", transform: formatName}) name = "";
  @Input({transform: booleanAttribute}) isSingle!:boolean;
  @Input({transform: numberAttribute}) salary!:number;

  @Output() myEvent = new EventEmitter<{name:String, newS}>();

  sendData(){
    this.myEvent.emit(name.this.name);
  }
  // name = "ramesh"
  // status = "single"
  // salary = 40000
  // isBtnDisabled = false

  // users = [
  //   {name:"Sam", isSingle: true, salary: 10000},
  //   {name:"James", isSingle: false, salary: 50000},
  //   {name:"Edward", isSingle: true, salary: 20000},
  // ]

  // inputVal="test";

  // onChange(e:Event){
  //   const value = (e.target as HTMLInputElement).value;
  //   this.inputVal = value;
  // }
}
