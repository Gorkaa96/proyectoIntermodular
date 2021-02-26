const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser')

mongoose.Promise = global.Promise;
mongoose.connect('mongodb://localhost:27017/playersdb', { useNewUrlParser: true, useUnifiedTopology: true, useFindAndModify: false });

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

let app = express();
app.use(bodyParser.json());
app.get('/players', (req, res) => {
    Player.find().then(result => {
        res.send(result);
    })
});

app.use(bodyParser.json());
app.post('/players', (req, res) => {
    let newPlayer = new Player({
        username: req.body.username,
        score: req.body.score
    });
    newPlayer.save().then(result => {
        let data = { error: false, result: result };
        res.send(data);
    }).catch(error => {
        let data = {
            error: true,
            errorMessage: "Error adding player"
        };
        res.send(data);
    });
});

app.listen(8080);