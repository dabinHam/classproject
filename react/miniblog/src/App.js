import logo from './logo.svg';
import './App.css';
import MainPage from "./components/page/MainPage";
import styled from "styled-components";
import {BrowserRouter, Route, Routes} from "react-router-dom";
import PostViewPage from "./components/page/PostViewPage";
import PostWritePage from "./components/page/PostWritePage";

const MainTitleText = styled.p`
  font-size:24px;
  font-weight: bold;
  text-align:center;
`;

function App() {
  // http://localhost:3000/ "post-write"  local주소 뒤에들어가는것.
  return (
      <BrowserRouter>
        <MainTitleText>mini Blog</MainTitleText>
        <Routes>
          <Route index element={<MainPage/>}/>
          <Route path={"post/:postId"} element={<PostViewPage/>}/>
          <Route path={"post-write"} element={<PostWritePage/>}/>

        </Routes>
      </BrowserRouter>
  );
}

export default App;
