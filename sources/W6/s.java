package W6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes6.dex */
@Inherited
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface s {
    String value();
}
