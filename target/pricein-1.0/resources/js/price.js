/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function myFunction(){
    var x= document.getElementById("js-menu");
    if(x.className==="main-nav"){
        x.className +="responsive";
    } else{
        x.className="main-nav";
    }
}

