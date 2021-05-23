class Offre {
  jobTitle: string;
  published: string;
  company: string;
  location: string;
  moreInfos: string;
  constructor(
    job: string,
    pub: string,
    comp: string,
    loc: string,
    infos: string
  ) {
    this.jobTitle = job;
    this.published = pub;
    this.company = comp;
    this.location = loc;
    this.moreInfos = infos;
  }
}
let date = new Date(2021, 5, 25);
let offretable = document.querySelector("#offretable") as HTMLDivElement;
let offre1 = new Offre("backend", "2021-05-25", "telnet", "LacII,Tunis", "#");
console.log(offre1.jobTitle);

offretable.innerHTML += `<div class="cell" data-title="Job-Title">${offre1.jobTitle}</div><div class="cell" data-title="Published">${offre1.published}</div><div class="cell" data-title="Company">${offre1.company}</div><div class="cell" data-title="Location">${offre1.location}</div><div class="cell" data-title="More-info"><a href="${offre1.moreInfos}">More infos ...</a></div>`;

console.log(offretable.innerHTML);
