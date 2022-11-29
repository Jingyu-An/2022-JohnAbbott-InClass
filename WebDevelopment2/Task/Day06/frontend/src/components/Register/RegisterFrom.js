import React, {useRef} from 'react';
import PostRegister from "../Databse/REST/PostRegister";

const RegisterFrom = () => {
  const usernameRef = useRef();
  const passwordRef = useRef();
  
  const submitHandler = (event) => {
    event.preventDefault();
    
    const username = usernameRef.current.value;
    const password = passwordRef.current.value;
    
    PostRegister(username, password).then();
    
  }
  
  return (
    <form onSubmit={submitHandler}>
      <label htmlFor='username'>Username</label>
      <input id='username' type='text' ref={usernameRef} required/>
      <label htmlFor='password'>Password</label>
      <input id='password' type='password' ref={passwordRef} required/>
      <button type='submit'>Register</button>
    </form>
  );
};

export default RegisterFrom;