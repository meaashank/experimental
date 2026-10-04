package androidx.compose.ui.text;

import androidx.compose.animation.core.C1610t;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f104260b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104261c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104262d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104263a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return K.f104261c;
        }

        public final int b() {
            return K.f104262d;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ K(int i10) {
        this.f104263a = i10;
    }

    public static final /* synthetic */ K c(int i10) {
        return new K(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof K) && i10 == ((K) obj).f104263a;
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return i10;
    }

    public static String h(int i10) {
        return C1610t.a("TextGranularity(value=", i10, ')');
    }

    public boolean equals(Object obj) {
        return e(this.f104263a, obj);
    }

    public int hashCode() {
        return this.f104263a;
    }

    public final /* synthetic */ int i() {
        return this.f104263a;
    }

    public String toString() {
        return h(this.f104263a);
    }
}
