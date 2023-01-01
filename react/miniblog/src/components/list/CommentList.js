import React from 'react';
import styled from "styled-components";
import CommentListItem from "./CommentListItem";

const  Wrapper= styled.div`
    display: flex;
    flex-direction: column;
    justify-content: center;
    
    & > * {
    :not(:last-child){
    margin-bottom:10px;
        }
    }
`;



function CommentList({comments}) {    // posts : 배열(받아야하는 항목들) | onClickItem : Item을 클릭했을때 들어오는 항목들
    return (
        <Wrapper>
            {comments.map(comment =>{
                return (
                   <CommentListItem key={comment.id} comment={comment}/>
                )
            })}
        </Wrapper>
    );
}

export default CommentList;