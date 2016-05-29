<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<h3><B>PRODUCTS LISITINGS</B></h3>
<script type="text/javascript"
src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.5.4/angular.js"></script>
<script>
var v=${jj};
angular.module('myApp', []).controller('namesCtrl', function($scope) {
	console.log(v);
    $scope.names = v
});
</script>
</head>
<body>
<div ng-app="myApp" ng-controller="namesCtrl">
   <div class="table-responsive"> 
   <table border="1">
    <thead>
   <tr>
   <th>p_name</th>
   <th>p_id</th>
   <th>p_cost</th>
   <th>link</th>
   </tr></thead>
   <tbody>
   <tr ng-repeat="c in names">
   <td>{{c.p_name}}</td>
   <td>{{c.p_id}}</td>
   <td>{{c.p_cost}}</td>
   <td><a href="{{c.Url}}">click1</a></td> 
  
   </tbody>
   </div>
   </div>
</table>
</body>
</html>