package tn.JobPortal.RestEasy.JobFinder;
public class LinkedInFinder extends JobFinder{
    public LinkedInFinder()
    {
        webSite = new WebSite("LinkedIn","https://www.linkedin.com");
    }
    private void initDriver()
    {

    }
    final static String WebDriverLocalPath="";

    @Override
    public void collectData() {

    }
}
