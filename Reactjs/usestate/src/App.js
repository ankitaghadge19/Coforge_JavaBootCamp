import { useState } from "react";
import Counter from "./components/Counter";

export default function MyApp() {
  return (
    <div>
      <h1>Counter using CounterFun() function</h1>
      <CounterFun />
      <br />
      <h1>Counter using Counter component</h1>
      <Counter />
    </div>
  );
}

function CounterFun() {
  const [count, setCount] = useState(0);

  function handleClick() {
    setCount(count + 1);
  }

  return <button onClick={handleClick}>Clicked {count} times</button>;
}
