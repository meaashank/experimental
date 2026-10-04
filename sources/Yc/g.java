package yc;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface g {

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public static final String f241145H1 = "none";

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public static final String f241146I1 = "custom";

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public static final String f241147J1 = "io.reactivex:computation";

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public static final String f241148K1 = "io.reactivex:io";

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    public static final String f241149L1 = "io.reactivex:new-thread";

    /* JADX INFO: renamed from: M1, reason: collision with root package name */
    public static final String f241150M1 = "io.reactivex:trampoline";

    /* JADX INFO: renamed from: N1, reason: collision with root package name */
    public static final String f241151N1 = "io.reactivex:single";

    String value();
}
