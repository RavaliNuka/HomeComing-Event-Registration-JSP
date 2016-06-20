package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import homecoming.Event;
import javax.servlet.annotation.WebServlet;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.TreeMap;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public final class AccountPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_items.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 int numberOfParticipants = 0; 
      out.write('\n');
 Event e = (Event) request.getSession().getAttribute("FirstTimecurrentLoginUser");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"AccountPagecss.css\" type=\"text/css\"/>\n");
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"links2\" align=\"right\">\n");
      out.write("            <a href=\"LogoutPage.jsp\">Log Out</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div style=\"text-align: center;\">\n");
      out.write("            <h1 style=\" font-size: 40px; color: #009933; margin: 0px 0px 0px 0px; padding-bottom: 0px; font-family:\" >NORTHWEST MISSOURI STATE UNIVERSITY</h1>\n");
      out.write("            <h2 style=\" font-size: 35px; color: #009933; margin: 0px 0px 0px 0px; padding-top: 0px;\" >OFFICE OF CAMPUS ACTIVITIES HOMECOMING</h2>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div style=\"position: absolute; left: 10%; top: 3%; \">\n");
      out.write("            <img width=\"100\" height=\"100\" src=\"NWLogo.jpg\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"main\">\n");
      out.write("\n");
      out.write("            <p>&nbsp;</p>\n");
      out.write("            <h1 id=\"underline\">Welcome  ");
      out.print( e.getGroupLeader());
      out.write("</h1>\n");
      out.write("            <p>&nbsp;</p>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td><p style=\"margin-right: 0px; padding-right: 0px; margin: 0px; padding: 0px;\">Status of your Request: <mark>Under Process</mark></p></td>                    \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            <br><h3>Keep visiting the page! Any updates will be posted here as soon as your request is processed.</h3><br><br>\n");
      out.write("\n");
      out.write("            ");

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

            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td><p>Event Requested: ");
      out.print( theme);
      out.write("</p></td>                    \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            <table border=\"1\" width=\"40%\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>S. No.</th>\n");
      out.write("                    <th>Name of the Participant</th>\n");
      out.write("                    <th>Contact Number</th>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tbody id=\"gen\" >\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td><p>Description: ");
      out.print( desc);
      out.write("</p></td>                    \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"vanish\">\n");
      out.write("                <form>\n");
      out.write("                    <h2>Leave us a message</h2>\n");
      out.write("                    <textarea style=\"width: 25%; height: auto;\" placeholder=\"Enter your message here...\"  name=\"messageofuser\" id=\"message\"></textarea>\n");
      out.write("                    <br><button type=\"button\" id=\"messagebuttonid\" onclick=\"thqdisplay();\">Submit</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <h1 id=\"ThankyouMessage\"></h1>\n");
      out.write("            <div id=\"underline\"></div>\n");
      out.write("            <p>&nbsp;</p>\n");
      out.write("\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                function thqdisplay() {\n");
      out.write("                    if (document.getElementById(\"message\").value.length < 1) {\n");
      out.write("                        alert(\"Please enter your message in the text box.\");\n");
      out.write("                        document.getElementById(\"message\").focus();\n");
      out.write("                    }\n");
      out.write("                    else {\n");
      out.write("                        document.getElementById('vanish').style.display = 'none';\n");
      out.write("                        document.getElementById(\"ThankyouMessage\").innerHTML = \"Thank you for your message. We will get back to you shortly.\";\n");
      out.write("                        var message = document.getElementById(\"message\").value;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            </script> \n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                <a>© 2015 Northwest Missouri State University. All rights reserved.</a> \n");
      out.write("            </div> \n");
      out.write("\n");
      out.write("            <!--**************************// leave us a message storage code **************************-->\n");
      out.write("            ");

            
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("            <h1 id=\"ThankyouMessage\"></h1>\n");
      out.write("            <form id=\"vanish\">\n");
      out.write("\n");
      out.write("                <h2>Leave us a message</h2>\n");
      out.write("                <textarea placeholder=\"Enter your message here...\"  name=\"messageofuser\" id=\"message\"></textarea>\n");
      out.write("                <br><input type=\"button\" value=\"Submit\" id=\"messagebuttonid\" onclick=\"thqdisplay()\">\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                function thqdisplay() {\n");
      out.write("                    if (document.getElementById(\"message\").value.length < 1) {\n");
      out.write("                        alert(\"Please enter your message in the text box.\");\n");
      out.write("                        document.getElementById(\"message\").focus();\n");
      out.write("                    }\n");
      out.write("                    else {\n");
      out.write("                        document.getElementById('vanish').style.display = 'none';\n");
      out.write("                        document.getElementById(\"ThankyouMessage\").innerHTML = \"Thank you for your message. We will get back to you shortly.\";\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            </script> -->");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${participant}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVarStatus("loop");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                        <tr>\n");
          out.write("                            <td>\n");
          out.write("                                ");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                            </td>\n");
          out.write("                            <td>\n");
          out.write("                                ");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                            </td>\n");
          out.write("                            <td>\n");
          out.write("                                ");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                            </td>                \n");
          out.write("                        </tr>\n");
          out.write("\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loop.index}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${participant[loop.index]}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${participantContact[loop.index]}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }
}
