package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE})
@Lc.c(AnnotationRetention.BINARY)
@Lc.d(allowedTargets = {AnnotationTarget.CLASS})
@Repeatable(a.class)
@Retention(RetentionPolicy.CLASS)
public @interface u0 {

    @Target({ElementType.TYPE})
    @Lc.c(AnnotationRetention.BINARY)
    @Lc.d(allowedTargets = {AnnotationTarget.CLASS})
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
        u0[] value();
    }

    String fromTableName();

    String toTableName();
}
