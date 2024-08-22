<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<head>
    <meta charset="UTF-8">
    <title>게시판 작성</title>
     <style>
     
        table { width:680px; text-align:center; }
        th    { width:100px; background-color:cyan; }
        input[type=text], textarea { width:100%; }
        .btn-container {
            position: absolute;
            top: 20px;
            right: 20px;
            display: flex;
            gap: 10px;
        }
        .form-container {
            position: relative;
            padding-left: 50px;
            padding-right: 50px;
            padding-top: 100px;
        }
    </style>
</head>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Board</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Resource
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">2022년 자료실</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">2023년 자료실</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">2024년 자료실</a></li>
          </ul>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Member
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">회원 등록</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">회원 삭제</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">회원 조회</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<div class="form-container">
<form method="post" action="${action}">
    <table class="table table-bordered table-hover">
        <tr>
            <th>제목</th>
            <td><input type="text" name="title"  maxlength="80"
                       value="${msg.title}">
            </td>
        </tr>
        <tr>
            <th>작성자</th>
            <td><input type="text" name="writer" maxlength="20"
                       value="${msg.writer}">
            </td>
        </tr>
        <tr>
            <th>내용</th>
            <td><textarea name="content" rows="50">${msg.content}</textarea>
            </td>
        </tr>
    </table>

    <br>
    <div class="btn-container">
    <input type="submit"  style="margin-bottom: 10px;" class="btn btn-outline-secondary" value="저장">
    <input type="button"   style="margin-bottom: 10px;" class="btn btn-outline-secondary" value="취소" onclick="history.back()">
</div>
</form>
</div>
</body>
</html>