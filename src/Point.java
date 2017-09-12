public class Point{
    private int x;
    private int y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public double ppdistance(Point p){
        return Math.sqrt(Math.pow(x - p.getX(),2)+Math.pow(y - p.getY(),2));
    }
    public Point move(int x,int y){
        return new Point(this.x + x,this.y + y);
    }
    public String toString(){
        return "("+x+","+y+")";
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}