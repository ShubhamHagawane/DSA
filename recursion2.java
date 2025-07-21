public class recursion2 {
    // tilling problem
    public static int tilling(int n) { //2 x n (floar size)
        // base case

        if (n==0 || n==1){
            return 1;
        }
        // choice for vertical
        // int fnm1 = tilling(n-1);

        // // choice for horizotal
        // int fnm2 = tilling(n-2);


        // int totalways = fnm1 +fnm2;

        return tilling(n-1) + tilling(n-2);
    }

    // remove dublicate in string 

    public static void removedublicate(String str , int idx , StringBuilder newstr, boolean map[]){
        // base case
        if (idx ==str.length()){
            System.out.println(newstr);
            return;
        }

        // kaam

        char currchar =str.charAt(idx);
        if(map[currchar-'a']==true){
            // duplicate
            removedublicate(str, idx+1, newstr, map);
        }else{
            map[currchar-'a']=true;
            removedublicate(str, idx+1, newstr.append(currchar), map);
        }
    }

    // friends pairing 

    public static int friendspairing(int n){
        if (n==1 || n==2){
            return n;
        }
        // choices 
        // single =
        // int fnm1 = friendspairing(n-1);

        // // pair
        // int fnm2 = friendspairing(n-2);
        // int pairways = (n-1) * fnm2;

        // // total ways 
        // int totalways = fnm1 + pairways;
        
        return friendspairing(n-1) + (n-1)* friendspairing(n-2);
    }

    // print binary string without consicuting ones 

    public static void printbinstring (int n , int lastplace , String str ){
        if (n==0){
            System.out.println(str);
            return ;
        }

        printbinstring(n-1, 0, str+"0");
        if (lastplace==0){
            printbinstring(n-1, 1, str+"1");
        }
    }

     
    public static void main (String args[]){
        // String str = "appnacollege";
        // removedublicate(str, 0, new StringBuilder(""), new boolean[26]);
       printbinstring(3, 0, "");
    }
}
