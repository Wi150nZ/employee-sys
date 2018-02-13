<%@ page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>
    <head>
        <title>Edit Employee</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
            crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.6/css/all.css">
        <link href="style.css" rel="stylesheet">
        <script src="util.js"></script>
    </head>

    <body onload="loadData('<s:property value="%{employeeBean.getState()}"/>');">
        <div class="container">
            <nav class="navbar navbar-expand-lg navbar-light bg-dark">
                <a class="navbar-brand" style="color: #eeeeee">EDIT EMPLOYEE</a>
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="home.action" style="color: #eeeeee;">
                            <i class="far fa-times-circle"></i>
                        </a>
                    </li>
                </ul>
            </nav>
        </div>
        <div class="container">
            <s:form class="form-signin" method="post" action="editEmployee">
                <%--<h5 class="form-signin-heading">Edit your employee information</h5>--%>
                <input type="hidden" name="id" value="<s:property value="%{employeeBean.getID()}"/>">

                <label class="sr-only">First Name</label>
                <input type="text" class="form-control" placeholder="First Name" name="employeeBean.fName" value="<s:property value="%{employeeBean.getfName()}"/>" required>

                <label class="sr-only">Last Name</label>
                <input type="text" class="form-control" placeholder="Last Name" name="employeeBean.lName" value="<s:property value="%{employeeBean.getlName()}"/>" required>

                <hr>

                <label class="sr-only">Address</label>
                <input type="text" class="form-control" placeholder="Address" name="employeeBean.address" value="<s:property value="%{employeeBean.getAddress()}"/>" required>

                <label class="sr-only">City</label>
                <input type="text" class="form-control" placeholder="City" name="employeeBean.city" value="<s:property value="%{employeeBean.getCity()}"/>" required>

                <label class="sr-only">State</label>
                <select class="form-control" id="state" name="employeeBean.state">
                    <option value="">State</option>
                    <option value="AK">Alaska</option>
                    <option value="AL">Alabama</option>
                    <option value="AR">Arkansas</option>
                    <option value="AZ">Arizona</option>
                    <option value="CA">California</option>
                    <option value="CO">Colorado</option>
                    <option value="CT">Connecticut</option>
                    <option value="DC">District of Columbia</option>
                    <option value="DE">Delaware</option>
                    <option value="FL">Florida</option>
                    <option value="GA">Georgia</option>
                    <option value="HI">Hawaii</option>
                    <option value="IA">Iowa</option>
                    <option value="ID">Idaho</option>
                    <option value="IL">Illinois</option>
                    <option value="IN">Indiana</option>
                    <option value="KS">Kansas</option>
                    <option value="KY">Kentucky</option>
                    <option value="LA">Louisiana</option>
                    <option value="MA">Massachusetts</option>
                    <option value="MD">Maryland</option>
                    <option value="ME">Maine</option>
                    <option value="MI">Michigan</option>
                    <option value="MN">Minnesota</option>
                    <option value="MO">Missouri</option>
                    <option value="MS">Mississippi</option>
                    <option value="MT">Montana</option>
                    <option value="NC">North Carolina</option>
                    <option value="ND">North Dakota</option>
                    <option value="NE">Nebraska</option>
                    <option value="NH">New Hampshire</option>
                    <option value="NJ">New Jersey</option>
                    <option value="NM">New Mexico</option>
                    <option value="NV">Nevada</option>
                    <option value="NY">New York</option>
                    <option value="OH">Ohio</option>
                    <option value="OK">Oklahoma</option>
                    <option value="OR">Oregon</option>
                    <option value="PA">Pennsylvania</option>
                    <option value="PR">Puerto Rico</option>
                    <option value="RI">Rhode Island</option>
                    <option value="SC">South Carolina</option>
                    <option value="SD">South Dakota</option>
                    <option value="TN">Tennessee</option>
                    <option value="TX">Texas</option>
                    <option value="UT">Utah</option>
                    <option value="VA">Virginia</option>
                    <option value="VT">Vermont</option>
                    <option value="WA">Washington</option>
                    <option value="WI">Wisconsin</option>
                    <option value="WV">West Virginia</option>
                    <option value="WY">Wyoming</option>
                </select>

                <label class="sr-only">Zip/Postal Code</label>
                <input type="text" class="form-control" placeholder="Zip/Postal Code" name="employeeBean.zip" value="<s:property value="%{employeeBean.getZip()}"/>" required>

                <hr>

                <label class="sr-only">Home Phone</label>
                <input type="text" class="form-control" placeholder="Home Phone" name="employeeBean.homeNum" value="<s:property value="%{employeeBean.getHomeNum()}"/>" required>

                <label class="sr-only">Cell Phone</label>
                <input type="text" class="form-control" placeholder="Cell Phone" name="employeeBean.cellNum" value="<s:property value="%{employeeBean.getCellNum()}"/>" required>

                <label class="sr-only">Email</label>
                <input type="text" class="form-control" placeholder="Email" name="employeeBean.email" value="<s:property value="%{employeeBean.getEmail()}"/>" required>

                <button class="btn- btn-sm btn-primary btn-block" type="submit">Edit Employee</button>
            </s:form>
        </div>
    </body>
</html>