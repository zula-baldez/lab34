package classes;

import interfaces.Helpable;

public class Journalist extends Human implements Helpable {
    public Journalist(int audienceOutsideTheInternet  , String name)
    {
        super(name);
        this.audienceOutsideTheInternet = audienceOutsideTheInternet;
    }
    private int audienceOutsideTheInternet;

    @Override
    public void help(HomeShelter homeShelter)
    {
        System.out.println(getName()+" каким-то магическим образом помогает");
        homeShelter.buff(0.005*audienceOutsideTheInternet/100);

    }
}
