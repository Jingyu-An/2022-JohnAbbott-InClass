import React, {useContext} from 'react';
import {LoggedInContext} from "../../App";
import HomeButton from "../Button/HomeButton";
import LogoutButton from "../Button/LogoutButton";


const Header = () => {
  const [isLoggedIn, setIsLoggedIn] = useContext(LoggedInContext);
  
  const logoutHandler = () => {
    setIsLoggedIn(false);
  }
  
  return (
    <div>
      {isLoggedIn ? "Welcome" : "Please login"}
      <HomeButton />
      {isLoggedIn ? <LogoutButton onClick={logoutHandler} /> : ''}
    </div>
  );
};

export default Header;