package eldarchallengeDM.modules;

public class Ejercicio5Array {
   String[] myArray = new String[]{"FristWord", "SecondWord", "THIRDWord", "LeTsGo", "ChallenGE", "HeY"};

   public void validaImprimeArray(){
    if (myArray.length > 10) {
        System.err.println("Error: longitud supera los 10.");
        return;
    }
        
        
    for (String str : myArray) {
        if (!str.matches("[a-zA-Z ]+")) {
            System.err.println("Error: el elemento '" + str + "' contiene caracteres no válidos.");
            return;
        }
    }
              
    String result = String.join(" ", myArray).toLowerCase();
    System.out.println(result);

   }
        
     
   
}
