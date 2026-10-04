package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: renamed from: androidx.room.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE})
@Lc.c(AnnotationRetention.BINARY)
@Lc.d(allowedTargets = {AnnotationTarget.CLASS})
@Repeatable(a.class)
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC2678o {

    /* JADX INFO: renamed from: androidx.room.o$a */
    @Target({ElementType.TYPE})
    @Lc.c(AnnotationRetention.BINARY)
    @Lc.d(allowedTargets = {AnnotationTarget.CLASS})
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
        InterfaceC2678o[] value();
    }

    String tableName();
}
