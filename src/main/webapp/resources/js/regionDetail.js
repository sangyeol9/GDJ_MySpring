/**
 * 
 */
 
 const del =document.getElementById("del");
 const frm = document.getElementById("frm");
 const up = document.getElementById("up");
 //콜백함수
 del.addEventListener("click",function(){
    let result =confirm("정말 지울거냐");

    if(result) frm.submit();

 })

up.addEventListener("click",function(){
    //let id = up.getAttribute('data-region-id');
    frm.setAttribute('action','update');
    frm.setAttribute('method','GET');
    frm.submit();
    //location.href="update?region_id="+id;
})