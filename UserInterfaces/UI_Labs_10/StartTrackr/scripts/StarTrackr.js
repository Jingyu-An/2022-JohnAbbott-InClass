// JavaScript source code for StarTrackr web page

// syntax: jquery(selector).action(parameter_list)
// syntax: $(selector).action(parameter_list)

/*
$(document).ready(function () {
    // jquery statements
})

$(function () {
    // jquery statements
})

$( () => {
    // jquery statements
});

*/

/*
$( () => {
   // window.alert('Welcome to StarTrackr web page');
});


$( () => {
    // find the number of even row in the body of the table
    window.alert($('#celebs tbody tr:even').length + ' even elements.');
});


$( () => {
    // get the font size of the first tr in tbody
    var theFontSize = $('#celebs tbody tr:first').css('font-size');
    alert(theFontSize);
});



$( () => {
   // change the color and background color of the first td
   $('#celebs tbody :first').css('color', '#00f');
   $('#celebs tbody tr:first').css('background-color', '#ddd');
});


$( () => {
    // combine style properties in one statement
    $('#celebs tbody :first').css({
        'background-color': '#ddd',
        'color':            '#00f',
        'font-size':        '12px',
        'line-height':      '2.5rem'
    });
});


$( () => {
    // apply zebra style to the tr even rows
    $('#celebs tbody tr:even').addClass('zebra');
    // remove the style 
    $('#celebs tbody tr:even').removeClass('zebra');
});


$( () => {
    // hide the paragraph with id disclaimer
    $('#disclaimer').click(function() {
        $('#disclaimer').hide();
    });
});


$( () => {
    // show the paragraph with id disclaimer
    $('#disclaimer').click(function() {
        $('#disclaimer').show();
    });
});


$( () => {
    // fade out the paragraph with id disclaimer
    $('#disclaimer').click(function() {
        $('#disclaimer').fadeOut();
    });
});

*/


$( () => {
    // add the hover effect using zebraHover class
    $('#celebs tbody tr:even').addClass('zebra');
    $('#celebs tbody tr').mouseover(function() {
        $(this).addClass('zebraHover');
    });

    $('#celebs tbody tr').mouseout(function () {
        $(this).removeClass('zebraHover');
    });
    
});


$( () => {
    // jquery statements
});
