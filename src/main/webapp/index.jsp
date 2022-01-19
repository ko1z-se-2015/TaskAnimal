<%@ page import="java.util.List" %>
<%@ page import="Interfaces.Moveable" %>
<%@ page import="GenericTypes.Habitat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>

<form method="post" action="AnimalServlet">

    <label for="animals">Choose one option: </label>
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
    <select name="habitat" id="habitat">
        <option value="cell">1. Cell</option>
        <option value="aquarium">2. Aquarium </option>
        <option value="cage">3. Cage</option>
    </select>

    <input type="submit" value="create">
</form>
<%
String error = (String) request.getAttribute("error");
    out.println(error + "<br>");
%>


<%
    String res = (String) request.getAttribute("res");
        out.println(res + "<br>");
%>

<%
    String cage = (String) request.getAttribute("cageAnimal");
    String cell = (String) request.getAttribute("cellAnimal");
    String aquarium = (String) request.getAttribute("aquariumAnimal");
%>
<p>Animals in cage: <%=cage%></p>
<br>
<p>Animals in cell: <%=cell%></p>
<br>
<p>Animals in aquarium: <%=aquarium%></p>
<br>

</body>
</html>
