 class array
{
    //fuction
    static void printarray(int [] a1)
   {
      //int [] a1={1,2,3,4,5};
      for (int i=0; i<a1.length;i++)
      {
        System.out.println(a1[i]);
      }
   }  


   //main 
   public static void main(String[] args) 
   {
    int [] a1={1,2,3,4,5};
    printarray (a1);
   }
}
