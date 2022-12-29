import React from "react";
import { useState } from "react";

function Update(props){
    // 이름, 사진, 가격

    const [name,setName] = useState('')
    const [img,setImg] = useState('');
    const [price,setPrice] = useState('');

    const handleChangeName = (event) => {
        setName(event.target.value);
    };

    const handleChangeImg = (event) => {
        setImg(event.target.value);
    };

    const handleChangePrice = (event) => {
        setPrice(event.target.value);
    };

    const handleSubmit = (event) => {
        alrert(`상품명:${name}, 금액 :${price}`)
        event.preventDefault();
    }


    return(
        <>
            <form onSubmit={handleSubmit}>
                <label>
                    상품명 : 
                    <input type="text" value={name} onChange={handleChangeName}/>
                </label>
                <label>
                    이미지 : 
                    <input type="file" value={img} onChange={handleChangeImg}/>
                </label>
                <label>
                    금액 : 
                    <input type="text" value={price} onChange={handleChangePrice}/>
                </label>
                <button type="submit">제출</button>
            </form>
        </>
    )


}

export default Update;