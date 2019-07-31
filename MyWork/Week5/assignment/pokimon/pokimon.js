async function findPokemon(event){
    event.preventDefault();
    const id = document.getElementById('poke-number').nodeValue;

    const resp = await fetch (`https://pokeapi.co/api/v2/pokemon/${id}`);
    const body = await resp.json();

    const{name, sprites} = body;

    for(let sprite in sprites){
        if(sprites[sprite]){
            const img = document.createElement('img');
            img.src = sprites[sprite];
            spriteContainer.appendChild();
        }
    }

    document.getElementById('poke-name').innerText = "Name:" + name;
}