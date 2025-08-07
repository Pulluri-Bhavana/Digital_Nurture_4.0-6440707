import React from "react";
import ListOfPlayers from "./ListOfPlayers";
import IndianPlayers from "./IndianPlayers";

function App() {
  const flag = true; // change to false to test other view

  return (
    <div style={{ textAlign: "center", padding: "20px" }}>
      <h1>🏏 Cricket App</h1>

      {flag ? <ListOfPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
