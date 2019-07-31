import React from 'react';
import './App.css';
import { FirstComponent } from './components/first/first.component';
import Second from './components/second/second.component';
import Third from './components/third/third.component';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import NotFound from './components/not-found/not-found.component';
import { NavComponent } from './components/app-nav/app-nav.component';
import { PokemonComponent } from './components/pokemon/pokemon.component';
import { NestedComponent } from './components/nested/nested.component';
import Cards from './components/cards/cards.component';
import { ChuckNorrisComponent } from './components/chuck/chuck.norris.component';
import TicTacToeComponent from './components/tic-tac-toe/tic.tac.toe.component';
import { HomeComponent } from './components/home/home.component';
import { SignInComponent } from './components/sign-in/sign.in.component';
import { Clicker } from './components/clicker/clicker.component';

const App: React.FC = () => {
  return (
    <BrowserRouter>
      <div className="App">
        <NavComponent />
        {/* The switch will only render the first route to match */}
        <Switch>
          <Route path="/first" component={FirstComponent} />
          <Route path="/second" component={Second} />
          <Route path="/third" component={Third} />
          <Route path="/cards" component={Cards} />
          <Route path="/chuck-norris" component={ChuckNorrisComponent} />
          <Route path="/clicker" component={Clicker} />
          <Route path="/home" component={HomeComponent} />
          <Route path="/nested" component={NestedComponent} />
          <Route path="/pokemon" component={PokemonComponent} />
          <Route path="/sign-in" component={SignInComponent} />
          <Route path="/tic-tac-toe" component={TicTacToeComponent} />
          <Route component={NotFound} />
        </Switch>
      </div>
    </BrowserRouter>
  );
}

export default App;
