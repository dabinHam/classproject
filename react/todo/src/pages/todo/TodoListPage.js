import React from 'react';
import PageLayout from "../../layout/PageLayout";
import Ex1 from "../../components/ex/Ex1";
import {Button, Grid, Paper} from "@mui/material";
import {useNavigate, useSearchParams} from "react-router-dom";
import Typography from "@mui/material/Typography";

function TodoListPage(props) {

    const [searchParams, setSearchParams] = useSearchParams()

    const navigate = useNavigate()

    const page = searchParams.get("page")
    const size = searchParams.get("size")

    const clickMove = (page, size) => {
        setSearchParams({page, size})
    }

    const clickRegister = () => {
        navigate("/todo/register")
    }

    const moveToRead = (id) => {
        const pageNum = page;
        const sizeNum = size;
        navigate({pathname:`/todo/read/${id}`, search:`?page=${pageNum}&size=${sizeNum}`})
    }

    const query = {page, size}

    return (
        <PageLayout title={'Todo List Page'}>
            <Grid item xs={12} md={12} lg={12}>
                <Paper sx={{p:2, display:'flex', flexDirection:'column'}}>
                    <h1>Todo List Page</h1>
                    <Typography variant={'h5'}>page:{page}</Typography>
                    <Typography variant={'h5'}>size:{size}</Typography>
                    <Button onClick={clickRegister}>등록</Button>
                    <Button onClick={()=>clickMove(3, 5)}>Move</Button>
                    <Ex1></Ex1>
                </Paper>
            </Grid>
        </PageLayout>
    );

}

export default TodoListPage;