package TheEighth.knowledege.demo8;

import com.sun.xml.internal.fastinfoset.util.ValueArrayResourceException;

/**
 * @ClassName CEO
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月22日 11时10分
 * @Version 1.0
 */
public class CEO {

   private static CEO ceo =new CEO();
   private CEO(){}
   public static CEO getCeo() {
       return ceo;
   }


}