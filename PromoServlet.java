/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/ContactServlet"})
public class PromoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Contact Us</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; background-color: #f4f4f4; margin: 0; padding: 0; }");
            out.println("header { background-color: #333; color: #fff; padding: 20px 0; }");
            out.println("header ul { list-style: none; padding: 0; margin: 0; text-align: center; }");
            out.println("header ul li { display: inline; margin-right: 15px; }");
            out.println("header ul li a { color: #fff; text-decoration: none; font-weight: bold; }");
            out.println("h1 { text-align: center; margin-top: 50px; color: #333; }");
            out.println(".large-img { width: 1300px; height: 450px; }"); 
            out.println(".small-img { width: 600px; height: 300px; }"); 
            out.println(".small-img-wrapper { display: flex; gap: 10px; justify-content: center; margin: 20px 0; }");
            out.println(".text-center { text-align: center; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<header>");
            out.println("<ul>");
            out.println("<li><a href=\"MenuServlet\">Home</a></li>");
            out.println("<li><a href=\"AboutServlet\">Menu</a></li>");
            out.println("<li><a href=\"ContactServlet\">Promo</a></li>");
            out.println("</ul>");
            out.println("</header>");
         
            // Menambahkan gambar pertama
            out.println("<img class=\"large-img\" src=\"https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEir_ZLqc1uUzbJpouXnTva5n4_VNTs9p3R_QIufMtOM5W_hQFvgEuh0xQYzi5XhVWKcQGWmxY34BFsn94GMWN6NxbSRNRczCMzuKhH_MVJidbKKnvnzZ1EW1Zb_qdJ87jGp4NO-Vw9p3PrD/s1600/PROMO+MERDEKA+band.jpg\" alt=\"Promo Merdeka Band\">");
            
            // Menambahkan gambar kedua dan ketiga
            out.println("<h1>Menu Yang Promo</h1>");
            out.println("<div class=\"small-img-wrapper\">");
            out.println("<div>");
            out.println("<img class=\"small-img\" src=\"https://www.blibli.com/friends-backend/wp-content/uploads/2023/07/Rekomendasi-Menu-Mie-Gacoan-Best-Seller-Mie-Iblis-1536x806.jpg\" alt=\"Mie Gacoan Best Seller\">");
            out.println("</div>");
            out.println("<div>");
            out.println("<img class=\"small-img\" src=\"https://www.blibli.com/friends-backend/wp-content/uploads/2023/07/Rekomendasi-Menu-Mie-Gacoan-Best-Seller-Es-Genderuwo-1536x806.jpg\" alt=\"Mie Gacoan Best Seller Es Genderuwo\">");
            out.println("</div>");
            out.println("</div>");
            // Teks di bawah gambar kedua dan ketiga
            out.println("<div class=\"text-center\">");
            out.println("<h3>Dengan Merayakan Hari Kemerdekaan Maka Menu Paket MIE SUIT DAN ES GROBAK SODOR, Mulai Dari 17.000</h3>");
            out.println("</div>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Contact Servlet";
    }
}
