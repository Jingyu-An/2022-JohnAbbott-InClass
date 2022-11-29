import React, {Fragment, useContext, useRef} from 'react';
import DbData from "../Databse/DbData";
import LoginForm from "../Login/LoginForm";
import Header from "./Header";
import {LoggedInContext} from "../../App";

const Home = (props) => {
  const [isLoggedIn, setIsLoggedIn] = useContext(LoggedInContext);
  
  return (
    <Fragment>
      <Header/>
      {isLoggedIn ?
        <div style={{textAlign: 'center'}}>
          <h1 className='card'>Welcome</h1>
        </div>
        : <LoginForm/> }
      <DbData/>
    </Fragment>
  );
};

export default Home;