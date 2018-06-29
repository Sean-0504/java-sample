package sample.application;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ViewController.
 *
 */
@WebServlet("/login")
public class ViewController extends HttpServlet {

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding(StandardCharsets.UTF_8.name());
        RequestDispatcher dispatch = req.getRequestDispatcher("/WEB-INF/jsp/Login.jsp");
        dispatch.forward(req, res);
    }
}
