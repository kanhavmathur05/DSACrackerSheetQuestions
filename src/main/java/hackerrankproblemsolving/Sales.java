package hackerrankproblemsolving;

public class Sales {
    public static void main(String args[])
    {
        int totalNumbers=18;
        int arr[]={10, 20, 20, 10, 10, 30, 50, 10, 20, 44, 44,76,98,2,4,3,44,50};
        int checked=0,count=0;
        int temp;
        for(int i=0;i<totalNumbers;i++)
        {
            if(arr[i]!=0)
            {
                temp=arr[i];
                arr[i]=checked;
                for(int j=i+1;j<totalNumbers;j++)
                {
                    if(temp==arr[j])
                    {
                        arr[j]=checked;
                        count++;
                        break;
                    }
                }
            }
        }

        System.out.println(count);
    }
}




















