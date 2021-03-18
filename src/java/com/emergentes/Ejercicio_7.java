
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Ejercicio_7", urlPatterns = {"/Ejercicio_7"})
public class Ejercicio_7 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio_7</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>MATRIZ CARACOL</h1>");
            
            out.println("<form action='Ejercicio_7' method='post'>");
            out.println("<input type='number' name='N'>");
            out.println("</form>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int N = Integer.parseInt(request.getParameter("N"));
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio_1_Salida</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>MATRIZ CARACOL N="+N+"</h1>");

        int [][]matriz=new int [20][20];

        int inicio=0;
        int nlimite=N-1;
        int c=1;
        while(c<=(N*N)){
            for(int i=inicio;i<=nlimite;i++){
                matriz[inicio][i]=c++;
            }    
            for(int i=inicio+1;i<=nlimite;i++){
                matriz[i][nlimite]=c++;
            }
            for(int i=nlimite-1;i>=inicio;i--){
                matriz[nlimite][i]=c++;
            }
            for(int i=nlimite-1;i>=inicio+1;i--){
                matriz[i][inicio]=c++;
            }
            inicio=inicio+1;
            nlimite=nlimite-1;
        }
        for(int i=0;i<N;i++){
            out.println("<br>");
            for(int j=0;j<N;j++){
                out.print("<a>"+matriz[i][j]+"</a>");
            }       
        }
               
            
            
            out.println("<br>");
            out.println("<a href='Main'>volver al menu</a>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }


}
