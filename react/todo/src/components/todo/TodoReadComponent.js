import React, {useEffect, useState} from 'react';
import {getTodo} from "../../apis/todoAPI";
import {useNavigate} from "react-router-dom";
import {deleteTodo} from "../apis/todoAPI";
import Typography from "@mui/material/Typography";
import Box from "@mui/material/Box";
import {Button, Checkbox, FormControlLabel, Stack, TextField} from "@mui/material";

function TodoReadComponent({id, moveToList, setResult}) {

    const navigate = useNavigate();
    const [todo, setTodo] = useState({});

    useEffect(() => {
        getTodo(id).then(result => {
            setTodo(result)
        })
    })

    // 삭제처리 함수
    const clickDelete = async () =>{
        const result = deleteTodo(id);
        setResult('삭제되었습니다.');
    }

    // 이전버튼 (목록으로 돌아가기, 수정취소)

    // Stack (spacing : 버튼의 간격)
    return (
        <>
            <Typography variant={'h4'} sx={{p:3}}>Todo Read Page</Typography>
            <Box sx={{p:1}}>
                <TextField variant="outlined" fullWidth name={'id'} label={'ID'} aria-readonly={true} value={String(todo.id)}></TextField>
            </Box>
            <Box sx={{p:1}}>
                <TextField variant="outlined" fullWidth name={'title'} label={'title'} aria-readonly={true} value={String(todo.title)}></TextField>
            </Box>
            <Box sx={{p:1}}>
                <TextField variant="outlined" fullWidth name="writer" label={'writer'}  aria-readonly={true} value={String(todo.writer)}></TextField>
            </Box>
            <Box sx={{p:1}}>
                <FormControlLabel control={<Checkbox checked={todo.complete}/>} label='Complete'/>
            </Box>
            <Box sx={{p:1}} display={"flex"} justifyContent={"right"}>
                <Stack spacing={2} direction={"row"}>
                    <Button variant={"contained"} onClick={()=> moveToModify()}>수정</Button>
                    <Button variant={"contained"} onClick={clickDelete}>삭제</Button>
                    <Button variant={"contained"} onClick={moveToList}>List</Button>
                </Stack>
            </Box>
        </>
    );
}

export default TodoReadComponent;