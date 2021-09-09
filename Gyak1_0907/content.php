<?php

	if(isset($_POST['action'])) {
		if(isset($_POST['index'])) {
			$return = '';
			$index = $_POST['index'];
			
			if($index == 'xml') {
				$return .= '<div class="row">';
					$return .= '<div class="col-12">';
						$return .= '<div class="background">';
							$return .= '<p class="pharagraph">Az XML (Extensible Markup Language, kiterjeszthető jelölőnyelv)
										   a W3C által ajánlott általános célú leíró nyelv, speciális célú leíró nyelvek létrehozására.
										   Az SGML egyszerűsített részhalmaza, mely különböző adattípusok leírására képes. Az elsődleges célja
										   strukturált szöveg és információ megosztása az interneten keresztül. Az XML-en alapuló nyelvek
										   (például RDF, RSS, MathML, XSIL, SVG) leírása formális, így lehetővé teszik a programok számára
										   a dokumentumok módosítását és validálását a formátum előzetes ismerete nélkül.
										   
										   A SAX és a DOM széles körben használt API XML adat feldolgozásához. A SAX soros feldolgozásra,
										   míg a DOM véletlen hozzáférésű feldolgozásra alkalmas. Másik formája az XML feldolgozó API-nak az adatkötés,
										   ahol az XML adat erősen típusos programnyelvi adatstruktúraként áll rendelkezésre. Jó példa az adatkötő rendszerekre
										   a Java Architecture for XML Binding (JAXB) és a Strathclyde Novel Architecture for Querying XML (SNAQue).
										   Az ADO.NET is képes erősen típusos adatstruktúraként kezelni XML forrásokat.
										   Egy szűrő az Extensible Stylesheet Language (XSL, kiterjeszthető stílusleíró nyelv)
										   családban képes átalakítani az XML fájlt megjelenítésre vagy nyomtatásra.</p>';
							$return .= '<ul>';
								$return .= '<li><p class="pharagraph">XSL-FO megjelenítésre alakítja át az XML fájlokat. Az XSL-FO alapvetően egy XML-alapú, lapon belüli elrendezést szabályozó nyelv.</p></li>';
								$return .= '<li><p class="pharagraph">XSLT átalakítja az XML-t más formátumra, például HTML-re, más XML szótárra vagy egyszerű szövegre.</p></li>';
								$return .= '<li><p class="pharagraph">XQuery egy W3C nyelv XML adatok lekérdezésére, megalkotására és átalakítására.</p></li>';
								$return .= '<li><p class="pharagraph">XPath egy elérési utakat leíró nyelv, mely adatok kiválasztására használható az XML fájlon belül. Az XPath az XQuery és az XSLT alnyelve.</p></li>';
							$return .= '</ul>';
						$return .= '</div>';	//End of background
					$return .= '</div>';	//End of col-12
				$return .= '</div>';	//End of row
				
				$return .= '<div class="row">';
					$return .= '<div class="col-12">';
						$return .= '<div class="background">';
							$return .= '<img class="picture" src="images/xml-info.png">';
						$return .= '</div>';	//End of background
					$return .= '</div>';	//End of col-12
				$return .= '</div>';	//End of row
			} elseif($index == 'web') {
				$return .= '<div class="row">';
					$return .= '<div class="col-12">';
						$return .= '<div class="background">';
							$return .= '<p class="pharagraph">A webfejlesztés folyamata manapság akár több tucat részfeladatból is állhat.
															  Ezen részfeladatok neve többnyire valamilyen 3-4 betűs technológiának, szabványnak a rövidítése.
															  Ezek közül csak azon legelemibbeket említjük meg, amelyek egy mai modern, dinamikus weboldal elkészítéséhez szükségesek.</p>';
							$return .= '<ul>';
								$return .= '<li><p class="pharagraph">HTML5</p></li>';
								$return .= '<li><p class="pharagraph">CSS3</p></li>';
								$return .= '<li><p class="pharagraph">JavaScript</p></li>';
								$return .= '<li><p class="pharagraph">PHP</p></li>';
							$return .= '</ul>';
						$return .= '</div>';	//End of background
					$return .= '</div>';	//End of col-12
				$return .= '</div>';	//End of row
				
				$return .= '<div class="row">';
					$return .= '<div class="col-12">';
						$return .= '<div class="background">';
							$return .= '<img class="picture" src="images/web-info.png">';
						$return .= '</div>';	//End of background
					$return .= '</div>';	//End of col-12
				$return .= '</div>';	//End of row
			} elseif($index == 'szoftver') {
				$return .= '<div class="row">';
					$return .= '<div class="col-12">';
						$return .= '<div class="background">';
							$return .= '<p class="pharagraph">A szoftvertesztelés a szoftverminőség-biztosítás és így a szoftverfejlesztés részét képezi.
															  A tesztelés egy rendszer vagy program kontrollált körülmények melletti futtatása, és az eredmények kiértékelése.
															  A hagyományos megközelítés szerint a tesztelés célja az, hogy a fejlesztés során létrejövő hibákat minél korábban felfedezze,
															  és ezzel csökkentse azok kijavításának költségeit. Jelenleg a tesztelői munka egyre inkább eltolódik a fejlesztők
															  és a döntéshozók információkkal való támogatásának irányába. Fontos szerepek még a fejlesztés állapotának pontos
															  és egzakt mérése és a kockázatkezelés és -becslés.</p>';
							$return .= '<ul>';
								$return .= '<li><p class="pharagraph">Definíciói:</p></li>';
									$return .= '<ul>';
										$return .= '<li><p class="pharagraph">Felhasználhatósági szemszög: "Alkalmasság a felhasználó által szánt célra."</p></li>';
										$return .= '<li><p class="pharagraph">Tesztelői szemszög: "Egyezés a specifikációval."</p></li>';
									$return .= '</ul>';
								$return .= '<li><p class="pharagraph">A szoftverminőség definíciói</p></li>';
									$return .= '<ul>';
										$return .= '<li><p class="pharagraph">Felhasználói szemszög: "Alkalmasság a felhasználó által szánt célra."</p></li>';
										$return .= '<li><p class="pharagraph">Programozói szemszög: "Egyezés a specifikációval."</p></li>';
									$return .= '</ul>';
							$return .= '</ul>';
						$return .= '</div>';	//End of background
					$return .= '</div>';	//End of col-12
				$return .= '</div>';	//End of row
				
				$return .= '<div class="row">';
					$return .= '<div class="col-12">';
						$return .= '<div class="background">';
							$return .= '<img class="picture" src="images/szoftver-info.png">';
						$return .= '</div>';	//End of background
					$return .= '</div>';	//End of col-12
				$return .= '</div>';	//End of row
			}
			
			echo $return;
		}
	}

?>