import classes.*;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Human[] people = new Human[100010];
        Dog[] dogs = new Dog[1000];
        int i;
        for(i=0; i<10000000*Math.random(); i++)
        {
            people[i] = new Human("random human"+i);
        }
        Businessman businessman = new Businessman(1000, "Роман Абрамович");
        Journalist journalist = new Journalist(100, "Леонид Парфенов");
        Musitian musitian = new Musitian(10, "Дмитрий Маликов");

        people[i] = businessman;
        people[i+1] = journalist;
        people[i+2] = musitian;

        for(int j = 0; j<=i+2; j++)
        {
            for(int q = 0; q<=i+2; q++)


                if(Math.random()<0.15)
                {
                    people[j].setSubscriber(people[q]);
                }

        }
        HomeShelter homeShelter = HomeShelter.homeShelter(100, "Приют домашний");
        for(int m = 0; m<100; m++)
        {
            Dog dog = new Dog(Gender.MALE, "a"+m, true);
            dogs[m] = dog;
            try {
                homeShelter.addDog(dog);
            }
            catch(DogIsNotHomeless|FullShelterException e)
            {
                System.out.println(e.getMessage());
            }
        }
        for(int j = 0; j<=i+2; j++) {
            if (Math.random() < 0.15)
                homeShelter.setSubscriber(people[j]);
        }
        System.out.println(i+3);
        Thread thread = new Time();
        thread.start();
        musitian.help(homeShelter);
        journalist.help(homeShelter);
        businessman.help(homeShelter);
        homeShelter.startFlashmob();

    }
}