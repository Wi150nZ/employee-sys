<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
    <title>Employees</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.6/css/all.css">
</head>

<body>
    <div class="container">
        <nav class="navbar navbar-expand-lg navbar-light bg-dark">
            <a class="navbar-brand" style="color: #eeeeee">EMPLOYEES</a>
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="addEmployee.jsp" style="color: #eeeeee;">
                        <i class="fas fa-plus-square"></i>
                    </a>
                </li>
        </ul>
        </nav>
    </div>

    <div class="container">
        <table class="table">
            <tr bgcolor="#6495ed">
                <th>NAME</th>
                <th>EMAIL</th>
            </tr>
            <s:iterator value="employees" var="employee">
                <tr>
                    <th>
                        <a href="editEmployeePage.action?id=<s:property value='#employee.id'/>"><s:property value="#employee.fName + ' ' + #employee.lName"/></a>
                    </th>
                    <th>
                        <s:property value="#employee.email"/>
                    </th>
                </tr>
            </s:iterator>
        </table>
    </div>
</body>
</html>
