package intermediate;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//jvm이 감지할 수 있도록 한다.
@Retention(RetentionPolicy.RUNTIME)
public @interface Count100 {

}
