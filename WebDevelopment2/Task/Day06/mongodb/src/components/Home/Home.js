import React, {Fragment} from 'react';
import DbData from "../Databse/DbData";
import LoginForm from "../Login/LoginForm";
import RegisterFrom from "../Register/RegisterFrom";
import Header from "./Header";

const Home = () => {
  return (
    <Fragment>
      <Header />
      <LoginForm />
      <DbData/>
    </Fragment>
  );
};

export default Home;