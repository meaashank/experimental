package e;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: e.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Lc.c(AnnotationRetention.BINARY)
@Lc.a
@Lc.d(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FIELD, AnnotationTarget.LOCAL_VARIABLE, AnnotationTarget.ANNOTATION_CLASS})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC4343q {

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    @NotNull
    public static final a f199931r1 = a.f199935a;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final int f199932s1 = 0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final int f199933t1 = 1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final int f199934u1 = 2;

    /* JADX INFO: renamed from: e.q$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f199935a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f199936b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f199937c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f199938d = 2;
    }

    int unit() default 1;
}
