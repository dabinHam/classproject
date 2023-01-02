import axios from "axios";

// todo 등록
export const postTodo = async (todo) => {
    // todo => {title : '', writer : '', complete : false}
    const res = await axios.post('http://localhost/todos', todo);
    return res.data;
}

// todo list 가져오기
export const getTodoList = async () => {
    const res = await axios.get('http://localhost/todos');
    return res.data;
}

export const getTodo = async (id) =>{
    const rest = await  axios.get((`http://localhost/todos/${id}`))
}