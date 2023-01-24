public class ArrayPresent {
    public static void main(String[] args) {
        
    int n = 70;
    boolean present = false;
    int [] a = {20,10,40,50,60};
   


    for(int i=0;i<a.length;i++)
    {
        if(n== a[i]){
           present = true;
        }
    }

    System.out.println(present);

    }
}
