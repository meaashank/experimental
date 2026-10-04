package androidx.compose.foundation.text.input;

import androidx.compose.animation.core.C1610t;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f94384b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f94385c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f94386d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f94387e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94388a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return r.f94387e;
        }

        public final int b() {
            return r.f94386d;
        }

        public final int c() {
            return r.f94385c;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ r(int i10) {
        this.f94388a = i10;
    }

    public static final /* synthetic */ r d(int i10) {
        return new r(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof r) && i10 == ((r) obj).f94388a;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return i10;
    }

    public static String j(int i10) {
        return C1610t.a("TextObfuscationMode(value=", i10, ')');
    }

    public boolean equals(Object obj) {
        return f(this.f94388a, obj);
    }

    public final int h() {
        return this.f94388a;
    }

    public int hashCode() {
        return this.f94388a;
    }

    public final /* synthetic */ int k() {
        return this.f94388a;
    }

    public String toString() {
        return j(this.f94388a);
    }
}
