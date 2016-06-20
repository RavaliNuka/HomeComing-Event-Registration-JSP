<%-- 
    Document   : WelcomePage
    Created on : Mar 30, 2015, 11:21:28 AM
    Author     : s522575
--%>

<%@page import="homecoming.Event"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Welcome!</title>
        <meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Welcomehtmlcss.css" type="text/css"/>
    </head>
    <body>

        <div style="text-align: center;">
            <h1 style=" font-size: 40px; color: #009933; margin: 0px 0px 0px 0px; padding-bottom: 0px;" >NORTHWEST MISSOURI STATE UNIVERSITY</h1>
            <h2 style=" font-size: 35px; color: #009933; margin: 0px 0px 0px 0px; padding-top: 0px;" >OFFICE OF CAMPUS ACTIVITIES HOMECOMING</h2>
        </div>

        <div style="position: absolute; left: 9.5%; top: 0%">
            <img width="100" height="100" src="NWLogo.jpg">
        </div>

        <form action = "AccountPage.jsp">

            <div class="wit" style="position: absolute; top: 22%;">  
                <% Event e = (Event) request.getSession().getAttribute("FirstTimecurrentLoginUser");%>
                <h2>Hello <%= e.getGroupLeader()%>,</h2>
                <h2>Your Account has been created successfully!</h2><br>
                <h2>Thank you for registering for the HomeComing Event-2015 at Northwest!</h2><br>
                <h2>Leave us a message for any Queries/Cancellations/Change of Event.</h2>
                <input type="submit" value="Continue" id="continue">
            </div>

        </form>

        <div id="footer">
            <a>© 2015 Northwest Missouri State University. All rights reserved.</a> 
        </div> 

    </body>

</html>
