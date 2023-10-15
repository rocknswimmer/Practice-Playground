import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());                // Reading input from STDIN

        for(int i = 0; i < tests; i++){
            int rounds = Integer.parseInt(br.readLine());
            String monsterList = br.readLine();
            String[] monsters = monsterList.split(" ");
            List<Integer> battleField = new ArrayList<Integer>();
            battleField.add(Integer.parseInt(monsters[0]));
            String results = "" + battleField.size();
            //System.out.println(battleField.size());
            //System.out.println(monsters[0]);
            for(int j = 1; j < monsters.length; j++){
                int currentMonster = Integer.parseInt(monsters[j]);
                if(currentMonster >= battleField.get(0)){
                    battleField.clear();
                    battleField.add(currentMonster);
                } else if(currentMonster < battleField.get(battleField.size() - 1)){
                    battleField.add(currentMonster);
                } else {
                    int indexMatch = battleField.indexOf(currentMonster);
                    if(indexMatch == -1){
                        //System.out.println("-1 not found");
                        int start = 0;
                        int end = battleField.size() - 1;

                        while(start <= end){
                            int mid = (start + end) / 2;

                            if(battleField.get(mid) > currentMonster){
                                start = mid + 1;
                            } else {
                                end = mid - 1;
                            }
                        }
                        battleField = battleField.subList(0, end + 2);
                    } else{
                        battleField = battleField.subList(0, indexMatch + 1);
                    }
                }

                //System.out.println(battleField.size());
                results = results + " " + battleField.size();
            }
            System.out.println(results);
        }
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        //container should be sorted greatest to smallest by entering monsters, if you find a value equal or smaller than the
        //current monster, get rid of all the rest on the field

        //battle field array starts with first element
        // before loop print 1 since will be looping through tests
        // for loop starts at 1 since first monster always counts
    }
}
