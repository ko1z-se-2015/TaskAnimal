<%@ page import="java.util.List" %>
<%@ page import="Interfaces.Moveable" %>
<%@ page import="GenericTypes.Habitat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
    <style>
        body {
            font-family: Arial, Helvetica;
            margin: 0;
            padding: 0;
        }
        .big {
            font-size: 1.2em;
        }

        .dropdown {
            position: relative;
            display: inline-block;
            vertical-align: middle;
            margin: 10px;
        }

        .dropdown select {
            cursor:pointer;
            background-color: #2980b9;
            color: #fff;
            font-size: inherit;
            padding: .5em;
            padding-right: 2.5em;
            border: 0;
            margin: 0;
            border-radius: 3px;
            text-indent: 0.01px;
            text-overflow: '';
            -webkit-appearance: button;
        }

        .dropdown::before,
        .dropdown::after {
            content: "";
            position: absolute;
            pointer-events: none;
        }

        .dropdown::after {
            content: "\25BC";
            height: 1em;
            font-size: .625em;
            line-height: 1;
            right: 1.2em;
            top: 50%;
            margin-top: -.5em;
        }

        .dropdown::before {
            width: 2em;
            right: 0;
            top: 0;
            bottom: 0;
            border-radius: 0 3px 3px 0;
        }

        .dropdown select[disabled] {
            color: rgba(0,0,0,.3);
        }

        .dropdown select[disabled]::after {
            color: rgba(0,0,0,.1);
        }

        .dropdown::before {
            background-color: rgba(0,0,0,.15);
        }

        .dropdown::after {
            color: rgba(0,0,0,.4);
        }
        .choose{
            font-size: 32px;
            font-weight: bold;
        }
        .button1{
            margin-top: 20px;
            display: inline-block;
            border:4px solid #0000;
            color: #0000;
            border-radius: 18px 18px 18px 18px;
            font-family: Comic Sans MS;
            max-width: 500px;
            max-height:500px;
            font-size: 29px;
            text-shadow: 0 1px 0 #fff;
            background-color: #008080;
            transition: 0.3s;
        }
        .button1:hover{
            transform: scale(1.05);
        }
    </style>
</head>
<body>

<form method="post" action="AnimalServlet">

    <label class="choose" for="animals">Choose one option: </label>
    <span class="dropdown big">
    <select name="animals" id="animals">
        <option value="tiger">1. Tigers</option>
        <option value="wolf">2. Wolfs </option>
        <option value="fox">3. Fox</option>
        <option value="turtle">4. Turtle</option>
        <option value="crow">5. Crow</option>
        <option value="sparrow">6. Sparrow</option>
        <option value="ostrich">7. Ostrich</option>
        <option value="penguin">8. Penguin</option>
        <option value="shark">9. Shark</option>
        <option value="pike">10. Pike</option>
    </select>
    </span>
    <span class="dropdown big">
    <select name="habitat" id="habitat">
        <option value="cell">1. Cell</option>
        <option value="aquarium">2. Aquarium </option>
        <option value="cage">3. Cage</option>
    </select>
    </span>

    <input class="button1" type="submit" value="create">
</form>


<%
    String cage = (String) request.getAttribute("cageAnimal");
    String cell = (String) request.getAttribute("cellAnimal");
    String aquarium = (String) request.getAttribute("aquariumAnimal");
%>
<p class="choose">Animals in cage: <%=cage%></p>
<br>
<p class="choose">Animals in cell: <%=cell%></p>
<br>
<p class="choose">Animals in aquarium: <%=aquarium%></p>
<br>
<%
    String error = (String) request.getAttribute("error");
%>
<p style=" font-size: 32px;font-weight: bold;"><%=error%> </p><br>

<%
    String res = (String) request.getAttribute("res");
%>
<p style=" font-size: 32px;font-weight: bold;"><%=res%> </p><br>
</body>
</html>
