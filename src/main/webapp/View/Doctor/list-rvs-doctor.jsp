<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import="java.util.*" %>
<%@ page import="com.Medicare.Appointement.Model.Appointement" %>
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>username_patient</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <div class="container">
            <a class="navbar-brand" href="index.jsp">MediCare</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="patient.jsp">Retour</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    
    <div class="container mt-5">
    
       <% ArrayList <Appointement> appointements  = (ArrayList<Appointement>) request.getAttribute("data"); %>
       <table class="table">
  <thead>
    <tr>
      <th scope="col">Username</th>
      <th scope="col">La Date </th>
      <th scope="col">Heure </th>
      <th scope="col">Statut</th>
      <th scope="col">Motif</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  
  
  <% if (appointements != null && !appointements.isEmpty()) { %>
    <% for (Appointement temp : appointements) { %>
        <tr>
            <td><%= temp.getUsername() %> </td>
            <td><%= temp.getDateDdv() %> </td>
             <td><%= temp.getHeure()  %> </td>
            <td> <%= temp.getStatut()  %></td>
            <td> <%= temp.getMotif() %></td>
        </tr>
    <% } %>
<% } else { %>
    <tr><td colspan="2">Aucun rendez-vous trouvé.</td></tr>
<% } %>
  
  
     
  </tbody>
</table>
      
    </div>

</body>
</html>