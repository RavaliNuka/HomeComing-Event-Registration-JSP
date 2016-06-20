package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import homecoming.Event;

public final class InnerPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 Event e= (Event)request.getSession().getAttribute("userName");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"mycssInnerPage.css\" type=\"text/css\"/>\n");
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"links2\" align=\"right\">\n");
      out.write("            <a href=\"LogoutPage.jsp\">Log Out</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"main\">\n");
      out.write("            \n");
      out.write("            <h1>Welcome  ");
      out.print( e.getGroupLeader() );
      out.write("</h1>\n");
      out.write("            <!--<br><h3>Status of your Request: </h3><h2><mark>Under Process</mark></h2>-->\n");
      out.write("            <br><h3>Status of your Request: <h2><mark>Under Process</mark></h2></h3>\n");
      out.write("            \n");
      out.write("            <br><h3>Keep visiting the page! Any updates will be posted here as soon as your request is processed.</h3><br><br>\n");
      out.write("            \n");
      out.write("            ");
 
                Scanner in = new Scanner(new File("underProcessEvents.txt"));
                String match = e.getUserAccountName();
                
                while(in.next().equals(match)){
                    
                }
                
            
      out.write("\n");
      out.write("            \n");
      out.write("            <form id=\"vanish\">\n");
      out.write("                <h1 id=\"ThankyouMessage\"></h1>\n");
      out.write("                <h2>Leave us a message</h2>\n");
      out.write("                <textarea placeholder=\"Enter your message here...\"  name=\"messageofuser\" id=\"message\"></textarea>\n");
      out.write("                <br><input type=\"button\" value=\"Submit\" id=\"messagebuttonid\" onclick=\"mymessagedisplay()\">\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            <script>\n");
      out.write("                function mymessagedisplay(){\n");
      out.write("                    document.getElementById(\"vanish\").innerHtml = \"\";\n");
      out.write("                    document.getElementById(\"ThankyouMessage\").innerHtml = \"Thank you for your message. We will get back to you shortly.\";\n");
      out.write("                }\n");
      out.write("            </script> \n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("            ");

//                String message = request.getParameter("messageofuser");
//                    if(message != null){
//                        if(((int)request.getSession().getAttribute("MessageCounter")) == 0){
//                            session.setAttribute("MessageCounter", 1);
//                            try (PrintWriter textDoc = new PrintWriter(new File("MessageCounter"))) {
//                                textDoc.println(1);
//                            }
//
//                            File newFile = new File("message_e.getUserAccountName().txt");
//                            try (PrintWriter textDoc = new PrintWriter(new File("message_e.getUserAccountName()"))) {
//                                textDoc.println("1 " + message + "\n");
//                            }
//                        }
//
//                        else{
//                            Scanner in = new Scanner(new File("MessageCounter"));
//                            int presentCounter = in.nextInt();
//                            presentCounter++;
//                            try (PrintWriter textDoc = new PrintWriter(new File("message_e.getUserAccountName()"))) {
//                                textDoc.println(presentCounter + " " + message + "\n");
//                            }
//                            session.setAttribute("MessageCounter", presentCounter);
//                            try (PrintWriter textDoc = new PrintWriter(new File("MessageCounter"))) {
//                                textDoc.println(presentCounter);
//                            }
//
//                        }
//                    }
//                    else ("Enter your message in the text box");
            
      out.write("   \n");
      out.write("            \n");
      out.write("                \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
