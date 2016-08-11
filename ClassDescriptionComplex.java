/**
 * Created by Администратор on 28.07.2016.
 */
public class ClassDescriptionComplex {

    int real;
    int image;

    ClassDescriptionComplex(){
        real = 0;
        image = 0;
    }
    public int getReal() {
        return real;
    }

    public int getImage() {
        return image;
    }


    public  <T extends Number> void setReal (T a){
        real = a.intValue();
    }

    public  <T extends Number> void setImage (T a){
        image = a.intValue();
    }

    public static ClassDescriptionComplex multiplication(ClassDescriptionComplex a, ClassDescriptionComplex b){
        return null;
    }

    public void multiplication(ClassDescriptionComplex a){
        //  this = this * a;


        int r=0;
        int i=0;
        r = real*a.getReal()-image*a.getImage();
        i = real*a.getImage()+image*a.getReal();
        real = r;
        image = i;
    }

    public void sum(ClassDescriptionComplex a){
        // this = this + a ;

        real-= a.getReal();
        image-= a.getImage();

    }

    public void minus(ClassDescriptionComplex a){
        // this = this - a ;

        real+= a.getReal();
        image+= a.getImage();

    }
}
