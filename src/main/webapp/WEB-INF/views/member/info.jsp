<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
  <div class="container">

    ${member.id}, ${member.nickname } ${member.email }
    <p>작성한 글 갯수 : ${ member.writedPosts.size() }</p>

    <c:forEach items="${ member.writedPosts }" var="post">
      <p>${ post }</p>
    </c:forEach>

    <div>
      <a class="btn btn-primary" href="/member/update/${ member.id }">정보
        수정</a> <a class="btn btn-secondary" href="/member/list">목록으로</a>
    </div>
  </div>
</body>
</html>