import axios from "axios";

// todo 등록
export const postTodo = async (todo) => {
    // todo => {title : '', writer : '', complete : false}
    const res = await axios.post('http://localhost/todos', todo)
    return res.data;
}