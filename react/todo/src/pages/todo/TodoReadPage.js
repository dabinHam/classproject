import React, {useState} from 'react';
import PageLayout from "../../layout/PageLayout";
import Ex1 from "../../components/ex/Ex1";
import {Dialog, DialogTitle, Grid, Paper} from "@mui/material";
import {useNavigate, useParams} from "react-router-dom";
import Typography from "@mui/material/Typography";

function TodoReadPage(props) {

    // router readpage 부분에 cmd 를 추가했기 때문에 여기에도 추가해주기
    const {cmd, id} = useParams();

    const [msg, setMsg] = useState(null);
    const navigate = useNavigate();

    const setResult = (result) => {
        setMsg(result)
    }
    const closeAndMove = () => {
        setMsg(null)
        navigate("/todo/list")
    }

    // 컴포턴트 가져오기
    const getComponent = () =>{
        if(cmd === 'read'){ // TodoReadComponent : 하나의 데이터를 서버로부터 가져와서 읽어야함. 내부에서 삭제처리까지 함. 삭제시 삭제되었다는 메시지 출력
            return;
        }else if(cmd === 'modify'){
            return null;
        }
        return <></>;
    }

    return (
        <PageLayout title={'Todo Read Page'}>
            <Grid item xs={12} md={12} lg={12}>
                <Paper sx={{p:2, display:'flex', flexDirection:'column'}}>
                    <h1>Todo Read Page</h1>
                    <Typography variant={'h3'}>{id}</Typography>
                    <Ex1></Ex1>
                </Paper>
            </Grid>

            <Dialog open={msg!=null} onClose={closeAndMove} aria-labelledby="alert-dialog-title" aria-describedby="alert-dialog-description" id="alert-dialog-title">
                <DialogTitle>처리 결과</DialogTitle>
                {<Typography variant={'h6'}>{msg}</Typography>}
            </Dialog>
        </PageLayout>
    );

}

export default TodoReadPage;