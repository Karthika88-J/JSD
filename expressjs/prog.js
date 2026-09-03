var exp=require("express")
var app=new exp()
var usr,pwd;
//get method api

app.get("/testfun",(request,response)=>{
 usr=request.query.usr;
 pwd=request.query.psd;

//response.se
// nd("<h1>welcome to express Js</h1>")
response.write("<h1>user name:"+usr+"</h1>");
response.write("<h1>password :"+pwd+"</h1>");
if(usr==="admin" && pwd==="admin@123")
{
    response.write("<font color='green' size='7'> valid user </font>");
}
else {
response.write("<font color='red' size='7'> invalid user </font>");
}
response.end()

}).listen(8991)
console.log("port listen at 8991....")