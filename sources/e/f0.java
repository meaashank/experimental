package e;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Lc.c(AnnotationRetention.BINARY)
@Lc.a
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface f0 {

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    @NotNull
    public static final a f199921v1 = a.f199926a;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final int f199922w1 = 2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final int f199923x1 = 3;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final int f199924y1 = 4;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final int f199925z1 = 5;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f199926a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f199927b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f199928c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f199929d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f199930e = 5;
    }

    int otherwise() default 2;
}
