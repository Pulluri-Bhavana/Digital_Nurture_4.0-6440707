import React from "react";

function App() {
  // Single object
  const mainOffice = {
    name: "Sky Tower",
    rent: 75000,
    address: "Hitech City, Hyderabad",
    image: "https://images.unsplash.com/photo-1600585154340-be6161a56a0c" // Sample image
  };

  // List of office space objects
  const officeSpaces = [
    {
      name: "Sky Tower",
      rent: 75000,
      address: "Hitech City, Hyderabad"
    },
    {
      name: "WorkHub",
      rent: 55000,
      address: "Jubilee Hills, Hyderabad"
    },
    {
      name: "TechZone",
      rent: 62000,
      address: "Gachibowli, Hyderabad"
    }
  ];

  // Inline style for the page layout
  const containerStyle = {
    textAlign: "center",
    fontFamily: "Arial",
    padding: "20px"
  };

  return (
    <div style={containerStyle}>
      {/* JSX Heading */}
      <h1>🏢 Office Space Rental</h1>

      {/* Office Image */}
      <img src={mainOffice.image} alt="Office" style={{ width: "300px", borderRadius: "8px" }} />

      {/* Single Office Details */}
      <h2>{mainOffice.name}</h2>
      <p>{mainOffice.address}</p>
      <p style={{ color: mainOffice.rent < 60000 ? "red" : "green" }}>
        Rent: ₹{mainOffice.rent}
      </p>

      <hr />

      {/* List of All Office Spaces */}
      <h2>Other Office Spaces</h2>
      <div style={{ display: "flex", justifyContent: "center", gap: "30px" }}>
        {officeSpaces.map((office, index) => (
          <div key={index} style={{ border: "1px solid #ccc", padding: "10px", borderRadius: "8px", width: "200px" }}>
            <h3>{office.name}</h3>
            <p>{office.address}</p>
            <p style={{ color: office.rent < 60000 ? "red" : "green" }}>
              Rent: ₹{office.rent}
            </p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
