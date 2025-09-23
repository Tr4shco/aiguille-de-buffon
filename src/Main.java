import geometrie.Point;
import geometrie.SegmentAgre;
import geometrie.SegmentComp;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(12.0, 14.0);
        SegmentAgre sa = new SegmentAgre(p, 20.4, 30.2);
        SegmentComp sc = new SegmentComp(5, 5, 10, 45);

        System.out.println(p.toString());
        System.out.println(sa.toString());
        System.out.println(sc.toString());
    }
}