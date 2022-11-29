import React from 'react';

const PostRegister = (username, password) => {
  return (
    fetch("http://localhost:3001/users/register", {
      method : "POST",
      body   : JSON.stringify({
        // id: Math.random().toString(),
        username: username,
        password: password,
      }),
      headers: {
        "Content-type": "application/json;charset=UTF-8",
      },
    })
    .then((data) => data.json())
    .then((json) => alert(JSON.stringify(json)))
  );
};

export default PostRegister;