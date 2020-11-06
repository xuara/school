<!-- Michael Kester
Assignment 2 Page -->
<!doctype html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
<head>
  <meta charset="utf-8">
  <META HTTP-EQUIV="CACHE-CONTROL" CONTENT="NO-CACHE">
    <link rel="stylesheet" type="text/css" href="../styles/style2.css">
    <title>IT 207 Calendar</title>
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
      <?php
      $currentDateFirstDayJD=gregoriantojd(date("m"),1,date("Y"));
      $currentDateJD=gregoriantojd(date("m"),date("d"),date("Y"));
      $daysInCurrentMonth=cal_days_in_month(CAL_GREGORIAN,date("m"),date("Y"));

      echo "Today is " . date("F d, Y") . "<br>";
      echo "Today is a " . jddayofweek($currentDateJD,1) . "<br>";
      echo "The day this month starts on is a " . jddayofweek($currentDateFirstDayJD,1) . "<br><br>";
      ?>

      <form method="POST">
        <div class="calendar">
          <div id="boxM"> <h3><?php echo date("F Y") ?></h3> </div>
          <div>Sunday</div>
          <div>Monday</div>
          <div>Tuesday</div>
          <div>Wednesday</div>
          <div>Thursday</div>
          <div>Friday</div>
          <div>Saturday</div>
          <?php
          for ($i=1; $i < $daysInCurrentMonth+1; $i++) {
            ?> <div> <?php echo $i . " "; ?> </div> <?php
          }
          ?>
        </div>

      </form>

    </div>


    <?php
    $copyright = '../includes/menu_copyright.inc';
    require($copyright);
    ?>
  </body>
  </html>
