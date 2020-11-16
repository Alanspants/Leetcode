package Simple_14;

public class offSolution {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"flower", "flow", "flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.equals(null) || strs.length == 0) return "";
        int minLength = Integer.MAX_VALUE;
        for (String s : strs) {
            minLength = Math.min(s.length(), minLength);
        }
        int low = 0, high = minLength;
        while (low < high) {
            int mid = (high - low + 1) / 2 + low;
            if(isPrefixCommon(strs, mid)){
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        return strs[0].substring(0, low);
    }

    public static boolean isPrefixCommon(String[] strs, int length){
        String str = strs[0].substring(0, length);
        for(int i = 0; i < strs.length; i++){
            for(int j = 0; j < length; j++){
                if(strs[i].charAt(j) != str.charAt(j)) return false;
            }
        }
        return true;
    }
}
