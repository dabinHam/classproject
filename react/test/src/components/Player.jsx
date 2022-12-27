import React from "react";

function Player(props){

    const name = props.PlayerName
    const number = props.PlayerNumber

    return(
        <ul>
            <li>선수 이름 : {name} </li>
            <li>선수 번호 : {number} </li>
        </ul>
    )
}

export default Player;