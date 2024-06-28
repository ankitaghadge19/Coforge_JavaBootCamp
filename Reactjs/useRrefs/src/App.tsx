import React from "react";
import "./App.css";
import Counter from "./components/Counter";
import SelectInputTag from "./components/SelectInputTag";

function App() {
  const data = 123; 

  return (
    <div>
      <SelectInputTag/>
      <Counter/>
    </div>
  );
}

export default App;
