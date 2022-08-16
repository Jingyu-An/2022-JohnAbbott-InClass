'use strict';

/**
 *
 * @param {String} className
 */

const mouseOverEvent = className => {
    document.querySelectorAll(className).forEach((places) => {
        places.style.backgroundColor = '#9ACBFF';
        places.style.color = 'white';
        places.style.cursor = 'pointer';
        places.style.transform = 'scale(1.1)';
        places.style.transition = '0.5s'
    });
};

const mouseOutEvent = className => {
    document.querySelectorAll(className).forEach((places) => {
        places.style.backgroundColor = 'white';
        places.style.color = 'black';
        places.style.transform = 'scale(1)';
    });
}

function worldMap() {
    let placeUSA = document.getElementById('place1');
    placeUSA.value = 'USA';

    let placeChina = document.getElementById('place2');
    placeChina.value = 'CHINA';

    let placeKorea = document.getElementById('place3');
    placeKorea.value = 'KOREA';

    let placeJapan = document.getElementById('place4');
    placeJapan.value = 'JAPAN';

    let nameHouston = document.getElementById('name1');
    let officeHouston = document.getElementById('Kickstarter');
    placeUSA.onmouseover = nameHouston.onmouseover = officeHouston.onmouseover = function () {
        mouseOverEvent('.usa');
    }
    placeUSA.onmouseout = nameHouston.onmouseout = officeHouston.onmouseout = function () {
        mouseOutEvent('.usa');
    }

    let nameLondon = document.getElementById('name2');
    let officeLondon = document.getElementById('Indiegogo');
    placeUSA.onmouseover = nameLondon.onmouseover = officeLondon.onmouseover = function () {
        mouseOverEvent('.usa');
    }
    placeUSA.onmouseout = nameLondon.onmouseout = officeLondon.onmouseout = function () {
        mouseOutEvent('.usa');
    }

    let nameNewYork = document.getElementById('name3');
    let officeNewYork = document.getElementById('Taobao');
    placeChina.onmouseover = nameNewYork.onmouseover = officeNewYork.onmouseover = function () {
        mouseOverEvent('.china');
    }
    placeChina.onmouseout = nameNewYork.onmouseout = officeNewYork.onmouseout = function () {
        mouseOutEvent('.china');
    }

    let nameSeattle = document.getElementById('name4');
    let officeSeattle = document.getElementById('Wadiz');
    placeKorea.onmouseover = nameSeattle.onmouseover = officeSeattle.onmouseover = function () {
        mouseOverEvent('.korea');
    }
    placeKorea.onmouseout = nameSeattle.onmouseout = officeSeattle.onmouseout = function () {
        mouseOutEvent('.korea');
    }

    let nameSydney = document.getElementById('name5');
    let officeSydney = document.getElementById('Sydney_Office');
    placeJapan.onmouseover = nameSydney.onmouseover = officeSydney.onmouseover = function () {
        mouseOverEvent('.japan');
    }
    placeJapan.onmouseout = nameSydney.onmouseout = officeSydney.onmouseout = function () {
        mouseOutEvent('.japan');
    }

    let nameTokyo = document.getElementById('name6');
    let officeTokyo = document.getElementById('Tokyo_Office');
    placeJapan.onmouseover = nameTokyo.onmouseover = officeTokyo.onmouseover = function () {
        mouseOverEvent('.japan');
    }
    placeJapan.onmouseout = nameTokyo.onmouseout = officeTokyo.onmouseout = function () {
        mouseOutEvent('.japan');
    }
}
