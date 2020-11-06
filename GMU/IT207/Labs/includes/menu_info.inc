<!-- Information Box -->
<div id="info">
	<div>
		<h3>IT 207-004 Spring 2019</h3>
		Professor Nachawati<br>
		George Mason University
	</div>

	<div>
		<h3>Michael Kester</h3>
		<a href="mailto:mkester4@gmu.edu">mkester4@gmu.edu</a><br>
		<?php
			date_default_timezone_set('America/New_York');

			// outputs e.g. 'Last modified: 20:43 Mar 04, 1998 UTC.'
			echo "Last modified: " . date ("H:i M d, Y T", getlastmod());
		?>
	</div>
</div>
