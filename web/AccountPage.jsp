<%-- 
    Document   : InnerPage
    Created on : Mar 30, 2015, 4:09:43 PM
    Author     : s522575
--%>

<%@page import="java.util.Scanner"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.File"%>
<%@page import="homecoming.Event"%>
<%@page import="javax.servlet.annotation.WebServlet"%>
<%@page import="java.io.Writer"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.FileWriter"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.TreeMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.lang.reflect.Array"%>


<%@page import="java.util.ArrayList"%>
<%@page import="java.io.File"%>
<%@page import="java.util.Scanner"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% int numberOfParticipants = 0; %>
<% Event e = (Event) request.getSession().getAttribute("FirstTimecurrentLoginUser");
    String userdisplay = "";
//if(e != null){
    userdisplay = e.getUserAccountName();
//}
//else {
//    userdisplay = (String) request.getSession().getAttribute("currentLoginUser");
//}
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="AccountPagecss.css" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <meta http-equiv="Pragma" content="no-cache"> 
        <meta http-equiv="Expires" content="-1"> 
        <meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate">
        <title>Welcome!</title>
    </head>
    <body>

        <div class="links2" align="right">
            <a>Logged in as </a><%= userdisplay%> |
            <a href="LogoutPage.jsp"> Log Out</a>
        </div>

        <div style="text-align: center;">
            <h1 style=" font-size: 40px; color: #009933; margin: 0px 0px 0px 0px; padding-bottom: 0px; font-family:" >NORTHWEST MISSOURI STATE UNIVERSITY</h1>
            <h2 style=" font-size: 35px; color: #009933; margin: 0px 0px 0px 0px; padding-top: 0px;" >OFFICE OF CAMPUS ACTIVITIES HOMECOMING</h2>
        </div>

        <div style="position: absolute; left: 10%; top: 3%; ">
            <img width="100" height="100" src="NWLogo.jpg">
        </div>

        <div id="main">

            <p>&nbsp;</p>
            <h1 id="underline">Welcome  <%= e.getGroupLeader()%></h1>
            <p>&nbsp;</p>
            <table>
                <tr>
                    <td><p style="margin-right: 0px; padding-right: 0px; margin: 0px; padding: 0px;">Status of your Request: <mark>Under Process</mark></p></td>                    
                </tr>
            </table>

            <br><h3>Keep visiting the page! Any updates will be posted here as soon as your request is processed.</h3><br><br>

            <%
                String match1 = e.getUserAccountName();
                out.println(match1);
                String match2 = (String) request.getSession().getAttribute("currentLoginUser");
                out.println(match2);

                ServletContext se = getServletContext();
                String path = se.getRealPath(File.separator);
//            out.println(path);    //displays the output on the web browser

                Scanner in = new Scanner(new File(path + "UnderProcessEvents.txt"));

//                String match = "s522575";
//            int numberOfParticipants = 0;
//              
                String temp1 = "";
                String myLine = "";
                ArrayList<String> participants = new ArrayList<String>();
                ArrayList<Long> participantC = new ArrayList<Long>();
                String gleader = "";
                long glcontact = 0;
                String theme = "";
                String desc = "";

                while (in.hasNext()) {

                    if (in.next().equals(match1) || in.next().equals(match2)) {
                        for (int i = 0; i <= 2; i++) {
                            in.next();
                        }

                        numberOfParticipants = in.nextInt();
                        in.next();

                        gleader = in.next() + " ";
                        while (!(myLine = in.next()).equals(",")) {
                            gleader += myLine;
                        }

                        glcontact = in.nextLong();
                        in.next();

                        for (int i = 0; i < numberOfParticipants; i++) {
                            temp1 = in.next() + " ";
                            while (!(myLine = in.next()).equals("*")) {
                                temp1 += myLine;
                            }
                            participants.add(temp1);
                            participantC.add(in.nextLong());
                            in.next();
                        }

                        theme = in.next() + " ";
                        while (!(temp1 = in.next()).equals(",")) {
                            theme += temp1 + " ";
                        }

                        desc = in.next() + " ";
                        while (!(temp1 = in.next()).equals("****")) {
                            desc += temp1 + " ";
                        }

                    } else {
                        temp1 = in.nextLine();
                    }
                }
                // request object can be accessed anywhere in a JSP page
                request.setAttribute("participant", participants);
                request.setAttribute("participantContact", participantC);

            %>


            <table>
                <tr>
                    <td><p>Event Requested: <%= theme%></p></td>                    
                </tr>
            </table>

            <table border="1" width="40%">
                <tr>
                    <th>S. No.</th>
                    <th>Name of the Participant</th>
                    <th>Contact Number</th>
                </tr>

                <tbody id="gen" >
                    <c:forEach items="${participant}" varStatus="loop">

                        <tr>
                            <td>
                                <c:out value="${loop.index}"/>
                            </td>
                            <td>
                                <c:out value="${participant[loop.index]}"/>
                            </td>
                            <td>
                                <c:out value="${participantContact[loop.index]}"/>
                            </td>                
                        </tr>

                    </c:forEach>
                </tbody>
            </table>

            <table>
                <tr>
                    <td><p>Description: <%= desc%></p></td>                    
                </tr>
            </table>




            <div id="vanish">
                <form>
                    <h2>Leave us a message</h2>
                    <textarea style="width: 25%; height: auto;" placeholder="Enter your message here..."  name="messageofuser" id="message"></textarea>
                    <br><button type="button" id="messagebuttonid" onclick="thqdisplay();">Submit</button>
                </form>
            </div><br>

            <h1 id="ThankyouMessage"></h1>
            <div id="underline"></div>
            <p>&nbsp;</p>


            <script type="text/javascript">
                function thqdisplay() {
                    if (document.getElementById("message").value.length < 1) {
                        alert("Please enter your message in the text box.");
                        document.getElementById("message").focus();
                    }
                    else {
                        var tee = "<%= e.getUserAccountName() %>";
                        var result = ajaxForUserMessageStorage("TextDocCreationServlet?data1=" + document.getElementById("message").value + "&data2=" + tee);
                        if(result === "created"){
                            document.getElementById('vanish').style.display = 'none';
                            document.getElementById("ThankyouMessage").innerHTML = "Thank you for your message. We will get back to you shortly.";
                            var message = document.getElementById("message").value;
                        }
                    }
                }

                function ajaxForUserMessageStorage(url) {
                    var myrequest2 = new XMLHttpRequest();
                    myrequest2.open("POST", url, false);
                    myrequest2.send(null);
                    return myrequest2.responseText;
                }
            </script> 

            <!--**************************// leave us a message storage code **************************-->



        </div>

        <footer id="footer">
            <p> © 2015 Northwest Missouri State University. All rights reserved.</p>
        </footer>  

    </body>






</html>


































<!--
            <h1 id="ThankyouMessage"></h1>
            <form id="vanish">

                <h2>Leave us a message</h2>
                <textarea placeholder="Enter your message here..."  name="messageofuser" id="message"></textarea>
                <br><input type="button" value="Submit" id="messagebuttonid" onclick="thqdisplay()">
            </form>

            <script type="text/javascript">
                function thqdisplay() {
                    if (document.getElementById("message").value.length < 1) {
                        alert("Please enter your message in the text box.");
                        document.getElementById("message").focus();
                    }
                    else {
                        document.getElementById('vanish').style.display = 'none';
                        document.getElementById("ThankyouMessage").innerHTML = "Thank you for your message. We will get back to you shortly.";
                    }
                }
            </script> -->