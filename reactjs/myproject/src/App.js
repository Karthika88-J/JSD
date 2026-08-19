import React from 'react'

function App() {
  var n=0
  return (
    <div>
      <h1>given number is positive, negative, zero</h1>
      <h2>{n} is  {(n>0 && "positive") || (n<0 && "negative") ||"zero" }</h2>
    </div>
  )
}

export default App






















/*import React from 'react'

function App() {
  var n=2024;
  return (
    <div>
      <h1>Number {n}</h1>
      <h2>given number is even or odd</h2>
      <h2>{n} is {(n%4===0 && " leap year") ||" mot aleap year"}</h2>
        

    </div>
  )
}

export default App

/*import React from 'react'

function App() {
  var n=7;
  return (
    <div>
      <h1>Number {n}</h1>
      <h2>given number is even or odd</h2>
      <h2>{n} is {(n%2===0 && " even number") ||"Odd Number"}</h2>
        

    </div>
  )
}

export default App


/*import React from 'react'

function App() {
  var n1=34;
  var n2=54;
  return (
    <div>
      
      <h2>1.simple if/else statement Result</h2>
     <h2> number one {n1}</h2>
          <h2> number one {n2}</h2>
          <h1>{(n1>n2 && n1) || n2} is bigest number</h1>

    </div>
  )
}

export default App


*/

/* import React from 'react'

function App() {
  var mark=10;
  return (
    <div>
      <h1>mark : {mark}</h1>
      <h2>1.simple if statement Result</h2>
      <h2>{mark>34 && "Pass"}</h2>
            <h2>{mark<=34 && "Fail"}</h2>

    </div>
  )
}

export default App*/




/*import './App.css'
import React from 'react'
import myimg from './images/b1.jpg'

function App() {
  return (
    <div align="center">
    <img src={myimg} width="90%" alt="not found"></img>
    </div>
  )
}

export default App
**/


/*var App=()=>{
  var a=10
  var b=20
  var c=30
  return(
   <>
   <h1>add of two numbers</h1>
   <h2>A value:{a}</h2>
      <h2>B value:{b}</h2>

   <h2>C value:{c}</h2>
   <h2>Add values:{a+b+c}</h2>

   </>
  )
}
export default App;*/


/*function App(){
  return(
    <> one top level element
    <h1>Wecome to react</h1>
    <h2>Wecome to react</h2>
    <h3>Wecome to react</h3>

    </>
  )
}
export default App;*/

/*import React from "react";
class App extends React.Component{
  render(){
    return(
      <>
      <h1>Welcome to class Component</h1>
      <h2>Welcome to class Component</h2>
      <h1>Welcome to class Component</h1>

      
      </>
    )
  }
}
export default App;*/



/*import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;*/

