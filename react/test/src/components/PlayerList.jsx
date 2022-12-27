import React from "react";
import Player from "./Player";

function Team(props){

    return (
        <div>
            <Player PlayerName='SON' PlayerNumber='7'></Player>
            <Player PlayerName='LEE' PlayerNumber='20'></Player>
            <Player PlayerName='PARK' PlayerNumber='17'></Player>
        </div>
    )

}

export default Team;