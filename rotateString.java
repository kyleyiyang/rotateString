class Solution {
    public boolean rotateString(String A, String B) {
        if (A.length() != B.length()) return false;
        if (A.length() == 0 && B.length() == 0) return true;
        for (int i=0;i<A.length();i++) {
            if (A.substring(i).equals(B.substring(0,B.length()-i)) && A.substring(0,i).equals(B.substring(B.length()-i))) {
                return true;
            }
        }
        return false;
    }
}
