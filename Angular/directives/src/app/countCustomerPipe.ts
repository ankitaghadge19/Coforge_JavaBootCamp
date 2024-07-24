import { Pipe,PipeTransform } from "@angular/core";
@Pipe({
    name: 'countCustomer'
})
export class countCustomerPipe implements PipeTransform{
    transform(customer: any[]): number {
        return customer.length;
    }
}