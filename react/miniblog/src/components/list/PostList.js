import React from 'react';
import styled from "styled-components";
import PostListItem from "./PostListItem";

const  Wrapper= styled.div`
    margin-top: 10px;
    display:flex;
    flex-direction: column;
    justify-content: center;
    
    & > * {
    :not(:last-child){
        margin-bottom:16px;
        }
    }
`;



function PostList({posts,onClickItem}) {    // posts : 배열(받아야하는 항목들) | onClickItem : Item을 클릭했을때 들어오는 항목들
    return (
        <Wrapper>
            {posts.map(post =>{
                return (
                    <PostListItem key={post.id} post={post} onClick={()=>onClickItem(post)}/>
                )
            })}
        </Wrapper>
    );
}

export default PostList;