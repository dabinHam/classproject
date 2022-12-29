import React from "react";
import { useState } from "react";

function RequestForm(props){

    const [value,setValue] = useState('요청사항을 입력하세요!');

    const handleChange = (event) =>{
        setValue(event.target.value);
    }

    const handleSubmit = (evnet)=> {
        evnet.preventDefault();
        alert('요청사항 : ' + value);
    }

    return(
        <form onChange={handleSubmit}>
            <label>
                요청사항 :
                <textarea value={value} onChange={handleChange}></textarea>
                <br/>
                <button type="submit">제출</button>
            </label>
        </form>
    )

}
export default RequestForm;