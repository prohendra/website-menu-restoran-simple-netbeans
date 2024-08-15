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

@WebServlet(urlPatterns = {"/AboutServlet"})
public class MenuServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>About Us</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; background-color: #f4f4f4; margin: 0; padding: 0; }");
            out.println("header { background-color: #333; color: #fff; padding: 20px 0; }");
            out.println("header ul { list-style: none; padding: 0; margin: 0; text-align: center; }");
            out.println("header ul li { display: inline; margin-right: 15px; }");
            out.println("header ul li a { color: #fff; text-decoration: none; font-weight: bold; }");
            out.println("h1 { text-align: center; margin-top: 50px; color: #333; }");
            out.println(".container { display: flex; justify-content: center; align-items: center; flex-wrap: wrap; margin: 20px; }");
            out.println(".container img { max-width: 100%; height: auto; }");
            out.println(".text { max-width: 600px; margin-left: 20px; font-size: 16px; color: #333; }");
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
            out.println("<h1>Mie Suit</h1>");
            // Bagian pertama
            out.println("<div class=\"container\">");
            out.println("<img src=\"https://assets.promediateknologi.id/crop/0x0:0x0/750x500/webp/photo/2023/02/19/FotoJet-2023-02-19T203316884-1175934296.jpg\" alt=\"About Image\">");
            out.println("<div class=\"text\">");
              out.println("<p><b>Mie Gacoan</b> memang terkenal dengan mie pedasnya, apalagi dengan adanya level pedas yang bisa kamu pilih sesuai selera. Akan tetapi, bagi kamu yang nggak suka pedas, bisa banget kok tetap menikmati menu Mie Gacoan. Ada mie yang nggak pedas, yaitu menu <b>Mie Suit</b>"
                    + ". Mie ini terdari 5 level yang paling pedas level 5 dengan 15 cabai dengan <b>harga 11.000</b></p>");
            out.println("</div>");
            out.println("</div>");
            // Bagian kedua
            out.println("<h1>Mie Suit</h1>");
            out.println("<div class=\"container\">");
            out.println("<img src=\"https://assets.promediateknologi.id/crop/0x0:0x0/750x500/webp/photo/2023/02/19/FotoJet-2023-02-19T203316884-1175934296.jpg\" alt=\"About Image\">");
            out.println("<div class=\"text\">");
            out.println("<p><b>Mie Gacoan</b> memang terkenal dengan mie pedasnya, apalagi dengan adanya level pedas yang bisa kamu pilih sesuai selera. Akan tetapi, bagi kamu yang nggak suka pedas, bisa banget kok tetap menikmati menu Mie Gacoan. Ada mie yang nggak pedas, yaitu menu <b>Mie Suit</b>"
                    + ". Mie ini terdari 5 level yang paling pedas level 5 dengan 15 cabai dengan <b>harga 11.000</b></p>");
            out.println("</div>");
            out.println("</div>");
            // Bagian ketiga
            out.println("<h1>Mie Suit</h1>");
            out.println("<div class=\"container\">");
            out.println("<img src=\"https://assets.promediateknologi.id/crop/0x0:0x0/750x500/webp/photo/2023/02/19/FotoJet-2023-02-19T203316884-1175934296.jpg\" alt=\"About Image\">");
            out.println("<div class=\"text\">");
              out.println("<p><b>Mie Gacoan</b> memang terkenal dengan mie pedasnya, apalagi dengan adanya level pedas yang bisa kamu pilih sesuai selera. Akan tetapi, bagi kamu yang nggak suka pedas, bisa banget kok tetap menikmati menu Mie Gacoan. Ada mie yang nggak pedas, yaitu menu <b>Mie Suit</b>"
                    + ". Mie ini terdari 5 level yang paling pedas level 5 dengan 15 cabai dengan <b>harga 11.000</b></p>");
            out.println("</div>");
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
        return "About Servlet";
    }
}
