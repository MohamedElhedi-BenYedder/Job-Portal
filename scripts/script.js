"use strict";
exports.__esModule = true;
//code here
var baseURL = "http://localhost:8080/JobPortal-1.0-SNAPSHOT/api";
var offretable = document.querySelector("#offretable");
var offreURL = baseURL + "/Offer";
//const chess = "https://raw.githubusercontent.com/MohamedElhedi-BenYedder/test/main/db.json"
var data = fetch(offreURL).then(function (response) {
    return response.json().then(function (data) {
        data.forEach(function (d) {
            console.log(d);
            var offre = d;
            offretable.innerHTML += "<div class=\"row\"><div class=\"cell\" data-title=\"Job-Title\">" + offre.title + "</div><div class=\"cell\" data-title=\"Published\">" + offre.dateOfPub + "</div><div class=\"cell\" data-title=\"Company\">" + offre.company + "</div><div class=\"cell\" data-title=\"Location\">" + offre.location + "</div><div class=\"cell\" data-title=\"More-info\"><a href=\"" + offre.originalLink + "\">More infos ...</a></div></div>";
        });
    })["catch"](function (err) {
        console.log("loading error!");
    });
});
