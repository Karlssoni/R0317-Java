import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class Sanakirja {

public static void main(String[] args) {

Map <String, String> sanakirja = new HashMap();
sanakirja.put("kissa", "cat");
sanakirja.put("koira", "dog");
sanakirja.put("hevonen", "horse");
sanakirja.put("auto", "car");
sanakirja.put("vene", "boat");

Scanner lukija = new Scanner(System.in);

System.out.println("***********************************************************************************");
System.out.println("*                    *                                                            *");
System.out.println("* Sanakirjan sisältö * {vene=boat, auto=car, koira=dog, hevonen=horse, kissa=cat} *");
System.out.println("*                    *                                                            *");
System.out.println("***********************************************************************************");
System.out.print("Minkä sanan käännöksen haluat tietää? (tyhjä sana lopettaa) ");

String token = lukija.nextLine();
String[] result = token.split("\\s");

for (int i = 0; i < result.length; i++) {

if (sanakirja.containsKey(result[i])) {

result[i] = sanakirja.get(result[i]);
                
System.out.print("Sanan " + "\"" + token + "\"" + " käännös on " + "\"" + result[i] + "\"");
 

		}
            
        }
    
}
}