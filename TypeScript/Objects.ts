interface Employee {
    readonly id: number;
    name: string;
    email?: string; 
}

let employee: Employee = {
    id: 101,
    name: "Sam"
};
console.log(employee); 

let person: { name: string; age: number } = {
    name: "Alice",
    age: 30
};
console.log(person); 