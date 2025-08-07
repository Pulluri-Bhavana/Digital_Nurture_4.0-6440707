import React from "react";
import { CohortsData, Cohort } from "./Cohort";

const CohortDetails = () => {
  return (
    <div>
      <h2>Cohort Details</h2>
      {CohortsData.map((item) => (
        <Cohort key={item.id} name={item.name} students={item.students} />
      ))}
    </div>
  );
};

export default CohortDetails;
