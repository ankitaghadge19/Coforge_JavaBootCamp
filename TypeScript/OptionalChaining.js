var _a, _b;
var calculator = {
    add: function (a, b) { return a + b; }
};
// Calling nested method safely with optional chaining
var result = (_a = calculator.add) === null || _a === void 0 ? void 0 : _a.call(calculator, 5, 3);
console.log(result); // Outputs: 8
// Handling non-existing method with optional chaining
var subtractResult = (_b = calculator.subtract) === null || _b === void 0 ? void 0 : _b.call(calculator, 5, 3);
console.log(subtractResult); // Outputs: undefined (no error thrown)
