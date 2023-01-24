public class ArrayOcurrence {
  
    public static void main(String[] args) {
        
        int n = 40;
        int count = 0;

        int [] array = {20,40,10,60,10,20,40,40};

        for(int i=0;i<array.length;i++){
            if(n == array[i]){
                count++;
            }
           
        }

        System.out.println(n + " is " + count + " times present in the array ");
    }
}
