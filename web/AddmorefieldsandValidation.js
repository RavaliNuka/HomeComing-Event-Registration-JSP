/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * 
 
 * 
 */

var count = 0;
var tablelength = 8;
var part = [];
var partContact = [];



window.onload = function () {
    //document.getElementById("addButton").onclick = addParticipant;
    //document.getElementById("removeButton").onclick = removeParticipant;
    document.getElementById("create").onclick = dataValidation;
};


function addorRemoveGroup() {
    var reqPart = document.getElementById("numberofparticipants").value;
    var itr = reqPart - count;
    if (itr >= 1) {
        for (var i = 0; i < itr; i++) {
            addParticipant();
        }
    }
    else {
        itr = Math.abs(itr);
        for (var i = 0; i < itr; i++) {
            removeParticipant();
        }
    }
}

function addParticipant() {
    count++;
    tablelength++;
    var table = document.getElementById("appendfield");
    var lableRow = table.insertRow(tablelength);
    var lcell1 = lableRow.insertCell(0);
    var lcell2 = lableRow.insertCell(1);
    lcell1.innerHTML = "<br><b style=\"font-weight: bold; color: #ffffff;\">Name of the Participant #" + count + ":</b>";
    lcell2.innerHTML = "<br><b style=\"font-weight: bold; color: #ffffff;\">Contact Number #" + count + ":</b>";

    tablelength++;
    var fieldRow = table.insertRow(tablelength);
    var fcell1 = fieldRow.insertCell(0);
    var fcell2 = fieldRow.insertCell(1);
    fcell1.innerHTML = "<input type=\"text\" name=\"participant" + count + "\" id=\"part" + count + "\"/>";
    fcell2.innerHTML = "<input type=\"text\" name=\"participant" + count + "Contact\" id=\"part" + count + "c\"/>";
}



function removeParticipant() {
    var tempdata = document.getElementById("dataFlow");
    tempdata.removeChild(tempdata.lastChild);
    tempdata.removeChild(tempdata.lastChild);
    count--;
    tablelength -= 2;
}


