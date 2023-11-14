class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int minSum = 0;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> startingCombo = newArrayList<Integer>();

        for(int whole = 0; whole < k; whole++){
            minSum = minSum + whole + 1;
            //startingCombo.add(whole + 1);
        }
        if(n < minSum){
            return result;
        }

        //inner recursion time?
        public static void comboGenerator(List<Integer> combo, int comboSum) {
            if(combo.size() == 0){
                //?
            } else{
                // add to combo
            }


            if(combo.size() == k && comboSum == n){
                result.add(combo);
            }
            if(combo.size() == k){
                return;
            }



        }

        comboGenerator(startingCombo, minSum)




        return result;
    }
}