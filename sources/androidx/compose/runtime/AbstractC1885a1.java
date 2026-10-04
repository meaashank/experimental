package androidx.compose.runtime;

import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.runtime.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T1
public abstract class AbstractC1885a1<T> extends A<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f99413c = 0;

    public AbstractC1885a1(@NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        super(interfaceC4376a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[PHI: r5
      0x002e: PHI (r5v2 java.lang.Object) = (r5v5 java.lang.Object), (r5v6 java.lang.Object) binds: [B:17:0x003a, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.runtime.A
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.compose.runtime.i2<T> d(@org.jetbrains.annotations.NotNull androidx.compose.runtime.C1888b1<T> r4, @org.jetbrains.annotations.Nullable androidx.compose.runtime.i2<T> r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof androidx.compose.runtime.Y
            r1 = 0
            if (r0 == 0) goto L16
            boolean r0 = r4.f99421f
            if (r0 == 0) goto L3d
            r1 = r5
            androidx.compose.runtime.Y r1 = (androidx.compose.runtime.Y) r1
            androidx.compose.runtime.L0<T> r5 = r1.f99404a
            java.lang.Object r0 = r4.d()
            r5.setValue(r0)
            goto L3d
        L16:
            boolean r0 = r5 instanceof androidx.compose.runtime.Z1
            if (r0 == 0) goto L30
            boolean r0 = r4.l()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r4.d()
            androidx.compose.runtime.Z1 r5 = (androidx.compose.runtime.Z1) r5
            T r2 = r5.f99408a
            boolean r0 = kotlin.jvm.internal.G.g(r0, r2)
            if (r0 == 0) goto L3d
        L2e:
            r1 = r5
            goto L3d
        L30:
            boolean r0 = r5 instanceof androidx.compose.runtime.K
            if (r0 == 0) goto L3d
            ed.l<androidx.compose.runtime.B, T> r0 = r4.f99420e
            androidx.compose.runtime.K r5 = (androidx.compose.runtime.K) r5
            ed.l<androidx.compose.runtime.B, T> r2 = r5.f99125a
            if (r0 != r2) goto L3d
            goto L2e
        L3d:
            if (r1 != 0) goto L44
            androidx.compose.runtime.i2 r4 = r3.i(r4)
            return r4
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.AbstractC1885a1.d(androidx.compose.runtime.b1, androidx.compose.runtime.i2):androidx.compose.runtime.i2");
    }

    @NotNull
    public abstract C1888b1<T> e(T t10);

    @NotNull
    public final C1888b1<T> f(T t10) {
        return e(t10);
    }

    @NotNull
    public final C1888b1<T> g(@NotNull ed.l<? super B, ? extends T> lVar) {
        return new C1888b1<>(this, null, false, null, null, lVar, false);
    }

    @NotNull
    public final C1888b1<T> h(T t10) {
        C1888b1<T> c1888b1E = e(t10);
        c1888b1E.f99423h = false;
        return c1888b1E;
    }

    public final i2<T> i(C1888b1<T> c1888b1) {
        if (!c1888b1.f99421f) {
            ed.l<B, T> lVar = c1888b1.f99420e;
            if (lVar != null) {
                return new K(lVar);
            }
            L0<T> l02 = c1888b1.f99419d;
            return l02 != null ? new Y(l02) : new Z1(c1888b1.d());
        }
        L0 l0E = c1888b1.f99419d;
        if (l0E == null) {
            T t10 = c1888b1.f99422g;
            H1<T> h1C = c1888b1.f99418c;
            if (h1C == null) {
                h1C = L1.c();
            }
            l0E = ActualAndroid_androidKt.e(t10, h1C);
        }
        return new Y(l0E);
    }
}
