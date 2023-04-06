import React from "react";
import FancyList from "./FancyList";

function ListPage(props){

    return(
        <FancyList color="lavender">
            <h1>{props.titM}</h1>
            <span>{props.titS}</span>
            {props.children}
        </FancyList>
    )

}

export default ListPage;