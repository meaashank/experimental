package androidx.compose.foundation;

import androidx.compose.animation.core.C1610t;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class C1650e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f89105b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f89106c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f89107d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f89108e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f89109a;

    /* JADX INFO: renamed from: androidx.compose.foundation.e$a */
    public static final class a {
        public a() {
        }

        public final int a() {
            return C1650e.f89106c;
        }

        public final int b() {
            return C1650e.f89107d;
        }

        public final int c() {
            return C1650e.f89108e;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ C1650e(int i10) {
        this.f89109a = i10;
    }

    public static final /* synthetic */ C1650e d(int i10) {
        return new C1650e(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof C1650e) && i10 == ((C1650e) obj).f89109a;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return i10;
    }

    public static String j(int i10) {
        return C1610t.a("AndroidExternalSurfaceZOrder(zOrder=", i10, ')');
    }

    public boolean equals(Object obj) {
        return f(this.f89109a, obj);
    }

    public final int h() {
        return this.f89109a;
    }

    public int hashCode() {
        return this.f89109a;
    }

    public final /* synthetic */ int k() {
        return this.f89109a;
    }

    public String toString() {
        return j(this.f89109a);
    }
}
