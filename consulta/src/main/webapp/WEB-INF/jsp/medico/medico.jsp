<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Telemedicina: Cadastrar Médico </title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">

  <c:import url="/WEB-INF/jsp/header.jsp" />


  <h2>Cadastro de Médicos</h2>

  <form action="/medico" method="post">
    <div class="form-group">
      <label for="usr">Nome:</label>
      <input type="text" class="form-control" name="nome">
    </div>

    <div class="form-group">
      <label for="usr">Sobrenome:</label>
      <input type="text" class="form-control" name="sobrenome">
    </div>

    <div class="form-group">
      <label for="usr">Sigla do Conselho:</label>
      <input type="text" class="form-control" name="siglaConselho">
    </div>

    <div class="form-group">
      <label for="usr">Código do Conselho:</label>
      <input type="text" class="form-control" name="codConselho">
    </div>


    <div class="form-group">
      <label>Especialidade:</label>


      <div class="form-check">
        <label class="form-check-label">
          <input type="checkbox" class="form-check-input" name="especialidade" value="Cardiologia"> Cardiologia<br>
          <input type="checkbox" class="form-check-input" name="especialidade" value="Dermatologia"> Dermatologia<br>
          <input type="checkbox" class="form-check-input" name="especialidade" value="Neurologia"> Neurologia<br>
          <input type="checkbox" class="form-check-input" name="especialidade" value="Oftamloogia"> Oftalmologia<br>
          <input type="checkbox" class="form-check-input" name="especialidade" value="Reumatologia"> Reumatologia<br>
          <input type="checkbox" class="form-check-input" name="especialidade" value="Otorrinolaringologia"> Otorrinolaringologia<br>
          <input type="checkbox" class="form-check-input" name="especialidade" value="Pediatria"> Pediatria<br>
        </label>
      </div>

      <div class="form-group">
        <label for="usr">Email:</label>
        <input type="text" class="form-control" name="email">
      </div>



    </div>

    <button type="submit" class="btn btn-primary">Cadastrar</button>
  </form>

  <br>
  <c:import url="/WEB-INF/jsp/footer.jsp"/>

</div>

</body>
</html>
