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
    Cage cage1 = new Cage(10);
    Aquarium aquarium1 = new Aquarium(10);
    Cell cell1 = new Cell(10);
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String select1 = request.getParameter("animals");
        String habitat = request.getParameter("habitat");
        String res = "";
        String error = "";
        switch (select1) {
            case "tiger":
                if(habitat.equals("cage")){
                    res = cage1.addAnimal(new Tiger()) + "cage";
                }else{
                    error = "The environment is not suitable for the animal";
                }

                break;
            case "fox":
                if(habitat.equals("cage")){
                    res = cage1.addAnimal(new Fox()) + "cage";
                }else{
                    error = "The environment is not suitable for the animal";
                }

                break;
            case "wolf":
                if(habitat.equals("cage")){
                    res = cage1.addAnimal(new Wolf()) + "cage";
                }else{
                    error = "The environment is not suitable for the animal";
                }
                break;
            case "turtle":
                if(habitat.equals("cage")){
                    res = cage1.addAnimal(new Turtle()) + "cage";
                }else{
                    error = "The environment is not suitable for the animal";
                }
                break;
            case "penguin":
                if(habitat.equals("cage")){
                    res = cage1.addAnimal(new Penguin()) + "cage";
                }else{
                    error = "The environment is not suitable for the animal";
                }
                break;
            case "ostrich":
                if(habitat.equals("cage")){
                    res = cage1.addAnimal(new Ostrich()) + "cage";
                }else{
                    error = "The environment is not suitable for the animal";
                }
                break;
            case "crow":
                if(habitat.equals("cell")){
                    res = cell1.addAnimal(new Crow()) + "cell";
                }else{
                    error = "The environment is not suitable for the animal";
                }
                break;
            case "sparrow":
                if(habitat.equals("cell")){
                    res = cell1.addAnimal(new Sparrow()) + "cell";
                }else{
                    error = "The environment is not suitable for the animal";
                }
                break;
            case "shark":
                if(habitat.equals("aquarium")){
                    res = aquarium1.addAnimal(new Shark()) + "aquarium";
                }else{
                    error = "The environment is not suitable for the animal";
                }
                break;
            case "pike":
                if(habitat.equals("aquarium")){
                    res = aquarium1.addAnimal(new Pike()) + "aquarium";
                }else{
                    error = "The environment is not suitable for the animal";
                }
                break;
        }

        String cellAnimal = "";
        cellAnimal = cell1.getAnimals().toString();
        String cageAnimal = "";
        cageAnimal = cage1.getAnimals().toString();
        String aquariumAnimal = "";
        aquariumAnimal = aquarium1.getAnimals().toString();

        request.setAttribute("cageAnimal", cageAnimal);
        request.setAttribute("cellAnimal", cellAnimal);
        request.setAttribute("aquariumAnimal", aquariumAnimal);
        request.setAttribute("res", res);
        request.setAttribute("error",error);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
