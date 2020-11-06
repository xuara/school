<!-- Michael Kester
finalgrade.php -->
<html>
<head>
	<link rel="stylesheet" type="text/css" href="../styles/style1.css">
  <title>IT 207 Final Grade Determiner</title>
	<body>
		<?php

	  $assignment = '../includes/menu_assignment.inc';

	  $info = '../includes/menu_info.inc';
	  require($assignment);

	  require($info);

	  ?>
		<div id="main">
			<?php
			$earnPart = $_POST["earnedParticipation"];
			$maxPart = $_POST["maxParticipation"];
			$weightPart = $_POST["weightParticipation"];

			$earnQuiz = $_POST["earnedQuiz"];
			$maxQuiz = $_POST["maxQuiz"];
			$weightQuiz = $_POST["weightQuiz"];

			$earnLab = $_POST["earnedLab"];
			$maxLab = $_POST["maxLab"];
			$weightLab = $_POST["weightLab"];

			$earnPrac = $_POST["earnedPracticum"];
			$maxPrac = $_POST["maxPracticum"];
			$weightPrac = $_POST["weightPracticum"];

			/* Functions to calculate percentages */

			/*
			@return double participation grade as a percentage
			*/
			function percentCalcPart($earnPart, $maxPart) {
				$percentPart = ($earnPart / $maxPart);
				return $percentPart;
			}

			/*
			@return double quiz grade as a percentage
			*/
			function percentCalcQuiz($earnQuiz, $maxQuiz) {
				$percentQuiz = ($earnQuiz / $maxQuiz);
				return $percentQuiz;
			}

			/*
			@return double lab grade as a percentage
			*/
			function percentCalcLab($earnLab, $maxLab) {
				$percentLab = ($earnLab / $maxLab);
				return $percentLab;
			}

			/*
			@return double practicum grade as a percentage
			*/
			function percentCalcPrac($earnPrac, $maxPrac) {
				$percentPrac = ($earnPrac / $maxPrac);
				return $percentPrac;
			}

			/* Functions to calculate weighted totals */

			/*
			@return integer percentage of participation weight out of 100
			(i.e. 6% --> 6)
			*/
			$calcPart = percentCalcPart($earnPart, $maxPart);
			function weightCalcPart($calcPart, $weightPart) {
				$weightPart = ($calcPart * $weightPart);
				return $weightPart;
			}

			/*
			@return integer percentage of quiz weight out of 100 (i.e. 6% --> 6)
			*/
			$calcQuiz = percentCalcQuiz($earnQuiz, $maxQuiz);
			function weightCalcQuiz($calcQuiz, $weightQuiz) {
				$weightQuiz = ($calcQuiz * $weightQuiz);
				return $weightQuiz;
			}

			/*
			@return integer percentage of lab weight out of 100 (i.e. 6% --> 6)
			*/
			$calcLab = percentCalcLab($earnLab, $maxLab);
			function weightCalcLab($calcLab, $weightLab) {
				$weightLab = ($calcLab * $weightLab);
				return $weightLab;
			}

			/*
			@return integer percentage of practicum weight out of 100 (i.e. 6% --> 6)
			*/
			$calcPrac = percentCalcPrac($earnPrac, $maxPrac);
			function weightCalcPrac($calcPrac, $weightPrac) {
				$weightPrac = ($calcPrac * $weightPrac);
				return $weightPrac;
			}
		?>

		<?php
		$percPart = (percentCalcPart($earnPart, $maxPart) * 100);
		$percQuiz = (percentCalcQuiz($earnQuiz, $maxQuiz) *100);
		$percLab = (percentCalcLab($earnLab, $maxLab) * 100);
		$percPrac = (percentCalcPrac($earnPrac, $maxPrac) * 100);

		$wPart = weightCalcPart($calcPart, $weightPart);
		$wQuiz = weightCalcQuiz($calcQuiz, $weightQuiz);
		$wLab = weightCalcLab($calcLab, $weightLab);
		$wPrac = weightCalcPrac($calcPrac, $weightPrac);

		$finalPerc = ($wPart + $wQuiz + $wLab + $wPrac);

		$letter = ( ($finalPerc >= 95) ? "A+" : (
			($finalPerc >= 90 and $finalPerc < 95) ? "A" : (
				 ($finalPerc >= 85 and $finalPerc < 90) ? "B+" : (
					 ($finalPerc >= 80 and $finalPerc < 85) ? "B" : (
						 ($finalPerc >= 75 and $finalPerc < 80) ? "C+" : (
							 ($finalPerc >= 70 and $finalPerc < 75) ? "C" : (
								 ($finalPerc >= 60 and $finalPerc < 70) ? "D" : (
									 ($finalPerc >= 0 and $finalPerc < 60) ? "F" : "ERROR"))))))));

		/*
		switch(true) {
			case ($finalPerc >= 95):
			$letter =  "A+";
			break;
			case ($finalPerc >= 90 && $finalPerc < 95):
			$letter =  "A";
			break;
			case ($finalPerc >= 85 && $finalPerc < 90):
			$letter =  "B+";
			break;
			case ($finalPerc >= 80 && $finalPerc < 85):
			$letter =  "B";
			break;
			case ($finalPerc >= 75 && $finalPerc < 80):
			$letter =  "C+";
			break;
			case ($finalPerc >= 70 && $finalPerc < 75):
			$letter =  "C";
			break;
			case ($finalPerc >= 60 && $finalPerc < 70):
			$letter =  "D";
			break;
			case ($finalPerc >= 0 && $finalPerc < 60):
			$letter =  "F";
			break;
			default:
			echo "Error!";
			break;
		} */
		?>

		<!-- form submission output -->
		You earned a <?php echo $percPart; ?>% for Participation,
		with a weighted value of <?php echo $wPart; ?>%. </br></br>

		You earned a <?php echo $percQuiz; ?>% for the Quizzes,
		with a weighted value of <?php echo $wQuiz; ?>%. </br></br>

		You earned a <?php echo $percLab; ?>% for the Lab Assignments,
		with a weighted value of <?php echo $wLab; ?>%. </br></br>

		You earned a <?php echo $percPrac; ?>% for the Practica,
		with a weighted value of <?php echo $wPrac; ?>%. </br></br>

		<span>Your Final Grade is a <?php echo $finalPerc; ?>%, which is a(n)
			<?php echo $letter ?>.</span>
	</div>
	<?php
  $copyright = '../includes/menu_copyright.inc';
  require($copyright);
  ?>
	</body>
</html>
