package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.room.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.FIELD, ElementType.METHOD})
@Lc.c(AnnotationRetention.BINARY)
@Lc.d(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC2662g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final b f117220k = b.f117234a;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final String f117221l = "[field-name]";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f117222m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f117223n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f117224o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f117225p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f117226q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f117227r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f117228s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f117229t = 3;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f117230u = 4;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @e.T(21)
    public static final int f117231v = 5;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @e.T(21)
    public static final int f117232w = 6;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final String f117233x = "[value-unspecified]";

    /* JADX INFO: renamed from: androidx.room.g$a */
    @e.T(21)
    @Lc.c(AnnotationRetention.BINARY)
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }

    /* JADX INFO: renamed from: androidx.room.g$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f117234a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f117235b = "[field-name]";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f117236c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f117237d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f117238e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f117239f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f117240g = 5;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f117241h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f117242i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f117243j = 3;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f117244k = 4;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @e.T(21)
        public static final int f117245l = 5;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @e.T(21)
        public static final int f117246m = 6;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public static final String f117247n = "[value-unspecified]";
    }

    /* JADX INFO: renamed from: androidx.room.g$c */
    @Lc.c(AnnotationRetention.BINARY)
    @Retention(RetentionPolicy.CLASS)
    public @interface c {
    }

    @a
    int collate() default 1;

    String defaultValue() default "[value-unspecified]";

    boolean index() default false;

    String name() default "[field-name]";

    @c
    int typeAffinity() default 1;
}
