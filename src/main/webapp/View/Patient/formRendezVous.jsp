<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Prendre un Rendez-vous</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <div class="container">
            <a class="navbar-brand" href="home.jsp">MediCare</a>
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

    <!-- Formulaire -->
    <div class="container mt-5">
        <h2 class="text-center">Prendre un Rendez-vous</h2>
        <p class="text-center">Remplissez le formulaire ci-dessous pour réserver un rendez-vous.</p>

        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card shadow-lg border-0">
                    <div class="card-body">
                        <form action="RendezVousServlet" method="post">
                           

                            <!-- Champ Date du rendez-vous -->
                            <div class="mb-3">
                                <label for="date" class="form-label">Date du rendez-vous</label>
                                <input type="date" class="form-control" id="date" name="date" required>
                            </div>

                            <!-- Champ Heure du rendez-vous -->
                            <div class="mb-3">
                                <label for="heure" class="form-label">Heure du rendez-vous</label>
                                <input type="time" class="form-control" id="heure" name="heure" required>
                            </div>

                            <!-- Champ Statut -->
                            <div class="mb-3">
                                <label for="statut" class="form-label">Statut</label>
                                <select class="form-control" id="statut" name="statut" required>
                                    <option value="En attente">En attente</option>
                                    <option value="Confirmé">Confirmé</option>
                                    <option value="Annulé">Annulé</option>
                                </select>
                            </div>

                            <!-- Champ Motif -->
                            <div class="mb-3">
                                <label for="motif" class="form-label">Motif du rendez-vous</label>
                                <textarea class="form-control" id="motif" name="motif" rows="3" required></textarea>
                            </div>

                            <!-- Bouton Soumettre -->
                            <div class="d-grid">
                                <button type="submit" class="btn btn-primary">Reserver</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>

