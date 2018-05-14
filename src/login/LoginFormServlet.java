package login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Implements a simple servlet to receive POST data from login form.
 *
 * @author Niu Yunpeng
 */
@WebServlet(name = "LoginFormServlet", urlPatterns = {"/LoginFormServlet"})
public class LoginFormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();

        if (email.length() > password.length()) {
            out.println("Welcome!");
        } else {
            out.println("403 Access Denied.");
        }
    }
}
