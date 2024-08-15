import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/MenuServlet"})
public class HomeServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Menu Servlet</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; background-color: #f4f4f4; margin: 0; padding: 0; }");
            out.println("header { background-color: #333; color: #fff; padding: 20px 0; }");
            out.println("header ul { list-style: none; padding: 0; margin: 0; text-align: center; }");
            out.println("header ul li { display: inline; margin-right: 15px; }");
            out.println("header ul li a { color: #fff; text-decoration: none; font-weight: bold; }");
            out.println("h1 { text-align: center; margin-top: 50px; color: #333; }");
            out.println("img { width: 1300px; height: 450px; }");    // CSS for full-width image
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
            out.println("<h1>Selamat Datang dan Selamat Menikmati</h1>");
            out.println("<img src=\"https://img.antaranews.com/cache/1200x800/2023/07/03/IMG-20230702-WA0008.jpg.webp\" alt=\"Full Width Image\" class=\"full-width\">"); // Add image here
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
        return "Menu Servlet";
    }
}
