
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Ejercicio_2", urlPatterns = {"/Ejercicio_2"})
public class Ejercicio_2 extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio_2</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<form action='Ejercicio_2_Salida' method='post'>");
            out.println("<h1>FACTORIAL</h1>");
            out.println("<label>numero: </label>");
            out.println("<input type='number' name='numero'>");
            out.println("<input type='submit' value='calcular'>");
            out.println("</form>");
            
            out.println("<br>");
            out.println("<a href='Main'>volver al menu</a>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

}
