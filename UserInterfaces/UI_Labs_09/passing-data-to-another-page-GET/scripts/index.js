function handleSubmit() {
//debugger;
    const first_name = document.getElementById('firstname').value;
    const last_name = document.getElementById('lastname').value;
  //  debugger;
    // to set into local storage
    localStorage.setItem('First_Name', first_name);
 //   debugger;
    localStorage.setItem('Last_Name', last_name);
//    debugger;
    return;
}
