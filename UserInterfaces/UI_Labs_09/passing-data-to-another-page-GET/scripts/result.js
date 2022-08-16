window.addEventListener('load', () => {
    //debugger;
    // Via Query parameters - GET
    const params = (new URL(document.location)).searchParams;
  //  debugger;
    const first_name = params.get('firstname');
 //   debugger;
    const last_name = params.get('lastname');
    debugger;




    // Via local Storage
    document.getElementById('result-firstname').innerHTML = first_name;
    debugger;
    document.getElementById('result-lastname').innerHTML = last_name;

    debugger;

});