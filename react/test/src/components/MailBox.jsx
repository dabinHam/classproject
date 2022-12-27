import React from "react";

// 인라인 조건 if문
// if문을 필요한곳에 직접 집어넣어서 사용하는 방법
// 실제로 if문을 넣는것은 아니고, if문과 동일한 효과를 내기위해 &&라는 논리연산자를 사용
// && 연산자는 흔히 AND 연산 이라고 부르는데 양쪽에 나오는 조건문이 모두 true인 경우에만 전체 결과가 true가 된다.

function MailBox(props){

    /* 
    {unReadMessage} = [{},{},{},{},{},{},{},{}] 
    */
    // props.unReadmessage => []

    const unReadMessage = props.unReadMessage;

    return(
        <>
            <h1> Mail Box </h1>
            {unReadMessage.length> 0 && <h3> 현재 {unReadMessage.length}개의 읽지 않은 메시지가 있습니다.</h3>}
        </>
    )

}
export default MailBox;