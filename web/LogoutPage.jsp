<%-- 
    Document   : Logout
    Created on : Apr 18, 2015, 12:17:22 AM
    Author     : S522575
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <META http-equiv="refresh" content="10;URL=UserInterface.jsp">
        <title>Logged Out Successfully!</title>
        <link rel="stylesheet" type="text/css" href="LogoutPagecss.css"/>
    </head>
    <body>
        
        <div style="text-align: center;">
            <h1 style=" font-size: 40px; color: #009933; margin: 0px 0px 0px 0px; padding-bottom: 0px;" >NORTHWEST MISSOURI STATE UNIVERSITY</h1>
            <h2 style=" font-size: 35px; color: #009933; margin: 0px 0px 0px 0px; padding-top: 0px;" >OFFICE OF CAMPUS ACTIVITIES HOMECOMING</h2>
        </div>

        <div style="position: absolute; left: 9.5%; top: 0%">
            <img width="100" height="100" src="NWLogo.jpg">
        </div>

        <div class="wit" style="position: absolute; top: 22%;">  
            
            <h1>You Have Successfully Logged Out.</h1><br>
            <a>You can</a><a href="UserLoginForm.jsp" style="text-decoration: none; font-weight: bold"> log in </a><a>again, or you will be redirected to the Home Page in 10 seconds.</a>
                    
        </div>

       
        <div id="footer">
            <a>© 2015 Northwest Missouri State University. All rights reserved.</a> 
        </div>
        
    </body>
</html>


<%

//    
//    
//    Thread.sleep(8000);
//
//RequestDispatcher myrd = request.getRequestDispatcher("UserInterface.jsp");  
//        myrd.forward(request, response); 

%>