<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Accordion - Collapse content</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#accordion" ).accordion({
      collapsible: true
    });
  } );
  </script>
<!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<!-- Title  -->
<title>La Casa de las Camisetas</title>

<!-- Favicon  -->
<link rel="icon" href="img/core-img/favicon.ico">

<!-- Core Style CSS -->
<link rel="stylesheet" href="css/core-style.css">
<link rel="stylesheet" href="style.css">

</head>

<body>

	<!-- ##### Header Area Start ##### -->
	<header class="header_area">
		<div
			class="classy-nav-container breakpoint-off d-flex align-items-center justify-content-between">
			<!-- Classy Menu -->
			<nav class="classy-navbar" id="essenceNav">
				<!-- Logo -->
				<a class="nav-brand" href="index.html">INICIO</a>
				<!-- Navbar Toggler -->
				<div class="classy-navbar-toggler">
					<span class="navbarToggler"><span></span><span></span><span></span></span>
				</div>
				<!-- Menu -->
				<div class="classy-menu">
					<!-- close btn -->
					<div class="classycloseIcon">
						<div class="cross-wrap">
							<span class="top"></span><span class="bottom"></span>
						</div>
					</div>
					<!-- Nav Start -->
					<div class="classynav">
						<ul>
							<li><a href="#">Categoria</a>
								<div class="megamenu">
									<ul class="single-mega cn-col-4">
										<li class="title"><a
											href="ServletListado?operacion=genero&genero=HOMBRE&categoria=SOLO">HOMBRE</a></li>

										<li><a
											href="ServletListado?operacion=genero&genero=HOMBRE&categoria=MANGA_CORTA">Manga
												Corta</a></li>
										<li><a
											href="ServletListado?operacion=genero&genero=HOMBRE&categoria=TIRANTES">Tirantes</a></li>
										<li><a
											href="ServletListado?operacion=genero&genero=HOMBRE&categoria=MANGA_LARGA">Manga
												Larga</a></li>

									</ul>
									<ul class="single-mega cn-col-4">
										<li class="title"><a
											href="ServletListado?operacion=genero&genero=MUJER&categoria=SOLO">MUJER</a></li>
										<li><a
											href="ServletListado?operacion=genero&genero=MUJER&categoria=MANGA_CORTA">Manga
												Corta</a></li>
										<li><a
											href="ServletListado?operacion=genero&genero=MUJER&categoria=TIRANTES">Tirantes</a></li>
										<li><a
											href="ServletListado?operacion=genero&genero=MUJER&categoria=MANGA_LARGA">Manga
												Larga</a></li>
									</ul>

								</div>
						</ul>
					</div>
					<!-- Nav End -->
				</div>
			</nav>

			<!-- Header Meta Data -->
			<div class="header-meta d-flex clearfix justify-content-end">
				<!-- Search Area -->
				<div class="search-area">
					<form action="#" method="post">
						<input type="search" name="search" id="headerSearch"
							placeholder="Type for search">
						<button type="submit">
							<i class="fa fa-search" aria-hidden="true"></i>
						</button>
					</form>
				</div>
				<!-- Favourite Area -->
				<!--<div class="favourite-area">
					<a href="#"><img src="img/core-img/heart.svg" alt=""></a>
				</div>
				-->
				<!-- User Login Info -->
				<div class="user-login-info">
					<a href="login.jsp"><img src="img/core-img/user.svg" alt=""></a>
				</div>
				<!-- Cart Area -->
				<!--<div class="cart-area">
					<a href="#" id="essenceCartBtn"><img src="img/core-img/bag.svg"
						alt=""> <span>3</span></a>
				</div>-->
			</div>

		</div>
	</header>
	<!-- ##### Header Area End ##### -->

	<!-- ##### Right Side Cart Area ##### -->
	<!-- <div class="cart-bg-overlay"></div>

    <div class="right-side-cart-area">

        Cart Button
        <div class="cart-button">
            <a href="#" id="rightSideCart"><img src="img/core-img/bag.svg" alt=""> <span>3</span></a>
        </div>

        <div class="cart-content d-flex">

            Cart List Area
            <div class="cart-list">
                Single Cart Item
                <div class="single-cart-item">
                    <a href="#" class="product-image">
                        <img src="img/product-img/product-1.jpg" class="cart-thumb" alt="">
                        Cart Item Desc
                        <div class="cart-item-desc">
                          <span class="product-remove"><i class="fa fa-close" aria-hidden="true"></i></span>
                            <span class="badge">Mango</span>
                            <h6>Button Through Strap Mini Dress</h6>
                            <p class="size">Size: S</p>
                            <p class="color">Color: Red</p>
                            <p class="price">$45.00</p>
                        </div>
                    </a>
                </div>

                Single Cart Item
                <div class="single-cart-item">
                    <a href="#" class="product-image">
                        <img src="img/product-img/product-2.jpg" class="cart-thumb" alt="">
                        Cart Item Desc
                        <div class="cart-item-desc">
                          <span class="product-remove"><i class="fa fa-close" aria-hidden="true"></i></span>
                            <span class="badge">Mango</span>
                            <h6>Button Through Strap Mini Dress</h6>
                            <p class="size">Size: S</p>
                            <p class="color">Color: Red</p>
                            <p class="price">$45.00</p>
                        </div>
                    </a>
                </div>

                Single Cart Item
                <div class="single-cart-item">
                    <a href="#" class="product-image">
                        <img src="img/product-img/product-3.jpg" class="cart-thumb" alt="">
                        Cart Item Desc
                        <div class="cart-item-desc">
                          <span class="product-remove"><i class="fa fa-close" aria-hidden="true"></i></span>
                            <span class="badge">Mango</span>
                            <h6>Button Through Strap Mini Dress</h6>
                            <p class="size">Size: S</p>
                            <p class="color">Color: Red</p>
                            <p class="price">$45.00</p>
                        </div>
                    </a>
                </div>
            </div>

            Cart Summary
            <div class="cart-amount-summary">

                <h2>Summary</h2>
                <ul class="summary-table">
                    <li><span>subtotal:</span> <span>$274.00</span></li>
                    <li><span>delivery:</span> <span>Free</span></li>
                    <li><span>discount:</span> <span>-15%</span></li>
                    <li><span>total:</span> <span>$232.00</span></li>
                </ul>
                <div class="checkout-btn mt-100">
                    <a href="checkout.html" class="btn essence-btn">check out</a>
                </div>
            </div>
        </div>
    </div> -->
	<!-- ##### Right Side Cart End ##### -->

	<!-- ##### Breadcumb Area Start ##### -->
	<!-- <div class="breadcumb_area bg-img" style="background-image: url(img/bg-img/breadcumb.jpg);">
        <div class="container h-100">
            <div class="row h-100 align-items-center">
                <div class="col-12">
                    <div class="page-title text-center">
                        <h2>Formulario</h2>
                    </div>
                </div>
            </div>
        </div>
    </div> -->
	<!-- ##### Breadcumb Area End ##### -->

	<!-- ##### Checkout Area Start ##### -->
	<div class="checkout_area section-padding-80">
		<div class="container">
			<div class="row">

				<div class="col-12 col-md-6">
					<div class="checkout_details_area mt-50 clearfix">
						<div class="order-details-confirmation">
							<div class="cart-page-heading mb-30">
								<h4>GESTION PRODUCTOS</h4>
							</div>

							<form action="ServletUsuario?operacion=alta" method="POST">
								<div class="row">
									<div class="catagories-menu">
										
										<ul id="menu-content2" class="menu-content collapse show">
											<!-- Single Item -->
											<li data-target="#clothing"><a
												href="#"><font size=4>Insertar Producto</font></a>
												<ul id="clothing">
													<li><a href="#">Color</a></li>
													<input class="input100" type="text" name="color">
													<li><a href="#">Precio</a></li>
													<input class="input100" type="text" name="precio">
													<li><a href="#">Genero</a></li>
													<input class="input100" type="text" name="genero">
													<li><a href="#">Talla</a></li>
													<input class="input100" type="text" name="talla">
													<li><a href="#">Categoria</a></li>
													<input class="input100" type="text" name="categoria">
													<li><a href="#">Stock</a></li>
													<input class="input100" type="text" name="stock">
													<li><a href="#">Imagen</a></li>
													<input class="input100" type="text" name="imagen">
													<li><a href="#">Descripción</a></li>
													<input class="input100" type="text" name="descripcion">

												</ul></li>
											<!-- Single Item -->
											<li data-target="#shoes"
												class="collapsed"><a href="#"><font size=4>Modificar
														Producto</font></a>
												<ul id="shoes">
													<li><a href="#">Id</a></li>
													<input class="input100" type="text" name="id">
													<li><a href="#">Color</a></li>
													<input class="input100" type="text" name="color">
													<li><a href="#">Precio</a></li>
													<input class="input100" type="text" name="precio">
													<li><a href="#">Genero</a></li>
													<input class="input100" type="text" name="genero">
													<li><a href="#">Talla</a></li>
													<input class="input100" type="text" name="talla">
													<li><a href="#">Categoria</a></li>
													<input class="input100" type="text" name="categoria">
													<li><a href="#">Stock</a></li>
													<input class="input100" type="text" name="stock">
													<li><a href="#">Imagen</a></li>
													<input class="input100" type="text" name="imagen">
													<li><a href="#">Descripción</a></li>
													<input class="input100" type="text" name="descripcion">

												</ul></li>
											<!-- Single Item -->
											<li data-target="#shoes"
												class="collapsed"><a href="#"><font size=4>Modificar
														Producto</font></a>
												<ul id="shoes">
													<li><a href="#">Id</a></li>
													<input class="input100" type="text" name="id">
													

												</ul></li>

											<!-- Single Item -->
											<li data-target="#shoes"
												class="collapsed"><a href="#"><font size=4>Modificar
														Producto</font></a>
												<ul id="shoes">
													<li><a href="#">Id</a></li>
													<input class="input100" type="text" name="id">
													

												</ul></li>
										</ul>
									</div>
							</form>
						</div>
					</div>

				</div>

			</div>

		</div>

		<!--   <div class="col-12 col-md-6 col-lg-5 ml-lg-auto">
                    <div class="order-details-confirmation">

                        <div class="cart-page-heading">
                            <h5>Your Order</h5>
                            <p>The Details</p>
                        </div>

                        <ul class="order-details-form mb-4">
                            <li><span>Product</span> <span>Total</span></li>
                            <li><span>Cocktail Yellow dress</span> <span>$59.90</span></li>
                            <li><span>Subtotal</span> <span>$59.90</span></li>
                            <li><span>Shipping</span> <span>Free</span></li>
                            <li><span>Total</span> <span>$59.90</span></li>
                        </ul> 

                         <div id="accordion" role="tablist" class="mb-4">
                            <div class="card">
                                <div class="card-header" role="tab" id="headingOne">
                                    <h6 class="mb-0">
                                        <a data-toggle="collapse" href="#collapseOne" aria-expanded="false" aria-controls="collapseOne"><i class="fa fa-circle-o mr-3"></i>Paypal</a>
                                    </h6>
                                </div>

                                <div id="collapseOne" class="collapse" role="tabpanel" aria-labelledby="headingOne" data-parent="#accordion">
                                    <div class="card-body">
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra tempor so dales. Phasellus sagittis auctor gravida. Integ er bibendum sodales arcu id te mpus. Ut consectetur lacus.</p>
                                    </div>
                                </div>
                            </div>
                            <div class="card">
                                <div class="card-header" role="tab" id="headingTwo">
                                    <h6 class="mb-0">
                                        <a class="collapsed" data-toggle="collapse" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo"><i class="fa fa-circle-o mr-3"></i>cash on delievery</a>
                                    </h6>
                                </div>
                                <div id="collapseTwo" class="collapse" role="tabpanel" aria-labelledby="headingTwo" data-parent="#accordion">
                                    <div class="card-body">
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Explicabo quis in veritatis officia inventore, tempore provident dignissimos.</p>
                                    </div>
                                </div>
                            </div>
                            <div class="card">
                                <div class="card-header" role="tab" id="headingThree">
                                    <h6 class="mb-0">
                                        <a class="collapsed" data-toggle="collapse" href="#collapseThree" aria-expanded="false" aria-controls="collapseThree"><i class="fa fa-circle-o mr-3"></i>credit card</a>
                                    </h6>
                                </div>
                                <div id="collapseThree" class="collapse" role="tabpanel" aria-labelledby="headingThree" data-parent="#accordion">
                                    <div class="card-body">
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Esse quo sint repudiandae suscipit ab soluta delectus voluptate, vero vitae</p>
                                    </div>
                                </div>
                            </div>
                            <div class="card">
                                <div class="card-header" role="tab" id="headingFour">
                                    <h6 class="mb-0">
                                        <a class="collapsed" data-toggle="collapse" href="#collapseFour" aria-expanded="true" aria-controls="collapseFour"><i class="fa fa-circle-o mr-3"></i>direct bank transfer</a>
                                    </h6>
                                </div>
                                <div id="collapseFour" class="collapse show" role="tabpanel" aria-labelledby="headingThree" data-parent="#accordion">
                                    <div class="card-body">
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Est cum autem eveniet saepe fugit, impedit magni.</p>
                                    </div>
                                </div>
                            </div>
                        </div> 

                        
                    </div>
                </div>-->
	</div>
	</div>
	</div>
	<!-- ##### Checkout Area End ##### -->

	<!-- ##### Footer Area Start ##### -->
	<!-- <footer class="footer_area clearfix">
        <div class="container">
            <div class="row">
                Single Widget Area
                <div class="col-12 col-md-6">
                    <div class="single_widget_area d-flex mb-30">
                        Logo
                        <div class="footer-logo mr-50">
                            <a href="#"><img src="img/core-img/logo2.png" alt=""></a>
                        </div>
                        Footer Menu
                        <div class="footer_menu">
                            <ul>
                                <li><a href="shop.html">Shop</a></li>
                                <li><a href="blog.html">Blog</a></li>
                                <li><a href="contact.html">Contact</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                Single Widget Area
                <div class="col-12 col-md-6">
                    <div class="single_widget_area mb-30">
                        <ul class="footer_widget_menu">
                            <li><a href="#">Order Status</a></li>
                            <li><a href="#">Payment Options</a></li>
                            <li><a href="#">Shipping and Delivery</a></li>
                            <li><a href="#">Guides</a></li>
                            <li><a href="#">Privacy Policy</a></li>
                            <li><a href="#">Terms of Use</a></li>
                        </ul>
                    </div>
                </div>
            </div>

            <div class="row align-items-end">
                Single Widget Area
                <div class="col-12 col-md-6">
                    <div class="single_widget_area">
                        <div class="footer_heading mb-30">
                            <h6>Subscribe</h6>
                        </div>
                        <div class="subscribtion_form">
                            <form action="#" method="post">
                                <input type="email" name="mail" class="mail" placeholder="Your email here">
                                <button type="submit" class="submit"><i class="fa fa-long-arrow-right" aria-hidden="true"></i></button>
                            </form>
                        </div>
                    </div>
                </div>
                Single Widget Area
                <div class="col-12 col-md-6">
                    <div class="single_widget_area">
                        <div class="footer_social_area">
                            <a href="#" data-toggle="tooltip" data-placement="top" title="Facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                            <a href="#" data-toggle="tooltip" data-placement="top" title="Instagram"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                            <a href="#" data-toggle="tooltip" data-placement="top" title="Twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a>
                            <a href="#" data-toggle="tooltip" data-placement="top" title="Pinterest"><i class="fa fa-pinterest" aria-hidden="true"></i></a>
                            <a href="#" data-toggle="tooltip" data-placement="top" title="Youtube"><i class="fa fa-youtube-play" aria-hidden="true"></i></a>
                        </div>
                    </div>
                </div>
            </div>

