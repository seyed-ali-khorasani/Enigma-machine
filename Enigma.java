import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Enigma
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        HashMap<String,String> plugBoardMap=new HashMap<>();
        HashMap<String,String>  rotor1Map=new HashMap<>();
        HashMap<String,String>  rotor2Map=new HashMap<>();
        HashMap<String,String>  rotor3Map=new HashMap<>();
        HashMap<String,String>  reflectorMap=new HashMap<>();
        reflectorMap.put("a","z");
        reflectorMap.put("b","y");
        reflectorMap.put("c","x");
        reflectorMap.put("d","w");
        reflectorMap.put("e","v");
        reflectorMap.put("f","u");
        reflectorMap.put("g","t");
        reflectorMap.put("h","s");
        reflectorMap.put("i","r");
        reflectorMap.put("j","q");
        reflectorMap.put("k","p");
        reflectorMap.put("l","o");
        reflectorMap.put("m","n");
        reflectorMap.put("n","m");
        reflectorMap.put("o","l");
        reflectorMap.put("p","k");
        reflectorMap.put("q","j");
        reflectorMap.put("r","i");
        reflectorMap.put("s","h");
        reflectorMap.put("t","g");
        reflectorMap.put("u","f");
        reflectorMap.put("v","e");
        reflectorMap.put("w","d");
        reflectorMap.put("x","c");
        reflectorMap.put("y","b");
        reflectorMap.put("z","a");
        File file=new File("E:\\DARSI\\data structure\\tamrinat\\EnigmaFile.txt");
    }
}
