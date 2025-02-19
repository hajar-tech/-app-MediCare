<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MediCare - Espace Patient</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <div class="container">
            <a class="navbar-brand" href="home.jsp">DoctorRV</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="prendreRendezVous.jsp">Prendre un Rendez-vous</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="consulterRendezVous.jsp">Consulter mes Rendez-vous</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-warning" href="home.jsp">Déconnexion</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Contenu principal -->
    <div class="container text-center mt-5">
        <h1>Bienvenue dans votre espace patient</h1>
        <p class="lead">Choisissez une action ci-dessous :</p>

        <div class="row justify-content-center">
            <!-- Prendre un Rendez-vous -->
            <div class="col-md-5">
                <div class="card shadow-lg border-0">
                    <div class="card-body">
                        <h3 class="card-title">Prendre un Rendez-vous</h3>
                        <p class="card-text">Réservez une consultation avec un médecin.</p>
                        <a href="formRendezVous.jsp" class="btn btn-primary">Accéder</a>
                    </div>
                </div>
            </div>

            <!-- Consulter les Rendez-vous -->
            <div class="col-md-5">
                <div class="card shadow-lg border-0">
                    <div class="card-body">
                        <h3 class="card-title">Consulter mes Rendez-vous</h3>
                        <p class="card-text">Voir l'historique et le statut de vos rendez-vous.</p>
                        <a href="username.jsp" class="btn btn-success">Accéder</a>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>