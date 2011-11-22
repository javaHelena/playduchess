package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

/**
 * @author : Helena Hjertén
 */

@Entity
public class Comment extends Model {

    public String greeting;
    public String author;


    public Comment(String greeting, String author){
        this.greeting=greeting;
        this.author=author;
    }

}
