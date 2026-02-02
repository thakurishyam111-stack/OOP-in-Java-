class FinallyExample {
    public static void main(String[] args){
        
        int[] numbers = { 1, 2, 3 ,4,6};
        try {
            // This will throw ArrayIndexOutOfBoundsException
            System.out.println(numbers[4]);
                                       
        }
        catch (ArrayStoreException e){
            
            System.out.println("Exception caught: " );
        } 
    }
       
}