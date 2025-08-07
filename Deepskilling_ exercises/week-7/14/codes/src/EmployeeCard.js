// src/EmployeeCard.js
import React, { useContext } from 'react';
import ThemeContext from './ThemeContext';
import Styles from './EmployeeCard.module.css';

function EmployeeCard(props) {
  const theme = useContext(ThemeContext);

  return (
    <div className={Styles.Card}>
      <h3>{props.employee.name}</h3>
      <p>{props.employee.email}</p>
      <p>{props.employee.phone}</p>
      <p>
        <a href="#" className={Styles[theme]}>Edit</a>
        <a href="#" className={Styles[theme]}>Delete</a>
      </p>
    </div>
  );
}

export default EmployeeCard;
