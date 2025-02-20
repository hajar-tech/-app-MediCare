<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MediCare - Accueil</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="d-flex justify-content-center align-items-center vh-100 bg-light">

    <div class="container text-center">
        <h1 class="mb-4">Bienvenue sur MediCare</h1>
        <p class="lead">Veuillez choisir votre espace :</p>
        
        <div class="row justify-content-center">
            <!-- Espace Patient -->
            <div class="col-md-4">
                <div class="card shadow-lg border-0">
                    <div class="card-body">
                        <h3 class="card-title">Espace Patient</h3>
                        <p class="card-text">Prenez et gérez vos rendez-vous en toute simplicité.</p>
                        <a href="Patient/formulaire.jsp" class="btn btn-primary">Accéder</a>
                    </div>
                </div>
            </div>

            <!-- Espace Médecin -->
           <div class="col-md-4">
                <div class="card shadow-lg border-0">
                    <div class="card-body">
                        <h3 class="card-title">Espace Medcin</h3>
                        <p class="card-text">Consulter et gérez votre agenda en toute simplicité.</p>
                        <a href="Doctor/doctor.jsp" class="btn btn-success">Accéder</a>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
