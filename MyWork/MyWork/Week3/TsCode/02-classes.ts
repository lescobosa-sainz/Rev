class RussianNestingDoll{

    innerDoll: RussianNestingDoll;
    size: string;
    color: string;
    constructor(innerDoll,size:string,color:string){
        this.innerDoll = innerDoll;
        this.size = size;
        this.color = color;
    }
}

let doll1 = new RussianNestingDoll(null,"tiny","red");
let doll2 = new RussianNestingDoll(doll1,"small","red");
let doll3 = new RussianNestingDoll(doll2,"normal","red");
let doll4 = new RussianNestingDoll(doll3,"huge","red");

console.log(doll4);

export class Shirt {
    constructor(
        public sleves:Sleeves, 
        public color = '',
        public collar:boolean,
        public size: string){}
}

enum Sleeves{
    LONG = 'long',
    SHORT = 'short',
    QUARTER = 'quarters',
    SLEEVLESS = 'sleevless'

} 

let s = new Shirt(Sleeves.SLEEVLESS,'green',false,'extra medium')
export let s2 = new Shirt();
console.log(s);

export default s;