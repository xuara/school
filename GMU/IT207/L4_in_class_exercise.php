<?php
	function mod($a, $b) {
		echo $a % $b;
	}
	
	function mod2($a, $b) {
		$c = $a % $b;
		echo $c;
	}
	
	mod(10, 2);
	echo;
	mod2(20, 10);
?>