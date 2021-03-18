
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Ejercicio_2_Salida", urlPatterns = {"/Ejercicio_2_Salida"})
public class Ejercicio_2_Salida extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int num=Integer.parseInt(request.getParameter("numero"));
        int fac=1;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio_2_Salida</title>");            
            out.println("</head>");
            out.println("<body>");
            for(int i=1;i<=num;i++){
                fac=fac*i;
            }        
            out.println("<h1>la factorial de "+num+" es: "+fac+"</h1>");
            out.println("<br>");
            
            out.println("<a href='Ejercicio_2'>volver atras</a>");
            out.println("<br>");
            out.println("<a href='Main'>volver al menu</a>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }



}
