/**
 * Created by deric on 05.05.2017.
 */
public class GreenCat extends Cat {

    public GreenCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void mew() {
        System.out.println("Meew, I'am Green cat " + name + " " + age );

    }
}
