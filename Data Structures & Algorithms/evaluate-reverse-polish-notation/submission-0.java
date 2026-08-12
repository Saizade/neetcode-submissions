class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>mystack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
        String token=tokens[i];
        if(token.equals("+")){
            int second=mystack.pop();
            int first=mystack.pop();
            mystack.push(first+second);
        }
         else if (token.equals("-")) {

                int second = mystack.pop();
                int first = mystack.pop();

                mystack.push(first - second);

            } 
            else if (token.equals("*")) {

                int second = mystack.pop();
                int first = mystack.pop();

                mystack.push(first * second);

            } 
            else if (token.equals("/")) {

                int second = mystack.pop();
                int first = mystack.pop();

                mystack.push(first / second);
            }
            else{
                int num=Integer.parseInt(token);
                mystack.push(num);
            }
        }
        return mystack.pop();
    }
}
