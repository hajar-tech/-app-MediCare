<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
        <h2 class="text-center">Entrer vos information</h2>
        <p class="text-center">rappelez-vous votre username.</p>

        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card shadow-lg border-0">
                    <div class="card-body">
                        <form action="http://localhost:8087/MediCare/AddPatientServlet" method="post">
                           
                            
                            <!-- Champ Fullname -->
                            <div class="mb-3">
                                <label for="fullname" class="form-label">full-name</label>
                                <input type="text" class="form-control" id="fullname" name="fullname" required>
                            </div>

                            <!-- Champ Email -->
                            <div class="mb-3">
                                <label for="email" class="form-label">Email</label>
                                <input type="email" class="form-control" id="email" name="email" required>
                            </div>

                            <!-- Champ Numéro de téléphone -->
                            <div class="mb-3">
                                <label for="phone" class="form-label">Numéro de téléphone</label>
                                <input type="tel" class="form-control" id="phone" name="phone" pattern="[0-9]{10}" placeholder="Ex : 0612345678" required>
                            </div>

                            <!-- Bouton Soumettre -->
                            <div class="d-grid">
                                <button type="submit" class="btn btn-primary">Enregistrer</button>
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

</body>
</html>