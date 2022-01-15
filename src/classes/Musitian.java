package classes;

import interfaces.Helpable;

public class Musitian extends Human implements Helpable {
    public Musitian(int audienceOutsideTheInternet  , String name)
    {
        super(name);
        this.audienceOutsideTheInternet = audienceOutsideTheInternet;
    }
    private int audienceOutsideTheInternet;
    @Override
    public void help(HomeShelter homeShelter)
    {
        System.out.println(getName()+" каким-то магическим образом помогает");
        homeShelter.buff(0.005);
    }
}
