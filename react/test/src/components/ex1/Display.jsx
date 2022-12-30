import React from "react";


// 상위 컴포넌트에서 배열을 받아서 리스트출력
// 함수를 받아서 클릭이벤트에 적용할 핸들러를 받고 적용
// 
function Display({arr,changeMenu}){
    // (props) 대신에 {arr,changeMenu}를 넣어주면 아래에 따로 선언하지 않고도 사용할 수 있다.
    
    return (
        <div style={{border: "3px solid #333", padding: 10, width: 200}}>
            <ul>
                {arr.map(menu =>
                    <li key={menu.mno} onClick={() => changeMenu(menu.mno)}>{menu.name} </li>)}
            </ul>
        </div>
    );


}
export default Display;