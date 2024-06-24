function greet(name: string | null | undefined) {
    if (name) {
        console.log(`Hello, ${name}!`);
    } else {
        console.log(`Hello, anonymous!`);
    }
}

greet('Alice');   
greet(undefined);  
greet(null);    
