import React from "react";
import TaskList from "./components/TaskList";
import TaskForm from "./components/TaskForm";
import TaskDetail from "./components/TaskDetail";

const App = () => {
  return (
    <div>
      <TaskList />
      <TaskForm />
      <TaskDetail taskId={1} />{" "}
      {/* You can change the taskId to display different task details */}
    </div>
  );
};

export default App;
