const express = require('express');
const app = express();
const port = 3001;

app.use(express.json());

// In-memory vehicle data store
let vehicles = [];
let currentId = 1;

// GET /vehicles - get all vehicles
app.get('/vehicles', (req, res) => {
  res.json(vehicles);
});

// GET /vehicles/:id - get vehicle by id
app.get('/vehicles/:id', (req, res) => {
  const id = parseInt(req.params.id);
  const vehicle = vehicles.find(v => v.id === id);
  if (!vehicle) {
    return res.status(404).json({ error: 'Vehicle not found' });
  }
  res.json(vehicle);
});

// POST /vehicles - create new vehicle
app.post('/vehicles', (req, res) => {
  const { vehicleName, price, image, desc, brand } = req.body;
  if (!vehicleName || !price || !image || !desc || !brand) {
    return res.status(400).json({ error: 'All fields are required' });
  }
  const newVehicle = {
    id: currentId++,
    vehicleName,
    price,
    image,
    desc,
    brand
  };
  vehicles.push(newVehicle);
  res.status(201).json(newVehicle);
});

// PUT /vehicles/:id - update vehicle by id
app.put('/vehicles/:id', (req, res) => {
  const id = parseInt(req.params.id);
  const vehicleIndex = vehicles.findIndex(v => v.id === id);
  if (vehicleIndex === -1) {
    return res.status(404).json({ error: 'Vehicle not found' });
  }
  const { vehicleName, price, image, desc, brand } = req.body;
  if (!vehicleName || !price || !image || !desc || !brand) {
    return res.status(400).json({ error: 'All fields are required' });
  }
  const updatedVehicle = {
    id,
    vehicleName,
    price,
    image,
    desc,
    brand
  };
  vehicles[vehicleIndex] = updatedVehicle;
  res.json(updatedVehicle);
});

// DELETE /vehicles/:id - delete vehicle by id
app.delete('/vehicles/:id', (req, res) => {
  const id = parseInt(req.params.id);
  const vehicleIndex = vehicles.findIndex(v => v.id === id);
  if (vehicleIndex === -1) {
    return res.status(404).json({ error: 'Vehicle not found' });
  }
  vehicles.splice(vehicleIndex, 1);
  res.status(204).send();
});

app.listen(port, () => {
  console.log(`Vehicle API server running at http://localhost:${port}`);
});
