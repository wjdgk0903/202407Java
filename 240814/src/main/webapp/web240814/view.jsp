<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<head>
    <meta charset="UTF-8">
    <style>
        table { width:680px; text-align:center; }
        th    { width:100px; background-color:cyan; }
        td    { text-align:left; border:1px solid gray; }
    </style>
</head>
<body>

<table class="table table-bordered table-hover">
    <tr>
        <th>제목</th>
        <td>${msg.title}</td>
    </tr>
    <tr>
        <th>작성자</th>
        <td>${msg.writer}</td>
    </tr>
    <tr>
        <th>작성일시</th>
        <td>${msg.regtime}</td>
    </tr>
    <tr>
        <th>조회수</th>
        <td>${msg.hits}</td>
    </tr>
    <tr>
        <th>내용</th>
        <td>${msg.content}</td>
    </tr>
</table>

<br>
<input type="button" class="btn btn-outline-secondary" value="목록보기" onclick="location.href='list'">
<input type="button" class="btn btn-outline-secondary" value="수정"
       onclick="location.href='write?num=${param.num}'">
<input type="button" class="btn btn-outline-secondary" value="삭제"
       onclick="location.href='delete?num=${param.num}'">

</body>
</html>