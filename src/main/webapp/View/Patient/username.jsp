<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Entrer Username</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <div class="container">
            <a class="navbar-brand" href="home.jsp">MediCare</a>
        </div>
    </nav>

    <div class="container mt-5">
        <h2 class="text-center">Vérifiez votre username</h2>
        
        <form action="/MediCare/RendezVousServlet" method="post">
            <div class="mb-3">
                <label for="username" class="form-label">Username</label>
                <input type="text" class="form-control" id="username" name="username" required>
            </div>
            <button type="submit" class="btn btn-success">Vérifier</button>
        </form>

       <% if (request.getAttribute("errorMessage") != null) { %>
    <div class="alert alert-danger mt-3">
        <%= request.getAttribute("errorMessage") %>
    </div>
<% } %>

    </div>
</body>
</html>
