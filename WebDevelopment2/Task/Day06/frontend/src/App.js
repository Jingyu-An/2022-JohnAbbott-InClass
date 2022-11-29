import React, {useState} from 'react';
import Home from "./components/Home/Home";

import './App.css';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  const loggedInValueToProvide = [isLoggedIn, setIsLoggedIn]; // So we can pass down both value and setter
  
  return (
    <LoggedInContext.Provider value={loggedInValueToProvide}>
      <Home/>
    </LoggedInContext.Provider>
  );
}

export const LoggedInContext = React.createContext({
  isLoggedIn   : false,
  setIsLoggedIn: () => {
  },
});

export default App;
