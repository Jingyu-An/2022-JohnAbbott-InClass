import React from 'react';
import GetAllData from "./REST/GetAllData";


const DbData = () => {
  return (
    <>
      <button onClick={GetAllData}>
        Get all users
      </button>
    </>
  );
};

export default DbData;