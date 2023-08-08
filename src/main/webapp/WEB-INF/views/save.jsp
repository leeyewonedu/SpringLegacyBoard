<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>saveForm</title>
</head>
<body>
    <form action="/board/save" method="post">
        <input type="text" name="boardWriter" placeholer="작성자">
        <input type="text" name="boardPass" placeholer="비밀번호">
        <input type="text" name="boardTitle" placeholer="내용을 입력하세요">
        <textarea name="boardContents" cols="30" rows="10" placeholer="내용을 입력하세요"></textarea>
        <input type="submit" value="작성">
    </form>
</body>
</html>