import React, { useState, useEffect } from "react";

import axios from "axios";

const TaskList = () => {
  const [tasks, setTasks] = useState([]);

  useEffect(() => {
    axios
      .get("http://localhost:5000/api/tasks")

      .then((response) => setTasks(response.data))

      .catch((error) => console.error(error));
  }, []);

  return (
    <div>
      <h2>Task List</h2>

      <ul>
        {tasks.map((task) => (
          <li key={task.id}>
            <strong>{task.title}</strong>

            <p>{task.description}</p>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default TaskList;
