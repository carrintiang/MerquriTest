package test; 

//QUESTION 1
//As the comment said to print 45, i have changed the getFinalSpeed method to return int instead of double

public class GamePlatform { 
    public static int getFinalSpeed(double initialSpeed, int[] inclinations) { 
        for (double i: inclinations) {
            initialSpeed -= i;
        }
        int iniSpeed = (int) initialSpeed;
        return iniSpeed;
        //throw new UnsupportedOperationException("Waiting to be implemented."); 
        } 
  public static void main(String[] args){ 
    System.out.println(getFinalSpeed(60.0, new int[] { 0, -30, 0, 45, 0 })); 
    //should print 45 
  } 
}
