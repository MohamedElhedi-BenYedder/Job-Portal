"use strict";
exports.__esModule = true;
exports.Offer = void 0;
var Offer = /** @class */ (function () {
    function Offer(job, pub, comp, loc, infos) {
        this.title = job;
        this.dateOfPub = pub;
        this.company = comp;
        this.location = loc;
        this.originalLink = infos;
    }
    return Offer;
}());
exports.Offer = Offer;
