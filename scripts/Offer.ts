export class Offer {
    title: string;
    dateOfPub: string;
    company: string;
    location: string;
    originalLink: string;
    constructor(
        job: string,
        pub: string,
        comp: string,
        loc: string,
        infos: string
    ) {
        this.title = job;
        this.dateOfPub = pub;
        this.company = comp;
        this.location = loc;
        this.originalLink = infos;
    }
}