import React from "react";

const players = [
  { name: "Virat", score: 85 },
  { name: "Rohit", score: 45 },
  { name: "Rahul", score: 75 },
  { name: "Hardik", score: 65 },
  { name: "Shami", score: 90 },
  { name: "Bumrah", score: 60 },
  { name: "Pant", score: 55 },
  { name: "Gill", score: 88 },
  { name: "Ashwin", score: 48 },
  { name: "Jadeja", score: 92 },
  { name: "Surya", score: 59 }
];

const ListOfPlayers = () => {
  const filteredPlayers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>🏏 All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>

      <h3>⛔ Players with score below 70:</h3>
      <ul>
        {filteredPlayers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListOfPlayers;
