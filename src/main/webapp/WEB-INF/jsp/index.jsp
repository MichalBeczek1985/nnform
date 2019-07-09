<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
    <style>
    	.error {color:red}
    	.mytext {width: 200px; height: 100px;}
    </style>
        <title>Home page</title>
        <meta charset="UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h3>Welcome, Enter Contact Details</h3>
        <form:form method="POST"
          action="/addContact" modelAttribute="contact">
          
             <table>
                <tr>
                    <td><label>Imie</label></td>
                    <td><form:input path="name" required="required"/></td>
                </tr>
<!--                 <tr> -->
<%--                     <td><form:label path="id">Id</form:label></td> --%>
<%--                     <td><form:input path="id"/></td> --%>
<!--                 </tr> -->
                <tr>
                    <td><label>
                      Nazwisko</label>
                      
                      </td>
                    <td><form:input path="surname" required="required"/></td>
                </tr>
                <tr>
                    <td><label>
                      Telefon</label></td>
                    <td><form:input path="phone" /></td>
                    <td><form:errors path="phone" cssClass="error" /></td>
                </tr>
                <tr>
                    <td><label>
                      Mail</label></td>
                    <td><form:input path="mail" /></td>
                     <td><form:errors path="mail" cssClass="error" /></td>
                </tr>
                <tr>
                    <td><label>
                      Adres</label></td>
                    <td><form:input type="textbox" path="address"  class="mytext" /></td>
                </tr>
                <tr>
                    <td><label>
                      Cel</label>
                      </td>
                    <td><form:input path="contactReason" class="mytext" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>