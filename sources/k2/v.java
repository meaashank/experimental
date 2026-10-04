package K2;

import android.graphics.Rect;
import android.os.Build;
import android.view.WindowMetrics;
import androidx.compose.animation.B;
import androidx.window.embedding.EmbeddingRule;
import e.InterfaceC4345t;
import e.T;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.window.core.d
public class v extends EmbeddingRule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f58391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f58392d;

    @T(30)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f58393a = new a();

        @InterfaceC4345t
        @NotNull
        public final Rect a(@NotNull WindowMetrics windowMetrics) {
            G.p(windowMetrics, "windowMetrics");
            Rect bounds = windowMetrics.getBounds();
            G.o(bounds, "windowMetrics.bounds");
            return bounds;
        }
    }

    @Lc.c(AnnotationRetention.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public v() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public final boolean a(@NotNull WindowMetrics parentMetrics) {
        G.p(parentMetrics, "parentMetrics");
        if (Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        Rect rectA = a.f58393a.a(parentMetrics);
        return (this.f58389a == 0 || rectA.width() >= this.f58389a) && (this.f58390b == 0 || Math.min(rectA.width(), rectA.height()) >= this.f58390b);
    }

    public final int b() {
        return this.f58392d;
    }

    public final int c() {
        return this.f58390b;
    }

    public final int d() {
        return this.f58389a;
    }

    public final float e() {
        return this.f58391c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f58389a == vVar.f58389a && this.f58390b == vVar.f58390b && this.f58391c == vVar.f58391c && this.f58392d == vVar.f58392d;
    }

    public int hashCode() {
        return B.a(this.f58391c, ((this.f58389a * 31) + this.f58390b) * 31, 31) + this.f58392d;
    }

    public v(int i10, int i11, float f10, int i12) {
        this.f58389a = i10;
        this.f58390b = i11;
        this.f58391c = f10;
        this.f58392d = i12;
    }

    public /* synthetic */ v(int i10, int i11, float f10, int i12, int i13, C4969v c4969v) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0.5f : f10, (i13 & 8) != 0 ? 3 : i12);
    }
}
