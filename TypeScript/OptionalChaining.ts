// Optional chaining simplifies accessing deeply nested properties or calling functions within objects, handling null or undefined values

let calculator = {
    add: (a: number, b: number) => a + b
};

// Calling nested method safely with optional chaining
let result = calculator.add?.(5, 3);
console.log(result);  

// Handling non-existing method with optional chaining
let subtractResult = calculator.subtract?.(5, 3);
console.log(subtractResult);  