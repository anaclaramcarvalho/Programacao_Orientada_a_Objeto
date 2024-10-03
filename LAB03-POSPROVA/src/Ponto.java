public class Ponto {
    private double x;
    private double y;

    public Ponto(double x1,double y1){
        x = x1;
        y = y1;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public void setX(double x1){
        this.x = x1;
    }
    public void setY(double y1){
        this.y = y1;
    }

    @Override
    public String toString(){
        return "Ponto(" + "x= " + x + ", y= " + y + ')';
    }
}
