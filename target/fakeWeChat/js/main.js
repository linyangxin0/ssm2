// //模态框添加用户
// function addUser(){
//     var name=$("#name").val();
//     // var password="123";
//     var title=$("#title").val();
//     var status=$("#status").val();
//
//     if(name==""||title==""||status==""||name==null||title==null||status==null){
//         alert("请正确输入歌曲信息");
//         return;
//     }
//
//     var param={
//         name:name,
//         title:title,
//         status:status
//     };
//
//     $.ajax({
//         url:"/songs/addSong.do",
//         method:"POST",
//         data:param,
//         success:function(data){
//             if((typeof(data)!="undefined")&&(data==0)){
//                 // $('#dataList').bootstrapTable('refresh');
//                 alert("歌曲添加成功");
//             }
//         },error:function(){
//             console.log("请求失败")
//         },
//         complete:function(){
//             $('#myModal').modal('hide');
//         },
//         context:this
//     });
// }