<div class="row mt-5">
                <div class="col-md-12 text-center">
                    <p>
                        Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0.
    Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
    Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0.
                    </p>
                </div>
            </div>
            
        </div>


    </footer> -->

	<footer class="footer_area clearfix">
		<div class="container">
			<div class="row">
				<!-- Single Widget Area -->
				<div class="col-12 col-md-6">
					<div class="single_widget_area d-flex mb-30">
						<!-- Logo -->
						<div class="footer-logo mr-50">
							<a href="#"></a>
						</div>
						<!-- Footer Menu -->
						<div class="footer_menu">
							<ul>

								<li><a href="contact.html">Contact</a></li>
							</ul>
						</div>
					</div>
				</div>

				<!-- Single Widget Area -->
				<div class="col-12 col-md-6">
					<div class="single_widget_area">
						<div class="footer_social_area">
							<a href="#" data-toggle="tooltip" data-placement="top"
								title="Facebook"><i class="fa fa-facebook"
								aria-hidden="true"></i></a> <a href="#" data-toggle="tooltip"
								data-placement="top" title="Instagram"><i
								class="fa fa-instagram" aria-hidden="true"></i></a> <a href="#"
								data-toggle="tooltip" data-placement="top" title="Twitter"><i
								class="fa fa-twitter" aria-hidden="true"></i></a> <a href="#"
								data-toggle="tooltip" data-placement="top" title="Pinterest"><i
								class="fa fa-pinterest" aria-hidden="true"></i></a> <a href="#"
								data-toggle="tooltip" data-placement="top" title="Youtube"><i
								class="fa fa-youtube-play" aria-hidden="true"></i></a>
						</div>
					</div>
				</div>
			</div>

			<div class="row mt-5">
				<div class="col-md-12 text-center"></div>
			</div>

		</div>
	</footer>
	<!-- ##### Footer Area End ##### -->

	<!-- jQuery (Necessary for All JavaScript Plugins) -->
	<script src="js/jquery/jquery-2.2.4.min.js"></script>
	<!-- Popper js -->
	<script src="js/popper.min.js"></script>
	<!-- Bootstrap js -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Plugins js -->
	<script src="js/plugins.js"></script>
	<!-- Classy Nav js -->
	<script src="js/classy-nav.min.js"></script>
	<!-- Active js -->
	<script src="js/active.js"></script>

</body>

</html>