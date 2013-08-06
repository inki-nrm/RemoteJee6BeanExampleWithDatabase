package se.nrm.mediaserver;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import se.nrm.mediaserver.entity.Image;
import se.nrm.mediaserver.entity.Media;
import se.nrm.mediaserver.entity.MediaText;

/**
 *
 * @author ingimar
 */
@WebServlet(name = "MediaServlet", urlPatterns = {"/MediaService"})
public class MediaServlet extends HttpServlet {

    @EJB
    MediaBean mediaBean;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Media media = new Image();
        media.setFilename("Butterfly-2013-08-06-16:15.jpg");
        media.setOwner("Larssons");
        media.setVisibility("private");
        media.setMimetype("ABC");
        //media.setMediaText(new MediaText("fjäril vingad syns vid haga... ","sv_SE"));
        mediaBean.saveMedia(media);
        try {
            out.println(mediaBean);
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
