const express = require('express');
const path = require("path");
const app = express();
const connectDB = require("./db/conn.js"); // Corrected path to the connection file
const static_path = path.join(__dirname, "../public"); // Adjusted path to the public directory
app.use(express.static(static_path));
const startServer = async () => {
    // First, connect to the database. The app will exit if this fails.
    await connectDB();

    // Then, set up routes
    app.use("/api", (req, res, next) => {
        res.send("Hello, World!");
    });

    // Finally, start the server
    app.listen(1000, () => {
        console.log("Server is running on port 1000");
    });
};

startServer();
