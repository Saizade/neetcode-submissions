class Solution {
    public boolean isValid(String s) {
        Stack<Character> mystack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                mystack.push(ch);
            }
            else{
                if(mystack.isEmpty()){
                    return false;
                }
                char top=mystack.peek();
                if(ch==')'&&top!='('||
                ch==']'&&top!='['||
                ch=='}'&&top!='{'
                ){
                    return false;
                }
                mystack.pop();

                }
            }
            return mystack.isEmpty();
        }
    }
