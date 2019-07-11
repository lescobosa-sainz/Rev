let arr = [5,10,8,2,3,25,15];

// let result = arr.filter((ele) =>{
//     return ele % 2===0;
// })

// console.log(result);

result = arr.filter(ele => !(ele % 2));
console.log(result);