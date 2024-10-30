public class ObjectsSec03
{
    public static void main(String[] args)
    {
        PixelSec03 name = new PixelSec03();
        System.out.println(name.getX());
        System.out.println(name.getY());

        name.setX(500);
        System.out.println(name.getX());

        PixelSec03 name2 = new PixelSec03(5, 5);
        System.out.println(name2.getX());
        System.out.println(name2.getY());
    }
}
