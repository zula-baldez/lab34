package interfaces;

import classes.Post;

import java.util.ArrayList;

public interface Postable {
    ArrayList<Postable> getSubscribers();
    void repost(Post post);
    Post post(ThingThatIsAbleToPost ttiatp);
    void subscribe(Postable a);
    void setSubscriber(Postable a);
    String  getName();
}
