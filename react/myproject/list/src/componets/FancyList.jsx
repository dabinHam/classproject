import React from "react";

function FancyList(props){
    return(
        <div className={'border-'+props.color}>
            {props.children}
        </div>
    )
}

export default FancyList; 