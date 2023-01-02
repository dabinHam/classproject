import React from 'react';
import PageLayout from "../../layout/PageLayout";
import Ex1 from "../../components/ex/Ex1";
import {Grid, Paper} from "@mui/material";
import {useParams} from "react-router-dom";
import Typography from "@mui/material/Typography";

function TodoReadPage(props) {

    const {id} = useParams();

    return (
        <PageLayout title={'Todo Read Page'}>
            <Grid item xs={12} md={12} lg={12}>
                <Paper sx={{p:2, display:'flex', flexDirection:'column'}}>
                    <h1>Todo Read Page</h1>
                    <Typography variant={'h3'}>{id}</Typography>
                    <Ex1></Ex1>
                </Paper>
            </Grid>
        </PageLayout>
    );

}

export default TodoReadPage;