class increasesize{
    /**
     * @param args
     */
    public static void main (String args[])
    {
        int A[]={5,7,8,9,3,5};
        System.out.println( A.length);
        int B[]=new int[2*A.length];
      A=B;
      B=null;
      System.out.println(A.length);
    }

}