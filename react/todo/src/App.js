import logo from './logo.svg';
import './App.css';
import Ex1 from "./components/ex/Ex1";
import SamplePage from "./pages/SamplePage";
import {RouterProvider} from "react-router-dom";
import routers from "./routers";

function App() {
  return (
    // <SamplePage/>
      <>
        <RouterProvider router={routers}/>
      </>
  );
}

export default App;
