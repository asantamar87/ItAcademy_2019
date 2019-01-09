package com.santamaria.aldo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Aldo Santamaria
 */
public class Users {
    
    private String nom;
    private String cognom;
    private String password;
    private Date date_register;
    private List <Video> videos;

    public Users(String nom, String cognom, String password, Date date_register, List<Video> videos) {
        this.nom = nom;
        this.cognom = cognom;
        this.password = password;
        this.date_register = date_register;
        this.videos = videos;
    }

     public Users() {   
        videos = new ArrayList<Video>();
    }
     public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }
    
    public void addVideos(Video videos) {
        this.videos.add(videos);
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDate_register() {
        return date_register;
    }

    public void setDate_register(Date date_register) {
        this.date_register = date_register;
    }

   

    
}
