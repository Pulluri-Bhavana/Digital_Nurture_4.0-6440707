import React, { Component } from "react";

class Getuser extends Component {
  constructor() {
    super();
    this.state = {
      user: null
    };
  }

  async componentDidMount() {
    const response = await fetch("https://api.randomuser.me/");
    const data = await response.json();
    this.setState({ user: data.results[0] });
  }

  render() {
    const { user } = this.state;
    return (
      <div>
        <h2>Random User</h2>
        {user ? (
          <div>
            <h3>{user.name.title} {user.name.first}</h3>
            <img src={user.picture.large} alt="User" />
          </div>
        ) : (
          <p>Loading...</p>
        )}
      </div>
    );
  }
}

export default Getuser;
