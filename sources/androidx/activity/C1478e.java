package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import androidx.annotation.RestrictTo;
import e.InterfaceC4348w;
import e.T;
import e.f0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.activity.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1478e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f85004e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f85005f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f85006g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f85007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f85008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f85009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f85010d;

    /* JADX INFO: renamed from: androidx.activity.e$a */
    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX INFO: renamed from: androidx.activity.e$b */
    @Target({ElementType.TYPE_USE})
    @Lc.c(AnnotationRetention.SOURCE)
    @Lc.d(allowedTargets = {AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface b {
    }

    @f0
    public C1478e(float f10, float f11, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f12, int i10) {
        this.f85007a = f10;
        this.f85008b = f11;
        this.f85009c = f12;
        this.f85010d = i10;
    }

    public final float a() {
        return this.f85009c;
    }

    public final int b() {
        return this.f85010d;
    }

    public final float c() {
        return this.f85007a;
    }

    public final float d() {
        return this.f85008b;
    }

    @T(34)
    @NotNull
    public final BackEvent e() {
        if (Build.VERSION.SDK_INT >= 34) {
            return C1476c.f84916a.a(this.f85007a, this.f85008b, this.f85009c, this.f85010d);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 34+");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BackEventCompat{touchX=");
        sb2.append(this.f85007a);
        sb2.append(", touchY=");
        sb2.append(this.f85008b);
        sb2.append(", progress=");
        sb2.append(this.f85009c);
        sb2.append(", swipeEdge=");
        return C1477d.a(sb2, this.f85010d, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @T(34)
    public C1478e(@NotNull BackEvent backEvent) {
        kotlin.jvm.internal.G.p(backEvent, "backEvent");
        C1476c c1476c = C1476c.f84916a;
        this(c1476c.d(backEvent), c1476c.e(backEvent), c1476c.b(backEvent), c1476c.c(backEvent));
    }
}
