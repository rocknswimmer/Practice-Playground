class Solution {
    public String removeStars(String s) {
        String combined = s.substring(0);
        int starAt = combined.indexOf("*");

        while (starAt != -1) {
            String front = "";
            String behind = "";
            int combined

            if(starAt == 1){ // promised opperation always possible so lowest * index is 1
                if(combined.length() > 2){
                    combined = combined.substring(2);
                } else {
                    combined = "";
                }
            } else {
                front = combined.substring(0, starAt - 1);
                if(starAt == combined.length() - 1){
                    behind = ""; // probably redundant but just to be safe
                } else {
                    behind = combined.substring(starAt + 1);
                }
                combined = front + behind;
            }


            starAt = combined.indexOf("*");
        }
        return combined;
    }
}