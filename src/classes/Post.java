package classes;

import interfaces.Postable;

public class Post{
    private Postable poster;
    public Post(Postable poster){
        this.poster = poster;
    };
    Postable getPoster()
    {
        return poster;
    }
}
