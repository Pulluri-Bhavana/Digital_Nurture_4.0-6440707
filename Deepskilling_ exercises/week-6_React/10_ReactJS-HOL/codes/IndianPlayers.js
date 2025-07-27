import React from "react";

const IndianPlayers = () => {
  const team = ["Virat", "Rohit", "Rahul", "Shami", "Bumrah", "Gill"];

  // Destructuring into Odd and Even team players
  const oddTeam = team.filter((_, index) => index % 2 !== 0);
  const evenTeam = team.filter((_, index) => index % 2 === 0);

  const T20players = ["Suryakumar", "Rinku", "Samson"];
  const RanjiTrophy = ["Pujara", "Iyer", "Rahane"];

  // Merge using ES6 spread operator
  const allPlayers = [...T20players, ...RanjiTrophy];

  return (
    <div>
      <h2>🇮🇳 Indian Players - Destructuring Example</h2>
      <p><strong>Odd Team Players:</strong> {oddTeam.join(", ")}</p>
      <p><strong>Even Team Players:</strong> {evenTeam.join(", ")}</p>

      <h3>🆚 All Players (T20 + Ranji Trophy)</h3>
      <ul>
        {allPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
