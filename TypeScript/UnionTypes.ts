// Union Types = variable that can hold values of different types
function celsiusToFahrenheit(temperature: number | string): number {
    if(typeof temperature === 'number')
        return (temperature * 9/5) + 32;
    else 
        return (parseInt(temperature) * 9/5) + 32;
}

console.log(celsiusToFahrenheit(10));
console.log(celsiusToFahrenheit("10"));

type ID = number | string;

function printID(id: ID) {
    console.log(id);
}

printID(123);    
printID("ABC");


// Any VS Union

let AnyVav: any;
AnyVav = 123;       
AnyVav = "Hello";   
AnyVav = true;   

type UnionVar = number | string;