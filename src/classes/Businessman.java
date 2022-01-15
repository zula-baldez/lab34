package classes;

import interfaces.Helpable;

public class Businessman extends Human implements Helpable {
    private int audienceOutsideTheInternet;
    public Businessman(int audienceOutsideTheInternet  , String name)
    {
        super(name);
        this.audienceOutsideTheInternet = audienceOutsideTheInternet;
    }
    @Override
    public void help(HomeShelter homeShelter)
    {
        System.out.println(this.getName()+" Рекламирует приют \"Домашний\"");
        homeShelter.buff(0.005*audienceOutsideTheInternet/100);
    }

}
