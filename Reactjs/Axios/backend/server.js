const express = require("express");

const cors = require("cors");

const app = express();

const port = 5000;

app.use(cors());

app.use(express.json());

app.listen(port, () => {
  console.log(`Server is running on http://localhost:${port}`);
});

let data = [
  { id: 1, title: "Task 1", description: "This is Task 1" },

  { id: 2, title: "Task 2", description: "This is Task 2" },
];

// GET all tasks
app.get("/api/tasks", (req, res) => {
  res.json(data);
});

// GET a single task
app.get("/api/tasks/:id", (req, res) => {
  const id = parseInt(req.params.id);

  const task = data.find((item) => item.id === id);

  if (task) {
    res.json(task);
  } else {
    res.status(404).json({ message: "Task not found" });
  }
});

// POST a new task
app.post("/api/tasks", (req, res) => {
  const { title, description } = req.body;

  const newTask = { id: data.length + 1, title, description };

  data.push(newTask);

  res.status(201).json(newTask);
});

// PUT (update) an existing task
app.put("/api/tasks/:id", (req, res) => {
  const id = parseInt(req.params.id);

  const { title, description } = req.body;

  const task = data.find((item) => item.id === id);

  if (task) {
    task.title = title || task.title;

    task.description = description || task.description;

    res.json(task);
  } else {
    res.status(404).json({ message: "Task not found" });
  }
});

// DELETE a task
app.delete("/api/tasks/:id", (req, res) => {
  const id = parseInt(req.params.id);

  data = data.filter((item) => item.id !== id);

  res.sendStatus(204);
});
