import React from 'react';

const PutBody = () => {
  return (
    fetch("http://localhost:3001/users", {
      method: 'PUT',
      body: JSON.stringify({
        username: 'Jingyu',
        password: '123'
      }),
      headers: {
        "content-type": "application/json;charset=utf-8",
      },
    })
    .then((data) => data.json())
    .then((json) => alert(JSON.stringify(json)))
  );
};

export default PutBody;