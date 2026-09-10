// import event 
var  events=require("events")

//create object to events emitter
var eventEmitter=new events.eventEmitter();
// bind event (called)

eventEmitter.on("karthika",()=>{
    console.log("events called ")
})
//file event (calling)
eventEmitter.emit("karthika")
eventEmitter.emit("karthika")
eventEmitter.emit("karthika")
eventEmitter.emit("karthika")
