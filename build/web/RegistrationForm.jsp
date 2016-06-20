<%-- 
    Document   : RegistrationForm
    Created on : Mar 30, 2015, 11:14:26 AM
    Author     : s522575
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Register for an Event</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="RegistrationFormcss.css" type="text/css"/>   
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src="AddmorefieldsandValidation.js"></script>
    </head>

    <body style="  background: url(Image1.jpg);">
        <!--<form onsubmit="return dataValidation()" action="WelcomeServlet">-->

        <div class="links" align="right">
            <a style="color: #cccccc" href="UserLoginForm.jsp">User Login</a> |
            <a style="color: #cccccc" href="AdminLogin.jsp">Admin Login</a>
        </div>

        <div style="text-align: center;">
            <a href="UserInterface.jsp" style="text-decoration: none"><h1 style=" font-size: 40px; color: #cccccc; margin: 0px 0px 0px 0px; padding-bottom: 0px;" >NORTHWEST MISSOURI STATE UNIVERSITY</h1></a>
            <a href="UserInterface.jsp" style="text-decoration: none"><h2 style=" font-size: 35px; color: #a7a0a0; margin: 0px 0px 0px 0px; padding-top: 0px;" >OFFICE OF CAMPUS ACTIVITIES HOMECOMING</h2></a>
        </div>

        <div style="position: absolute; top: 4%; left: 10%;">
            <a href="UserInterface.jsp" style="text-decoration: none; color: #cccccc"><img width="100" height="100" src="NWLogo.jpg"></a>
        </div>

        <br>
        <form onsubmit="return dataValidation()" action="WelcomeServlet" method="post">
            <fieldset style="background-color: #323232; opacity: 0.855;" >
                <legend style="font-size: 33px; color: #ffff33;">Create an Account</legend>
                <table  id="appendfield">
                    <tbody id="dataFlow">

                        <tr>
                            <td><br><label style="color: #ffffff" id="rfid1">Choose your Username *: </label></td>
                        </tr> 
                        <tr>
                            <td><input autofocus type="text" name="username" id="userid" /><br></td>
                        </tr>

                        <tr>
                            <td><br><label style="color: #ffffff" id="rfid2">Create a Password *:    </label></td>
                            <div id="pwcriteria" style="display: inline; visibility: hidden; font-size: 11.5px; font-weight: bold; color: #ffff00; position: absolute; top: 47.5%; text-align: right; float: right;">Password must contain atleast 8 characters and must not contain special characters</div>
                    <!--                    <td><br><p id="passwordmessage" style="color:red"></p></td>-->
                        </tr>         
                    <tr>
                        <td><input type="text" name="password" id="pw" onkeydown="pwcriteriavisible()"/><br></td>
                        <!--<td><p size="small" color = "red">The password must contain 7 to 20 characters and must not contain any special characters</p><br></td>-->
                        <!--<td><input type="password" name="password" id="pw"/><br></td>-->
                    </tr>

                    <tr>
                        <td><br><label style="color: #ffffff" id="rfid3">Confirm your Password *:</label></td>
                    </tr>         
                    <tr>
                        <td><input type="text" name="passwordconfirm" id="pwc"/><br></td>
                    </tr> 

                    <tr>
                        <td><br><label style="color: #ffffff" id="rfid4">Name of the Group Leader *: </label></td>
                        <td><br><label style="color: #ffffff">Contact Number *: </label></td>
                    </tr>         
                    <tr>
                        <td><input type="text" name="groupleader" id="glname"  onkeydown="pwcriteriahide()"/><br></td>
                        <td><input type="text" name="glContact" id="glc"/><br></td>
                    </tr>

                    <tr>
                        <td><br><label style="color: #ffffff">Select the Number of Participants *</label></td>
                        <td><br><select name = "numberOfParticipants" id="numberofparticipants" onchange="addorRemoveGroup()">
                                <option value=0>Select</option>
                                <option value=1>1</option> 
                                <option value=2>2</option> 
                                <option value=3>3</option> 
                                <option value=4>4</option> 
                                <option value=5>5</option> 
                                <option value=6>6</option> 
                                <option value=7>7</option> 
                                <option value=8>8</option> 
                                <option value=9>9</option> 
                                <option value=10>10</option> 
                                <option value=11>11</option> 
                                <option value=12>12</option> 
                                <option value=13>13</option> 
                                <option value=14>14</option> 
                                <option value=15>15</option> 
                            </select>
                        </td>
                    </tr>              

                    </tbody>
                </table>


                <table>    
                    <tr>
                        <td><br><label style="color: #ffffff" id="rfid8">Select your Participation Theme Name *:</label></td>
                    </tr>         
                    <tr>
                        <td><select name = "themename" id="theme" >
                                <option value="none">Select</option>
                                <option value="Badminton">Badminton</option> 
                                <option value="Baseball">Baseball</option> 
                                <option value="Basket Ball">Basket Ball</option> 
                                <option value="Bearcat Football">Bearcat Football</option> 
                                <option value="Bearcat Soccer">Bearcat Soccer</option>
                                <option value="Comedy Central on Campus">Comedy Central on Campus</option>
                                <option value="Hanging of Banners">Hanging of Banners</option> 
                                <option value="Olio & Emcee Tryouts">Olio & Emcee Tryouts</option>
                                <option value="Royalty Voting">Royalty Voting</option>
                                <option value="Set-up Canned Art">Set-up Canned Art</option> 
                                <option value="Skit Tryouts">Skit Tryouts</option> 
                                <option value="Variety Show">Variety Show</option> 
                                <option value="Volley Ball">Volley Ball</option> 
                                <option value="Walk Out Day Celebration">Walk Out Day Celebration</option> 

                            </select><br>
                        </td>
                        <!--<td><input type="text" name="themename" id="theme"/><br></td>-->
                    </tr> 

                    <tr>
                        <td><br><label style="color: #ffffff" id="rfid9">Description *:</label></td>
                    </tr>           
                    <tr>
                        <td><textarea placeholder="Enter your description here..."  name="description" id="desc"></textarea><br></td>
                    </tr>

                    <tr>
                        <td><br><input type="checkbox" id="tandc" value="agreed" ><label style="font-weight: bold; color: #ffffff;">     I have read and agree to the Terms & Conditions.</label></td>
                    </tr>
                </table>   

                <br><br>
                <input type="submit" value="Create account" id="create" >
                <input type="button" onClick="location.href = 'UserInterface.jsp'" value="Cancel" id="cancel" style="float: right">


            </fieldset>
        </form>

        <p>&nbsp;</p>
        <div id="footer" style="text-align: center">
            <a style=" color: #660066; font-weight: bold;">© 2015 Northwest Missouri State University. All rights reserved.</a> 
        </div> 

        <script type="text/javascript">
            function pwcriteriavisible() {
                document.getElementById("pwcriteria").style.visibility = "visible";
            }
            function pwcriteriahide() {
                document.getElementById("pwcriteria").style.visibility = "hidden";
            }
        </script> 


    </body>
</html>
