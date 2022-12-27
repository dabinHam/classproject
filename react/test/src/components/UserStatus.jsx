import React from "react";


// 조건부렌더링
// 인라인조건 if-else문
function UserStatus(props){

    return(
        <>
            현재 사용자는 <br/>
            {props.isLogin ? '로그인':'비 로그인'} 상태입니다.
        </>
    )


}
export default UserStatus;