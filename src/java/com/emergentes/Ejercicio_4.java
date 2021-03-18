
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Ejercicio_4", urlPatterns = {"/Ejercicio_4"})
public class Ejercicio_4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio_4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>cambio de moneda</h1>");
            
            out.println("<form action='Ejercicio_4_Salida_1' method='get'>");
            out.println("<input type='submit' value='Bolivianos a Dolares'>");
            out.println("</form>");
            
            out.println("<form action='Ejercicio_4_Salida_2' method='get'>");
            out.println("<input type='submit' value='Dolares a bolivianos'>");
            out.println("</form>");
            
            out.println("<br>");
            out.println("<a href='Main'>volver al menu</a>"); 
            
            out.println("</body>");
            out.println("</html>");
        }
    }


}
