package wiederholung;

public class Schüler {

    private String name;
    private int age;
    private String favoriteIceCream;

    public Schüler(String name, int age, String favoriteIceCream) {
        this.name = name;
        this.age = age;
        this.favoriteIceCream = favoriteIceCream;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public String getFavoriteIceCream() {
        return favoriteIceCream;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", age=" + age +
                ", favoriteIceCream=" + favoriteIceCream;
    }
}
