/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homecoming;


import java.io.FileNotFoundException;



import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

/**
 *
 * @author S522575
 */
@WebServlet(name = "WelcomeServlet", urlPatterns = {"/WelcomeServlet"})
public class WelcomeServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        String groupLeader = request.getParameter("groupleader");
        long glContact = Long.parseLong(request.getParameter("glContact"));
        int numberOfParticipants = Integer.parseInt(request.getParameter("numberOfParticipants"));
        
        String[] participants = new String[numberOfParticipants];
        long[] participantContacts = new long[numberOfParticipants];
        for(int i=1; i <=numberOfParticipants; i++){
            participants[i-1] = request.getParameter("participant"+i);
            participantContacts[i-1] = Long.parseLong(request.getParameter("participant"+i+"Contact"));
        }
        
        String themeName = request.getParameter("themename");
        String description = request.getParameter("description");
        
        ArrayList<Participant> fullParticipantInfo = new ArrayList<>();
        for(int i=0; i < numberOfParticipants; i++){
            Participant tempPart = new Participant(participants[i], participantContacts[i]);
            fullParticipantInfo.add(tempPart);
        }
        Event eve = new Event(userName, password, numberOfParticipants, groupLeader, glContact, fullParticipantInfo, themeName, description);
        
        ServletContext se=getServletContext();
        String path = se.getRealPath(File.separator);
//        path = path.substring(0, path.indexOf("\build"));
//        String tempPath = "C:/Users/s522575/Documents/NetBeansProjects/HomeComing Event Registration JSP/build/web/";
//        System.out.println(path);
        
        try (PrintWriter textDoc = new PrintWriter(new File(path+"UnderProcessEvents.txt"))) {
            textDoc.write(eve.toString() + "\r\n");
        }
        
        String fileName1 = "Status_" + userName;
        try (PrintWriter textDoc = new PrintWriter(new File(path + fileName1 + ".txt"))) {
            textDoc.write("Under Process");
        }
        
        String fileName2 = "LeftAMessage";
        try (PrintWriter textDoc = new PrintWriter(new File(path + fileName2 + ".txt"))) {
            textDoc.println("");
        }
        
        
        
//        request.setAttribute("currentLoginUser",userName);
        
        HttpSession presentSession =request.getSession();
        presentSession.setAttribute("FirstTimecurrentLoginUser", eve);
        
        
        
        RequestDispatcher myrd = request.getRequestDispatcher("WelcomePage.jsp");  
        myrd.forward(request, response);  
        
//        response.sendRedirect("web/WelcomePage.jsp");
//         response.sendRedirect("./WelcomePage.jsp");

        
//Use SendDirect if you want to work with JSP pages
//response.sendRedirect("/thankyou.jsp");
//This is simpe thing to use than RequestDispatcher which doesn't work with doPost().
        

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
