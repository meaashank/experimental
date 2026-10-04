package androidx.compose.material;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f97028b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f97029c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f97030d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f97031e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97032a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return S.f97030d;
        }

        public final int b() {
            return S.f97031e;
        }

        public final int c() {
            return S.f97029c;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ S(int i10) {
        this.f97032a = i10;
    }

    public static final /* synthetic */ S d(int i10) {
        return new S(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof S) && i10 == ((S) obj).f97032a;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return i10;
    }

    @NotNull
    public static String i(int i10) {
        return i10 == f97029c ? "FabPosition.Start" : i10 == f97030d ? "FabPosition.Center" : "FabPosition.End";
    }

    public boolean equals(Object obj) {
        return f(this.f97032a, obj);
    }

    public int hashCode() {
        return this.f97032a;
    }

    public final /* synthetic */ int j() {
        return this.f97032a;
    }

    @NotNull
    public String toString() {
        return i(this.f97032a);
    }
}
