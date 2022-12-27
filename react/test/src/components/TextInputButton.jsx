import React,{useRef} from "react";

function TextInputButton(props){

    const inputEl = useRef(null);

    const onButtonClick = () => { 
        // current : 연결되어있는 객체 input을 가리킨다! , 마운트된 input element 를 가리킴
        inputEl.current.focus();
        inputEl.current.value='new Message'
    }

        /* ref : 어디랑 연결해서 참조,사용 할지  |  연결되었다 = mount되었다. 
       onClick : 이벤트 연결시 사용 */
    return(
        <div>
            <input ref={inputEl} type="text" />
            <button onClick={onButtonClick}>클릭!</button>
        </div>
    )
}

export default TextInputButton;