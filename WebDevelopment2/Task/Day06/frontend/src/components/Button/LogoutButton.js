import React from 'react';

import './Button.css'

const LogoutButton = (props) => {
  return (
    <button className='button' style={{backgroundColor: 'red'}} onClick={props.onClick}>
      Log Out
    </button>
  );
};

export default LogoutButton;