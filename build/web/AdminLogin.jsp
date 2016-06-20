<%-- 
    Document   : AdminLogin
    Created on : Apr 2, 2015, 10:38:17 AM
    Author     : S522575
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login</title>
        <link rel="stylesheet" type="text/css" href="AdminLogincss.css"/>
    </head>
    <body id="adminloginpagebackground">
                

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
            <a style="color: #ffffff" href="UserLoginForm.jsp">User Login</a>
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
                <form onsubmit="return adminValidation()" action="adminInnerPage.jsp" method="post">
                    <table>
                        <h3 style="text-align: center;"><b>Admin Login</b></h3>
                        
                            <tr>
                                <td><label>Admin</label></td>
                                <td><input autofocus type="text" id="adminloginid" name="LoginID" required=""</td>
                            </tr>

                            <tr>
                                <td><br><label>Password</label></td>
                                <td><br><input type="text" id="adminloginpassword" name="LoginPassword" required=""</td>
                            </tr>
                        
                    </table>
                    
                    <div style="text-align: center;">
                        <br><input type="submit" id="adminloginsubmit" onclick="adminValidation();" style="width: 33%; border-radius: 10px; border-color: #ea0f1f;" value="Sign in">
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
    function adminValidation() {
        if (document.getElementById("adminloginid").value === "administrator" && document.getElementById("adminloginpassword").value === "BearcatRocks") {
            return true;
        }
        
        else if(document.getElementById("adminloginid").value.length < 1 || document.getElementById("adminloginpassword").value.length < 1){
            if(document.getElementById("adminloginid").value.length < 1){
                document.getElementById("adminloginid").value = "";
                document.getElementById("adminloginid").focus();
            }
            document.getElementById("adminloginpassword").value = "";
            return false;
        }
        else {
            document.getElementById("invalidusernameorpassword").style.visibility = "visible";
            document.getElementById("adminloginid").focus();
            document.getElementById("adminloginid").value = "";
            document.getElementById("adminloginpassword").value = "";
            return false;
        }
    }
</script> 