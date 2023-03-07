package com.ada.pesoideal;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "PesoIdealServlet", urlPatterns = "/calc")
public class PesoIdealServlet extends HttpServlet {
    private String genero;
    private Double altura;
    private Double pesoIdeal;
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String genero = String.valueOf((req.getParameter("genero")));
        Double altura = Double.valueOf((req.getParameter("altura")));
        if (genero.equals("H")) {
            Double pesoIdeal = (72.7 * altura) - 58;
            req.setAttribute("pesoIdeal", String.format("%.2f kg", pesoIdeal));
            resp.setHeader("pesoIdeal", String.format("%.2f", pesoIdeal));

        }
        if (genero.equals("M")) {
            Double pesoIdeal = (62.1 * altura) - 44.7;
            req.setAttribute("pesoIdeal", String.format("%.2f kg", pesoIdeal));
            resp.setHeader("pesoIdeal", String.format("%.2f", pesoIdeal));
        }
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
