import React from 'react';

const GetBody = () => {
  return (
    fetch("http://localhost:3001/users/get", {
      method : 'POST',
      body   : JSON.stringify({
        username: 'Jingyu',
      }),
      headers: {
        "content-type": "application/json;charset=utf-8",
      },
    })
    .then((data) => data.json())
    .then((json) => alert(JSON.stringify(json)))
  );
};

export default GetBody;