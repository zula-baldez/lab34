package classes;

import interfaces.Postable;
import interfaces.ThingThatIsAbleToPost;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class HomeShelter extends DogShelter implements Postable {
    private static HomeShelter a;
    private ArrayList<Postable> subscribers = new ArrayList<>();
    private static int fleshmobResult = 0;
    private double chanceOfSuccess = 0.00005;
    private HomeShelter(int capacity, String name) {
        super(capacity, name);
    }

    public static HomeShelter homeShelter(int capacity, String name) {
        if (a == null) {
            a = new HomeShelter(capacity, name);
            return a;

        } else return a;

    }

    @Override
    public Post post(ThingThatIsAbleToPost ttiatp) {
        int seers = subscribers.size();
        Post a = new Post(this);
        try {
            TimeUnit.MILLISECONDS.sleep(200);
        }
        catch (Exception e) {}
        System.out.println("Приют домашний запостил фотографию " + ttiatp.getName() + " и этот пост увидело " + seers +" подписчиков");
        return a;
    }


    public String getName() {
        return name;
    }

    public void startFlashmob() {

        while(true) {

                for (int i = 0; i < dogs.size(); i++) {
                    Post a = post(dogs.get(i));
                    for (int j = 0; j < this.subscribers.size(); j++) {

                    if (Math.random() < chanceOfSuccess) {
                        fleshmobResult++;
                        System.out.println(dogs.get(i).getName() + " нашел свой дом! Его новый хозяин - " + subscribers.get(j).getName());
                        dogs.get(i).setHomeless(false);
                        dogs.remove(i);
                        i--;
                        break;
                    }
                    if (Math.random() < 0.001) {
                        subscribers.get(j).repost(a);
                    }
                }
            }
        }
    }
    public static int getFleshmobResult() {
        return fleshmobResult;
    }
    public void repost(Post post) {
        for(Postable i : subscribers)
        {
            if(  Math.random() < 0.01 && !post.getPoster().getSubscribers().contains(i))
            {
                i.subscribe(post.getPoster());
            }
        }


    }
    public void subscribe(Postable a)
    {
        a.setSubscriber(this);
    }
    public void setSubscriber(Postable a) {
        subscribers.add(a);
    }
    public void buff(double ch) {
        chanceOfSuccess = Math.min(0.0001, ch+chanceOfSuccess);
    }

    @Override
    public ArrayList<Postable> getSubscribers() {
        return subscribers;
    }
}