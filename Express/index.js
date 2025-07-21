const express = require("express");
const app = express();

let port = 8080;
app.listen(port , ()=>{
    console.log(`app is listen on port ${port}`);
});

// app.use((req ,res)=>{
//     console.log("request received");
//     res.send({
//         name :"apple",
//         color: "red"
//     });
// });

app.get("/" ,(req , res)=>{
    res.send("root path");
});

app.get("/apple" ,(req , res)=>{
    res.send("apple path");
});

app.get("/orange" ,(req , res)=>{
    res.send("orange path");
});