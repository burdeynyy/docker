package ru.pstu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicLong;

@WebServlet(name = "RobinStatServlet", urlPatterns = {"/robin/stat"}, loadOnStartup = 0)
public class RobinStatServlet extends HttpServlet {

    //ab -n 10 -c 1 -k http://localhost:9999/robin
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.write(RobinServlet.count.toString());
    }
}
