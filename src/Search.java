public class Search {

    private String substr;
    private String str;
    private int strLength;
    private int substrLength;

    public int substrSearch(String __substr, String __str){

        substr = __substr;
        str = __str;
        strLength = str.length();
        substrLength = substr.length();

        for(int i = 0; i <= strLength-substrLength; i++){
            int a;
            System.out.println(i);
            for(a = 0; a < substrLength; a++){
                if(str.charAt(a+i) != substr.charAt(a)){
                    break;
                }
            }
            if(a == substrLength){
                return i;
            }
        }
        return -1;
    }

    public int getSubstrLength(){
        return substrLength;
    }
}

