package homecoming;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author S522575
 */
@WebServlet(name = "UserPermissionServlet" , urlPatterns = {"/UserPermissionServlet"})
public class UserPermissionServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        String idTobeChecked = request.getParameter("data1");
        String pwTobeChecked = request.getParameter("data2");
        int truth = 0;
        String temp1;
        String pw = " ";

        ServletContext se = getServletContext();
        String path = se.getRealPath(File.separator);
        
        String filename1 = "Status_" + idTobeChecked;
        Scanner inTemp = new Scanner(new File(path + filename1 + ".txt"));
        String status = " ";
        status = inTemp.nextLine();
        

        Scanner in = new Scanner(new File(path + "underProcessEvents.txt"));
        while (in.hasNext()) {
            if (in.next().equals(idTobeChecked)) {
                in.next();
                if (in.next().equals(pwTobeChecked)) {
                    truth = 1;
                }
            } else {
                temp1 = in.nextLine();
            }
        }
        
        HttpSession presentSession =request.getSession();
        presentSession.setAttribute("currentLoginUser",idTobeChecked);
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
//            out.println(truth);
            if(truth == 1)
                out.print("found " + status);
            else out.print("not found");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
