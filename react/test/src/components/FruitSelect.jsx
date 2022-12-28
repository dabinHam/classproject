import React from "react";
import { useState } from "react";

function FruitSelect(props){

    const [value,setValue] = useState('');

    const handleChange = (event) =>{
        setValue(event.target.value);
    }

    const handleSubmit = (evnet)=> {
        evnet.preventDefault();
        alert('선택한과일 : ' + value);
    }

    return(
        <form onChange={handleSubmit}>
            <label>
                과일선택 :
                <select value={value} onChange={handleChange}>  
                    <option value="apple">사과</option>
                    <option value="banana">바나나</option>
                    <option value="grape">포도</option>
                    <option value="orange">오렌지</option>
                </select>
                <br/>
                <button type="submit">제출</button>
            </label>
        </form>
    )

}
export default FruitSelect;