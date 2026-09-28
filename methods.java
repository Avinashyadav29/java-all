public class methods {
      static int logic(int X, int Y){
        int Z;  
        if(X>Y){
            Z=X+Y;
        }
        else{
            Z=(X-Y)*5;
        }

        return Z;


    }
        
public static void main(String[] args) {
    int a =5;
    int b =7;
    int c ;
    c = logic(a,b);
    int a1 = 6;
    int b1=7;
    int c1;
    c1= logic(a1, b1);

    
    ;
    System.out.println(c);
    System.out.println(c1);
}
}

