<!--Michael Kester
Home Page -->
<!doctype html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
<head>
<meta charset="utf-8">

<link rel="stylesheet" type="text/css" href="/~mkester4/IT207/styles/home_style.css">

<title>IT 207</title>
</head>

<body>
	<?php
		$assignment = 'includes/menu_assignment.inc';
		$info = 'includes/menu_info.inc';
		
		require($assignment);
		require($info);
	?>
	
	<div id="main">
		<div>
			<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/OCR-A_sample.svg/639px-OCR-A_sample.svg.png" alt="Sample Image">

			<h3>Summary</h3>
			<ul>
				<li>Personal</li>
				<li style="list-style-type: none">
					<ul>
						<li>Home town is Springfield, VA, USA.</li>
						<li>Hobbies are hiking and fishing.</li>
					</ul>					
				</li>
			</ul>
			
			<ul>
				<li>Academic</li>
				<li style="list-style-type: none">
					<ul>
						<li>A senior whose major is Information Technology with a security concentration.</li>
					</ul>
				</li>	
			</ul>
		</div>
		
		<div>
			<h3>Professional & Personal Details</h3>
			<ul>
				<li>Skills in Microsoft Office (Word, PowerPoint, Excel)</li>
				<li>Programming</li>
				<li style="list-style-type: none">
					<ul>
						<li>Java</li>
					</ul>
				</li>
			</ul>
			
			<?php
				echo "Here is the start of the required PHP code for this assignment:<br>";
			?>
			<ul>
				<li>This uses the "strlen" (string length) function:</li>
				<li style="list-style-type: none">
					<ul>
						<li>
							<?php
								echo "The word " . "hippopotamus" .  " is " . (strlen("hippopotamus")) . " letters long";
							?>
						</li>
					</ul>
				</li>
			</ul>
			
			<ul>
				<li>This uses the "rand" (random) and "getrandmax" (get random max) functions:</li>
				<li style="list-style-type: none">
					<ul>
						<li>
							<?php
								echo "A randomly generated number from 0 to 246810 is: " . rand(0, 246810);
							?>
						</li>
						<li>
							<?php
								echo "The default max value for a random number is: " . getrandmax();
							?>
						</li>
					</ul>
				</li>
			</ul>
			
			<ul>
				<li>This uses the "strtolower" (string to lower) function:</li>
				<li style="list-style-type: none">
					<ul>
						<li>
							<?php
								echo "'PHP IS QUITE USEFUL' but in all lower case letters is: " . strtolower("'PHP IS QUITE USEFUL'");
							?>
						</li>
					</ul>
				</li>
			</ul>
			
			<ul>
				<li>This uses the "strtoupper" (string to upper) function:</li>
				<li style="list-style-type: none">
					<ul>
						<li>
							<?php
								echo "'php is pretty neat' but in all upper case letters is: " . strtoupper("'php is pretty neat'");
							?>
						</li>
					</ul>
				</li>
			</ul>
			
			<ul>
				<li>This uses the "str_repeat" (string repeat) function:</li>
				<li style="list-style-type: none">
					<ul>
						<li>
							<?php
								echo "The word 'parsec' repeated 4 times is: " . "'" . str_repeat("parsec", 4) . "'";
							?>
						</li>
					</ul>
				</li>
			</ul>
			
			<ul>
				<li>This uses the "strrev" (string reverse) function:</li>
				<li style="list-style-type: none">
					<ul>
						<li>
							<?php
								echo "The phrase 'do geese see god' backwards is: " . strrev("'do geese see god'");
							?>
						</li>
					</ul>
				</li>
			</ul>			
		</div>
	</div>
	
	<?php	
		$copyright = 'includes/menu_copyright.inc';
		
		require($copyright);
	?>
</body>
</html>