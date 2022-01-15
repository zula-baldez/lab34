package classes;

import interfaces.ThingThatIsAbleToPost;

public final class Dog implements ThingThatIsAbleToPost {
    private String name;
    private Gender gender;
    private boolean homeless;

    public Dog(Gender gender, String name, boolean homeless) {
        this.name = name;
        this.gender = gender;
        this.homeless = homeless;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public boolean isHomeless() {
        return homeless;
    }

    public void setHomeless(boolean homeless)
    {
            this.homeless = homeless;
    }
}
