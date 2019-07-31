import React from 'react';
import { Button } from 'reactstrap';


interface IState {


        joke: any,
     
    


}

export class Norris extends React.Component<{}, IState> {
    constructor(props: any) {
        super(props);
        this.state = {
           
                joke: null,
               
            
        }
    }



    findNewjoke = async () => {
        const resp = await fetch('http://api.icndb.com/jokes/random?limitTo=[nerdy]' );
        const joke = (await resp.json()).value.joke;
        this.setState({
            joke
        });
    }



    render() {
        return (
            <div>


                <Button color="warning" onClick={this.findNewjoke}>Find</Button>

                <br />
                <h3>Joke: {this.state.joke && this.state.joke}</h3>


            </div>
        );
    }
}
