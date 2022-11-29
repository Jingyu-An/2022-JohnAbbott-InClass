import React from 'react';

const PostBody = (username, password) => {
  return (
    fetch("http://localhost:3001/users", {
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
    .then((json) => alert(JSON.stringify(json)))
  );
};

export default PostBody;