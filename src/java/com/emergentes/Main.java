
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Main", urlPatterns = {"/Main"})
public class Main extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Main</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>PRACTICA 1</h1>");
            
            out.println("<form action='Ejercicio_1'>");
            out.println("<input type='submit' value='EJERCICIO 1'>");
            out.println("</form>");
            
            out.println("<form action='Ejercicio_2'>");
            out.println("<input type='submit' value='EJERCICIO 2'>");
            out.println("</form>");
            
            out.println("<form action='Ejercicio_3'>");
            out.println("<input type='submit' value='EJERCICIO 3'>");
            out.println("</form>");
            
            out.println("<form action='Ejercicio_4'>");
            out.println("<input type='submit' value='EJERCICIO 4'>");
            out.println("</form>");
            
            out.println("<form action='Ejercicio_5'>");
            out.println("<input type='submit' value='EJERCICIO 5'>");
            out.println("</form>");
            
            out.println("<form action='Ejercicio_6'>");
            out.println("<input type='submit' value='EJERCICIO 6'>");
            out.println("</form>");

            out.println("<form action='Ejercicio_7'>");
            out.println("<input type='submit' value='EJERCICIO 7'>");
            out.println("</form>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }
}
