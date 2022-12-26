import java.io.File;
import java.util.ArrayList;
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
        int rotor1Rotate=0;
        int rotor2Rotate=0;
        int rotor3Rotate=0;
        String date=input.next();
        String plugBoard[]=new String[8];
        String plugBoarsString;
        String rotor1[]=new String[26];
        String rotor1String;
        String rotor2[]=new String[26];
        String rotor2String;
        String rotor3[]=new String[26];
        String rotor3String;
        String text;
        String textSizeArray[]=new String[100];
        try
        {
            Scanner readFile = new Scanner(file);
            while (readFile.hasNextLine())
            {
                if (readFile.nextLine().contains(date)) {
                    plugBoarsString = readFile.nextLine().substring(12, 42);
                    plugBoard = plugBoarsString.split(",");
                    rotor1String = readFile.nextLine().substring(9, 35);
                    rotor1 = rotor1String.split("");
                    rotor2String = readFile.nextLine().substring(9, 35);
                    rotor2 = rotor2String.split("");
                    rotor3String = readFile.nextLine().substring(9, 35);
                    rotor3 = rotor3String.split("");
                    break;
                }
            }
            plugBoardMap=createPlugBoard(plugBoard);
            input.nextLine();
            text=input.nextLine();
            textSizeArray=text.split(" ");
            String textArray[]=new String[text.length()];
            ArrayList<String> textWords=new ArrayList<>();
            ArrayList<String> answer=new ArrayList<>();
            textArray=text.split(" ");
            for (int i = 0; i < textArray.length; i++)
            {
                for (int j = 0; j < textArray[i].length(); j++)
                {
                    textWords.add(textArray[i].substring(j,j+1));
                }
            }
            rotor1Map=createRotor1(rotor1,rotor1Map);
            rotor2Map=createRotor2(rotor2,rotor2Map);
            rotor3Map=createRotor3(rotor3,rotor3Map);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    static HashMap<String,String> createPlugBoard(String[] plugBoard)
    {
        HashMap<String,String> plugBoardMap=new HashMap<>();
        plugBoardMap.put(plugBoard[0].substring(0,1),plugBoard[0].substring(1,2));
        plugBoardMap.put(plugBoard[0].substring(1,2),plugBoard[0].substring(0,1));
        for (int i = 1; i < 8; i++)
        {
            plugBoardMap.put(plugBoard[i].substring(1,2),plugBoard[i].substring(2,3));
            plugBoardMap.put(plugBoard[i].substring(2,3),plugBoard[i].substring(1,2));
        }
        return plugBoardMap;
    }
    static HashMap<String,String> createRotor1(String[] rotor1,HashMap<String,String> rotor1Map)
    {
        int num=0;
        char word;
        for (int i = 97; i < 123; i++)
        {
            word=(char) i;
            rotor1Map.put(String.valueOf(word),rotor1[num]);
            num++;
        }
        return rotor1Map;
    }
    static HashMap<String,String> createRotor2(String[] rotor2,HashMap<String,String> rotor2Map)
    {
        int num=0;
        char word;
        for (int i = 97; i < 123; i++)
        {
            word=(char) i;
            rotor2Map.put(String.valueOf(word),rotor2[num]);
            num++;
        }
        return rotor2Map;
    }
    static HashMap<String,String> createRotor3(String[] rotor3,HashMap<String,String> rotor3Map)
    {
        int num=0;
        char word;
        for (int i = 97; i < 123; i++)
        {
            word=(char) i;
            rotor3Map.put(String.valueOf(word),rotor3[num]);
            num++;
        }
        return rotor3Map;
    }
}
