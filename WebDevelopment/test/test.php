<html lang="en">
<head>
    <title> Hello World </title>
</head>
<body>
<p>
<!--    --><?php
/*
    $fistName = "Jingyu";
    $lastName = "An";
    $studentID = 1234;
    $gender = true; //T : Female, F : Male
    $program = "Web Development";
    $birthYear = 1987;

    if ($gender === true) {
        $gender = "female";
    } else {
        $gender = "male";
    }

    echo "<p>Name : " . $fistName . " " . $lastName . "<br>" . "Student ID : " . $studentID . "<br>" .
        "Gender : " . $gender . "<br>" . "Program : " . $program . "<br>" . "Year of birth : " . $birthYear . "</p>";

    $Today = "Tuesday";
    if ($Today === "Monday") {
        echo "<p>Today is Monday</p>";
    } else {
        echo "<p>Today is not Monday</p>";
    }
    $grade = 59;

    echo "<p>Your grade corresponds to ";
    if ($grade > 0 && $grade <= 60) {
        echo "Fail";
    } else if ($grade > 60 && $grade <= 70) {
        echo "D";
    } else if ($grade > 70 && $grade <= 80) {
        echo "C";
    } else if ($grade > 80 && $grade <= 90) {
        echo "B";
    } else if ($grade > 90 && $grade <= 100) {
        echo "A";
    }
    echo "</p>";


    $gr = "B";
    echo "<p>Your grade corresponds to ";
    switch ($gr) {
        case "A":
            echo "A";
            break;
        case "B":
            echo "B";
            break;
        case "C":
            echo "C";
            break;
        case "D":
            echo "D";
            break;
        default:
            echo "Fail";
            break;
    }
    echo "</p>";

    $age = 32;
    echo "<p>";
    if ($age >= 20 && $age <= 40) {
        if ($age < 30 ) {
            echo "You are an adult.";
            if ($age <= 25) {
                echo "You are in your early 20";
            } else
                echo "You are in your late 20";

        } else {
            echo "You are an young professional";
        }
    } else if ($age >= 50 && $age <= 70) {
        echo "You deserve rest";
    }
    echo "</p>";

    echo "<p>";
    $count = 0;
    while ($count < 20) {
        echo "counter at ", $count++ . "<br>";
    }

    echo "<br>";

    $count = 0;
    while ($count < 20) {
        echo "counter at ", ++$count . "<br>";
    }
    echo "</p>";*/

    echo "<hr><p>";
    echo "</p>";

    echo "<hr><p>";
    $count = 2;
    do {
        echo "The count is equal to $count";
        ++$count;
    } while ($count < 2);
    echo "</p>";

    echo "<hr><p>";
    for ($count = 0; $count < 20; $count++) {
        echo "Counter at" . $count . "<br>";
    }
    echo "</p>";

    echo "<hr><p>";
    $daysOfWeek = array();
    $daysOfWeek = ["Monday", "Tuesday", "Wednesday", "Thursday", " Friday", " Saturday", "Sunday"];
    foreach ($daysOfWeek as $day){
        echo $day . "<br>";
    }
    echo "</p>";

    echo "<hr><p>";

    $testNumber = 33;
    if (EvenOdd($testNumber))
        echo "The number is even.";
    else
        echo "The number is odd.";
    echo "<br>";
    echo EvenOdd($testNumber);

    function EvenOdd($number): bool
    {
        if ($number%2 == 0) {
            echo "Even <br>";
            return true;
        } else {
            echo "Odd <br>";
            return false;
        }
    }
    echo "</p>";


    echo "<hr><p>";
    $arr = [2, 3, 6, 5, 1];

    echo "The sum is " . sum($arr) . "<br>";
    echo "The highest number is " . highest($arr) . "<br>";

    function sum($nums) {
        $sum = 0;
        foreach ($nums as $num )
            $sum += $num;
        return $sum;
    }

    function highest($nums) {
        $max = $nums[0];
        foreach ($nums as $num) {
            $max = $max > $num ? $max : $num;
        }
        return $max;
    }



    echo "</p>";
    ?>
</p>
</body>
</html>
