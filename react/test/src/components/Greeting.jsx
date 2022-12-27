import React from "react";

// 조건부 렌더링 , 엘리먼트 변수
// 1. 미리 상태값 만들어 놓고 
function UserGreeting(props){
    return(
        <h1>다시 오셨군요 !</h1>
    )
}

function GuestGreeting(props){
    return <h1>회원가입을 해주세요!</h1>;
}

// 2. 조건별 분기 나눠주기
function Greeting(props){

    const isLogin = props.isLogin
/*     if(isLogin){
        return <UserGreeting/>
    }
    return <GuestGreeting/> */

    // 인라인조건 if-else문
    return(
        <>
        {isLogin ? <UserGreeting/> : <GuestGreeting/>}
        </>
    )
}
export default Greeting;