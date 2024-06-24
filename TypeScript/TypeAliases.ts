// Shape of object
type Employee = {
    readonly id: number;
    name: string;
    email?: string;
    getDetails: () => string; 
};

// Defination of onject
let employee: Employee = {
    id: 101,
    name: "Sam",
    getDetails: function() {
        return `ID: ${this.id}, Name: ${this.name}, Email: ${this.email ?? "N/A"}`;
    }
};

console.log(employee.getDetails());
