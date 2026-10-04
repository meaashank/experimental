package androidx.compose.ui.text.font;

import androidx.compose.animation.core.C1610t;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f104479b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104480c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104481d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f104482e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104483a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return F.f104482e;
        }

        public final int b() {
            return F.f104480c;
        }

        public final int c() {
            return F.f104481d;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ F(int i10) {
        this.f104483a = i10;
    }

    public static final /* synthetic */ F d(int i10) {
        return new F(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof F) && i10 == ((F) obj).f104483a;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return i10;
    }

    @NotNull
    public static String j(int i10) {
        return i10 == f104480c ? "Blocking" : i10 == f104481d ? "Optional" : i10 == f104482e ? "Async" : C1610t.a("Invalid(value=", i10, ')');
    }

    public boolean equals(Object obj) {
        return f(this.f104483a, obj);
    }

    public final int h() {
        return this.f104483a;
    }

    public int hashCode() {
        return this.f104483a;
    }

    public final /* synthetic */ int k() {
        return this.f104483a;
    }

    @NotNull
    public String toString() {
        return j(this.f104483a);
    }
}
