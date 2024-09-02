package StringAll;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println(isSame("Nishant","Nishant"));
    }
    
    public static boolean isSame(String q,String w){
        int i;
        if(q.length()==w.length()){
            for(i=0;i<q.length();i++){
                if(q.charAt(i)!=w.charAt(i)){
                    return false;
                }
            }
        }
        else{
            return false;
        }
 return i==q.length()-1;
    }
}
