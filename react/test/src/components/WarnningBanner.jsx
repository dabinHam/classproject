import React from "react";


// props 는 박스라고 생각하기 -> 담아서 받을수 있는 ! 
function WarnningBanner(props){

    // true : 위험 !!!! | false : 화면 출력 하지 않는 처리

    if(!props.warning){
        return null;
    }

    return(
        <>
            <h1>경고!!!!</h1>
        </>
    )

}

export default WarnningBanner;