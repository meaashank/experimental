package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.room.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Target({})
@Lc.c(AnnotationRetention.BINARY)
@Lc.d(allowedTargets = {})
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC2685w {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f117293A = 2;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f117294B = 3;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f117295C = 4;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f117296D = 5;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final b f117297y = b.f117299a;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f117298z = 1;

    /* JADX INFO: renamed from: androidx.room.w$a */
    @Lc.c(AnnotationRetention.BINARY)
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }

    /* JADX INFO: renamed from: androidx.room.w$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f117299a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f117300b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f117301c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f117302d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f117303e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f117304f = 5;
    }

    String[] childColumns();

    boolean deferred() default false;

    Class<?> entity();

    @a
    int onDelete() default 1;

    @a
    int onUpdate() default 1;

    String[] parentColumns();
}
