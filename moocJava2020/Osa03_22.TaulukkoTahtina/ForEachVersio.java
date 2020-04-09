class ForEachCommaVersio { 
  
    public static void main(String args[])
    { 
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 }; 

        for(int i : arr) {
          // Vau, pyhä minimaalisuus
          System.out.print((i+", ")+i);
        }
    } 
}
