import React from "react"; 
import { useState } from "react";
import Dialog from "./Diaolog";

let room = [];

function SignUpDiaolog(props){

    const [nickName,setNickName] = useState('');

    const handleClick = (event) =>{
        alert(`어서오세요~!! ${nickName}님`);
        room.push(nickName)
        setNickName('')
    }
    return(
            <Dialog title="프로젝트 팀 참여" message="닉네임을 입력해주세요>">
            <input type="text" value={nickName} 
            onChange={(event)=>setNickName(event.target.value)} />
            <button type="submit" onClick={handleClick}>참여 하기</button>
            <div>
                {room.map((name,index)=>{
                    return<p key={index}>{name}</p>
                })}
            </div>
            </Dialog>

    )
}
export default SignUpDiaolog;