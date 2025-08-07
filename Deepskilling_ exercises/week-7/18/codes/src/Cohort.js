export const CohortsData = [
  {
    id: 1,
    name: "Cohort Alpha",
    students: 25
  },
  {
    id: 2,
    name: "Cohort Beta",
    students: 30
  }
];

export const Cohort = ({ name, students }) => {
  return (
    <div>
      <h3>{name}</h3>
      <p>Students: {students}</p>
    </div>
  );
};
