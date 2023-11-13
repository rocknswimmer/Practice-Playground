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

// most hidden opperations solution
// class Solution {
//         public String removeStars(String s) {
//         StringBuilder res = new StringBuilder();
//         for (char c : s.toCharArray())
//             if (c == '*')
//                 res.setLength(res.length() - 1);
//             else
//                 res.append(c);
//         return res.toString();
//     }
// }

//simple solution/trick to the problem without fancy language functionality
// class Solution {
//     public String removeStars(String s) {
//         String res = "";

//         // Initilizing the count of stars
//         int count = 0;

//         // Traversing backwards for the ease removal of closest non-star character
//         for(int i = s.length()-1; i >= 0; i--)
//         {
//             if(s.charAt(i) != '*' && count == 0)
//             {
//                 res += s.charAt(i);
//             }
//             if(s.charAt(i) == '*')
//             {
//                 count++;
//             }
//             else if(s.charAt(i) != '*' && count != 0)
//             {
//                 count--;
//             }
//         }

//         // Reversing the string
//         String new_str = "";
//         for(int i = 0; i < res.length(); i++)
//         {
//             char ch = res.charAt(i);
//             new_str= ch + new_str;
//         }

//         return new_str;
//     }
// }