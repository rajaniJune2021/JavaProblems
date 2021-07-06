import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringSplitURL {

    public static void main(String[] args) throws URISyntaxException {
        String s = "https://appuat1.ace.aaa.com/oneclickupgrade/membershipbenefitlevel?customerid=000000&campaigncode=111111&autopayrequired=boolean";
//        String words[] = s.split("=");
//        String customerid ="";
//        String cCode="";
//        String autoPay ="";
//        String s5="";
//        for(int i=0;i<words.length;i++){
//             s5= words[0];
//            System.out.println(words[i]);
//            if(i==1){
//                customerid="="+ words[i].replace("000000", "222222");
//            }
//            if(i==2){
//                cCode= "="+words[i].replace("111111", "333333");
//            }
//            if(i==3){
//                autoPay = "="+words[i].replace("boolean", "true");
//            }
//        }
//
//        System.out.println(s5+customerid+cCode+autoPay);
        URI obj = new URI(s);
        obj = new URI(obj.getQuery());
        System.out.println(obj.toString());
        String[] words = obj.toString().split("&");
        Map<String,String> map = new LinkedHashMap<>();
        for(int i=0;i< words.length;i++){
            int index = words[i].indexOf("=");
            map.put(words[i].substring(0,index),words[i].substring(index+1));
        }
        map.put("customerid","123456");
        map.put("campaigncode","123456");
        map.put("autopayrequired","true");
        System.out.println(map.toString());
        String updateURl = map.toString().replace('{', ' ').replace("}", " ").replace(", ", "&").trim();
        System.out.println(updateURl);
        s = s.replace(obj.toString(), updateURl);
        System.out.println(s);
    }
}
