import { Component } from '@angular/core';
 
@Component({
  selector: 'app-customer-list',
  imports: [],
  templateUrl: './customer-list.component.html',
  styleUrl: './customer-list.component.css'
})
export class CustomerListComponent {
customer : any;
query:string
constructor(){
 
  this.query = ''
  this.customer =[
    {
      name : "Sudha",
      age : 42,
      profession : "Teacher",
      ordered_date : new Date().getTime()
    },
    {
      name : "Neha",
      age : 30,
      profession : "Dentist",
      ordered_date : new Date().getTime()
    },
    {
      name : "Dilip",
      age : 52,
      profession : "Manager",
      ordered_date : new Date().getTime()
    },
    {
      name : "Alia",
      age : 28,
      profession : "Developer",
      ordered_date : new Date().getTime()
    },
    {
      name : "Rutva",
      age : 36,
      profession : "Housewife",
      ordered_date : new Date().getTime()
    },
  ]
}
onCustomerDelete( evt:{customer_name:String}){
 
  let del_cust_name =evt.customer_name
  this.customer = this.customer.filter((c:{name:string})=>c.name != del_cust_name)
  console.log(`customer ${evt.customer_name} just deleted`);
 
}
 
}