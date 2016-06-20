package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class About_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>About</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Aboutcss.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
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
      out.write("            <div style=\"position: absolute; top: 5.9%; left: 12.5%;\">\n");
      out.write("                <a href=\"UserInterface.jsp\" style=\"text-decoration: none\"><img width=\"100\" height=\"100\" src=\"NWLogo.jpg\"></a>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div style=\"position: absolute; top: 34%; left: 25%;\">\n");
      out.write("                <img width=\"650\" height=\"280\" src=\"AboutTabImage1.jpg\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"menubar\">\n");
      out.write("                <ul id=\"menu\">\n");
      out.write("                    <li><a  href=\"UserInterface.jsp\">Home</a></li>\n");
      out.write("                    <li class=\"current\"><a href=\"About.jsp\">About</a></li>\n");
      out.write("                    <li><a href=\"Schedule.jsp\">Schedule</a></li>\n");
      out.write("                    <li><a href=\"Gallery.jsp\">Gallery</a></li>\n");
      out.write("                    <li><a href=\"ContactUs.jsp\">Contact Us</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div><!--close menubar-->\t\n");
      out.write("\n");
      out.write("            <div id=\"site_content\">\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--                <div class=\"slideshow\">\n");
      out.write("                    <ul class=\"slideshow\">\n");
      out.write("                        <li class=\"show\"><img width=\"680\" height=\"400\" src=\"images/home_1.jpg\"/></li>\n");
      out.write("                        <li><img width=\"680\" height=\"250\" src=\"images/home_2.jpg\"/></li>\n");
      out.write("                        <li class=\"show\"><img width=\"500\" height=\"400\" src=\"SlideshowImage1.jpg\"/></li>\n");
      out.write("                        <li class=\"show\"><img width=\"500\" height=\"250\" src=\"SlideshowImage2.jpg\"/></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\t  \t -->\n");
      out.write("\n");
      out.write("                <div id=\"content\">\n");
      out.write("                    <div class=\"content_item\">\n");
      out.write("                        <h1>Homecoming 2015</h1> \n");
      out.write("                        <p>Homecoming at Northwest is a week-long celebration each October featuring athletic events, entertainment and plenty of opportunities for everyone to show their Bearcat spirit. Homecoming events are open to all Northwest students, alumni, faculty, staff, families and friends, and community members. This site contains all the information anyone would need to enjoy the Northwest Homecoming experience.</p>\t                          \n");
      out.write("                        <br style=\"clear:both\"/>\n");
      out.write("                    </div><!--close content_item-->\n");
      out.write("                </div><!--close content-->  \n");
      out.write("\n");
      out.write("            </div><!--close site_content--> \n");
      out.write("\n");
      out.write("            <div id=\"content_bottom\">\n");
      out.write("            </div><!--close content_bottom-->   \n");
      out.write("        </div><!--close main-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"col-left\" style=\"opacity: 0.91; width: 23%; float: left; position: absolute; bottom: -32%; margin-bottom: 2%; left: 12.3%;  //left 14.45\n");
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
      out.write("        <div id=\"col-center\" style=\"opacity: 0.91; width: 22%; position: absolute; bottom: -32%; margin-bottom: 2%; left: 38.25%;\n");
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
      out.write("        <div id=\"col-right\" style=\"opacity: 0.91; width: 22.9%; position: absolute; bottom: -32%; margin-bottom: 2%; left: 63%;\n");
      out.write("             display: block; background-color: #000; padding: 1%; height: 18.3%; text-align: left !important\">\n");
      out.write("            <h3 style=\"position: absolute; bottom: 31%; right: 17%; font-size: 160%; font-weight: bold;\" ><a style=\"text-decoration: none;\" href=\"Feedback.jsp\">Give us your feedback</a></h3>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"footer\">\n");
      out.write("            <a>© 2015 Northwest Missouri State University. All rights reserved.</a> \n");
      out.write("        </div>  \n");
      out.write("\n");
      out.write("        \n");
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
