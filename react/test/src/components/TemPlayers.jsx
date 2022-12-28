import React from "react";

const players = [
    {id:1, name:'빨강색'},
    {id:2, name:'보라색'},
    {id:3, name:'노란색'},
    {id:4, name:'핑크색'}
]

// 구조화 되어있는 경우 map() 이용하여 엘리먼트 생성하기 
function TemPlayers(props){

    return(
        <>
            <ul>
                {
                    players.map((player, index) => {
                        return <li key={player.id}>{player.name}</li>
                    })
                }
            </ul>
        </>
    )

}

export default TemPlayers;