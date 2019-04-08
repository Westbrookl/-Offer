package 字符串.替换空格;

/**
 * 替换字符串的时候，如果使用String中的split方法会导致的问题在于：如果存在于字符串的最后一位，那么便没有办法区分。
 */
public class Solution {
    public static String replaceSpace(StringBuffer str) {
        if(str == null || str.length() <= 0) return "";
        String temp = str.toString();
        String[] strArr = temp.split(" ");
        StringBuffer sbff = new StringBuffer();
//     StringBuffer   for(String s : strArr){
//            sbff.append(s);
//            sbff.append("%20");
//        }
        for(int i=0;i<strArr.length-1;i++){
            sbff.append(strArr[i]);
            sbff.append("%20");
        }
        sbff.append(strArr[strArr.length-1]);
        return sbff.toString();
    }
    public static String re(StringBuffer str){
        if(str == null || str.length() == 0) return "";
        StringBuffer buff = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                buff.append("%20");
            }else{
                buff.append(str.charAt(i));
            }
        }
        return buff.toString();
    }

    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("We are happy ");
        String temp1 = replaceSpace(s1);
        String temp = re(s1);
        System.out.println(temp1);
        System.out.println(temp);
    }
}