function dataValidation() {

    var userid = document.getElementById("userid").value;
    var password = document.getElementById("pw").value;
    var passwordconfirmation = document.getElementById("pwc").value;
    var glname = document.getElementById("glname").value;
    var glcontact = document.getElementById("glc").value;
    var n = document.getElementById("numberofparticipants").value;

//    if (document.getElementById("numberofparticipants").value === "0") {
//        alert("Select the Number of Participants");
//        return false;
//    }
//    else {
//        for (var index = 0; index < count; index++) {
//            part[index] = document.getElementById("part" + (index + 1)).value;
//            partContact[index] = document.getElementById("part" + (index + 1) + "c").value;
//        }
//    }

    var theme = document.getElementById("theme").value;
//    if(theme === "none"){
//        alert("Select your Participation Theme Name");
//        return false;
//    }
    var desc = document.getElementById("desc").value;

    var setpassword = /^[a-zA-Z0-9].{6,20}$/;
    //The password must contain 7 to 20 characters and must not contain any special characters


    if (userid.length < 1) {
        alert("Please enter your Username!");
        document.getElementById("userid").focus();
        return false;
    }

    else {
        if (password.length < 1 || passwordconfirmation.length < 1) {
            alert("Please enter the password!");
            document.getElementById("pw").value = "";
            document.getElementById("pwc").value = "";
            document.getElementById("pw").focus();
            return false;
        }
        else if (password !== passwordconfirmation && !(setpassword.test(password))) {
            alert("Your passwords did not match!");
            alert("Your password must be between 7 to 20 characters and must not contain special characters");
            document.getElementById("pw").value = "";
            document.getElementById("pwc").value = "";
            document.getElementById("pw").focus();
            return false;
        }
        else if (password !== passwordconfirmation && setpassword.test(password)) {
            alert("Your passwords did not match!");
            document.getElementById("pw").value = "";
            document.getElementById("pwc").value = "";
            document.getElementById("pw").focus();
            return false;
        }
        else if (password === passwordconfirmation && !(setpassword.test(password))) {
            alert("Your password must be between 7 to 20 characters and must not contain special characters");
            document.getElementById("pw").value = "";
            document.getElementById("pwc").value = "";
            document.getElementById("pw").focus();
            return false;
        }

        else {

            if (glname.length < 1) {
                alert("Please enter the name of your group leader!");
                document.getElementById("glname").focus();
                return false;
            }

            else {

                if (glcontact.length < 1) {
                    alert("Please enter the contact number of your group leader!");
                    document.getElementById("glc").focus();
                    return false;
                }
                else if (glcontact.length < 10) {
                    alert("Mobile number must contain 10 characters!. Please verify the mobile number you have entered");
                    document.getElementById("glc").focus();
                    return false;
                }
                else if (glcontact.length > 10) {
                    alert("Please verify the Mobile number you have entered!. It must not exceed 10 characters");
                    document.getElementById("glc").focus();
                    return false;
                }
                else {
                    
                    var flag = 0;
                    if (document.getElementById("numberofparticipants").value === "0") {
                        alert("Select the Number of Participants");
                        return false;
                    }
                    else{
                        for (var index = 0; index < count; index++) {
                            part[index] = document.getElementById("part" + (index + 1)).value;
                            partContact[index] = document.getElementById("part" + (index + 1) + "c").value;
                        }
                        flag = 1;
                    }
                    if(flag === 1) {

                        var flag1 = 0;
                        for (var i = 0; i < count; i++) {
                            if (part[i].length < 1) {
                                alert("Please enter the name of Participant #" + (i + 1));
                                document.getElementById("part" + (i + 1)).focus();
                                return false;
                            }
                            else
                                flag1 = 1;
                        }

                        if (flag1 === 1) {
                            flag2 = 0;
                            for (var i = 0; i < count; i++) {
                                if (partContact[i].length < 1) {
                                    alert("Please enter the contact number of Participant #" + (i + 1));
                                    document.getElementById("part" + (i + 1) + "c").focus();
                                    return false;
                                }
                                else if (partContact[i].length < 10) {
                                    alert("Mobile number must contain 10 characters!. Please verify the mobile number of Participant #" + (i + 1) + " you have entered");
                                    document.getElementById("part" + (i + 1) + "c").focus();
                                    return false;
                                }
                                else if (partContact[i].length > 10) {
                                    alert("Please verify the Mobile number of Participant #" + (i + 1) + " you have entered!. It must not exceed 10 characters");
                                    document.getElementById("part" + (i + 1) + "c").focus();
                                    return false;
                                }
                                else
                                    flag2 = 1;

                            }

                            if (flag2 === 1) {
                                if (theme === "none") {
                                    alert("Select your Participation Theme Name!");
//                                    document.getElementById("theme").focus();  
                                    return false;
                                }
                                else {
                                    if (desc.length < 1) {
                                        alert("Please enter the Description!");
                                        document.getElementById("desc").focus();
                                        return false;
                                    }
                                    else {
                                        if(document.getElementById("tandc").checked !== true){
                                            alert("You must agree to our Terms & Conditions before you create your account!");
                                            return false;
                                        }
                                        else{
                                            return true;
//                                        var partfinal ="";
//                                        var partcontactsfinal = "";
//                                        
//                                        for(var index = 0; index < count; index++){
//                                            if(part[index].length > 1){
//                                                partfinal += part[index] + ":";
//                                            }
//                                            if(partContact[index].length > 1){
//                                                partcontactsfinal += partContact[index] + ":";
//                                            }
//                                        }
//                                        alert(partfinal + "\n" + partcontactsfinal);
//                                        var welcomerequest = new XMLHttpRequest();
//                                        var url = "WelcomeServlet?useridAReq=" + userid + "&passwordAreq=" + password + "&groupleaderAreq=" + glname + "&glcontactAreq=" + glcontact + "&partnamesAreq=" + partfinal + "&partcontactsAreq=" + partcontactsfinal + "&partthemeAreq=" + theme + "&descriptionAreq=" + desc;                                                        
//                                        welcomerequest.open("POST", url, true);
//                                        welcomerequest.send(null);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
































