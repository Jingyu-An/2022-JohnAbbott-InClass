/*
const submitName = (event) => {
    event.preventDefault();
    const name_input = document.getElementById('name_input');
    console.log(name_input);
    const name = name_input.value; // change to name_input.value;
    console.log(name);
    const character_array = name.split("");
    const reversed_characters_array = character_array.reverse();
    const reversed_name = reversed_characters_array.join("");
    document.getElementById('reversed_name').innerHTML = reversed_name;

}
*/

 // using debbuger 
 const submitName = (event) => {
    event.preventDefault();
    const name_input = document.getElementById('name_input');
    debugger;
    const name = name_input.value;
    debugger;
    const character_array = name.split("");
    const reversed_characters_array = character_array.reverse();
    const reversed_name = reversed_characters_array.join("");
    document.getElementById('reversed_name').innerHTML = reversed_name;

 }

 /*
 const submitName = (event) => {
    event.preventDefault();
    const name_input = document.getElementById('name_input');
    const name = name_input.value;
    console.log(name);
    const character_array = name.split("");
    const reversed_characters_array = character_array.reverse();
    const reversed_name = reversed_characters_array.join("");
    document.getElementById('reversed_name').innerHTML = reversed_name;
}

*/