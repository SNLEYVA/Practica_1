
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Ejercicio_4_Salida_1", urlPatterns = {"/Ejercicio_4_Salida_1"})
public class Ejercicio_4_Salida_1 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio_4_Salida_1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>cambio de Bolivianos a Dolares</h1>");
            
            out.println("<form action='Ejercicio_4_Salida_1' method='post'>");

            out.println("<label>Bolivianos: </label>");
            out.println("<input type='number' name='num'>");
            out.println("<input type='submit' value='Cambiar a Dolares'>");
            
            out.println("<br>");
            out.println("<a href='Ejercicio_4'>volver atras</a>");
            out.println("<br>");
            out.println("<a href='Main'>volver al menu</a>");  
            
            out.println("</form>");     
            
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        double numero=Double.parseDouble(request.getParameter("num"));
        double dolar=6.91,res=0;
                
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio_4_Salida_1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Dolar es: "+dolar+" $</h1>");
            out.println("<h1>cambio de "+numero+" Bs. a Dolares es:</h1>");
            res=numero/dolar;
            out.println("<h1>= "+res+" $</h1>");

            out.println("<br>");
            out.println("<a href='Ejercicio_4'>volver atras</a>");
            out.println("<br>");
            out.println("<a href='Main'>volver al menu</a>"); 
            
            out.println("</body>");
            out.println("</html>");
        }     
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
