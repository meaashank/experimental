package b3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface d {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int f120790L = 0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f120791M = 1;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f120792N = 2;

    boolean memoizeStaticMethod() default false;

    int override() default 0;

    boolean skipStaticMethod() default false;

    String staticMethodName() default "";
}
