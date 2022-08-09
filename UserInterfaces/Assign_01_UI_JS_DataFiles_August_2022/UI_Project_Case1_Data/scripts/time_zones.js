/*
   Assignment 01 
   Developed By:       Jingyu An
   Developed Date:     08-06-2022

   Function List: Add the list of your functions here.
   1) addTime(oldtime, milliseconds)
      Used to add a specified number of milliseconds to a date object named oldtime.
      A new date object with the new time value is returned by the function.

   2) showTime(time)
      Displays a time value in the format:
      hh:mm AM/PM

   3) ...
*/

function addTime(oldtime, milliseconds) {
    let newTime;
    newTime = new Date();

    let newValue;
    newValue = oldtime.getTime() + milliseconds;

    newTime.setTime(newValue);

    return newTime;
}

/**
 *
 * @param {Date} time
 * @returns {string}
 */

function showTime(time) {

    let thisDate = time.getDate();
    let thisMonth = time.getMonth() + 1;
    let thisYear = time.getFullYear();
    let thisHour = time.getHours();
    let thisMinute = time.getMinutes();

    let ampm = (thisHour < 12) ? ' AM ' : ' PM ';

    thisHour = (thisHour > 12) ? (thisHour - 12) : thisHour;

    thisHour = (thisHour == 0) ? 12 : thisHour;

    thisMinute = (thisMinute < 10) ? ('0' + thisMinute) : thisMinute;

    return thisMonth + '/' + thisDate + '/' + thisYear + '\n ' + thisHour + ':' + thisMinute + ' ' + ampm;
}

/**
 *
 * @param {String} className
 */
const mouseOverEvent = className => {
    document.querySelectorAll(className).forEach((places) => {
        places.style.backgroundColor = 'indianred';
        places.style.color = 'white';
        places.style.border = 'none';
        places.style.borderRadius = '20px';
        places.style.transform = 'scale( 1.1 )';
    });
};

const mouseOutEvent = className => {
    document.querySelectorAll(className).forEach((places) => {
        places.style.backgroundColor = 'white';
        places.style.color = 'black';
        places.style.border = '1px solid black';
        places.style.borderRadius = '0px';
        places.style.transform = 'scale( 1 )';
    });
}
