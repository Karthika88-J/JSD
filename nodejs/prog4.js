// import event 
var  events=require("events")

//create object to events emitter
var eventEmitter=new events.eventEmitter();
// bind event (called)
const dis=()=>{
    console.log("events called")
}
eventEmitter.on("karthika",dis)
//file event (calling)
eventEmitter.emit("karthika")
eventEmitter.emit("karthika")
eventEmitter.emit("karthika")
eventEmitter.emit("karthika")
