// class Solution {
//     public List<List<Integer>> combinationSum3(int k, int n) {
//         int minSum = 0;
//         List<List<Integer>> result = new ArrayList<>();
//         List<Integer> startingCombo = newArrayList<Integer>();

//         for(int whole = 0; whole < k; whole++){
//             minSum = minSum + whole + 1;
//             //startingCombo.add(whole + 1);
//         }
//         if(n < minSum){
//             return result;
//         }

//         //inner recursion time?
//         public static void comboGenerator(List<Integer> combo, int comboSum) {
//             if(combo.size() == 0){
//                 //?
//             } else{
//                 // add to combo
//             }


//             if(combo.size() == k && comboSum == n){
//                 result.add(combo);
//             }
//             if(combo.size() == k){
//                 return;
//             }



//         }

//         comboGenerator(startingCombo, minSum)




//         return result;
//     }
// }

// may need to learn to not use inner rucursion if this is sketchy or too new on a java system since its a java 10+ solution using var

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int minSum = 0;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> startingCombo = new ArrayList<Integer>();

        if(n > 45){
            return result;
        }

        for(int whole = 0; whole < k; whole++){
            minSum = minSum + whole + 1;
            //startingCombo.add(whole + 1);
        }
        if(n < minSum){
            return result;
        }

        var innerRecursion = new Object(){

            public void comboGenerator(List<Integer> comboOrigin, int comboSum) {
            //check phase
            List<Integer> combo = new ArrayList<Integer>(comboOrigin);
            if(combo.size() == k && comboSum == n){
                result.add(combo);
            }
            if(combo.size() == k || comboSum > n){
                return;
            }

            //recusion phase
            if(combo.size() == 0){
                //?
                combo.add(1);
                comboSum += 1;
                while(comboSum <= (10 - k) && comboSum <= n){
                    comboGenerator(combo, comboSum);
                    comboSum++;
                    combo.clear();
                    combo.add(comboSum);
                }

            } else{
                // add to combo
                int previous = combo.get(combo.size() - 1);
                int current = previous + 1;

                while(comboSum + current <= n && current <= (10 - (k - combo.size()))){
                    combo.add(current);
                    comboGenerator(combo, comboSum + current);
                    current++;
                    combo.remove(combo.size() - 1);
                }


            }


        }
        };


        innerRecursion.comboGenerator(startingCombo, 0);




        return result;
    }
}