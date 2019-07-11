class food{
    constructor(texture, rating, name,color, price){
        this.textur = texture;
        this.rating = rating;
        this.name = name;
        this.color = color;
        this.price = price;

        this.otherGetColor = () => {
            return this.color
        }
    }

getColor(){
    this.color;
}

}


let bannana = new food('smoothe' , 5, "bannana", "green",10);
console.log(bannana);

console.log(`getColor() =${bannana.getColor()}`);