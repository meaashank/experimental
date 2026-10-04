package U;

import com.prism.hider.vault.calculator.C4261m;
import dd.h;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@h
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0114a f68367b = new C0114a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f68368c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f68369d = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68370a;

    /* JADX INFO: renamed from: U.a$a, reason: collision with other inner class name */
    public static final class C0114a {
        public C0114a() {
        }

        public final int a() {
            return a.f68369d;
        }

        public final int b() {
            return a.f68368c;
        }

        public C0114a(C4969v c4969v) {
        }
    }

    public /* synthetic */ a(int i10) {
        this.f68370a = i10;
    }

    public static final /* synthetic */ a c(int i10) {
        return new a(i10);
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof a) && i10 == ((a) obj).f68370a;
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    @NotNull
    public static String h(int i10) {
        return i10 == f68368c ? "Touch" : i10 == f68369d ? "Keyboard" : C4261m.f168559e;
    }

    public boolean equals(Object obj) {
        return e(this.f68370a, obj);
    }

    public int hashCode() {
        return this.f68370a;
    }

    public final /* synthetic */ int i() {
        return this.f68370a;
    }

    @NotNull
    public String toString() {
        return h(this.f68370a);
    }

    public static int d(int i10) {
        return i10;
    }

    public static int g(int i10) {
        return i10;
    }
}
