<!-- Michael KesterAssignment 1 Page -->
<!doctype html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
<head>
  <meta charset="utf-8">
  <link rel="stylesheet" type="text/css" href="../styles/style1.css">
  <title>IT 207 Final Grade Determiner</title>
</head>
<html>
<body>
  <?php
  $assignment = '../includes/menu_assignment.inc';
  $info = '../includes/menu_info.inc';
  require($assignment);
  require($info);
  ?>
  <div id="main">
    <form method="POST" action="finalgrade.php">
      <h3>Participation</h3>
      Earned: <input type="text" name="earnedParticipation">
      Max: <input type="text" name="maxParticipation">
      Weight (percentage): <input type="text" name="weightParticipation">
      <h3>Quizzes</h3>
      Earned: <input type="text" name="earnedQuiz">
      Max: <input type="text" name="maxQuiz">
      Weight (percentage): <input type="text" name="weightQuiz">
      <h3>Lab Assignments</h3>
      Earned: <input type="text" name="earnedLab">
      Max: <input type="text" name="maxLab">
      Weight (percentage): <input type="text" name="weightLab">
      <h3>Practica</h3>
      Earned: <input type="text" name="earnedPracticum">
      Max: <input type="text" name="maxPracticum">
      Weight (percentage): <input type="text" name="weightPracticum">
      <br /><br />
      <input type="submit">
    </form>
  </div>
  <?php
  $copyright = '../includes/menu_copyright.inc';
  require($copyright);
  ?>
</body>
</html>
