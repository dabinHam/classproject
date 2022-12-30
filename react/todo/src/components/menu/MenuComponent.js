import React from 'react';
import {Dashboard} from "@mui/icons-material";
import List from "@mui/material/List";
import ListItemButton from "@mui/material/ListItemButton";
import ListItemIcon from "@mui/material/ListItemIcon";
import ListItemText from "@mui/material/ListItemText";
import IconButton from "@mui/material/IconButton";

const menuArr=[
    {icon:<Dashboard/>,text:"Todo 리스트"},
    {icon:<Dashboard/>,text:"Todo 등록"},
    {icon:<Dashboard/>,text:"로그인"},
    {icon:<Dashboard/>,text:"회원가입"}
]

function MenuComponent(props) {

    return (
        <List>
            {menuArr.map((menu,index)=>{
                return(
                    <IconButton key={index}>
                        <ListItemIcon>{menu.icon}</ListItemIcon>
                        <ListItemText primary={menu.text}></ListItemText>
                    </IconButton>
                )
            })}
        </List>
    );
}

export default MenuComponent;