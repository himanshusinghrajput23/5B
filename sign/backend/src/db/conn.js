const mongoose = require("mongoose");

// The password "Himanshu@1409" contains a special character "@" which must be URL encoded to "%40".
const DB_URI = "mongodb+srv://admin:Himanshu%401409@cluster0.frmyqee.mongodb.net/blog?retryWrites=true&w=majority&appName=Cluster0";

const connectDB = async () => {
    try {
        // The .then() is not needed when using await
        await mongoose.connect(DB_URI);
        console.log("Connected to MongoDB");
    } catch (error) {
        console.error("Failed to connect to MongoDB. Please check your connection string and ensure your IP is whitelisted.", error);
        // Exit process with failure if the app can't connect to the DB
        process.exit(1);
    }
};

module.exports = connectDB;
