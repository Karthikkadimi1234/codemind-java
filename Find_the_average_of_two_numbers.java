import java.util.*;
class avg{
    public static void main(String args[]){
        int x,y;
        float c; 
        Scanner sc= new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        c=(float)(x+y)/2;
       // System.out.println(x+"k"+y);
        System.out.format("%.4f",c);
    }
}