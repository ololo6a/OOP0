/**
 * Created by Администратор on 28.07.2016.
 */
public class Fraction {
        // x / y


    private long x;
    private long y;

    public long getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public long getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    Fraction(long x, long y ){
        this.x = x ;
        this.y = y;
    }

    public void print(){
        System.out.println(x+"/"+y);
    }


    public Fraction add(Fraction a ){
        Fraction res = new Fraction(a.getX()+x,a.getY()+y);

        x+=a.getX();
        y+=a.getY();

        return res;
    }

    public Fraction mult(double d) {

        long dx=0;
        long dy=1;

        while ( (double)(d - (double)(int)(d))  > 0.000001 ){
            dy*=10;
            d*=10;
            if (dy > 10000000000000000L) break;
        }

        dx=(long) d;
        Fraction res = new Fraction(dx * x,dy*y);
        x*=dx;
        y*=dy;

        return res;
    }

    public Fraction dev(double d) {

        long dx=0;
        long dy=1;

        while ( (double)(d - (double)(int)(d))  > 0.000001 ){
            dy*=10;
            d*=10;
            if (dy > 10000000000000000L) break;
        }

        dx=(long) d;
        Fraction res = new Fraction(dy * x, dx*y);
        x*=dy;
        y*=dx;

        return res;
    }

    public static void main(String[] args) {
        Fraction d = new Fraction(1,5);
        d.print();

        d.mult(0.5);
        d.print();
        d.dev(0.5);
        d.print();
        // не производится сокращение дроби


    }
}
