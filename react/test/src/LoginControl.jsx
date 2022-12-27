import React from "react";
import { useState } from "react";

    // props를 통하여 onClick에 함수를 전달받으려고 함. 
    // <button onClick={props.onClick}>  여기서의 onClick은 속성이름
    // props.onClick의 부분은 내가 선언하는 변수명같은거임 . 이름이 같으면 헷갈릴수있어서 수정.
    // return의 값은 단순 UI ,  props(속성)을 통해서 이벤트를 받아옴. 

    function LoginButton(props){
        return(
            <>
                <button onClick={props.handleClick}>    
                    로그인
                </button>
            </>
        )
    }

    function LogoutButton(props){
        return(
            <>
                <button onClick={props.handleClick}>    
                    로그아웃
                </button>
            </>
        )
    }

    function LoginControl(props){
        const [isLogin, setIsLogin] = useState(false);

        const handleLoginClick = () => {
            setIsLogin(true);
        }

        const handleLogoutClick = () =>{
            setIsLogin(false);
        }

        let btn;

        if(isLogin){
            btn = <LogoutButton handleClick={handleLogoutClick}/>
        } else{
            btn = <LoginButton handleClick={handleLoginClick}/>
        }

        return(
            <>
                {btn}
            </>
        )
    }   
export default LoginControl;