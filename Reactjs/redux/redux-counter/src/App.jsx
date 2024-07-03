import "./App.css";
import Counter from "./componets/Counter";

function App() {
  return (
    <div className="flex h-screen items-center justify-center bg-indigo-600">
      <div className="bg-white rounded shadow text-center pt-8 text-lg font-medium">
        <h2>Counter App using React & React-Redux</h2>
        <Counter />
      </div>
    </div>
  );
}

export default App;
