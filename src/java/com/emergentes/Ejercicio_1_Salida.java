
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Ejercicio_1_Salida", urlPatterns = {"/Ejercicio_1_Salida"})
public class Ejercicio_1_Salida extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        int ano = Integer.parseInt(request.getParameter("ano"));
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio_1_Salida</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>DATOS RESIVIDOS</h1>");
            out.println("<p>nombre:"+nombre+"</p>");
            out.println("<p>su edad es:"+(2021-ano)+"</p>");
            
            out.println("<br>");
            out.println("<a href='Ejercicio_1'>volver atras</a>");
            out.println("<br>");
            out.println("<a href='Main'>volver al menu</a>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

}
