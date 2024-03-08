//빈값 입력 방지
document.querySelector('.btn').addEventListener('click', function(e){
    //만약 id 있는 input태그의 value가 공백이라면
    if(document.querySelector('.form-control').value == ''){
        e.preventDefault() //빈값 방지
        alert('빈칸에 값을 입력해주세요!')
    }
});