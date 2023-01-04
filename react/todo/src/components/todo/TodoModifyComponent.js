import React, {useEffect, useState} from 'react';
import {getTodo, putTodo} from "../apis/todoAPI";
import Typography from "@mui/material/Typography";
import Box from "@mui/material/Box";
import {Button, Checkbox, FormControlLabel, Stack, TextField} from "@mui/material";

function TodoModifyComponent({id,setResult}) {

    // form을 수정하기 때문에 상태관리를 해야해서 useState를 사용해줘야한다.
    const [todo, setTodo] = useState({});

    useEffect(()=>{
        getTodo(id).then(result=>{
            setTodo(result);
        })
    })

    const changeTodo = (e) => {
        todo[e.target.name] = e.target.value()
        setTodo({...todo})
    }

    const changeTodoComplete = (e) =>{
        todo['complete'] = e.target.checked
        setTodo({...todo})
    }

    const clickModify = async () => {
        const result = await putTodo(todo)
        setResult('수정되었습니다.')
    }


    return (
        <>
            <Typography variant={'h4'} sx={{p:3}}>Todo Modify Page</Typography>
            <Box sx={{p:1}}>
                <TextField variant="outlined" fullWidth name={'id'} label={'ID'} value={String(todo.id)} onChange={(e)=>changeTodo(e)}></TextField>
            </Box>
            <Box sx={{p:1}}>
                <TextField variant="outlined" fullWidth name={'title'} label={'title'} value={String(todo.title)} onChange={(e)=>changeTodo(e)}></TextField>
            </Box>
            <Box sx={{p:1}}>
                <TextField variant="outlined" fullWidth name="writer" label={'writer'}  value={String(todo.writer)} onChange={(e)=>changeTodo(e)}></TextField>
            </Box>
            <Box sx={{p:1}}>
                <FormControlLabel control={<Checkbox checked={todo.complete} onChange={(e)=>changeTodoComplete(e)}/>} label='Complete'/>
            </Box>
            <Box sx={{p:1}} display={"flex"} justifyContent={"right"}>
                <Stack spacing={2} direction={"row"}>
                    <Button variant={"contained"} >수정</Button>
                    <Button variant={"contained"} onClick={()=>clickModify()}>삭제</Button>
                    <Button variant={"contained"} >취소(이전)</Button>
                    <Button variant={"contained"} >List</Button>
                </Stack>
            </Box>
        </>
    );
}

export default TodoModifyComponent;