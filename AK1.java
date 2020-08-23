import java.util.ArrayList;
import java.util.Scanner;

public class AK1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputOne = scanner.nextLine();
        String inputTwo = scanner.nextLine();
        int value = calculateNumbers(inputOne,inputTwo);
        displayAnswer(value);
    }
    public static int calculateNumbers(String firstIP, String secondIP){
        char[] nameOne = firstIP.toCharArray();
        char[] nameTwo = secondIP.toCharArray();
        int countOne=0,countTwo=0;
        for(int i=0;i<nameOne.length;i++)
        {
            for(int j=0;j<nameTwo.length;j++)
            {
                if(nameTwo[j]!='1' && nameOne[i]==nameTwo[j])
                {
                    nameTwo[j] = '1';
                    countTwo++;
                    break;
                }
            }
        }

        return (nameOne.length - countTwo) + (nameTwo.length - countTwo);
    }
    public static void displayAnswer(int numbers){
        ArrayList<String> flames = new ArrayList<String>();
        flames.add("Friends");
        flames.add("Love");
        flames.add("Affection");
        flames.add("Marriage");
        flames.add("Enemy");
        flames.add("Sister");
        int placement = 0;
   
        while(flames.size()!=1){
            for(int i=0;i<numbers-1;i++){
                placement = (placement+1)% (flames.size());
            }
            flames.remove(placement);
        }
        System.out.println(flames.get(0));
    }
}
