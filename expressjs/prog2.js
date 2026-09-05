
const {MongoClient}=require("mongodb")
var bp=require("body-parser")
var exp=require("express");
const bodyParser = require("body-parser");
var app=new exp()
var urlencoderparser=bp.urlencoded({extended:false});
var usr,pwd;
//get method api

app.post("/testfun",urlencoderparser,async(request,response)=>{
 usr=request.body.usr;
 pwd=request.body.psd;
 const data={"usr":usr,"pwd":pwd}
 var client=new MongoClient("mongodb://127.0.0.1:27017/");
client.connect()
response.write("<h1>Express and Mongodb connection success</h1>")
try{

    const result= await client.db("jsd").collection("login").insertOne(data)
    console.log(result)
    response.write("<h1>Susscessfuly INserter </h1>")
}
catch{
    console.log("error")
    response.write("<h1>data eror </h1>")
}

//response.se
// nd("<h1>welcome to express Js</h1>")
/*response.write("<h1>user name:"+usr+"</h1>");
response.write("<h1>password :"+pwd+"</h1>");
if(usr==="admin" && pwd==="admin@123")
{
    response.write("<font color='green' size='7'> valid user </font>");
}
else {
response.write("<font color='red' size='7'> invalid user </font>");
}*/
response.end()

}).listen(8991)
console.log("port listen at 8991....")