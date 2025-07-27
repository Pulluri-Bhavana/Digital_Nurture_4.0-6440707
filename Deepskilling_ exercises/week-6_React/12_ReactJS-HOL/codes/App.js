import React from "react";
import CurrencyConverter from "./CurrencyConverter";

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 0
    };
  }

  // Method 1: Increment Counter
  increment = () => {
    this.setState({ counter: this.state.counter + 1 });
  };

  // Method 2: Say Hello
  sayHello = () => {
    alert("Hello! This is a static message.");
  };

  // Method called when increment button is clicked
  handleIncrementClick = () => {
    this.increment();
    this.sayHello();
  };

  // Method for decrement
  decrement = () => {
    this.setState({ counter: this.state.counter - 1 });
  };

  // Button passing argument
  sayWelcome = (message) => {
    alert(message);
  };

  // Synthetic event
  handleSyntheticEvent = (event) => {
    alert("I was clicked");
    console.log("Synthetic Event:", event);
  };

  render() {
    return (
      <div style={{ textAlign: "center", marginTop: "30px" }}>
        <h1>🧪 React Events Lab</h1>

        <p><strong>Counter:</strong> {this.state.counter}</p>

        {/* Multiple Method Invocation */}
        <button onClick={this.handleIncrementClick} style={{ marginRight: "10px" }}>
          Increment
        </button>

        <button onClick={this.decrement}>
          Decrement
        </button>

        <br /><br />

        {/* Passing Arguments to Function */}
        <button onClick={() => this.sayWelcome("Welcome to React Events!")}>
          Say Welcome
        </button>

        <br /><br />

        {/* Synthetic Event */}
        <button onClick={this.handleSyntheticEvent}>
          OnPress
        </button>

        <br /><br />

        {/* Currency Converter Component */}
        <CurrencyConverter />
      </div>
    );
  }
}

export default App;
