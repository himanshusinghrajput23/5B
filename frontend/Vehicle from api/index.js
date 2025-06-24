const express = require('express');
const app = express();
const port = 3000;

app.use(express.json());
let vehicle = [];
app.get('/vehicles',(req))