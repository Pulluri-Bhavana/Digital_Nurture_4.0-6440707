import '../Stylesheets/mystyle.css';

function CalculateScore({ name, school, total, goal }) {
  const average = total / goal;
  return (
    <div className="score-box">
      <h2>{name}</h2>
      <p>School: {school}</p>
      <p>Average Score: {average}</p>
    </div>
  );
}

export default CalculateScore;
