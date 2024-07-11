class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stackk=new Stack<>();
        for(char i:s.toCharArray()){
            if(i==')'){
                StringBuilder sb = new StringBuilder();
                while(stackk.peek() != '(') {
                    sb.append(stackk.pop());
                }
                stackk.pop();
                for(char c:sb.toString().toCharArray()){
                    stackk.push(c);
                }
            }else{
                stackk.push(i);
            }
        }
        StringBuilder result = new StringBuilder();
        while(!stackk.isEmpty()){
            result.append(stackk.pop());
        }
        return result.reverse().toString();
    }
}