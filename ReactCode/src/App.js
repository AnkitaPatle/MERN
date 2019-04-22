import React, { Component } from 'react';
import { Router, Switch, Route } from 'react-router-dom';
import { createBrowserHistory } from 'history';

import ExceptionSearch from "./components/ExceptionSearch.jsx";
import UpdateExceptionSearch from "./components/updateExceptionSearch.jsx"

const history = createBrowserHistory()

class App extends Component {
  render() {
    return (
      <div>
        <Router history={history}>

          <Switch>
            <Route exact path='/' component={ExceptionSearch}/>
            <Route path='/update' component={UpdateExceptionSearch}/>
            
          </Switch>
        </Router>
        
      </div>
    );
  }
}

export default App;
