document.addEventListener('DOMContentLoaded',()=>{

    /* 문서 객체 생성 */
    // const input = document.querySelector('#newList');   // input입력값
    // const addBtn = document.querySelector('#addBtn');   // 등록버튼
    // const userList = document.querySelector('#add_user_list');  // 입력값으로 추가된 리스트
    
    const signUpForm = document.querySelector('#regForm');
    // const userId = document.querySelector('#userId');


    signUpForm.addEventListener('submit',(event)=>{
        // console.log('등록버튼이 클릭되었습니다.');

        const userId = document.querySelector('#userId');
        const pw = document.querySelector('#pw');
        const rePw = document.querySelector('#rePw');
        const userName = document.querySelector('#userName');

        console.log(userId.value.search(/[a-zA-Z0-9]/));
        console.log(/[a-zA-Z0-9]/.test(userId.value));


        if(/[a-zA-Z0-9]/.test.value){
            alert('아이디는 대문자 소문자 숫자만을 조합하는 문자열 입력만 가능합니다.');
        }

        console.log(1234);
        event.preventDefault();
        




    });
    
    /* 배열 */

    const userList = ['userId','pw','rePw','userName'];
    console.log(userList);

    function printName()  {
        const name = document.getElementById('userId').value;
        document.getElementById("add_user_list").innerText = userId;
      }




    /* 등록된 정보가 없는 경우  */
/*     let userList = document.querySelectorAll('#add_user_list');
    userList.forEach((userList)=>{
        userList.textContent = '등록된 정보가없습니다.';
        // userList.style.color = 'red';
        
    }) */

    


    // /* 리스트 제거 */
    // const removeList = function(){

    // };

    // /* 이벤트 연결 */
    // addBtn.addEventListener('click',userList);

});

