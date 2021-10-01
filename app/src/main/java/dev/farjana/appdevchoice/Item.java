package dev.farjana.appdevchoice;

public class Item {
    private int imageId;
    private String imageName;
    private String siteURl;

    public Item(int imageId, String imageName, String siteURl) {
        this.imageId = imageId;
        this.imageName = imageName;
        this.siteURl = siteURl;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getSiteURl() {
        return siteURl;
    }

    public void setSiteURl(String siteURl) {
        this.siteURl = siteURl;
    }

}
