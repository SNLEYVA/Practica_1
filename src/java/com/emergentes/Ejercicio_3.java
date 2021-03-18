
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Ejercicio_3", urlPatterns = {"/Ejercicio_3"})
public class Ejercicio_3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio_3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos del usuario</h1>");
            
            out.println("<form action='Ejercicio_3' method='post'>");
            out.println("<label>Nombre: </label>");
            out.println("<input type='text' name='nombre'>");
            out.println("<br>");
            out.println("<label>Año de Nacimiento: </label>");
            out.println("<input type='number' name='ano'>");
            out.println("<br>");
            out.println("<input type='submit' value='Procesar'>");
            
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
        String nombre = request.getParameter("nombre");
        int ano = Integer.parseInt(request.getParameter("ano"));
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio_3</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>DATOS RESIVIDOS</h1>");
            out.println("<p>nombre:"+nombre+"</p>");
            out.println("<p>su edad es:"+(2021-ano)+"</p>");
            
            out.println("<br>");
            out.println("<a href='Main'>volver al menu</a>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
