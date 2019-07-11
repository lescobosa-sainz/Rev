function add (a,b){
    return a+ b;
}

let arrowAdd = (a,b) => {
    return a + b;
}

let result = add(5,10);
console.log(`result = ${result}
arrowAdd(5,10) = ${arrowAdd(5,10)}`);

let b = add;
console.log(`
b = ${b}`)


