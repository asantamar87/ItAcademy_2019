package com.santamaria.aldo;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Aldo Santa Maria
 */
public class Main {

    public static void main(String[] args) throws MalformedURLException {

        Video video1 = new Video();
        video1.setTittle("tittle1");
        video1.setUrl(new URL("http://www.example.com/docs/resource1.html"));

        String tags = new String("tag1, tag2, tag3");
        video1.addTags(tags);

        Video video2 = new Video();
        video2.setTittle("titulo2");
        video2.setUrl(new URL("http://www.example.com/docs/resource2.html"));
        String tags2 = new String("tag1, tag2");
        video2.addTags(tags2);

        Users user1 = new Users();
        user1.setNom("Aldo");
        user1.addVideos(video1);
        user1.addVideos(video2);

        for (Video v : user1.getVideos()) {
            System.out.println("User-> " + user1.getNom() + " has ->  " + v.getTittle() + " URL -> " + v.getUrl()
                    + " contains this list of tags ->  " + v.getList_tags());
        }

    }
}
