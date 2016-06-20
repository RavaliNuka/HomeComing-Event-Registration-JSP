<%-- 
    Document   : ContactUs
    Created on : Apr 12, 2015, 8:16:26 PM
    Author     : S522575
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Us</title>
        <link rel="stylesheet" type="text/css" href="ContactUscss.css"/>
          <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/ContactUscss.css">
    </head>
    <body>


        <div style="position: absolute; top: 5.9%; left: 12.5%;">
            <a href="UserInterface.jsp" style="text-decoration: none"><img width="100" height="100" src="NWLogo.jpg"></a>
        </div>

        <div class="links" align="right" style="margin-top: 0.45%; margin-right: 0.975%;">
            <a href="RegistrationForm.jsp">Register</a> |
            <a href="UserLoginForm.jsp">User Login</a> |
            <a href="AdminLogin.jsp">Admin Login</a>
        </div>

        <div id="main">
            <div id="header">
                <div id="banner">
                    <div id="welcome">
                        <a href="UserInterface.jsp" style="text-decoration: none"><h1 style="position: absolute; left: 10%;"><b>NORTHWEST MISSOURI STATE UNIVERSITY</b></h1></a>
                    </div><!--close welcome-->
                    <div id="welcome_slogan">
                        <a href="UserInterface.jsp" style="text-decoration: none"><h2 style="position: absolute; left: 10%; margin-bottom: 0%; padding-bottom: 0%">OFFICE OF CAMPUS ACTIVITIES HOMECOMING</h2></a>
                    </div><!--close welcome_slogan-->
                </div><!--close banner-->
            </div><!--close header-->





            <div id="menubar">
                <ul id="menu">
                    <li><a  href="UserInterface.jsp">Home</a></li>
                    <li><a href="About.jsp">About</a></li>
                    <li><a href="Schedule.jsp">Schedule</a></li>
                    <li><a href="Gallery.jsp">Gallery</a></li>
                    <li class="current"><a href="ContactUs.jsp">Contact Us</a></li>
                </ul>
            </div><!--close menubar-->	

            <div id="site_content">	

                <div style="position: absolute; top: 41%; left: 54%;">
                    <img width="390" height="300" src="ContactUsTabImage1.jpg">
                </div>
                
                <h1 id="ThankyouMessage"></h1>
                <div id="vanish" style="position: absolute; top: 32%">
                    <h1>Contact Us</h1>
                    <p>Please feel free to contact us at any time to share your thoughts and concerns.</p>
                    <p>We will be more than happy to respond to you.</p>
                    <p>&nbsp;</p>
                    <form>
                        <h3><span style="text-align: left; float: left; width: 180px;;">Name</span><input id="name" style="width: 280px; height: 25px;" type="text"></h3>
                        <h3><span style="text-align: left; float: left; width: 180px;">E-mail Address</span><input id="email" style="width: 280px; height: 25px;" type="text"></h3>
                        <h3><span style="text-align: left; float: left; width: 180px;">Message</span><textarea id="message" style="width: 280px; height: 150px;"></textarea></h3>
                        
                    </form>
                    <div style="position: absolute; left: 402px;">
                        <input id="contactTabButton" type="button"  onclick="thqdisplay()" value="Submit" style=" height: 28px; float: right;">
                    </div>
                    
                </div>
                
                
<script type="text/javascript">
    function thqdisplay() {
        if (document.getElementById("name").value.length < 1) {
            alert("Please enter your name in the text box.");
        }
        else{
            if(document.getElementById("email").value.length < 1){
                alert("Please enter your e-mail address in the text box.");
                document.getElementById("email").focus();
            }
            else {
                if(document.getElementById("message").value.length < 1){
                    alert("Please enter your message in the text box.");
                    document.getElementById("message").focus();
                }
                else {
                    document.getElementById('name').value= "";
                    document.getElementById('email').value= "";
                    document.getElementById('message').value= "";
                    alert("Thank you for Contacting us. We will respond to you as soon as possible.");
        //            var message = document.getElementById("message").value;
                }
            }
        }
    }
</script> 

            </div><!--close site_content--> 

            <div id="content_bottom">
            </div><!--close content_bottom-->   
        </div><!--close main-->


        <div id="col-left" style="opacity: 0.91; width: 23%; float: left; position: absolute; bottom: -32.5%; margin-bottom: 2%; left: 12.3%;  //left 14.45
             display: block; background-color: #000; padding: 1%; height: 18.3%; text-align: left !important">
            <!--display: block;  padding: 10px; background-color: #000; height: 120px; text-align: left !important;">-->
            <h3>Contact Us</h3>
            <p id="undertwo" style=" font-size: 82%; ">
                <b>Northwest Missouri State University</b>
                <br>
                800 University Drive | Maryville, MO 64468
                <br>
                660.562.1532 |

                <a style="text-decoration:none;" href="http://www.nwmissouri.edu" target="_blank">www.nwmissouri.edu</a> 
            </p>

        </div>

        <div id="col-center" style="opacity: 0.91; width: 22%; position: absolute; bottom: -32.5%; margin-bottom: 2%; left: 38.25%;
             display: block; background-color: #000; padding: 1%; height: 18.3%; text-align: left !important">
            <h3>Related Links</h3>
            <p id="under" style=" font-size: 82%;" >
                <a style="text-decoration: none;" href="http://www.nwmissouri.edu/aboutus/index.htm" target="_blank">About Northwest</a>
                <br><a style="text-decoration: none;" href="http://www.nwmissouri.edu/admissions/campusvisits/maps.htm" target="_blank">Maps and Directions</a>
                <br><a style="text-decoration: none;" href="http://www.nwmissouri.edu/police/parking/maps.htm" target="_blank">Parking Maps</a>
                <br><a style="text-decoration: none;" href="http://www.nwmissouri.edu/police/forms/reportcrime.htm" target="_blank">Report a Crime</a>
                <br><a style="text-decoration: none;" href="http://www.nwmissouri.edu/alert/index.htm" target="_blank">Emergency Information</a>
            </p>
        </div>

        <div id="col-right" style="opacity: 0.91; width: 22.9%; position: absolute; bottom: -32.5%; margin-bottom: 2%; left: 63%;
             display: block; background-color: #000; padding: 1%; height: 18.3%; text-align: left !important">
            <!--<h3 style="position: absolute; bottom: 31%; right: 17%; font-size: 160%;" ><b>Give us your feedback</b></h3>-->
            <h3 style="position: absolute; bottom: 31%; right: 17%; font-size: 160%; font-weight: bold;" ><a style="text-decoration: none;" href="Feedback.jsp">Give us your feedback</a></h3>
        </div>

        <div id="footer">
            <a>© 2015 Northwest Missouri State University. All rights reserved.</a> 
        </div>  


    </body>
</html>


