package geometrie;

public class SegmentComp {
    private Point centre;
    private double longueur;
    private double angle;

    public SegmentComp(double centreX, double centreY, double longueur, double angle) {
        this.centre = new Point(centreX, centreY);
        this.longueur = longueur;
        this.angle = angle;
    }

    public Point getCentre() {
        return this.centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getLongueur() {
        return this.longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getAngle() {
        return this.angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    @Override
    public String toString(){
        return new String("SegmentComp : centre = " + getCentre().toString()
                + " longueur = " + getLongueur()
                + " angle = " + getAngle());
    }
}
