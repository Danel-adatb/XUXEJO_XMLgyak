<HTML>
	<HEAD>
		<TITLE>XUXEJO_0907</TITLE>
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="style.css">
		<meta charset="UTF-8">
	</HEAD>
	
	<BODY>
	<?php
		$return = '';
		
		// Navbar Starts here
		$return .= '<div class="navbar navbar-expand-lg">';
			$return .= '<ul class="navbar mr-auto">';
				$return .= '<a href="index.php" class="nav-link">Home</a>';
				$return .= '<button class="nav-link showdiv" id="xml" title="xml">XML Adatkezelés</button>';
				$return .= '<button class="nav-link showdiv" id="web" title="xml">Web Technológiák</button>';
				$return .= '<button class="nav-link showdiv" id="szoftver" title="xml">Szoftvertesztelés</button>';
			$return .= '</ul>';
		$return .= '</div>';
		// Navbar Ends here
		
		//BODY
		
			$return .= '<div class="container-fluid">';
				$return .= '<div class="row">';
					$return .= '<div class="col-6">';
						// Welcome Sign
							$return .= '<div class="card">';			
								$return .= '<div class="info">';
									$return .= "<h1 class='card-head'>Üdvözöllek!</h1>";
									$return .= '<p class="description">Ezen a weblapon található az XML Adatkezelés 1. gyakorlatának feladata. Látható 4 menüpont
																	   az oldalon. Home (azaz a kezdő oldal ahol jelenleg is tartózkodunk), XML Adatkezelés (XML-lel kapcsolatos adatok), 
																	   Web Technológiák (WebTech-kel kapcsolatos információk), Szoftvertesztelés (Szoftvertervezéssel kapcsolatos információk).
																	   A menüpontok rákantitásával ellenőrizheted az oldalakat</p>';	
								$return .= '</div>';	//End of info
							$return .= '</div>';	//End of card
						// Welcome Sign
					$return .= '</div>';	//End of col-9
					
					$return .= '<div class="col-6 display" id="content">';
					
					$return .= '</div>';	//End of col-3
				$return .= '</div>';	//End of row
			$return .= '</div>';	//End of container-fluid
		
		//BODY
		
		echo $return;
	?>
	
	<script src="show.js"></script>
	</BODY>
</HTML>