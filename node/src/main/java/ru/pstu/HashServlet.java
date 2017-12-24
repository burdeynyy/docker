package ru.pstu;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicLong;

@WebServlet(name = "HashServlet", urlPatterns = {"/hash"}, loadOnStartup = 0)
public class HashServlet extends HttpServlet {

    public static AtomicLong count = new AtomicLong();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        count.incrementAndGet();
        out.write(count.toString());
    }
}