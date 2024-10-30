public class PixelSec02
{
    private int x = 0;
    private int y = 0;
    private int maxX = 800;
    private int maxY = 600;

    public PixelSec02()
    {
        x = 0;
        y = 0;
    }

    public PixelSec02(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public PixelSec02(int x, int y, int maxX, int maxY)
    {
        this.x = x;
        this.y = y;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public void setX(int newX)
    {
        if (newX < 0)
        {
            x = 0;
        }
        else if (newX > maxX)
        {
            x = 600;
        }
        else
        {
            x = newX;
        }
    }


    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }


}
