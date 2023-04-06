
document.addEventListener('DOMContentLoaded',()=>{

    // 문서 객체 생성
    const input = document.querySelector('#newTodo');   // input 입력값 
    const addBtn = document.querySelector('#addBtn');   // 추가버튼
    const todolist = document.querySelector('#todoList');   // 입력값이 추가된 결과

    // 핸들러 함수 선언 전 카운트 변수 선언
    let cnt =0;

    // 핸들러 함수
    const addTodo = function(){
        // console.log('할일추가');
        // console.log(input.value);
        if (input.value.trim() === '') {
            alert('할일을 입력해주세요!!!');
            return;      // return은 반환도 하지만 아래로 내려가지않고 종료해주는 역할도 할 수 있다.
        }

        // 동적으로 추가할 엘리먼트 생성 
        const newDiv = document.createElement('div');
        const checkBox = document.createElement('input');
        const todo = document.createElement('span');
        const delBtn = document.createElement('button');

        // 생성된 엘리먼트 추가
        newDiv.appendChild(checkBox);
        newDiv.appendChild(todo);
        newDiv.appendChild(delBtn);
        

        // 속성 설정
        newDiv.style.padding = '10px';
        // 상수로 만들어둔 이유는 이벤트하는시점에 값이 달라져있으면 문제가 생기기 때문 . 
        // 추가해야하는 값도 상수로 만들어야함. 
        // const key = cnt;
        // cnt += 1;
        const key = cnt++;

        newDiv.setAttribute('data-key',key);    // 필요할때 만들어서 사용한다. 

        checkBox.type = 'checkbox';
        todo.textContent = input.value;
        delBtn.textContent = '삭제';

        // 이벤트 적용
/*         checkBox.addEventListener('change',(event)=>{
            event.target.checked
            todo.style.textDecoration = 'line-through';
        }); */
        checkBox.addEventListener('change',(event)=>{
            
            todo.style.textDecoration = event.target.checked ? 'line-through' : '' ;
        });

        delBtn.addEventListener('click',()=>{
            removeTodo(key);
        });

        // todoList에 새로운 div를 추가 
        todolist.appendChild(newDiv);

        input.value=''; // 할일 추가 후 input에 입력했던 글자가 사라지게 만들어준다.
    
    };
    const removeTodo = function(key){
        const delElement = document.querySelector(`div[data-key="${key}"]`);
        todolist.removeChild(delElement);
    };

    // 이벤트 연결 
    addBtn.addEventListener('click', addTodo);

});

/* 
    1. 문서 객체 설정 
    2. 핸들러 함수 
    3. 이벤트 연결 
    4. 핸들러함수{할일추가(if문)}
    5. 핸들러함수{todoList에 새로운 div를 추가 }
    6. 핸들러함수{동적으로 추가할 엘리먼트 생성}
    7. 핸들러함수{생성된 엘리먼트 추가}
    8. 핸들러함수{속성 설정}
    9. 이벤트 적용
*/