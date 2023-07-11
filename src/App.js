
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import Login from './libra/Login';
import Home from './libra/Home';
function App() {
  return (
    <div className="App">
      <BrowserRouter>
      <Routes>
        <Route path="/login" element={<Login/>}></Route>
        <Route path="/" element={<Login/>}></Route>
       <Route path="/home" element={<Home/>}>s</Route>

      </Routes>
      </BrowserRouter>
    
    
     </div>
  );
}

export default App;
