const mongoose = require('mongoose');
const express = require('express');
const bodyParser = require('body-parser');

// Connecting to Mongoo Atlas database
mongoose.connect('mongodb+srv://gorka_hernandez:4v@cluster0.as4iy.mongodb.net/playersdb?retryWrites=true&w=majority', {
  useNewUrlParser: true,
  useUnifiedTopology: true
});

const app = express();

let playerSchema = new mongoose.Schema({
  username: {
    type: String,
    required: true,
    minlength: 1,
    trim: true
  },
  score: {
    type: Number,
    required: true,
  }
});
let Player = mongoose.model('players', playerSchema);


app.use(function (req: any, res: any, next: any) {
  res.header("Access-Control-Allow-Origin", "*"); // update to match the domain you will make the request from
  res.header("Access-Control-Allow-Methods", 'GET,PUT,POST,DELETE,OPTIONS');
  res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
  next();
});

app.use(
  bodyParser.urlencoded({
    extended: true
  })
)

app.use(bodyParser.json())


app.get('/players', async (req: any, res: any) => {
  const players = await Player.find({});
  console.log(players);

  try {
    res.send(players);
  } catch (err) {
    res.status(500).send(err);
  }
});


app.post('/players', async (req: any, res: any) => {
  const player = new Player({
    username: req.body.username,
    score: req.body.score
  });

  try {
    await player.save();
    res.send(player);
  } catch (err) {
    res.status(500).send(err);
  }
});

app.delete('/players/:id', async (req: any, res: any) => {
  try {
    const player = await Player.findByIdAndDelete(req.params.id)

    if (!player) res.status(404).send("No item found")
    res.status(200).send()
  } catch (err) {
    res.status(500).send(err)
  }
});

app.put('/players/:id', async (req: any, res: any) => {
  try {
    const player = await Player.findByIdAndUpdate(req.params.id, req.body)
    await Player.save()
    res.send(player)
  } catch (err) {
    res.status(500).send(err)
  }
});


// This is not working with Heroku, IP and PORT are automatically asigned
/*const server = app.listen(8000, "localhost", () => {
  const { address, port } = server.address();
  console.log('Listening on %s %s', address, port);
});*/


// start the server listening for requests
app.listen(process.env.PORT || 3000,
  () => console.log("Server is running..."));