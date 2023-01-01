import logo from './logo.svg';
import './App.css';
import Comment from './components/Comment';
import Notification from './components/Notification';
import Counter from './components/Counter';
import TextInputButton from './components/TextInputButton';
import Accommodate from './components/Acommodate';
import Toggle from './components/Toggle';
import MyButton from './components/MyButton';
import ConfirmButton from './components/ConfirmButton';
import Greeting from './components/Greeting';
import LoginControl from './components/LoginControl';
import MailBox from './components/MailBox';
import UserStatus from './components/UserStatus';
import WarnningBanner from './components/WarnningBanner';
import ToolBar from './components/ToolBar';
import MainPage from './components/MainPage';
import NumberList from './components/NumberList';
import TemPlayers from './components/TemPlayers';
import NameForm from './components/NameForm';
import RequestForm from './components/RequestForm';
import FruitSelect from './components/FruitSelect';
import Reservation from './components/Reservation';
import Signup from './components/Signup';
import FancyBorder from './components/FancyBorder';
import WelcomeMessage from './components/WelcomeMessage';
import WelcomeDialog from './components/WelcomeDialog';
import SignUpDiaolog from './components/SignUpDiaolog';
import Card from './components/Card';
import ProfileCard from './components/ProfileCard';
import DarkOrWhite from './components/DarkOrWhite';
import WordContainer from './components/ex2/WordContainer';
import Container from './components/ex1/Container';

function App() {
  return (
    <Container/>
  );
}


/* function App() {
  return (
    <DarkOrWhite/>
  );
} */

/* function App() {
  return (
    <ProfileCard/>
  );
} */

/* function App() {
  return (
    <SignUpDiaolog/>
  );
} */

/* function App() {
  return (
    <WelcomeDialog/>
  );
} */

/* function App() {
  return (
    <WelcomeMessage/>
  );
}
 */

/* function App() {
  return (
    <Signup/>
  );
} */

/* function App() {
  return (
    <Reservation/>
  );
} */


/* function App() {
  return (
    <FruitSelect/>
  );
} */


/* function App() {
  return (
    <RequestForm/>
  );
} */


/* function App() {
  return (
    <NameForm/>
  );
} */


/* function App() {
  return (
    <TemPlayers/>
  );
} */

/* function App() {
  return (
    <TemPlayers/>
  );
} */

/* function App() {
  return (
    <NumberList/>
  );
} */

/* function App() {
  return (
    <MainPage/>
  );
} */

/* function App() {
  return (
    // <WarnningBanner warning={false}/>  // 화면이 출력되지 않음.
    <WarnningBanner warning={true}/>  // 경고 !!!!
  );
} */

/* function App() {
  return (
    <UserStatus isLogin={false}/>
  );
} */

/* let list = [{},{},{},{},{},{},{},{}]

function App() {
  return (
    <MailBox unReadMessage ={list}/>
  );
} */

/* function App() {
  return (
    <LoginControl/>
  );
} */


/* // 상위컴포넌트에서 하위컴포넌트로 상태,데이터 공유
function App() {
  return (
    // <Greeting isLogin={false}/>  // 회원가입을 해주세요!
    <Greeting isLogin={true}/>    // 다시 오셨군요 !
  );
} */

/* function App() {
  return (
    <ConfirmButton/>
  );
} */

/* function App() {
  return (
    <MyButton/>
  );
} */


/* function App() {
  return (
    <Toggle/>
  );
} */

/* function App() {
  return (
    <Accommodate/>
  );
} */

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
