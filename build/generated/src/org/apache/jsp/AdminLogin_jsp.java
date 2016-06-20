package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admin Login</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"AdminLogincss.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"adminloginpagebackground\">\n");
      out.write("                \n");
      out.write("\n");
      out.write("        <div id=\"invalidusernameorpassword\" style=\"visibility: hidden\">\n");
      out.write("            <fieldset style=\"position: absolute; left: 37.4%; top: 20%; display: block; background-color: #fae4a8 ;width: 26%; height: 9.3%; border: 4px; border-color: #cd8686; border-style: solid;\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><h4 style=\"font-family: sans-serif; text-align: left; margin-top: 0%; margin-bottom: 0%; color: #f40909; font-weight: bold;\">There was a problem with your request.</h4></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><p style=\"font-family: sans-serif; text-align: left; font-size: 74%; margin-top: 0%; color: #f40909;\">There was an error with your Username or Password combination. Please try again.</p></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </fieldset>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"links\" align=\"right\">\n");
      out.write("            <a style=\"color: #ffffff\" href=\"RegistrationForm.jsp\">Register</a> |\n");
      out.write("            <a style=\"color: #ffffff\" href=\"UserLoginForm.jsp\">User Login</a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div style=\"text-align: center;\">\n");
      out.write("            <a href=\"UserInterface.jsp\" style=\"text-decoration: none\"><h1 style=\" font-size: 40px; color: #ffffff; margin: 0px 0px 0px 0px; padding-bottom: 0px;\" >NORTHWEST MISSOURI STATE UNIVERSITY</h1></a>\n");
      out.write("            <a href=\"UserInterface.jsp\" style=\"text-decoration: none\"><h2 style=\" font-size: 35px; color: #ffffff; margin: 0px 0px 0px 0px; padding-top: 0px;\" >OFFICE OF CAMPUS ACTIVITIES HOMECOMING</h2></a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div style=\"position: absolute; top: 4%; left: 10%;\">\n");
      out.write("            <a href=\"UserInterface.jsp\" style=\"text-decoration: none\"><img width=\"100\" height=\"100\" src=\"NWLogo.jpg\"></a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div style=\"position: absolute; top: 37%; bottom: 80%; left: 39%; right: 4%; \">\n");
      out.write("            <fieldset style=\"background-color: #d3d2e0; border: 4px; border-color: #3237d4; border-radius: 10px; border-style: groove;\n");
      out.write("                      width: 40%;\">\n");
      out.write("                <form onsubmit=\"return adminValidation()\" action=\"adminInnerPage.jsp\" method=\"post\">\n");
      out.write("                    <table>\n");
      out.write("                        <h3 style=\"text-align: center;\"><b>Admin Login</b></h3>\n");
      out.write("                        \n");
      out.write("                            <tr>\n");
      out.write("                                <td><label>Admin</label></td>\n");
      out.write("                                <td><input autofocus type=\"text\" id=\"adminloginid\" name=\"LoginID\" required=\"\"</td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td><br><label>Password</label></td>\n");
      out.write("                                <td><br><input type=\"text\" id=\"adminloginpassword\" name=\"LoginPassword\" required=\"\"</td>\n");
      out.write("                            </tr>\n");
      out.write("                        \n");
      out.write("                    </table>\n");
      out.write("                    \n");
      out.write("                    <div style=\"text-align: center;\">\n");
      out.write("                        <br><input type=\"submit\" id=\"adminloginsubmit\" onclick=\"adminValidation();\" style=\"width: 33%; border-radius: 10px; border-color: #ea0f1f;\" value=\"Sign in\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </fieldset>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"footer\">\n");
      out.write("            <a>© 2015 Northwest Missouri State University. All rights reserved.</a> \n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    function adminValidation() {\n");
      out.write("        if (document.getElementById(\"adminloginid\").value === \"administrator\" && document.getElementById(\"adminloginpassword\").value === \"BearcatRocks\") {\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        else if(document.getElementById(\"adminloginid\").value.length < 1 || document.getElementById(\"adminloginpassword\").value.length < 1){\n");
      out.write("            if(document.getElementById(\"adminloginid\").value.length < 1){\n");
      out.write("                document.getElementById(\"adminloginid\").value = \"\";\n");
      out.write("                document.getElementById(\"adminloginid\").focus();\n");
      out.write("            }\n");
      out.write("            document.getElementById(\"adminloginpassword\").value = \"\";\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        else {\n");
      out.write("            document.getElementById(\"invalidusernameorpassword\").style.visibility = \"visible\";\n");
      out.write("            document.getElementById(\"adminloginid\").focus();\n");
      out.write("            document.getElementById(\"adminloginid\").value = \"\";\n");
      out.write("            document.getElementById(\"adminloginpassword\").value = \"\";\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script> ");
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
