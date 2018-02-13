<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link href="style.css" rel="stylesheet">
</head>

<body>
    <div class="container">
        <s:form class="form-signin" method="post" action="login">
            <h2 class="form-signin-heading">Please sign in</h2>

            <label class="sr-only">ID</label>
            <input type="text" class="form-control" placeholder="Email" name="user.email" required autofocus>

            <label class="sr-only">Password</label>
            <input type="password" class="form-control" placeholder="Password" name="user.password" required>

            <hr>

            <button class="btn- btn-lg btn-primary btn-block" type="submit">Sign in</button>
            <s:if test="%{user != null}">
                <p class="form-signin-heading">Invalid email or password</p>
            </s:if>
        </s:form>
    </div>
</body>
</html>
