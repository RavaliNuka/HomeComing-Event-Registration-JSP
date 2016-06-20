<%-- 
    Document   : Feedback
    Created on : Apr 13, 2015, 5:08:00 PM
    Author     : S522575
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedback</title>
        <link rel="stylesheet" type="text/css" href="Feedbackcss.css"/>
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
                    <li><a href="ContactUs.jsp">Contact Us</a></li>
                </ul>
            </div><!--close menubar-->	

            <div id="site_content">	


                <div id="vanish" style="position: absolute; top: 35%">
                    <h1>Feedback</h1>
                    <p style="text-align: left; padding-top: 0px; margin-top: 0px; padding-bottom: 0px; margin-bottom: 0px;">Please take a moment to give us your valuable feedback that helps us to improve your experience in the upcoming events. Any comments/</p>
                    <p>suggestions are welcome.</p><br>

                    <form>
                        <table>
                            <tr>
                                <td><h3 style=" width: 200px; ">Select Event Name:</h3></td>
                                <td><select style=" width: 215px; height: 22px" name = "themename" id="theme" >
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
                                    </select>
                                </td>
                            </tr>

                            <tr>
                                <td><br><h3 style=" width: 200px; padding-right: 0px; margin: 0px;">Rating:</h3></td>
                                <!--<td><br><input id="eventRating" style=" width: 211px; height: 19px" type="text"></td>-->
                                <!--Star rating coe starts-->
                                
                                <td style=" position: absolute; left: 22.4%;"> <input class="star star-5" id="star-5" type="radio" name="star"/>
                                            <label name="Rating" class="star star-5" for="star-5"></label>
                                            <input class="star star-4"  id="star-4" type="radio" name="star"/>
                                            <label class="star star-4"  for="star-4"></label>
                                            <input class="star star-3"  id="star-3" type="radio" name="star"/>
                                            <label class="star star-3" for="star-3"></label>
                                            <input class="star star-2"  title="2 Stars" id="star-2" type="radio" name="star"/>
                                            <label class="star star-2" for="star-2"></label>
                                            <input class="star star-1"  title="1 star" id="star-1" type="radio" name="star"/>
                                            <label class="star star-1" for="star-1"></label></td>

                                
                            <!--star ends here-->
                            </tr>

                            <tr>
                                <td><br><h3 style=" width: 200px; margin: 0px; padding: 0px;">Suggestion/Comment:</h3></td>
                                <td><br><textarea id="feedback" style=" height: 130px; width: 213px;"></textarea></td>
                            </tr>

                            <tr>
                                <td></td>
                                <td><input id="contactTabButton" type="submit"  onclick="thqdisplay()" value="Submit" style=" height: 28px; float: right"></td>
                            </tr>
                        </table>
                    </form>
                </div>


                <script type="text/javascript">
                    function thqdisplay() {
                        if (document.getElementById("theme").value === "none") {
                            alert("Please select the name of the event you wish to rate.");
                        }
                        else {
//                            if (document.getElementById("eventRating").value.length < 1) {
//                                alert("Please rate the event you have selected");
//                            }
                            
                                document.getElementById('feedback').value = "";
                                alert("Thank you for your feedback!");
                            
                        }
                    }
                </script> 

            </div><!--close site_content--> 

            <div id="content_bottom">
            </div><!--close content_bottom-->   
        </div><!--close main-->


        <div id="col-left" style="opacity: 0.91; width: 23%; float: left; position: absolute; bottom: -32.5%; margin-bottom: 2%; left: 12.3%;  //left 14.45 bottom: -32.5
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
