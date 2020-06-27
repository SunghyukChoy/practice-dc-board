<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>회원가입 페이지</title>
<link href="../../css/base.css" rel="stylesheet" />
<link href="../../lib/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<script src="../../lib/jquery/jquery-3.5.1.min.js"></script>
<script src="../../lib/bootstrap/js/popper.min.js"></script>
<script src="../../lib/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
  <div class="container">
    <h2>회원 정보 수정</h2>
    <form action="/member/register" method="post" style="width: 600px">

      <input class="form-control" type="text" name="id"
        placeholder="아이디" value="${ member.id }" required /> <br /> <input
        class="form-control" type="password" name="password"
        placeholder="비밀번호" value="${ member.password }" required /> <br />
      <input class="form-control" type="text" name="lastName"
        placeholder="성" value="${ member.lastName }" required /> <br />
      <input class="form-control" type="text" name="firstName"
        placeholder="이름" value="${ member.firstName }" required /> <br />
      <input class="form-control" type="text" name="nickname"
        placeholder="닉네임" value="${ member.nickname }" required /> <br />
      <input class="form-control" type="email" name="email"
        placeholder="이메일" value="${ member.email }" /> <br />

      <button type="submit" class="btn btn-success">정보수정</button>
      <a class="btn btn-secondary" href="javascript:history.back(-1)">뒤로가기</a>
    </form>
  </div>

</body>
</html>