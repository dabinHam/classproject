import React from "react";
import { useContext } from "react";
import ThemeContext from "./ThemeContext";

function MainContent(props){
    
    // const color = props.color;

    const {theme,toggleTheme} = useContext(ThemeContext);
    // context 안에는 내가 공유하고싶은 상태값이 들어있음.

    //  테마에 따라 배경을 흰색 또는 검정색
    return(
        <div style={{
            width : '100vw',
            height : '100vh',
            padding : '1.5rem', // 1.5rem = 150%
            backgroundColor : theme == 'light' ? "white" : "black",
            color : theme == 'light' ? "black" : "white"
        }}>
            <p>안녕하세요 테마변경이 가능한 웹 사이트 입니다.</p>
            <button onClick={toggleTheme}>테마변경</button>
        </div>
    )


}

export default MainContent;