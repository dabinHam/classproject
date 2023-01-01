import React from "react";
import { useState } from "react";
import Details from "./Detail";
import Display from "./Display";
// Controller의 역할
// 하위 컴포넌트에 전달할 데이터를 가지고 있어야 한다!
// 상태 값을 가지고 있고 하위 컴포넌트에 전달!
// 상태 값을 변경해주는 핸들러함수 하위컴포넌트에 전달!
function Container(props){

    const styles = {
        wrapper: {
            padding: 16,
            display: "flex",
            flexDirection: "row",
            justifyContent: "space-around" 
        },
        box : {border : "3px solid #333"}
    };

    const menus = [
        {mno:1, name: '상품1', price: 4000},
        {mno:2, name: '상품2', price: 5000},
        {mno:3, name: '상품3', price: 6000},
        {mno:4, name: '상품4', price: 7000},
        {mno:5, name: '상품5', price: 8000},
    ]

    const [selectedMenu, setSelectedMenu] = useState();

    const changeMenu = (mno) => {
        const menu = menus.find(m => m.mno === mno)
        setSelectedMenu(menu)
    }

    return (
        <div style={styles.wrapper}>
            <Display arr={menus} changeMenu={changeMenu}></Display>
            <Details menu={selectedMenu}></Details>
        </div>
    );

}
export default Container;