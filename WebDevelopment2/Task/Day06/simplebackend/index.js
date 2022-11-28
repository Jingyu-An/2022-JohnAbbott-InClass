require('dotenv').config();
const mongoose = require('mongoose');
const userModel = require('./components/Datebase/models')

const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');

const app = express();
const port = 3001; //Must be different from the port of the React app

app.use(cors()); // https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS

mongoose.connect("mongodb+srv://mongouser:" + process.env.MONGODB_PWD +
  "@cluster0.zpqzfcw.mongodb.net/myFirstDb?retryWrites=true&w=majority",
  {
    useNewUrlParser   : true,
    useUnifiedTopology: true,
  });

const db = mongoose.connection;
db.on("error", console.error.bind(console, "Connection error: "));
db.once("open", () => {
  console.log("Connected successfully");
})

app.use(express.json()); // Allows express to read a request body

// Configuring body parser middleware
app.use(bodyParser.urlencoded({extended: false}));
app.use(bodyParser.json());

// POST request
app.post("user", async (req, res) => {
  const username = req.body.username;
  const password = req.body.password;
  const user = {
    username: username,
    password: password,
  };
  await userModel.create(user);
  res.send(user);
})

// GET request
/* An API get request to /users to get all users */
app.get("/users", async (req, res) => {
  const users = await userModel.find();
  res.send(users);
})
/* An API get request using query parameters to /users?username=XXX */
app.get("user", async (req, res) => {
  const username = req.query.username;
  const user = await userModel.findOne({
    username: username,
  })
  res.send(user);
});
/* An API get request using URL path parameters to /users/:username */
app.get("/users/:username", async (req, res) => {
  const username = req.params.username;
  const user = await userModel.findOne({
    username: username,
  })
  res.send(user);
});
/* An API post request using body to get user /users/get */
get.post("/users/get", async (req, res) => {
  const username = req.body.username;
  const user = await userModel.findOne({
    username: username,
  })
  res.send(user);
})

// PUT request
/* An API post request using body /users. Replaces the entire user. */
app.put ("/users", async (req, res) => {
  const password = req.body.password;
  const username = req.body.username;
  const user = {
    username: username,
    password: password,
  };
  const results = await userModel.replaceOne({
    username: username }, user);
  
  res.send(results);
})

// PATCH request
/* An API post request using body /users/username that changes a single field */
app.patch("/users/:username/password", async (req, res) => {
  const username = req.params.username;
  const password = req.body.password;
  const results = await userModel.updateOne(
    { username: username },
    { password: password }
  );
  
  res.send(results);
})

// DELETE request
/* An API delete request using URL path parameters to /users/:username */
app.delete("/users/:username", async (req, res) => {
  const username = req.params.username;
  const results = await userModel.deleteOne({
    username: username,
  });
  
  res.send(results);
})

app.listen(port, () => {
  console.log(`Hello world app listening on port ${port}!`);
});