import React from "react";
import { useCallback } from "react";
import { useState } from "react";
import MainContent from "./MainContent";
import ThemeContext from "./ThemeContext";

function DarkOrWhite(props){

    // 사용자가 버튼을 눌러서 상태값을 변경할때 변경하는 버튼을 MainContext에서 만들어 질수있게 처리해보고자 함. 

    const [theme, setTheme] = useState('light');

    // [theme]가 변경되면 useCallback도 새롭게 처리되는
    const toggleTheme = useCallback(()=>{
        if(theme == 'light'){
            setTheme("dark")
        }else if(theme == 'dark'){
            setTheme("light")
        }
    },[theme]);

    return(

        <ThemeContext.Provider value={{theme, toggleTheme}}>
            <MainContent/>
        </ThemeContext.Provider>
    )


}
export default DarkOrWhite;