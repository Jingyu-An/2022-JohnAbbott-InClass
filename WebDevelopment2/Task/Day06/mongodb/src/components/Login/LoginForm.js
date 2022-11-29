import React, {useRef} from 'react';
import PostLogin from "../Databse/REST/PostLogin";
import {LoggedInContext} from "../../App";

const LoginForm = () => {
  const usernameRef = useRef();
  const passwordRef = useRef();
  
  const [isLoggedIn, setIsLoggedIn] = React.useContext(LoggedInContext);
  
  const submitHandler = (event) => {
    event.preventDefault();
    
    const username = usernameRef.current.value;
    const password = passwordRef.current.value;
  
    fetch("http://localhost:3001/users/login", {
      method : "POST",
      body   : JSON.stringify({
        username: username,
        password: password,
      }),
      headers: {
        "Content-type": "application/json;charset=UTF-8",
      },
    })
    .then((data) => data.json())
    .then((json) => {
      alert(JSON.stringify(json));
      json.success ? setIsLoggedIn(true) : setIsLoggedIn(false);
    })
  }
  
  return (
    <form onSubmit={submitHandler}>
      <label htmlFor='username'>Username</label>
      <input id='username' type='text' ref={usernameRef} required/>
      <label htmlFor='password'>Password</label>
      <input id='password' type='password' ref={passwordRef} required/>
      <button type='submit'>Login</button>
    </form>
  );
};

export default LoginForm;