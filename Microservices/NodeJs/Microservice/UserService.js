const express = require("express");
const app = express();
app.use(express.json());

const users = [
  { id: 1, name: "Krishna" },
  { id: 2, name: "Narayan" },
];

app.get("/users", (req, res) => {
  res.send(users);
});
app.get("/users/:id", (req, res) => {
  const user = users.find((u) => u.id === parseInt(req.params.id));
  if (!user)
    return res.status(404).send("User not exists or something went wrong!!");
  res.send(user);
});

app.listen(3001, () => {
  console.log("User Service is running Successfully");
});
