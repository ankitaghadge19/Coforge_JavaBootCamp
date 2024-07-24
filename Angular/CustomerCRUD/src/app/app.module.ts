import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppComponent } from './app.component';
import { HttpClient } from '@angular/common/http';
import { DataTablesModule } from 'angular-datatables';
import { CustomerListComponent } from './customer-list/customer-list.component';
import { AddCustomerComponent } from './add-customer/add-customer.component';
 
@NgModule({
  declarations: [
    AppComponent,
    CustomerListComponent,
    AddCustomerComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    HttpClient,
    DataTablesModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
 