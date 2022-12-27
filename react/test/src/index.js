import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import reportWebVitals from './reportWebVitals';
import Comment from './components/Comment';
import App from './App';

const root = ReactDOM.createRoot(document.getElementById('root'));

/* function tick(){  // tick() :  시간마다 화면을 갱신해주기 위하여 
                  // StrictMode : 코드에 문제가있는지 확인하기 위한거라서 없어도 상관은 없음. 
  root.render(
    <React.StrictMode> 
      <Clock/>
    </React.StrictMode>
  );
}

setInterval(tick,1000); */

 
  root.render(
    <React.StrictMode>  
      <App/>
    </React.StrictMode>
  );




// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
