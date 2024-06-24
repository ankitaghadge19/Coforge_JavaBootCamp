// spread (...) operator is used to expand elements of an iterable (like arrays, strings, or objects) 

const arr1 = [1, 2, 3];
const arr2 = [4, 5, 6];

const combinedArr = [...arr1, ...arr2];
console.log(combinedArr); 

const Profile = { id: 101, name: "Adil" };
const Address = {city: "Pune", country: "India"};

const Account = {...Profile, ...Address};
console.log(Account);
