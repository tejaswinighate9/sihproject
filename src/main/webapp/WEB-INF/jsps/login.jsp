<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="description" content="">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

  <!-- Title -->
  <title>Adani Ports and SEZ Ltd</title>

  <!-- Favicon -->
  <link rel="icon" href="img/core-img/favicon.ico">

  <!-- Core Stylesheet -->
  <link href="css/style.css" rel="stylesheet">
  <link href="css/login.css" rel="stylesheet">

  <!-- Responsive CSS -->
  <link href="css/responsive/responsive.css" rel="stylesheet">  

</head>
<body>
<!-- Preloader Start -->
  <div id="preloader">
    <div class="loader">
      <span class="inner1"></span>
      <span class="inner2"></span>
      <span class="inner3"></span>
    </div>
  </div>

  <!-- ***** Header Area Start ***** -->
  <header class="header_area" id="header">
    <div class="container-fluid h-100">
      <div class="row h-100">
        <div class="col-12 h-100">
          <nav class="h-100 navbar navbar-expand-lg align-items-center">
            <a class="navbar-brand" href="index.jsp">adani</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#fancyNav" aria-controls="fancyNav" aria-expanded="false" aria-label="Toggle navigation"><span class="ti-menu"></span></button>
            <div class="collapse navbar-collapse" id="fancyNav">
              <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                  <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item dropdown">
                  <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Ports</a>
                  <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="index.jsp">Mundra Port</a>
                    <a class="dropdown-item" href="static-page.jsp">Dahej Port</a>
                    <a class="dropdown-item" href="contact.jsp">Dhamra Port</a>
                  </div>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#">Container Tracking</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="static-page.jsp">Logistics</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="login">Payment</a>
                </li>
              </ul>
              <!-- Search & Shop Btn Area -->
              <div class="fancy-search-and-shop-area">
                <a id="search-btn" href="#"><i class="icon_search" aria-hidden="true"></i></a>
                <a id="shop-btn" href="#"><i class="icon_bag_alt" aria-hidden="true"></i></a>
              </div>
            </div>
          </nav>
        </div>
      </div>
    </div>
  </header>
  <!-- ***** Header Area End ***** -->

  <!-- Login Form Start -->
  <div class="loginnn">
  <div class="container2" id="container2">
    <div class="form-container2 sign-up-container2" id="signUp">
    <div id="ErrorMsg"> ${errorMsg} </div>
      <form class="farm" action="/adani/register" method="post">
        <h1>Create Account</h1>
        <div class="social-container2">
          <a href="#" class="social"><i class="fa fa-facebook-f"></i></a>
          <a href="#" class="social"><i class="fa fa-google-plus"></i></a>
          <a href="#" class="social"><i class="fa fa-linkedin"></i></a>
        </div>
        <span class="sss">or use your email for registration</span>
        <input class="inn" type="text" name="firstName"placeholder="Name" />
        <input class="inn" type="email" name="email" placeholder="Email" />
        <input class="inn" type="password" name="pwd" placeholder="Password" />
        <button class="butt" type="submit" upDirect">Sign Up</button>
      </form>
    </div>
    <div class="form-container2 sign-in-container2">
      <form class="farm" action="#">
        <h1>Sign in</h1>
        <div class="social-container2">
          <a href="#" class="social"><i class="fa fa-facebook-f"></i></a>
          <a href="#" class="social"><i class="fa fa-google-plus"></i></a>
          <a href="#" class="social"><i class="fa fa-linkedin"></i></a>
        </div>
        <span class="sss">or use your account</span>
        <input class="inn" type="email" placeholder="Email" />
        <input class="inn" type="password" placeholder="Password" />
        <a href="#" class="social">Forgot your password?</a>
        <button class="butt" id="inDirect">Sign In</button>
      </form>
    </div>
    <div class="overlay-container2">
      <div class="overlay2">
        <div class="overlay-panel2 overlay-left2">
          <h1 class="howw">Welcome Back!</h1>
          <p class="howw">To keep connected with us please login with your personal info</p>
          <button class="butt ghost" id="signIn">Sign In</button>
        </div>
        <div class="overlay-panel2 overlay-right2">
          <h1 class="howw">Hello, Friend!</h1>
          <p class="howw">Enter your personal details and start journey with us</p>
          <button class="butt ghost" id="signUp">Sign Up</button>
        </div>
      </div>
    </div>
  </div>
  </div>
  <!-- Login Form End -->

  <!-- ***** Footer Area Start ***** -->
  <footer class="fancy-footer-area fancy-bg-dark">
    <div class="footer-content section-padding-80-50">
      <div class="container">
        <div class="row">
          <!-- Footer Widget -->
          <div class="col-12 col-sm-6 col-lg-3">
            <div class="single-footer-widget">
              <h6>Our Newsletter</h6>
              <p>Subscribe to our mailing list to get the updates to your email inbox.</p>
              <form action="#" method="get">
                <input type="search" name="search" id="footer-search" placeholder="E-mail">
                <button type="submit">Subscribe</button>
              </form>
              <div class="footer-social-widegt d-flex align-items-center">
                <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                <a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
                <a href="#"><i class="fa fa-google-plus" aria-hidden="true"></i></a>
                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                <a href="#"><i class="fa fa-pinterest" aria-hidden="true"></i></a>
              </div>
            </div>
          </div>
          <!-- Footer Widget -->
          <div class="col-12 col-sm-6 col-lg-3">
            <div class="single-footer-widget">
              <h6>Twitter Feed</h6>
              <div class="single-tweet">
                <a href="#"><i class="fa fa-twitter" aria-hidden="true"></i> With the popularity of podcast shows growing with each year, you might consider starting it yourself as well. <br>https://buff.ly/2zttoJb </a>
                <span>About 20 hours ago</span>
              </div>
            </div>
          </div>
          <!-- Footer Widget -->
          <div class="col-12 col-sm-6 col-lg-3">
            <div class="single-footer-widget">
              <h6>Link Categories</h6>
              <nav>
                <ul>
                  <li><a href="#"><i class="fa fa-angle-double-right" aria-hidden="true"></i> Agency</a></li>
                  <li><a href="#"><i class="fa fa-angle-double-right" aria-hidden="true"></i> Home</a></li>
                  <li><a href="#"><i class="fa fa-angle-double-right" aria-hidden="true"></i> Studio</a></li>
                  <li><a href="#"><i class="fa fa-angle-double-right" aria-hidden="true"></i> About</a></li>
                  <li><a href="#"><i class="fa fa-angle-double-right" aria-hidden="true"></i> Studio</a></li>
                  <li><a href="#"><i class="fa fa-angle-double-right" aria-hidden="true"></i> Services</a></li>
                  <li><a href="#"><i class="fa fa-angle-double-right" aria-hidden="true"></i> Blogs</a></li>
                  <li><a href="#"><i class="fa fa-angle-double-right" aria-hidden="true"></i> Work</a></li>
                  <li><a href="#"><i class="fa fa-angle-double-right" aria-hidden="true"></i> Shop</a></li>
                  <li><a href="#"><i class="fa fa-angle-double-right" aria-hidden="true"></i> Privacy</a></li>
                </ul>
              </nav>
            </div>
          </div>
          <!-- Footer Widget -->
          <div class="col-12 col-sm-6 col-lg-3">
            <div class="single-footer-widget">
              <h6>Contact Us</h6>
              <p>1 (800) 686-6688 <br>info.deercreative@gmail.com</p>
              <p>40 Baria Sreet 133/2 <br>NewYork City, US</p>
              <p>Open hours: 8.00-18.00 Mon-Fri</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </footer>
  <!-- ***** Footer Area End ***** -->

  <!-- jQuery-2.2.4 js -->
  <script src="js/jquery/jquery-2.2.4.min.js"></script>
  <!-- Popper js -->
  <script src="js/bootstrap/popper.min.js"></script>
  <!-- Bootstrap-4 js -->
  <script src="js/bootstrap/bootstrap.min.js"></script>
  <!-- All Plugins js -->
  <script src="js/others/plugins.js"></script>
  <!-- Active JS -->
  <script src="js/script.js"></script>
  <script  src="js/login.js"></script>
</body>
</html>