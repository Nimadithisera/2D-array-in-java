
//IT21190216import java.util.Random;

public class RandNum{

  int arr[][] = new int[5][5];

  Random rand = new Random();

  int s = 0;
  int mx = 0;
  double avg = 0.00;
  int min;

  RandNum(){
    for( int i =0; i < 5; i++)
    {
       System.out.println("");
      for(int j=0; j < 5; j++)
      {
        int n = rand.nextInt(100);
        arr[i][j] = n;
        System.out.print(arr[i][j]+" ");
        
      }
    }
    System.out.println("");
  }
  public void MaxMnAvg(){

   min= arr[0][0];

  for( int i =0; i < 5; i++)
    {
       System.out.print("");
      for(int j=0; j < 5; j++)
      {
        if (mx < arr[i][j]){
          mx = arr[i][j];
        }
        if(min > arr[i][j]){
          min = arr[i][j];
        }

        s =+ arr[i][j];
      }

      
    }
  avg = s/25.0;
}

  public void Display(){
    System.out.println("maximum is :"+mx );
    System.out.println(" Minimum is :"+min );
    System.out.println(" Avarage is :"+avg);
  }
  
}