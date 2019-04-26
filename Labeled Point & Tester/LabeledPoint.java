import java.awt.Point;

public class LabeledPoint extends Point {

    public String label;

    public LabeledPoint(int x, int y, String pointLabel)
    {
        super(x,y);
        label = pointLabel;

    }

    public String toString()
    {
        label = label + super.toString().replaceAll(".*t"," ");
        return label;
    }
}