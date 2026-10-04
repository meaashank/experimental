package lc;

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

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public static final String f221071A1 = "none";

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public static final String f221072B1 = "custom";

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public static final String f221073C1 = "io.reactivex:computation";

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public static final String f221074D1 = "io.reactivex:io";

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public static final String f221075E1 = "io.reactivex:new-thread";

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public static final String f221076F1 = "io.reactivex:trampoline";

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public static final String f221077G1 = "io.reactivex:single";

    String value();
}
