public class PixelSec01
{
    private int x = 0;
    private int y = 0;

    public PixelSec01()
    {
        x = 0;
        y = 0;
    }

    public PixelSec01(int x, int y)
    {
        setX(x);
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setX(int newX)
    {
        if (newX < 0)
        {
            x = 0;
        }
        else if (newX > 800)
        {
            x = 800;
        }
        else
        {
            x = newX;
        }
    }
}
