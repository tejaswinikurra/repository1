class Array
{
    int arr[] = null;
    public Array(int sizeofarr)
    {
        arr = new int[sizeofarr];
        for(i=0; i<arr.length; i++)
        {
            arr[i]=Integer.MIN_VALUE;
        }
    }
        public void insert(int adress, int numbertobeinserted)
        {
        try{
            if (arr(adress) == Integer.MIN_VALUE)
            {
                arr[adress]=numbertobeinserted;
                System.out.println("sucessfully insterted");
            }
            else
            {
                System.out.println("the cell is already occupied");
            }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("the index is out of bounds");/*The exception message "the cell is already occupied" in your code will be printed
                                                                   when you try to insert a number into an array position (address) that already contains 
                                                                   a value other than Integer.MIN_VALUE*/
            }
        }
    public static void main(String[]args)
    {
        Array arr = new Array(3);
        arr.insert(0, 2);
        arr.insert(1, 3);
        arr.insert(2, 4);
    }
}
