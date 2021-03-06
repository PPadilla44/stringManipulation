public class StringManipulator{
    
    public String trimAndConcat(String str1, String str2){
        str1 = str1.trim();
        str2 = str2.trim();
        return str1+str2;
    }

    public Integer getIndexOrNull(String str,char character){
        int result = str.indexOf(character);
        if(result < 0) {
            return null;
        } else {
            return result;
        }
    }

    public String concatSubstring(String str1, int start, int end, String str2){
        return str1.substring(start,end) + str2;
    }

}