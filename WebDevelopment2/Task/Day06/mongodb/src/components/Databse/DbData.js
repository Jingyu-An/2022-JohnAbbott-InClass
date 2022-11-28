import React from 'react';

const DbData = () => {
  return (
    <>
      <button onClick={callGetAllData}>
        Get all users
      </button>
    </>
  );
};

const callGetAllData = () => {
  fetch("http://localhost:3001/users", {method: 'GET'})
  .then(data => data.json())
  .then(json => alert(JSON.stringify(json)));
};



export default DbData;