package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.C1610t;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f90093b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f90094c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f90095d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f90096e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90097a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return d.f90094c;
        }

        public final int b() {
            return d.f90095d;
        }

        public final int c() {
            return d.f90096e;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ d(int i10) {
        this.f90097a = i10;
    }

    public static final /* synthetic */ d d(int i10) {
        return new d(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof d) && i10 == ((d) obj).f90097a;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return i10;
    }

    public static String i(int i10) {
        return C1610t.a("FinalSnappingItem(value=", i10, ')');
    }

    public boolean equals(Object obj) {
        return f(this.f90097a, obj);
    }

    public int hashCode() {
        return this.f90097a;
    }

    public final /* synthetic */ int j() {
        return this.f90097a;
    }

    public String toString() {
        return i(this.f90097a);
    }
}
