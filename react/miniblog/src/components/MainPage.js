import React from "react";
import styled from "styled-components";

const Wrapper = styled.div`
    padding:1em;
    background-color:lightcoral;
    display:flex;
    flex-direction:row;
    align-items:flex-start;
    text-align:center;
`;

const Block = styled.div`
    padding:${props=>props.padding};
    border:1px solid black;
    border-radius:1rem;
    background-color : ${props=>props.bc};
    color:white;
    font-size:2rem;
    font-weight: bold;
`;

const Title = styled.h1`
    font-size:150%;
    color:white;
    text-align:center;
`;

const Button=styled.button`
    color:${props => props.dark ? "white":"black"};
    background-color:${props => props.dark ? "black":"white"};
    border:3px solid black;
    cursor:pointer;
    margin:10px;
    padding:5px;
`;

const RoundedBtn = styled(Button)`
    border-radius: 5px;
`;

const blockItems= [
    {label:"아메리카노",padding:"1rem",backColor:"tan"},
    {label:"홍차",padding:"2rem",backColor:"green"},
    {label:"우유",padding:"3rem",backColor:"lavender"}
];

function MainPage(props){
    return(
        <>
            <Wrapper>
{/*                <Title>
                    안녕하세요
                </Title>

                <Button>Button A</Button>
                <Button dark>Button B</Button>
                <RoundedBtn>Button C</RoundedBtn>*/}

                {blockItems.map( (item,index) =>{
                    return(
                        <Block key={index} padding={item.padding} bc={item.backColor}>{item.label}</Block>
                    )
                })}
            </Wrapper>
        </>
    )
}
export default MainPage;