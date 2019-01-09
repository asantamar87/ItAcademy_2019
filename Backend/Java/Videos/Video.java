package com.santamaria.aldo;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aldo Santamaria
 */
public class Video {

    private URL url;
    private String tittle;
    private List<String> list_tags;

    public Video() {
        list_tags = new ArrayList<String>();
    }
    
    public Video(URL url, String tittle, List<String> list_tags) {
        this.url = url;
        this.tittle = tittle;
        this.list_tags = list_tags;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public List<String> getList_tags() {
        return list_tags;
    }
    public void addTags(String tags) {
    	this.list_tags.add(tags);
    }

    public void setList_tags(List<String> list_tags) {
        this.list_tags = list_tags;
    }

    @Override
    public String toString() {
        // return "Video{" + "url=" + url + ", tittle=" + tittle + ", list_tags=" + list_tags + '}';
        String results = "+";
        for (String d : list_tags) {
            results += d.toString();
        }
        return results;

    }

}
