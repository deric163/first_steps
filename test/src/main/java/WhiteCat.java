/**
 * Created by deric on 05.05.2017.
 */
public class WhiteCat extends Cat {
    public WhiteCat(String name, int age) {
        super(name, age);
    }


    @Override
    public void mew() {
        System.out.println("Meew, I'am White cat " + name + " " + age);

    }
}