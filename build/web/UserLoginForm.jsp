<%-- 
    Document   : index
    Created on : Apr 2, 2015, 12:45:30 AM
    Author     : s522575
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Login Form</title>
        <link rel="stylesheet" type="text/css" href="UserLoginFormcss.css"/>
    </head>
    <body id="userloginpagebackground">

        <div id="invalidusernameorpassword" style="visibility: hidden">
            <fieldset style="position: absolute; left: 37.4%; top: 20%; display: block; background-color: #fae4a8 ;width: 26%; height: 9.3%; border: 4px; border-color: #cd8686; border-style: solid;">
                <table>
                    <tr>
                        <td><h4 style="font-family: sans-serif; text-align: left; margin-top: 0%; margin-bottom: 0%; color: #f40909; font-weight: bold;">There was a problem with your request.</h4></td>
                    </tr>
                    <tr>
                        <td><p style="font-family: sans-serif; text-align: left; font-size: 74%; margin-top: 0%; color: #f40909;">There was an error with your Username or Password combination. Please try again.</p></td>
                    </tr>
                </table>
            </fieldset>
        </div>


        <div class="links" align="right">
            <a style="color: #ffffff" href="RegistrationForm.jsp">Register</a> |
            <a style="color: #ffffff" href="AdminLogin.jsp">Admin Login</a>
        </div>

        <div style="text-align: center;">
            <a href="UserInterface.jsp" style="text-decoration: none"><h1 style=" font-size: 40px; color: #ffffff; margin: 0px 0px 0px 0px; padding-bottom: 0px;" >NORTHWEST MISSOURI STATE UNIVERSITY</h1></a>
            <a href="UserInterface.jsp" style="text-decoration: none"><h2 style=" font-size: 35px; color: #ffffff; margin: 0px 0px 0px 0px; padding-top: 0px;" >OFFICE OF CAMPUS ACTIVITIES HOMECOMING</h2></a>
        </div>

        <div style="position: absolute; top: 4%; left: 10%;">
            <a href="UserInterface.jsp" style="text-decoration: none"><img width="100" height="100" src="NWLogo.jpg"></a>
        </div>


        <div style="position: absolute; top: 37%; bottom: 80%; left: 39%; right: 4%; ">
            <fieldset style="background-color: #d3d2e0; border: 4px; border-color: #3237d4; border-radius: 10px; border-style: groove;
                      width: 40%;">
                <form id="form1"  method="post">
                    <!--<form action="UserPermissionServlet">-->
                    <table>
                        <b><h3 style="text-align: center">Welcome back!</h3></b>
                        <h5 style="text-align: center">Sign in to continue to your account</h5>
                        <tr>
                            <td><label>User Name</label></td>
                            <td><input autofocus type="text" id="userloginid" name="LoginID" required="Enter your user name here"</td>
                        </tr>

                        <tr>
                            <td><br><label>Password</label></td>
                            <td><br><input type="text" id="userloginpassword" name="LoginPassword" required="Enter your Password here"</td>
                        </tr>
                    </table>

                    <div style="text-align: center;">
                        <br><input type="submit" onclick="userValidation()" style="width: 33%; border-radius: 10px; border-color: #ea0f1f;" value="Sign in">
                    </div>

                    <br><div id="registerlogin" style="text-align: center;">
                        Not Registered Yet? <a style="text-decoration: none; color: #8a2de3;" href="RegistrationForm.jsp" >Register Here</a>
                    </div>
                </form>
            </fieldset>

        </div>

        <div id="footer">
            <a>© 2015 Northwest Missouri State University. All rights reserved.</a> 
        </div> 

    </body>
</html>






<script type="text/javascript">
    function userValidation() {

        if (document.getElementById("userloginid").value.length < 1 || document.getElementById("userloginpassword").value.length < 1) {
            if (document.getElementById("userloginid").value.length < 1) {
                document.getElementById("userloginid").value = "";
                document.getElementById("userloginid").focus();
            }
            document.getElementById("userloginpassword").value = "";
            return false;
        }

        var result = ajaxForPermissionInside("UserPermissionServlet?data1=" + document.getElementById("userloginid").value + "&data2=" + document.getElementById("userloginpassword").value);

        if (result === "not found"){
            document.getElementById("invalidusernameorpassword").style.visibility = "visible";
            document.getElementById("userloginid").focus();
            document.getElementById("userloginid").value = "";
            document.getElementById("userloginpassword").value = "";
            return false;
        }
        else if(result === "found under process"){
            document.getElementById("form1").action = "AccountPage.jsp";
        }
        else if(result === "found approved"){
            document.getElementById("form1").action = "AccountRequestApproved.jsp";
        }
        else if (result === "found rejected") {
            document.getElementById("form1").action = "AccountRequestRejected.jsp";
        }
    }

    function ajaxForPermissionInside(url) {
        var myrequest1 = new XMLHttpRequest();
        myrequest1.open("POST", url, false);
        myrequest1.send(null);
        return(myrequest1.responseText);
    }

</script> 