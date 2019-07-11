function iterate(arr, cb){
    for (let i = 0;i <arr.length; i++){
        cb(arr[i],i);
    }
}

function myCallBack(element,index){
    console.log(`index: ${index}, element: ${element}`);
}

let arr = [5,2,8,10,15,32];
iterate(arr, myCallBack);