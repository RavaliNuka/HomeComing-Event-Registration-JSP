<%-- 
    Document   : UserInterface
    Created on : Mar 31, 2015, 5:43:51 PM
    Author     : s522575
--%>





<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Welcome Bearcats!</title>
        <link rel="stylesheet" type="text/css" href="UserInterfacecss.css"/>

<!--        <meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
        <meta http-equiv="Pragma" content="no-cache" />
        <meta http-equiv="Expires" content="0" />-->
        
    </head>

    <body>

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

            <div style="position: absolute; top: 5.9%; left: 12.5%;">
                <a href="UserInterface.jsp" style="text-decoration: none"><img width="100" height="100" src="NWLogo.jpg"></a>
            </div>

            <div style="position: absolute; top: 34%; left: 34%;">
                <img width="410" height="280" src="HomeTabImage1.jpg">
            </div>

            <div id="menubar">
                <ul id="menu">
                    <li class="current"><a  href="UserInterface.jsp">Home</a></li>
                    <li><a href="About.jsp" >About</a></li>
                    <li><a href="Schedule.jsp">Schedule</a></li>
                    <li><a href="Gallery.jsp">Gallery</a></li>
                    <li><a href="ContactUs.jsp">Contact Us</a></li>
                </ul>
            </div><!--close menubar-->	

            <div id="site_content">		


                <!--                <div class="slideshow">
                                    <ul class="slideshow">
                                        <li class="show"><img width="680" height="400" src="images/home_1.jpg"/></li>
                                        <li><img width="680" height="250" src="images/home_2.jpg"/></li>
                                        <li class="show"><img width="500" height="400" src="SlideshowImage1.jpg"/></li>
                                        <li class="show"><img width="500" height="250" src="SlideshowImage2.jpg"/></li>
                                    </ul>
                                </div>	  	 -->

                <div id="content">
                    <div class="content_item">
                        <h1>Welcome To our Website</h1> 
                        <p>This site is dedicated to the Homecoming event at Northwest to show our bearcat spirit and rejuvenate our mind and body with joy and pride. 
                            Here you can find all the information about the various activities that you can take part and win exciting prizes.
                            You need to register and create an account to participate in the Homecoming event.</p>	                          
                        <br style="clear:both"/>
                    </div><!--close content_item-->
                </div><!--close content-->  

            </div><!--close site_content--> 

            <div id="content_bottom">
            </div><!--close content_bottom-->   
        </div><!--close main-->


        <div id="col-left" style="opacity: 0.91; width: 23%; float: left; position: absolute; bottom: -32%; margin-bottom: 2%; left: 12.3%;  //left 14.45
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

        <div id="col-center" style="opacity: 0.91; width: 22%; position: absolute; bottom: -32%; margin-bottom: 2%; left: 38.25%;
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

        <div id="col-right" style="opacity: 0.91; width: 22.9%; position: absolute; bottom: -32%; margin-bottom: 2%; left: 63%;
             display: block; background-color: #000; padding: 1%; height: 18.3%; text-align: left !important">
            <h3 style="position: absolute; bottom: 31%; right: 17%; font-size: 160%; font-weight: bold;"><a style="text-decoration: none;" href="Feedback.jsp">Give us your feedback</a></h3>
        </div>

        <div id="footer">
            <a>© 2015 Northwest Missouri State University. All rights reserved.</a> 
        </div>  

    </body>
</html>
