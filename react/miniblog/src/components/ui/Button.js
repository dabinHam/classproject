import React from "react";
import styled from "styled-components";

const StyledButton = styled.button`
    padding:8px 16px;
    font-size:16px;
    border-width:1px;
    border-radius:8px;
    cursor:pointer;
`

function Button({title,onClick}){
    // {title || "Button"} : title가 false가 된다면 "Button"이 처리된다.
    return(
        <div>
            <StyledButton onClick={onClick}>
                {title || "Button"}
            </StyledButton>
        </div>
    )
}
export default Button;