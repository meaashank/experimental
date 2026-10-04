package androidx.compose.foundation.text.input;

import androidx.compose.animation.core.C1610t;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f94380b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f94381c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f94382d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94383a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return q.f94382d;
        }

        public final int b() {
            return q.f94381c;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ q(int i10) {
        this.f94383a = i10;
    }

    public static final /* synthetic */ q c(int i10) {
        return new q(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof q) && i10 == ((q) obj).f94383a;
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return i10;
    }

    public static String h(int i10) {
        return C1610t.a("TextHighlightType(value=", i10, ')');
    }

    public boolean equals(Object obj) {
        return e(this.f94383a, obj);
    }

    public int hashCode() {
        return this.f94383a;
    }

    public final /* synthetic */ int i() {
        return this.f94383a;
    }

    public String toString() {
        return h(this.f94383a);
    }
}
