package Servlets;

import GenericTypes.Cage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/HabitatServlet")
public class HabitatServlet extends HttpServlet {


        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int numAnimals = Integer.parseInt(request.getParameter("numAnimals"));
        int availableSize = Integer.parseInt(request.getParameter("availableSize"));
        String msg3 = "";
        if (availableSize - numAnimals >= 0) {
            msg3 = "Animals was added successfully";
        }else {
            msg3 = "There is no space!!! Too much animals were added";
        }
        request.setAttribute("msg3", msg3);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
