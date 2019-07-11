function food(name, rating, price, texture, color){
    this.name = name;
    this.rating = rating;
    this.price = price;
    this.texture = texture;
    this.color = color;
}

let rice = new food('rice',10,3,'grainy','white');
console.log(rice);