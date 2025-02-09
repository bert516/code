import "./App.css";
import React from "react";

function UI() {
  return (
    <div className = "container">
      <div className = "left">
        <button className = "menubuttons">Piechart</button>
        <button className = "menubuttons">Performance</button>
      </div>
      <div className = "right"></div>
    </div>
  );
};
export default UI;