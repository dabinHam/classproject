import React from "react";
import Card from "./Card";

function ProfileCard(props){

    return(
        <Card title="냐옹이" backgroundColor={'lightpink'}>
            <h1>안녕하세요 (둠칫둠칫)</h1>
            <img src="https://item.kakaocdn.net/do/49f9f0f4d4f24f6321023f14f967e5ddf43ad912ad8dd55b04db6a64cddaf76d" alt="고양이짤" />
        </Card>
    )

}
export default ProfileCard;