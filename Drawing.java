package test;

//QUESTION 2
import java.util.List;
import java.util.ArrayList;

public class Drawing { 
  public String[] colours; 
  public String[] shapes; 
  
  public static class Art { 
    public String colour; 
    public String shape; 
    public Art(String colour, String shape) { 
      this.colour = colour; 
      this.shape = shape; 
    } 
  }
//The following method should be named Drawing instead of IceCreamMachine 
public Drawing(String[] colours, String[] shapes) 
    { 
    this.colours = colours; 
    this.shapes = shapes;    
    }
  
  public List<Art> mix() { 
    List<Drawing.Art> result = new ArrayList<>();
      for (String i: colours){
        for(String j: shapes){
          result.add(new Drawing.Art(i,j));
          }
        }
        //throw new UnsupportedOperationException("Waiting to be implemented"); 
        return result;
    }

public static void main(String[] args) { 
  Drawing draw = new Drawing (new String[]{ "red", "blue" }, new String[]{ "circle" }); 
  List<Art> mixes= draw.mix(); 
  /* * Should print: 
  * red, circle 
  * blue, circle */ 
    for (Art art: mixes) { 
    System.out.println(art.colour + ", " + art.shape); 
    } 
  }
}
