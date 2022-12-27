import React from "react";
import { useState } from "react";

function ConfirmButton(props){
// 동의를 목적으로 하는 경우 사용하기도 한다. 
    const [isConfirmed , setIsConfirmed] = useState(false);

    const handleConfirm = () => {
        setIsConfirmed((prevIsConfirmed) => !prevIsConfirmed)
    }

    return(
        <>
            <button onClick={handleConfirm} disabled={isConfirmed}>
                {isConfirmed ? '확인 완료':'확인 하기'}
            </button>
        </>
    )
}

export default ConfirmButton;