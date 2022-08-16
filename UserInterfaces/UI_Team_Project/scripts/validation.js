function subscribeValidation() {
    if (!checkInput("fullName")){
        return false;
    } else if (!checkInput("email")) {
        return false;
    }
    alert("Thanks for subscribe!")
    return true;
}

function careerValidation() {
    if (!checkInput("first_name")){
        return false;
    } else if (!checkInput("last_name")) {
        return false;
    } else if (!checkInput("email")) {
        return false;
    } else if (!checkInput("phone")) {
        return false;
    } else if (!checkSelect("citySelect")) {
        return false;
    } else if (!checkSelect("jobCategorySelect")) {
        return false;
    } else if (!checkSelect("jobTypeSelect")) {
        return false;
    } else if (!checkForFileNull()) {
        return false;
    } else if (!checkCheckbox("workPlace[]")) {
        return false;
    } else if (!checkCheckbox("language[]")) {
        return false;
    }
    return true;
}

function supportValidation() {
    if (!checkInput("fullName")) {
        return false;
    } else if (!checkInput("email")) {
        return false;
    } else if (!checkInput("phone")) {
        return false;
    } else if (!checkInput("title")) {
        return false;
    } else if (!checkInput("myEditor")) {
        return false;
    }
    return true;
}

function checkInput(id) {
    let input = document.getElementById(id);

    if (input.value.length === 0) {
        if (id === "fullName" || id === "first_name" || id === "last_name") {
            console.log(id);
            alert("Please enter your name");
        } else if (id === "email") {
            alert("Please enter your email");
        } else if (id === "phone") {
            alert("Please enter your phone number");
        } if (id === "title") {
            alert("Please enter the title");
        } else if (id === "myEditor") {
            alert("Please enter the Description");
        }
        input.focus();
        // If the user hasn't completed the field,
        // changes its background color to yellow
        input.style.background = "yellow";
        return false;
    }

    if (id === "email") {
        let emailCorrectPattern = /^[\w\-\.\+]+\@[a-zA-Z0-9\. \-]+\.[a-zA-z0-9]{2,4}$/;
        if (!(input.value.match(emailCorrectPattern))) {
            alert('Please enter a valid email address');
            input.focus();
            input.style.background = 'lightgreen';
            return false;
        }
    } else if (id === "phone") {
        let phoneCorrectPattern = /^\(?(\d{3})\)?[- ]?(\d{3})[- ]?(\d{4})$/;

        if (!(input.value.match(phoneCorrectPattern))) {
            alert('Please enter a valid Phone number');
            input.focus();
            input.style.background = 'lightgreen';
            return false;
        }
    }
    // After the user completes the field,
    // restores the background color to white
    input.style.background = "white";
    return true;
} // end function checkForLastName

function checkSelect(id) {
    let selectedField = document.getElementById(id);
    if(selectedField.value === ""){
        alert('Please Select a Option');
        selectedField.style.background = "yellow";
        return false;
    }
    selectedField.style.background = "white";
    return true;
}

function checkForFileValidation(){
    let fileField = document.getElementById("formFile");
    let filePath = fileField.value;

    //allowing file type
    let allowExtensions = /(\.doc|\.docx|\.pdf)$/i;

    if(!allowExtensions.exec(filePath)) {
        alert('Invalid file type');
        fileField.style.background = "yellow";
        fileField.value = '';
        return false;
    }
    fileField.style.background = "white";
    return true;
}

function checkForFileNull(){
    let fileField = document.getElementById("formFile");
    let filePath = fileField.value;

    if (filePath.length === 0) {
        alert('Please upload your file');
        fileField.style.background = "yellow";
        return false;
    }

    fileField.style.background = "white";

    return checkForFileValidation();
}

function checkCheckbox(id) {
    let checkbox = document.getElementsByName(id);
    let counter = 0;

    for (let i = 0; i < checkbox.length; i++) {
        if (checkbox[i].checked) {
            counter++;
        }
    }

    if (counter === 0) {
        alert('Please check your prefer options');
        for (let i = 0; i < checkbox.length; i++) {
            checkbox[i].style.scale = '2';
        }
        return false;
    }

    return true;
}