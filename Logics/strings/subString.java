//programs using substring method

class subString{

    static String rev(String s){
        String res="";
        for (int i = s.length()-1; i >=0 ; i--) {
            res+=s.charAt(i);
        }
        return res;
    }
    public static void main(String[] args) {
        
        String str="MethodOverloading";
        System.out.println(str.substring(0,2));
        System.out.println(str.substring(0,6));
        System.out.println(str.substring(3,6));
        System.out.println(str.substring(6,10));
        System.out.println(str.substring(10,14));
        System.out.println(str.substring(14));
        System.out.println(str.substring(10));
        System.out.println(str.substring(6));
        System.out.println(str.substring(6,14));

        subString s1=new subString();
        String first=str.substring(0,6);
        String last=str.substring(6);
        System.out.println(rev(first)+" "+last);
        System.out.println(first+" "+rev(last));


        char c1=(char)(str.charAt(0)+32);
        char c2=(char)(str.charAt(4)-32);
        System.out.println(c1+str.substring(1,4)+c2);

        char c=(char)(str.charAt(0)+32);
        System.out.println(c+str.substring(1));


        String rev="";

        char c3=(char)(str.charAt(0)+32);
       char c4= (char)(str.charAt(16)-32);
       for(int i=str.length()-2;i>=1;i--){
         rev=rev+str.charAt(i);

       }
       System.out.println(c4+rev+c3);
        String res="";

       //mEtHoD
       String s="method";
       for(int i=0;i<s.length();i++){
        if(i%2==0){
           res=res+ (char)(s.charAt(i)-32);
        }else{
            res+=(char)(s.charAt(i));
        }
        
       }
       System.out.println(res);

    
    String result="";
    for(int i=0;i<s.length();i++){
        if(i%2!=0){
           result=result+ (char)(s.charAt(i)-32);
        }else{
            result+=(char)(s.charAt(i));
        }
        
       }
       System.out.println(result);

    }
}