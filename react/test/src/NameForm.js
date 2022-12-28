import React, { useState } from "react";

function NameForm(props){

    const [value,setValue] = useState('');  // 초기값 설정

    const handleChange = (event) =>{
        setValue(event.target.value) // (event.target) : event가 실행된 엘리먼트를 가르킴
    }

    const handleSubmit = (event)=>{
        event.preventDefault();
        alert('입력한 이름은' + value)
    }

    return(
        <>
            <form onSubmit={handleSubmit}>
                <label>
                    이름 :
                    <input type="text" value={value} onChange={handleChange}></input>
                </label>
                <button type="submit">제출</button>
            </form>
        </>
    )
}
export default NameForm;