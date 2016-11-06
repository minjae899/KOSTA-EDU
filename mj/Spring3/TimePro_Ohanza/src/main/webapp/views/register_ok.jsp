<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
  #img{
     padding-left: 33%;
     padding-top: 5%;
  }
  #subimg{
     width: 30%;
     height: 35%;
     margin-left: 35%;
  }
   td{
   /* font-family: 'Oswald', Serif; */
    /* font-family: 'Oswald', Monospace;  */
   /*  font-family: 'Oswald', Cursive;  */
   /* font-family: 'Oswald', Fantasy;  */
   font-family: '나눔 고딕'; 
   }
</style>
 <link href="../css/bootstrap.min.css" rel="stylesheet"> 
<script type="text/javascript" src="../js/jquery-1.11.3.js"></script>
<script type="text/javascript">

   $(function(){
	   var cnt=1;
	   var interval;
	   $('#img').append("<img src=../img/1.png width=5% height=7%>")
	   interval = setInterval(function(){		  
		   cnt+=1;
		  // alert(cnt);
	         $('#img').append("<img src=../img/"+cnt+".png width=5% height=7%>");
	       if(cnt>9)
	    	{
	    	   clearInterval(interval); 
	    	}
	      },500);   
   });
   </script>
</head>
<body>
   <div id="img"></div>
   <img id="subimg" alt="" src="../img/welcome.png">
   
   <div align="center">
      <hr width="50%">
      <table>
        <tr>
          <td>이&nbsp;&nbsp;&nbsp;름&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;</td><td><span>${member.name}</span></td>
        </tr>
        <tr>
          <td>아이디&nbsp;&nbsp;:&nbsp;&nbsp;</td><td><span>${member.id}</span></td>
        </tr>
        <tr>
          <td>닉네임&nbsp;&nbsp;:&nbsp;&nbsp;</td><td><span>${member.nickname}</span></td>
        </tr>
      </table><br>
         <a href="login.html" class="btn btn-xs btn-success"><span class="glyphicon glyphicon-user"></span>login</a>
      <hr width="50%">
   </div>
</body>
</html>