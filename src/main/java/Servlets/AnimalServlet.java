package Servlets;

import AnimalClasses.*;
import GenericTypes.Aquarium;
import GenericTypes.Cage;
import GenericTypes.Cell;
import GenericTypes.Habitat;
import Interfaces.Flyable;
import Interfaces.Moveable;
import Interfaces.Swimable;
import Interfaces.Walkable;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/AnimalServlet")
public class AnimalServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String select1 = request.getParameter("animals");
        String habitat = request.getParameter("habitat");
        String res = "";
        String error = "";
        Cage cage1 = new Cage(10);
        Aquarium aquarium1 = new Aquarium(10);
        Cell cell1 = new Cell(10);
        switch (select1) {
            case "tiger":
                if(habitat.equals("cage")){
                    res = cage1.addAnimal(new Tiger()) + "    "+cage1.getHabitatSize();
                }else{
                    error = "The environment is not suitable for the animal";
                }

                break;
            case "fox":
                if(habitat.equals("cage")){
                    res = cage1.addAnimal(new Fox());
                }else{
                    error = "The environment is not suitable for the animal";
                }

                break;
            case "wolf":
                if(habitat.equals("cage")){
                    res = cage1.addAnimal(new Wolf());
                }else{
                    error = "The environment is not suitable for the animal";
                }
                break;
            case "turtle":
                if(habitat.equals("cage")){
                    res = cage1.addAnimal(new Turtle());
                }else{
                    error = "The environment is not suitable for the animal";
                }
                break;
            case "penguin":
                if(habitat.equals("cage")){
                    res = cage1.addAnimal(new Penguin());
                }else{
                    error = "The environment is not suitable for the animal";
                }
                break;
            case "Ostrich":
                if(habitat.equals("cage")){
                    res = cage1.addAnimal(new Ostrich());
                }else{
                    error = "The environment is not suitable for the animal";
                }
                break;
            case "crow":
                if(habitat.equals("cell")){
                    res = cell1.addAnimal(new Crow());
                }else{
                    error = "The environment is not suitable for the animal";
                }
                break;
            case "sparrow":
                if(habitat.equals("cell")){
                    res = cell1.addAnimal(new Sparrow());
                }else{
                    error = "The environment is not suitable for the animal";
                }
                break;
            case "shark":
                if(habitat.equals("aquarium")){
                    res = aquarium1.addAnimal(new Shark());
                }else{
                    error = "The environment is not suitable for the animal";
                }
                break;
            case "pike":
                if(habitat.equals("aquarium")){
                    res = aquarium1.addAnimal(new Pike());
                }else{
                    error = "The environment is not suitable for the animal";
                }
                break;
        }
        request.setAttribute("res", res);
        request.setAttribute("error",error);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int numAnimals = Integer.parseInt(request.getParameter("numAnimals"));
//        int availableSize = Integer.parseInt(request.getParameter("availableSize"));
//        String msg3 = "";
//        if (availableSize - numAnimals >= 0) {
//            msg3 = "Animals was added successfully";
//        }else {
//            msg3 = "There is no space!!! Too much animals were added";
//        }
//        request.setAttribute("msg3", msg3);
//        request.getRequestDispatcher("index.jsp").forward(request, response);
//    }
}
