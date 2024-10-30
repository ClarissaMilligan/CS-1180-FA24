public class ObjectsSec02
{
    public static void main(String[] args)
    {
        PixelSec02 name = new PixelSec02();
        System.out.println(name.getX());
        System.out.println(name.getY());

        PixelSec02 name2 = new PixelSec02(5, 5);
        System.out.println(name2.getX());
        System.out.println(name2.getY());

        name2.setX(-10);
        System.out.println(name2.getX());
    }
}
