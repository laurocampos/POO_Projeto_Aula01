/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rodrigo
 */
@WebServlet(urlPatterns = {"/jc"})
public class JurosCompostos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
           // String v_i =0;
           // int d_m_i = 0 ;
           // int d_a_i = 0;
           // //entrada da data final
           // int d_m_f = 0;
           // int d_a_f = 0 ;
            //para saber os meses passados ((ano1 - ano2)*12 + mes1-mes2)
           // float temp_m = 0;
            //int i =0 ;
    
    
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet JurosCompostos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<br>");
            out.println("<form> calculo de juros compostos <br>");
            out.println("valor inicial: <input type='text' name='v_i'> <br>");
            out.println("mes inicial: <input type='text' name='d_m_i'> <br>");
            out.println("ano inicial:<input type='text' name='d_a_i'> <br>");
            out.println("mes final: <input type='text' name='d_m_f'> <br>");
            out.println("ano final:<input type='text' name='d_a_f'> <br>");
            out.println("percentual:<input type='text' name='i'> <br>");
            out.println("<input type='submit' name='Calcular'> <br>");
            out.print("</form>");
            //int altura= request.getParameter("altura"); Declaraçao para entrada de dados
            String v_i = request.getParameter("v_i");
            //entrada da data inicial
            String d_m_i = request.getParameter( "d_m_i") ;
            String d_a_i = request.getParameter("d_a_i") ;
            //entrada da data final
            String d_m_f = request.getParameter("d_m_f") ;
            String d_a_f = request.getParameter("d_a_f") ;
            //para saber os meses passados ((ano1 - ano2)*12 + mes1-mes2)
            float temp_m = (float) ((Double.parseDouble(d_a_i) - Double.parseDouble(d_a_f))* 12 + Double.parseDouble(d_m_i) - Double.parseDouble((d_m_f)));
            String i = request.getParameter("i") ;
                        //double d = Double.parseDouble((String)
            //M = P . (1 +  i)^n  calculo do juros composto
            double v_f = (Double.parseDouble(v_i) *(Math.pow((1+ (Double.parseDouble(i)) ),temp_m)));
            double v_j =(Double.parseDouble(v_i)) - (v_f);
            
            out.println("O montante é de: "+v_f+" e valorjuros:"+v_j+"<br>");
                        
            out.println("</body>");
            out.println("</html>");
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
