package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrationForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Register for an Event</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"RegistrationFormcss.css\" type=\"text/css\"/>   \n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"AddmorefieldsandValidation.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body style=\"  background: url(Image1.jpg);\">\n");
      out.write("        <!--<form onsubmit=\"return dataValidation()\" action=\"WelcomeServlet\">-->\n");
      out.write("        \n");
      out.write("        <div class=\"links\" align=\"right\">\n");
      out.write("            <a style=\"color: #cccccc\" href=\"UserLoginForm.jsp\">User Login</a> |\n");
      out.write("            <a style=\"color: #cccccc\" href=\"AdminLogin.jsp\">Admin Login</a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div style=\"text-align: center;\">\n");
      out.write("            <a href=\"UserInterface.jsp\" style=\"text-decoration: none\"><h1 style=\" font-size: 40px; color: #cccccc; margin: 0px 0px 0px 0px; padding-bottom: 0px;\" >NORTHWEST MISSOURI STATE UNIVERSITY</h1></a>\n");
      out.write("            <a href=\"UserInterface.jsp\" style=\"text-decoration: none\"><h2 style=\" font-size: 35px; color: #a7a0a0; margin: 0px 0px 0px 0px; padding-top: 0px;\" >OFFICE OF CAMPUS ACTIVITIES HOMECOMING</h2></a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div style=\"position: absolute; top: 4%; left: 10%;\">\n");
      out.write("            <a href=\"UserInterface.jsp\" style=\"text-decoration: none; color: #cccccc\"><img width=\"100\" height=\"100\" src=\"NWLogo.jpg\"></a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <form onsubmit=\"return dataValidation()\" action=\"WelcomeServlet\" method=\"post\">\n");
      out.write("            <fieldset style=\"background-color: #323232; opacity: 0.855;\" >\n");
      out.write("                <legend style=\"font-size: 33px; color: #ffff33;\">Create an Account</legend>\n");
      out.write("                <table  id=\"appendfield\">\n");
      out.write("                    <tbody id=\"dataFlow\">\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td><br><label style=\"color: #ffffff\" id=\"rfid1\">Choose your Username *: </label></td>\n");
      out.write("                        </tr> \n");
      out.write("                        <tr>\n");
      out.write("                            <td><input autofocus type=\"text\" name=\"username\" id=\"userid\" /><br></td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td><br><label style=\"color: #ffffff\" id=\"rfid2\">Create a Password *:    </label></td>\n");
      out.write("                    <div id=\"pwcriteria\" style=\"display: inline; visibility: hidden; font-size: 11.5px; font-weight: bold; color: #ffff00; position: absolute; top: 51%; text-align: right; float: right;\">Password must contain atleast 8 characters and must not contain special characters</div>\n");
      out.write("                    <!--                    <td><br><p id=\"passwordmessage\" style=\"color:red\"></p></td>-->\n");
      out.write("                    </tr>         \n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"text\" name=\"password\" id=\"pw\" onkeydown=\"pwcriteriavisible()\"/><br></td>\n");
      out.write("                        <!--<td><p size=\"small\" color = \"red\">The password must contain 7 to 20 characters and must not contain any special characters</p><br></td>-->\n");
      out.write("                        <!--<td><input type=\"password\" name=\"password\" id=\"pw\"/><br></td>-->\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><br><label style=\"color: #ffffff\" id=\"rfid3\">Confirm your Password *:</label></td>\n");
      out.write("                    </tr>         \n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"text\" name=\"passwordconfirm\" id=\"pwc\"/><br></td>\n");
      out.write("                    </tr> \n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><br><label style=\"color: #ffffff\" id=\"rfid4\">Name of the Group Leader *: </label></td>\n");
      out.write("                        <td><br><label style=\"color: #ffffff\">Contact Number *: </label></td>\n");
      out.write("                    </tr>         \n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"text\" name=\"groupleader\" id=\"glname\"  onkeydown=\"pwcriteriahide()\"/><br></td>\n");
      out.write("                        <td><input type=\"text\" name=\"glContact\" id=\"glc\"/><br></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><br><label style=\"color: #ffffff\">Select the Number of Participants *</label></td>\n");
      out.write("                        <td><br><select name = \"numberOfParticipants\" id=\"numberofparticipants\" onchange=\"addorRemoveGroup()\">\n");
      out.write("                                <option value=0>Select</option>\n");
      out.write("                                <option value=1>1</option> \n");
      out.write("                                <option value=2>2</option> \n");
      out.write("                                <option value=3>3</option> \n");
      out.write("                                <option value=4>4</option> \n");
      out.write("                                <option value=5>5</option> \n");
      out.write("                                <option value=6>6</option> \n");
      out.write("                                <option value=7>7</option> \n");
      out.write("                                <option value=8>8</option> \n");
      out.write("                                <option value=9>9</option> \n");
      out.write("                                <option value=10>10</option> \n");
      out.write("                                <option value=11>11</option> \n");
      out.write("                                <option value=12>12</option> \n");
      out.write("                                <option value=13>13</option> \n");
      out.write("                                <option value=14>14</option> \n");
      out.write("                                <option value=15>15</option> \n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>              \n");
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <table>    \n");
      out.write("                    <tr>\n");
      out.write("                        <td><br><label style=\"color: #ffffff\" id=\"rfid8\">Select your Participation Theme Name *:</label></td>\n");
      out.write("                    </tr>         \n");
      out.write("                    <tr>\n");
      out.write("                        <td><select name = \"themename\" id=\"theme\" >\n");
      out.write("                                <option value=\"none\">Select</option>\n");
      out.write("                                <option value=\"Badminton\">Badminton</option> \n");
      out.write("                                <option value=\"Baseball\">Baseball</option> \n");
      out.write("                                <option value=\"Basket Ball\">Basket Ball</option> \n");
      out.write("                                <option value=\"Bearcat Football\">Bearcat Football</option> \n");
      out.write("                                <option value=\"Bearcat Soccer\">Bearcat Soccer</option>\n");
      out.write("                                <option value=\"Comedy Central on Campus\">Comedy Central on Campus</option>\n");
      out.write("                                <option value=\"Hanging of Banners\">Hanging of Banners</option> \n");
      out.write("                                <option value=\"Olio & Emcee Tryouts\">Olio & Emcee Tryouts</option>\n");
      out.write("                                <option value=\"Royalty Voting\">Royalty Voting</option>\n");
      out.write("                                <option value=\"Set-up Canned Art\">Set-up Canned Art</option> \n");
      out.write("                                <option value=\"Skit Tryouts\">Skit Tryouts</option> \n");
      out.write("                                <option value=\"Variety Show\">Variety Show</option> \n");
      out.write("                                <option value=\"Volley Ball\">Volley Ball</option> \n");
      out.write("                                <option value=\"Walk Out Day Celebration\">Walk Out Day Celebration</option> \n");
      out.write("\n");
      out.write("                            </select><br>\n");
      out.write("                        </td>\n");
      out.write("                        <!--<td><input type=\"text\" name=\"themename\" id=\"theme\"/><br></td>-->\n");
      out.write("                    </tr> \n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><br><label style=\"color: #ffffff\" id=\"rfid9\">Description *:</label></td>\n");
      out.write("                    </tr>           \n");
      out.write("                    <tr>\n");
      out.write("                        <td><textarea placeholder=\"Enter your description here...\"  name=\"description\" id=\"desc\"></textarea><br></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td><br><input type=\"checkbox\" id=\"tandc\" value=\"agreed\" ><label style=\"font-weight: bold; color: #ffffff;\">     I have read and agree to the Terms & Conditions.</label></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>   \n");
      out.write("                \n");
      out.write("                <br><br>\n");
      out.write("                <input type=\"submit\" value=\"Create account\" id=\"create\" >\n");
      out.write("                <input type=\"button\" onClick=\"location.href = 'UserInterface.jsp'\" value=\"Cancel\" id=\"cancel\" style=\"float: right\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <p>&nbsp;</p>\n");
      out.write("        <div id=\"footer\" style=\"text-align: center\">\n");
      out.write("            <a style=\" color: #660066; font-weight: bold;\">© 2015 Northwest Missouri State University. All rights reserved.</a> \n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function pwcriteriavisible() {\n");
      out.write("                document.getElementById(\"pwcriteria\").style.visibility = \"visible\";\n");
      out.write("            }\n");
      out.write("            function pwcriteriahide() {\n");
      out.write("                document.getElementById(\"pwcriteria\").style.visibility = \"hidden\";\n");
      out.write("            }\n");
      out.write("        </script> \n");
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
