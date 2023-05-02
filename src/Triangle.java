
    public class Triangle {
    int a ;
    int b ;
    int c ;

    public void area(){
        int h = (int) Math.sqrt(Math.pow(a,2)-(Math.pow(b,2)/2));
            System.out.println(h);
            System.out.println("S = "+a*Math.pow(h,2));
    }




}
