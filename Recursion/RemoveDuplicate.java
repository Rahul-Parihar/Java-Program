public class RemoveDuplicate {

    public static void removeDublicates(String str,int idx,StringBuilder newStr,boolean map[] ){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        //kaam
        char currChar=str.charAt(idx);
        if (map[currChar-'a']==true){
            //dubplicates
            removeDublicates(str, idx+1, newStr, map);
        }else{
           map[currChar-'a']=true;
           removeDublicates(str, idx+1, newStr.append(currChar), map);
        }

    }
    public static void main(String[] args) {
       String str= "appnnacollege";
       removeDublicates(str, 0, new StringBuilder(""), new boolean[26]);
        
    }
    
}
