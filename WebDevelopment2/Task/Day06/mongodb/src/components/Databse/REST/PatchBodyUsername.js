import React from 'react';

const PatchBodyUsername = () => {
  return (
    fetch("http://localhost:3001/users/Jingyu/password", {
      method: 'PATCH',
      body: JSON.stringify({
        password: '321',
      }),
      headers: { 'Content-Type' : 'application/json;charset=utf-8', },
    })
    .then((data) => data.json())
    .then((json) => alert(JSON.stringify(json)))
  );
};

export default PatchBodyUsername;