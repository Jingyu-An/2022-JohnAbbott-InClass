/*    JavaScript 
      Project 02-02

      Application to test for completed form
      Author: Jingyu An
      Date:   2022-08-02

      Filename: project02-02.js
 */

function verifyForm() {

    let name;
    let email;
    let phone;

    name = document.getElementById('name').value;
    email = document.getElementById('email').value;
    phone = document.getElementById('phone').value;

    if ((name !== "" && email !== "" && phone !== "")) {
        window.alert('Thank you!')
    } else {
        window.alert('Please fill in all fields')
    }
}

document.getElementById('submit').addEventListener("click", verifyForm)