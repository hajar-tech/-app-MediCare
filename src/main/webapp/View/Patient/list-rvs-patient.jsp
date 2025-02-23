<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ page import="java.util.*" %>
<%@ page import="com.Medicare.Appointement.Model.Appointement" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Rendez-vous</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <div class="container">
            <a class="navbar-brand" href="home.jsp">MediCare</a>
        </div>
    </nav>

    <div class="container mt-5">
        <h2 class="text-center">Rendez-vous pour ${param.username}</h2>
        <% ArrayList <Appointement> appointements  = (ArrayList<Appointement>) request.getAttribute("appointements"); %>

        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Username</th>
                    <th>Date</th>
                    <th>Heure</th>
                    <th>Statut</th>
                    <th>Motif</th>
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
