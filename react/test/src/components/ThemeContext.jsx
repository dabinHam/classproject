import React from "react";

// 여기서 초기값을 만들지 않고 프로바이드 통하여 값을 넣어줄예정
const ThemeContext= React.createContext();
ThemeContext.displayName="ThemeContext";

export default ThemeContext;