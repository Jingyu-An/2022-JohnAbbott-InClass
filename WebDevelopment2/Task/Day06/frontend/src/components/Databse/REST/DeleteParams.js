import React from 'react';

const DeleteParams = () => {
  return (
    fetch("http://localhost:3001/users/Hyunju", { method: 'DELETE'})
    .then((data) => data.json())
    .then((json) => alert(JSON.stringify(json)))
  );
};

export default DeleteParams;