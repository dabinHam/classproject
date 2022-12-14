
    let replyList;
    let editModal;
    /* jquery 시작*/
$().ready(function (){
    editModal = new bootstrap.Modal('#replyEditModal')
    $('#btn_reply').click(function (){insertReply()})   // 등록
    $('#btn_edit').click(function (){editReply()})      // 수정

    // replyList
    $.ajax({
    url : '/reply/' + bno,
    success : function (data){
    console.log(data)
    console.log(data[0].reply)
    $(data).each(function (index, reply){
    let newTD =
    // '<tr>'+
    '<td>'+reply.replyer+'</td>'+
    '<td>'+reply.reply+'</td>'+
    '<td>'+reply.replydate+'</td>'+
    '<td>'+'<a class="badge bg-warning text-decoration-none" href="javascript:showEditModal('+reply.rno+')">수정</a> <a class="badge bg-danger text-decoration-none" href="javascript:deleteReply('+reply.rno+')">삭제</a>'+'</td>'
    // '</tr>'

    let newTR = $('<tr></tr>').attr('class','text-center fs-6').attr('tr-index', reply.rno).html(newTD)

    $('#replyList').append(newTR)
})
}
})
})

    function insertReply(){
    // 서버로 전송 할 payload(parameter,data)
    const payload = {
    bno : bno,
    reply : $('#reply').val(),
    replyer : $('#replyer').val()
}

    console.log("payload, payload")

    $.ajax({
    url: '/reply',
    type: 'post',
    data: JSON.stringify(payload),
    dataType: "json",
    contentType: "application/json",
    success: function (data){

    let html = '<td class="col-2">'+data.replyer+'</td>'
    html += '<td>'+data.reply+'</td>'
    html += '<td class="col-2">'+data.replyDate+'</td>'
    html += '<td class="col-2">'+
    '<a href="javascript:showEditModal('+data.rno+')" class="badge bg-warning text-decoration-none">수정</a> '
    +' <a href="javascript:deleteReply('+data.rno+')" class="badge bg-danger text-decoration-none">삭제</a></td>'

    $('<tr></tr>').html(html).appendTo('#replyList').attr('class', 'fs-6 text-center').attr('tr-index', data.rno)

    $('#reply').val('')
    $('#replyer').val('')
}
})


}

    function deleteReply(rno){

    if(!confirm('삭제하시겠습니까?')){
    return;
}
    console.log('rno >>>>',rno);

    $.ajax({
    url: '/reply/'+rno,
    type: 'delete',
    success: function (data){
    console.log('delete - response =>', data)

    if(data == 1){
    // 화면에서 해당 tr-index == rno행 삭제
    $('tr[tr-index="'+rno+'"]').remove()
    alert('삭제되었습니다.')
} else {
    alert('삭제할 대상이 존재하지 않습니다.')
}
}
})
}

    function showEditModal(rno){
    editModal.show()

    let editTD = $('tr[tr-index="'+rno+'"]>td')
    console.log(editTD)

    console.log(editTD.eq(0).text())
    console.log(editTD.eq(1).text())
    console.log(editTD.eq(2).text())

    $('#erno').val(rno)
    $('#ereplyer').val(editTD[0].textContent)
    $('#ereply').val(editTD[1].textContent)
    $('#ereplydate').val(editTD[2].textContent)
}

    function editReply(){

    const payload = {
    bno : bno,
    rno : $('#erno').val(),
    replyer : $('#ereplyer').val(),
    reply : $('#ereply').val(),
    replyDate : $('#ereplydate').val()
}

    console.log(payload)

    $.ajax({
    url: '/reply/'+payload.rno,
    type: 'put',
    data: JSON.stringify(payload),
    dataType: "json",
    contentType: "application/json",
    success: function (data){
        const editTD = $('tr[tr-index="'+payload.rno+'"]>td')
        $(editTD).eq(1).text();

    editModal.hide();
}

})


}


