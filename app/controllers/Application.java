package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        List comments = Comment.findAll();
        String header = "Duchess Meeting 22 nov";

        render(comments, header);
    }


    public static void add(String greeting, String author){
        Comment comment = new Comment(greeting, author);
        comment.save();
        index();
    }


}