const left = 1;
const right = 2;
const up = 3;
const down = 4;

const enum Directions {left, right, up, down};

enum Directions1 {left = 1, right, up, down};

enum Directions3 {left = 'a', right = 'b', up = 'c', down = 'd'};

let currentDir = Directions.left;
console.log(currentDir);
