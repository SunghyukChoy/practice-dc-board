<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.fakedc.practiceboard.utils.JspViewHelper"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<link href="../../css/base.css" rel="stylesheet" />
<link href="../../lib/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<script src="../../lib/jquery/jquery-3.5.1.min.js"></script>
<script src="../../lib/bootstrap/js/popper.min.js"></script>
<script src="../../lib/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
  <div class="container pt-3">
    <h2>회원 리스트</h2>
    <table class="table mt-3">
      <thead class="thead-dark">
        <tr>
          <th>ID</th>
          <th>성</th>
          <th>이름</th>
          <th>닉네임</th>
          <th>이메일</th>
          <th>가입일자</th>
          <th>관리</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${memberList }" var="member">
          <tr>
            <th><a href="/member/info/${ member.id }">${ member.id }</a></th>
            <td>${ member.lastName }</td>
            <td>${ member.firstName }</td>
            <td><a href="/member/info/${ member.id }"> ${ member.nickname  }</a>
            </td>
            <td>${ member.email }</td>
            <td>${ JspViewHelper.parseDateToString(member.registerDate, "yyyy.MM.dd") }</td>
            <td>
              <form action="/member/delete" method="post">
                <input type="hidden" name="id" value="${ member.id }" />
                <a class='btn btn-primary'
                  href="/member/update/${ member.id }">수정</a>
                <button type="submit" class="btn btn-danger">삭제</button>
              </form>
            </td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
    <div>
      <a class="btn btn-primary" href="/member/register">회원추가</a>
    </div>
  </div>
</body>
</html>
