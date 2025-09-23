package geometrie;

public class SegmentAgre {
    private Point centre;
    private double longueur;
    private double angle;

    public SegmentAgre(Point centre, double longueur, double angle) {
        this.centre = centre;
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
}
