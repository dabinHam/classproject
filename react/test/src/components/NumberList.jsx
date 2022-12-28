import React from "react";

function NumberList(props){

    const numbers = [1,2,3,77,5]

    // 배열의 map(callback 반환하는 값) => 새로운 배열
    // const listItems= numbers.map((number) => <li>{number}</li>);
    // map : 새로운 배열을 만든다 = 새로운 요소는 callback(= 반환값이 새로운 요소 )
    // <li>{number}</li> : 엘리먼트
    const listItems= numbers.map((number,index) => <li key={index}>{number}</li>);

    /* [{},{},{},{},{}] */

    return(
        <>
            <ul>
                {listItems}
            </ul>
        </>
    )

}
export default NumberList;