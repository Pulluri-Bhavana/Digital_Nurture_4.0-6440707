import React from "react";

class CurrencyConverter extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      rupees: "",
      euros: ""
    };
  }

  handleChange = (event) => {
    this.setState({ rupees: event.target.value });
  };

  handleSubmit = () => {
    const rupees = parseFloat(this.state.rupees);
    if (!isNaN(rupees)) {
      const euros = rupees / 90; // Example conversion rate
      this.setState({ euros: euros.toFixed(2) });
    } else {
      alert("Please enter a valid amount");
    }
  };

  render() {
    return (
      <div style={{ marginTop: "40px" }}>
        <h2>💱 Currency Converter</h2>
        <input
          type="text"
          placeholder="Enter amount in ₹"
          value={this.state.rupees}
          onChange={this.handleChange}
        />
        <button onClick={this.handleSubmit} style={{ marginLeft: "10px" }}>
          Convert
        </button>
        {this.state.euros && (
          <p>EUR: €{this.state.euros}</p>
        )}
      </div>
    );
  }
}

export default CurrencyConverter;
