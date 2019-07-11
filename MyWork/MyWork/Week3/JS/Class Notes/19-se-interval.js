let minute = 0;
let hour = 11;
let dayTime = 'pm';
let is = true
function createInterval(second){
    setInterval(() => {
        console.log(`${hour}:${minute}:${second} ${dayTime}`)
        second = second +1;
        if (second == 60){
            second =0;
            minute = minute + 1;
            if (minute == 60){
                minute = 0;

                if (hour == 12){
                    if (is == true){
                        is = false;
                        daytime = 'am';
                    }

                   
                if(hour == 13){

                    
                    

       
                    hour = 1;
                    // else if (is == false){
                    //     daytime = 'pm'
                    //     is = true;
                    // }
                }
               
            }
            hour = hour + 1
            }
        }

    },1000)
}

//createInterval('hello');
//createInterval('today is wendesday');
createInterval(1);