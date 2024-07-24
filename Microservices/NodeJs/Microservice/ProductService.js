const express = require("express");
const app = express();
app.use(express.json());

const products = [
  { id: 1, name: "T-shirt", userId: 1 },
  { id: 2, name: "bottle", userId: 2 },
];

app.get("/products", (req, res) => {
  res.send(products);
});

app.get("/products/:id", (req, res) => {
  const id = parseInt(req.params.id);
  const product = products.find((p) => p.id === id);
  if (!product) {
    return res.status(404).send("Product not found");
  }
  res.send(product);
});

app.listen(3002, () => {
  console.log("Product Service is running Successfully");
});
