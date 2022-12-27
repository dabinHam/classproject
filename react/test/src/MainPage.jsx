import React from "react";
import { useState } from "react";
import ToolBar from "./components/ToolBar";

function MainPage(props){

    const [isLogin, setIsLogin] = useState(false);

    // 함수를 만들어서 (TollBar로) 전달 
    const onClickLogin = () => {
        setIsLogin(true)
    }

    const onClickLogout = () => {
        setIsLogin(false)
    }

    return(
        <>
            <ToolBar
                isLogin={isLogin}
                onClickLogin={onClickLogin}
                onClickLogout={onClickLogout}
            />

            <h3>안녕하세요 메인 인덱스 페이지 입니다.</h3>
        </>
    )

}
export default MainPage;