import { RouterModule, Routes } from '@angular/router';
import { CustomerListComponent } from './customer-list/customer-list.component';
import { AddCustomerComponent } from './add-customer/add-customer.component';
import { NgModel } from '@angular/forms';
import { Router } from 'express';
import { NgModule } from '@angular/core';
 
export const routes: Routes = [
{path:"",redirectTo:'view-customer',pathMatch:'full'},
{path:'view-customer',component:CustomerListComponent},
{path:'add-customer',component:AddCustomerComponent},
 
];
 
@NgModule({
    imports:[RouterModule.forRoot(routes)],
    exports:[RouterModule]
})
export class AppRoutingModule{}
 
 