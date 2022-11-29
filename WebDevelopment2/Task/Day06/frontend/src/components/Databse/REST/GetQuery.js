import React from 'react';

const GetQuery = () => {
  return (
    fetch("http://localhost:3001/user?username=Jingyu", {method: 'GET'})
    .then(data => data.json())
    .then(json => alert(JSON.stringify(json)))
  );
};

export default GetQuery;