package tn.JobPortal.RestEasy.JobFinder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import tn.JobPortal.RestEasy.Model.Offer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TanitJobFinder extends JobFinder {
        public TanitJobFinder()
    {
        webSite = new WebSite("TanitJob","https://www.tanitjobs.com");
    }

    public void collectOnePage(String url,int pageIndex) throws IOException {
        final String pageUrl = url + "/?searchId=1621293040.6756&action=search&page=" + pageIndex;
        final Document document = Jsoup.connect(pageUrl).get();
        List<Offer> JobPage = new ArrayList<>();
        for (Element article : document.select("article")) {

            final String jobTitle = article.select("div.media-heading.listing-item__title").text();
            final String dateOfPublishing = article.select("div.media-right.text-right div.listing-item__date").text();
            final String jobOriginalLink = article.select("div.media-right.text-right a").attr("href");
            final String company = article.select("span.listing-item__info--item.listing-item__info--item-company").text();
            final String jobLocation = article.select("span.listing-item__info--item.listing-item__info--item-location").text();
            final Offer offer = new Offer(jobTitle, dateOfPublishing, jobOriginalLink, company, jobLocation);
            JobPage.add(offer);
            Jobs.addAll(JobPage);
            System.out.println(jobTitle + "   " + dateOfPublishing + "    " + jobOriginalLink + "      " + company + "       " + jobLocation);

        }
        System.out.println("---------page"+pageIndex+" : is done");
    }

    @Override
    public void collectData() {
        final String url = webSite.getUrl()+"/jobs";
        final int postPerPage =20;
        try{
            final Document firstDocument = Jsoup.connect(url).get();
            final String announcesNumber = firstDocument.select("h1.search-results__title.col-sm-offset-3.col-xs-offset-0").text().split(" ")[0];
            final int pageNumber = (int) Math.ceil(Integer.parseInt(announcesNumber)/postPerPage);
            for (int i =1;i < pageNumber+1;i++){
                collectOnePage(url,i);

                }

            } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        System.out.println("---------last Page ----------------");
    }

}
