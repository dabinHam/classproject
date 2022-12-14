import React from 'react';
import {Grid, Paper} from "@mui/material";
import PageLayout from "../layout/PageLayout";

function MainPage(props) {
    return (
        <PageLayout title={'Main Page'}>
            <Grid item xs={12} md={12} lg={12}>
                <Paper sx={{p:2, display:'flex',flexDirection: 'column'}}>
                    <h1>Main Page</h1>
                </Paper>
            </Grid>
        </PageLayout>
    );
}

export default MainPage;