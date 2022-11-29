import React, {useContext} from 'react';
import {LoggedInContext} from "../../App";
import HomeButton from "../Button/HomeButton";
import LogoutButton from "../Button/LogoutButton";

import './Header.css'

const Header = () => {
  const [isLoggedIn, setIsLoggedIn] = useContext(LoggedInContext);
  
  const logoutHandler = () => {
    setIsLoggedIn(false);
  }
  
  return (
    <div className='header'>
      {isLoggedIn ? "Welcome" : "Please login"}
      {isLoggedIn ? <LogoutButton onClick={logoutHandler} /> : ''}
      <HomeButton />
    </div>
  );
};

export default Header;