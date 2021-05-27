import { Offer } from "./Offer";


//code here
const baseURL: string = "http://localhost:8080/JobPortal-1.0-SNAPSHOT/api";
let offretable = document.querySelector("#offretable") as HTMLDivElement;
let offreURL:string= baseURL+"/Offer"; 
//const chess = "https://raw.githubusercontent.com/MohamedElhedi-BenYedder/test/main/db.json"
let data = fetch(offreURL).then(
    response =>{
        return response.json().then((data) => {
            data.forEach((d:Offer) => {
                console.log(d);
                
                let offre : Offer =d;
                offretable.innerHTML += `<div class="row"><div class="cell" data-title="Job-Title">${offre.title}</div><div class="cell" data-title="Published">${offre.dateOfPub}</div><div class="cell" data-title="Company">${offre.company}</div><div class="cell" data-title="Location">${offre.location}</div><div class="cell" data-title="More-info"><a href="${offre.originalLink}">More infos ...</a></div></div>`;
                
                
            });
            
            
        }).catch((err) => {
            console.log("loading error!"); 
            
            
        });
    }
)

