// spread (...) operator is used to expand elements of an iterable (like arrays, strings, or objects) 
var __assign = (this && this.__assign) || function () {
    __assign = Object.assign || function(t) {
        for (var s, i = 1, n = arguments.length; i < n; i++) {
            s = arguments[i];
            for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
                t[p] = s[p];
        }
        return t;
    };
    return __assign.apply(this, arguments);
};
var __spreadArray = (this && this.__spreadArray) || function (to, from, pack) {
    if (pack || arguments.length === 2) for (var i = 0, l = from.length, ar; i < l; i++) {
        if (ar || !(i in from)) {
            if (!ar) ar = Array.prototype.slice.call(from, 0, i);
            ar[i] = from[i];
        }
    }
    return to.concat(ar || Array.prototype.slice.call(from));
};
var arr1 = [1, 2, 3];
var arr2 = [4, 5, 6];
var combinedArr = __spreadArray(__spreadArray([], arr1, true), arr2, true);
console.log(combinedArr);
var Profile = { id: 101, name: "Adil" };
var Address = { city: "Pune", country: "India" };
var Account = __assign(__assign({}, Profile), Address);
console.log(Account);
