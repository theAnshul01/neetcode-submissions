class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }

        String reverse = new StringBuilder(sb).reverse().toString();

        System.out.println("reverse: " + reverse);
        System.out.println("forward: " + sb.toString());

        return sb.toString().toLowerCase().equals(reverse.toLowerCase());
    }
}
