<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="<c:url value="/boot/css/bootstrap.min.css"/> ">
  <script src="<c:url value='/boot/js/jquery-2.2.3.min.js'/>"></script>
  <script src="<c:url value='/boot/js/bootstrap.min.js'/>"></script>
 
</head>
<body><nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#"><H4><b>Watches</b></H4></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/WEB-INF/jsp/Home.html"><b>HOME</b></a></li>
      <li><a href="loginn.jsp"><b>LOGIN</b></a></li>
      <li><a href="ContactUs.jsp"><B>CONTACTUS</B></a></li>
      <li><a href="AboutUs.jsp"><B>ABOUTUS</B></a></li>
      <li><a href="Allcategories"><B>ALLCATEGORIES</B></a></li>
      <li><a href="update"><B>update</B></a></li>
      <li><a href="viewproducts"><B>viewproducts</B></a></li>
         <li><a href="/Signup"><B>signup</B></a></li>
         <li><a href="addproduct"><B>addproduct</B></a></li>
    </ul>
  </div>
</nav>
<style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  </style>

<div class="container">
  <br>
 <% /* <div id="myCarousel" class="carousel slide" data-ride="carousel"
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="image1" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="image2"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="<c:url value="/boot/images/watch1.jpg" />" alt="image5" width="8000" height="660">
      </div>

      <div class="item">
        <img src="<c:url value="/boot/images/watch2.jpg" />" alt="image2" width="460" height="345">
      </div>
    
      <div class="item">
        <img src="<c:url value="/boot/images/watch3.jpg" />" alt="image3" width="460" height="345">
      </div>

      
      </div>
    </div>*/%>
    
    
    
    <div id="myCarousel" class="carousel slide">
    							<!-- Indicators -->
    							<ol class="carousel-indicators">
      								<li class="item1 active"></li>
      								<li class="item2"></li>
      								<li class="item3"></li>
      								<li class="item4"></li>
    							</ol>

    							<!-- Wrapper for slides -->
    							<div class="carousel-inner" role="listbox">
	
      								<div class="item active">
        								<img src="<c:url value="/boot/images/watch3.jpg"/>" />        					
      								</div>

      								<div class="item">
        								<img src="<c:url value="/boot/images/watch2.jpg"/>" />        
      								</div>
    
      								<div class="item">
        								<img src="<c:url value="/boot/images/watch1.jpg"/>"  />        
      								</div>       
						    	
						    	</div>
                        	</div>
    

    <script>
    $(document).ready(function(){
    	$("#myCarousel").carousel({interval:2000});
    });
    </script>
 </div>


</body>
</html>