import logo from './logo.svg';
import './App.css';
import Comment from './components/Comment';
import Notification from './components/Notification';
import Counter from './components/Counter';
import TextInputButton from './components/TextInputButton';
import Accommodate from './components/Acommodate';


function App() {
  return (
    <Accommodate/>
  );
}

/* function App() {
  return (
    <TextInputButton/>
  );
} */

/* function App() {
  return (
    <Counter/>
  );
} */



/* function App() {
  return (
    <Notification message="안녕하세요"/>
  );
} */


/* const comment = {
  user : {
    userName : '손',
    imgUrl : 'https://ichef.bbci.co.uk/news/640/cpsprodpb/4118/production/_119546661_gettyimages-1294130887.jpg'
  },
  content : '대한민국 화이팅!',
  replyDate : '2022-12-26'
}

function App() {
  return (
    <Comment user={comment.user} content={comment.content} replyDate={comment.replyDate}/>
  );
} */

/* function App() {
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
 */

export default App;
