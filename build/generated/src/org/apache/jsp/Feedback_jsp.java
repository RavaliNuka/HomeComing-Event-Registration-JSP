package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Feedback</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Feedbackcss.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div style=\"position: absolute; top: 5.9%; left: 12.5%;\">\n");
      out.write("            <a href=\"UserInterface.jsp\" style=\"text-decoration: none\"><img width=\"100\" height=\"100\" src=\"NWLogo.jpg\"></a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"links\" align=\"right\" style=\"margin-top: 0.45%; margin-right: 0.975%;\">\n");
      out.write("            <a href=\"RegistrationForm.jsp\">Register</a> |\n");
      out.write("            <a href=\"UserLoginForm.jsp\">User Login</a> |\n");
      out.write("            <a href=\"AdminLogin.jsp\">Admin Login</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"main\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div id=\"banner\">\n");
      out.write("                    <div id=\"welcome\">\n");
      out.write("                        <a href=\"UserInterface.jsp\" style=\"text-decoration: none\"><h1 style=\"position: absolute; left: 10%;\"><b>NORTHWEST MISSOURI STATE UNIVERSITY</b></h1></a>\n");
      out.write("                    </div><!--close welcome-->\n");
      out.write("                    <div id=\"welcome_slogan\">\n");
      out.write("                        <a href=\"UserInterface.jsp\" style=\"text-decoration: none\"><h2 style=\"position: absolute; left: 10%; margin-bottom: 0%; padding-bottom: 0%\">OFFICE OF CAMPUS ACTIVITIES HOMECOMING</h2></a>\n");
      out.write("                    </div><!--close welcome_slogan-->\n");
      out.write("                </div><!--close banner-->\n");
      out.write("            </div><!--close header-->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"menubar\">\n");
      out.write("                <ul id=\"menu\">\n");
      out.write("                    <li><a  href=\"UserInterface.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"About.jsp\">About</a></li>\n");
      out.write("                    <li><a href=\"Schedule.jsp\">Schedule</a></li>\n");
      out.write("                    <li><a href=\"Gallery.jsp\">Gallery</a></li>\n");
      out.write("                    <li><a href=\"ContactUs.jsp\">Contact Us</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div><!--close menubar-->\t\n");
      out.write("\n");
      out.write("            <div id=\"site_content\">\t\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div id=\"vanish\" style=\"position: absolute; top: 35%\">\n");
      out.write("                    <h1>Feedback</h1>\n");
      out.write("                    <p style=\"text-align: left; padding-top: 0px; margin-top: 0px; padding-bottom: 0px; margin-bottom: 0px;\">Please take a moment to give us your valuable feedback that helps us to improve your experience in the upcoming events. Any comments/</p>\n");
      out.write("                    <p>suggestions are welcome.</p><br>\n");
      out.write("\n");
      out.write("                    <form>\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><h3 style=\" width: 200px; \">Select Event Name:</h3></td>\n");
      out.write("                                <td><select style=\" width: 215px; height: 22px\" name = \"themename\" id=\"theme\" >\n");
      out.write("                                        <option value=\"none\">Select</option>\n");
      out.write("                                        <option value=\"Badminton\">Badminton</option> \n");
      out.write("                                        <option value=\"Baseball\">Baseball</option> \n");
      out.write("                                        <option value=\"Basket Ball\">Basket Ball</option> \n");
      out.write("                                        <option value=\"Bearcat Football\">Bearcat Football</option> \n");
      out.write("                                        <option value=\"Bearcat Soccer\">Bearcat Soccer</option>\n");
      out.write("                                        <option value=\"Comedy Central on Campus\">Comedy Central on Campus</option>\n");
      out.write("                                        <option value=\"Hanging of Banners\">Hanging of Banners</option> \n");
      out.write("                                        <option value=\"Olio & Emcee Tryouts\">Olio & Emcee Tryouts</option>\n");
      out.write("                                        <option value=\"Royalty Voting\">Royalty Voting</option>\n");
      out.write("                                        <option value=\"Set-up Canned Art\">Set-up Canned Art</option> \n");
      out.write("                                        <option value=\"Skit Tryouts\">Skit Tryouts</option> \n");
      out.write("                                        <option value=\"Variety Show\">Variety Show</option> \n");
      out.write("                                        <option value=\"Volley Ball\">Volley Ball</option> \n");
      out.write("                                        <option value=\"Walk Out Day Celebration\">Walk Out Day Celebration</option> \n");
      out.write("                                    </select>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td><br><h3 style=\" width: 200px; padding-right: 0px; margin: 0px;\">Rating:</h3></td>\n");
      out.write("                                <!--<td><br><input id=\"eventRating\" style=\" width: 211px; height: 19px\" type=\"text\"></td>-->\n");
      out.write("                                <!--Star rating coe starts-->\n");
      out.write("                                \n");
      out.write("                                <td style=\" position: absolute; left: 22.4%;\"> <input class=\"star star-5\" id=\"star-5\" type=\"radio\" name=\"star\"/>\n");
      out.write("                                            <label name=\"Rating\" class=\"star star-5\" for=\"star-5\"></label>\n");
      out.write("                                            <input class=\"star star-4\"  id=\"star-4\" type=\"radio\" name=\"star\"/>\n");
      out.write("                                            <label class=\"star star-4\"  for=\"star-4\"></label>\n");
      out.write("                                            <input class=\"star star-3\"  id=\"star-3\" type=\"radio\" name=\"star\"/>\n");
      out.write("                                            <label class=\"star star-3\" for=\"star-3\"></label>\n");
      out.write("                                            <input class=\"star star-2\"  title=\"2 Stars\" id=\"star-2\" type=\"radio\" name=\"star\"/>\n");
      out.write("                                            <label class=\"star star-2\" for=\"star-2\"></label>\n");
      out.write("                                            <input class=\"star star-1\"  title=\"1 star\" id=\"star-1\" type=\"radio\" name=\"star\"/>\n");
      out.write("                                            <label class=\"star star-1\" for=\"star-1\"></label></td>\n");
      out.write("\n");
      out.write("                                \n");
      out.write("                            <!--star ends here-->\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td><br><h3 style=\" width: 200px; margin: 0px; padding: 0px;\">Suggestion/Comment:</h3></td>\n");
      out.write("                                <td><br><textarea id=\"feedback\" style=\" height: 130px; width: 213px;\"></textarea></td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td><input id=\"contactTabButton\" type=\"submit\"  onclick=\"thqdisplay()\" value=\"Submit\" style=\" height: 28px; float: right\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <script type=\"text/javascript\">\n");
      out.write("                    function thqdisplay() {\n");
      out.write("                        if (document.getElementById(\"theme\").value === \"none\") {\n");
      out.write("                            alert(\"Please select the name of the event you wish to rate.\");\n");
      out.write("                        }\n");
      out.write("                        else {\n");
      out.write("//                            if (document.getElementById(\"eventRating\").value.length < 1) {\n");
      out.write("//                                alert(\"Please rate the event you have selected\");\n");
      out.write("//                            }\n");
      out.write("                            \n");
      out.write("                                document.getElementById('feedback').value = \"\";\n");
      out.write("                                alert(\"Thank you for your feedback.\");\n");
      out.write("                            \n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                </script> \n");
      out.write("\n");
      out.write("            </div><!--close site_content--> \n");
      out.write("\n");
      out.write("            <div id=\"content_bottom\">\n");
      out.write("            </div><!--close content_bottom-->   \n");
      out.write("        </div><!--close main-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"col-left\" style=\"opacity: 0.91; width: 23%; float: left; position: absolute; bottom: -32.5%; margin-bottom: 2%; left: 12.3%;  //left 14.45 bottom: -32.5\n");
      out.write("             display: block; background-color: #000; padding: 1%; height: 18.3%; text-align: left !important\">\n");
      out.write("            <!--display: block;  padding: 10px; background-color: #000; height: 120px; text-align: left !important;\">-->\n");
      out.write("            <h3>Contact Us</h3>\n");
      out.write("            <p id=\"undertwo\" style=\" font-size: 82%; \">\n");
      out.write("                <b>Northwest Missouri State University</b>\n");
      out.write("                <br>\n");
      out.write("                800 University Drive | Maryville, MO 64468\n");
      out.write("                <br>\n");
      out.write("                660.562.1532 |\n");
      out.write("\n");
      out.write("                <a style=\"text-decoration:none;\" href=\"http://www.nwmissouri.edu\" target=\"_blank\">www.nwmissouri.edu</a> \n");
      out.write("            </p>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"col-center\" style=\"opacity: 0.91; width: 22%; position: absolute; bottom: -32.5%; margin-bottom: 2%; left: 38.25%;\n");
      out.write("             display: block; background-color: #000; padding: 1%; height: 18.3%; text-align: left !important\">\n");
      out.write("            <h3>Related Links</h3>\n");
      out.write("            <p id=\"under\" style=\" font-size: 82%;\" >\n");
      out.write("                <a style=\"text-decoration: none;\" href=\"http://www.nwmissouri.edu/aboutus/index.htm\" target=\"_blank\">About Northwest</a>\n");
      out.write("                <br><a style=\"text-decoration: none;\" href=\"http://www.nwmissouri.edu/admissions/campusvisits/maps.htm\" target=\"_blank\">Maps and Directions</a>\n");
      out.write("                <br><a style=\"text-decoration: none;\" href=\"http://www.nwmissouri.edu/police/parking/maps.htm\" target=\"_blank\">Parking Maps</a>\n");
      out.write("                <br><a style=\"text-decoration: none;\" href=\"http://www.nwmissouri.edu/police/forms/reportcrime.htm\" target=\"_blank\">Report a Crime</a>\n");
      out.write("                <br><a style=\"text-decoration: none;\" href=\"http://www.nwmissouri.edu/alert/index.htm\" target=\"_blank\">Emergency Information</a>\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"col-right\" style=\"opacity: 0.91; width: 22.9%; position: absolute; bottom: -32.5%; margin-bottom: 2%; left: 63%;\n");
      out.write("             display: block; background-color: #000; padding: 1%; height: 18.3%; text-align: left !important\">\n");
      out.write("            <!--<h3 style=\"position: absolute; bottom: 31%; right: 17%; font-size: 160%;\" ><b>Give us your feedback</b></h3>-->\n");
      out.write("            <h3 style=\"position: absolute; bottom: 31%; right: 17%; font-size: 160%; font-weight: bold;\" ><a style=\"text-decoration: none;\" href=\"Feedback.jsp\">Give us your feedback</a></h3>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"footer\">\n");
      out.write("            <a>© 2015 Northwest Missouri State University. All rights reserved.</a> \n");
      out.write("        </div>  \n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
