import React from 'react';

const GetAllData = () => {
  return (
    fetch("http://localhost:3001/users", {method: 'GET'})
    .then(data => data.json())
    .then(json => alert(JSON.stringify(json)))
  );
};

export default GetAllData;