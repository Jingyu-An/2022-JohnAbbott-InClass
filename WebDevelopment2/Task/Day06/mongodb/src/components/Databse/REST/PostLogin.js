import React from 'react';

import { LoggedInContext} from "../../../App";


const PostLogin = (username, password, isLoggedIn, setIsLoggedIn) => {
  
  return (
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
  );
};

export default PostLogin;