import React from 'react';

import './Button.css'

const LogoutButton = (props) => {
  return (
    <button className='button' onClick={props.onClick}>
      Log Out
    </button>
  );
};

export default LogoutButton;