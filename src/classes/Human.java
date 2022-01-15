package classes;

import interfaces.Postable;
import interfaces.ThingThatIsAbleToPost;

import java.util.ArrayList;

public class Human implements Postable {
    protected String name;
    private ArrayList<Postable> subscribers = new ArrayList<>();
    public Human(String name) {
        this.name = name;
    }
    @Override
    public Post post(ThingThatIsAbleToPost ttiatp) {
        int seers =  subscribers.size();
        Post a = new Post(this);
        System.out.println("Приют домашний запостил фотографию " +ttiatp.getName()+" и этот пост увидело" + seers);
        return a;
    }
    @Override
    public  void repost(Post post) {
        for(Postable i : subscribers)
        {
            if(  Math.random() > 0.1 && !post.getPoster().getSubscribers().contains(i))
            {
                i.subscribe(post.getPoster());
            }
        }
    }
    @Override
    public void subscribe(Postable a)
    {
            a.setSubscriber(this);
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setSubscriber(Postable a)
    {
        subscribers.add(a);
    }
    @Override
    public ArrayList<Postable> getSubscribers() {
        return subscribers;
    }
}
