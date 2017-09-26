package com.uy.mycustomlistview;

/**
 * Created by ASUS-PC on 9/14/2017.
 */

public class AndroidVersion {
    int logo;
    String codename, version, api, date;

    public AndroidVersion(int logo, String codename, String version, String api, String date) {
        this.logo = logo;
        this.codename = codename;
        this.version = version;
        this.api = api;
        this.date = date;
    }

    public int getLogo() {
        return logo;
    }

    public String getCodename() {
        return codename;
    }

    public String getVersion() {
        return version;
    }

    public String getApi() {
        return api;
    }

    public String getDate() {
        return date;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
