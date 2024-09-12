import java.util.Arrays;
class array2 
{
    int [][]arr = null;
    public array2(int rowsize, int colsize)
    {   
        arr = new int[rowsize][colsize];
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
            arr[i][j]=Integer.MIN_VALUE;
            }
        }      
    //creation of 2-d arrays      
        /*  arr = new int[3][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[1][0]=3;
        arr[1][1]=4;
        System.out.println(arr);
        System.out.println(Arrays.deepToString(arr));*/
    }

    public void insert(int row, int col, int value)
    {
        try
        {
            if (arr[row][col]==Integer.MIN_VALUE)
            {
                arr[row][col]=value;
                System.out.println("value inserted");
            }
            else
            {
                System.out.println("the blcok is occupied");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("the index is invalid");
        }
    }
    public void accessvalue(int row, int col)
    {
        try{
            
            System.out.println("the index of the value is:" + arr[row][col]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("the index is invalid");
        }
    }
    public void traverse(int row, int col)
    {
        int i = 0;
        int j = 0;
        for(i=0; i<arr.length; i++)
        {
            for(j=0; j<arr[i].length; j++)
            {
                System.out.println(arr[i][j]);
            }
        }
        // System.out.println("the values of array are "+ c);
    }
    public void search(int value)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                if(arr[i][j]==value)
                {
                    System.out.println("the index of the value to be searched is: " + i +"," + j);
                    return;//if not kept it will execute the last sop statement also
                }
            }
        }
        System.out.println("the value is not found");
    }
    public void delete(int row, int col)
    {
        try
        {
            System.out.println("the value is deleted" + arr[row][col]);
            arr[row][col]=Integer.MIN_VALUE;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("the index is out of bounds");
        }
    }
    public static void main(String[] args)
    {
        array2 obj = new array2(2,2);
        obj.insert(0,0,13);
        obj.insert(0,1,14);
        obj.insert(1,0,12);
        obj.insert(1,1,11);
        System.out.println(Arrays.deepToString(obj.arr));
        // obj.accessvalue(1, 0);
        // obj.accessvalue(0, 1);
        // obj.traverse(3, 3);
        obj.search(12);
        obj.delete(1,1);
        System.out.println(Arrays.deepToString(obj.arr));
    }
}