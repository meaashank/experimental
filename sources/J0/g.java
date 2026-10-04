package j0;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface g {
    int limit() default Integer.MAX_VALUE;

    Class<? extends i<?>> provider();
}
