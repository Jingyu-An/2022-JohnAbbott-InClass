import React from 'react';

const GetParams = () => {
  return (
    fetch("http://localhost:3001/users/Jingyu", {method: 'GET'})
    .then(data => data.json())
    .then(json => alert(JSON.stringify(json)))
  );
};

export default GetParams;