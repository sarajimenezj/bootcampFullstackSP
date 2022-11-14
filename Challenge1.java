import java.util.*;


public class Challenge1 {
  
  // 2.A Random ten Dig Number method
   
  public static String main(String chain) {
        
    int randomnumber = (int) (Math.random() * 100000000);
    
    String result = String.valueOf(randomnumber);
    
    if (chain.equalsIgnoreCase("Type A")) {
    
      result = "54" + result;
      
    } else if (chain.equalsIgnoreCase("Type B")) {
    
      result = "08" + result;
      
    
   } else {
   
      result = "No Valid";
      
    }
    
    return result;
    
  }

    //2.B String of text is contained in given list?
  
  public static boolean ListCheck(String str, List<String> list) {
  
    boolean verify = list.contains(str);
    
    boolean verify_converted = (verify!= true)?false:true;
    
    return verify_converted;
    
  }
}
