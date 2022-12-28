import React from "react";
import { useState } from "react";

function Reservation(props){
    const [ haveBreakfast, getHaveBreakfast] = useState(true)
    const [ guestofNum, getGuestofNum] = useState(5)

    const handleSubmit = (event)=>{
        event.preventDefault();
        alert(`조식여부는 ${haveBreakfast} 이고 방문객 수는 ${guestofNum}명 입니다.`)
    }

    return(
        <>
            <form onSubmit={handleSubmit}>
                <label>
                    조식여부 :
                    <input type="checkbox" checked={haveBreakfast} onChange={(event)=>{
                        getHaveBreakfast(event.target.checked)
                    }}/>
                </label>
                <label>
                    방문객 수 :
                    <input type="text" value={guestofNum} onChange={getGuestofNum} />
                </label>
                <br/>
                <button type="submit">제출</button>
            </form>
        </>
    )

}
export default Reservation;