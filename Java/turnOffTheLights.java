import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lenYK = br.readLine();  // Reading input from STDIN
        String[] tempTup = lenYK.split(" ");
        int len = Integer.parseInt(tempTup[0]);
        int k = Integer.parseInt(tempTup[1]);
        int l = 1;
        String bulbs = br.readLine();//.split(" ");

        //System.out.println(len);
        //System.out.println(k);

        //System.out.println(bulbs);
        //System.out.println(bulbs.lastIndexOf("1"));

        if(len == k){
            System.out.println(l);
            return;
        }
        if(k == 1){
            int first = bulbs.indexOf("1");
            int last = bulbs.lastIndexOf("1");
            l = last - first + 1;
            System.out.println(l);
            return;
        }

        String[] bulbsArr = bulbs.split("");

        while(l < len){
            int opperations = 0;
            for(int i = 0; i < len; i++){
                if(bulbsArr[i].equals("1")){
                    opperations++;
                    i = i + l - 1;
                }
            }

            //System.out.println(l);
            //System.out.println(opperations);
            if(opperations <= k){
                System.out.println(l);
                return;
            }
            l++;
        }
        //System.out.println(l);    // Writing output to STDOUT
    }
}
