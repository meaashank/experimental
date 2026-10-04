package androidx.databinding;

import B0.C0922f;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.C1531f0;
import androidx.databinding.i;
import androidx.databinding.t;
import androidx.databinding.v;
import androidx.databinding.w;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.K;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import e.I;
import h1.C4485a;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class B extends C2508a implements D2.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f112220r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f112221s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f112222t = 3;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f112223u = "binding_";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f112224v = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f112229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f112230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f112231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public D[] f112232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f112233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.databinding.i<y, B, Void> f112234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f112235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Choreographer f112236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Choreographer.FrameCallback f112237i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f112238j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DataBindingComponent f112239k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public B f112240l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.lifecycle.B f112241m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k f112242n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f112243o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f112244p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f112219q = Build.VERSION.SDK_INT;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final boolean f112225w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final androidx.databinding.j f112226x = new a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final androidx.databinding.j f112227y = new b();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final androidx.databinding.j f112228z = new c();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final androidx.databinding.j f112215A = new d();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final i.a<y, B, Void> f112216B = new e();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final ReferenceQueue<B> f112217C = new ReferenceQueue<>();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final View.OnAttachStateChangeListener f112218D = new f();

    public class a implements androidx.databinding.j {
        @Override // androidx.databinding.j
        public D a(B b10, int i10, ReferenceQueue<B> referenceQueue) {
            return new o(b10, i10, referenceQueue).f112256a;
        }
    }

    public class b implements androidx.databinding.j {
        @Override // androidx.databinding.j
        public D a(B b10, int i10, ReferenceQueue<B> referenceQueue) {
            return new m(b10, i10, referenceQueue).f112254a;
        }
    }

    public class c implements androidx.databinding.j {
        @Override // androidx.databinding.j
        public D a(B b10, int i10, ReferenceQueue<B> referenceQueue) {
            return new n(b10, i10, referenceQueue).f112255a;
        }
    }

    public class d implements androidx.databinding.j {
        @Override // androidx.databinding.j
        public D a(B b10, int i10, ReferenceQueue<B> referenceQueue) {
            return new j(b10, i10, referenceQueue).f112250a;
        }
    }

    public class e extends i.a<y, B, Void> {
        @Override // androidx.databinding.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(y yVar, B b10, int i10, Void r42) {
            if (i10 == 1) {
                yVar.getClass();
            } else if (i10 == 2) {
                yVar.getClass();
            } else {
                if (i10 != 3) {
                    return;
                }
                yVar.getClass();
            }
        }
    }

    public class f implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            B.s(view).f112229a.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                B.this.f112230b = false;
            }
            B.i0();
            if (B.this.f112233e.isAttachedToWindow()) {
                B.this.o();
                return;
            }
            View view = B.this.f112233e;
            View.OnAttachStateChangeListener onAttachStateChangeListener = B.f112218D;
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            B.this.f112233e.addOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    public class h implements Choreographer.FrameCallback {
        public h() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            B.this.f112229a.run();
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[][] f112247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[][] f112248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[][] f112249c;

        public i(int i10) {
            this.f112247a = new String[i10][];
            this.f112248b = new int[i10][];
            this.f112249c = new int[i10][];
        }

        public void a(int i10, String[] strArr, int[] iArr, int[] iArr2) {
            this.f112247a[i10] = strArr;
            this.f112248b[i10] = iArr;
            this.f112249c[i10] = iArr2;
        }
    }

    public static class j implements Q, x<K<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D<K<?>> f112250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public WeakReference<androidx.lifecycle.B> f112251b = null;

        public j(B b10, int i10, ReferenceQueue<B> referenceQueue) {
            this.f112250a = new D<>(b10, i10, this, referenceQueue);
        }

        @Override // androidx.lifecycle.Q
        public void a(@Nullable Object obj) {
            B bA = this.f112250a.a();
            if (bA != null) {
                D<K<?>> d10 = this.f112250a;
                bA.Q(d10.f112265b, d10.b(), 0);
            }
        }

        @Override // androidx.databinding.x
        public void b(@Nullable androidx.lifecycle.B b10) {
            androidx.lifecycle.B bG = g();
            K<?> kB = this.f112250a.b();
            if (kB != null) {
                if (bG != null) {
                    kB.p(this);
                }
                if (b10 != null) {
                    kB.k(b10, this);
                }
            }
            if (b10 != null) {
                this.f112251b = new WeakReference<>(b10);
            }
        }

        @Override // androidx.databinding.x
        public D<K<?>> c() {
            return this.f112250a;
        }

        @Override // androidx.databinding.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void e(K<?> k10) {
            androidx.lifecycle.B bG = g();
            if (bG != null) {
                k10.k(bG, this);
            }
        }

        @Nullable
        public final androidx.lifecycle.B g() {
            WeakReference<androidx.lifecycle.B> weakReference = this.f112251b;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        @Override // androidx.databinding.x
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(K<?> k10) {
            k10.p(this);
        }
    }

    public static class k implements androidx.lifecycle.A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<B> f112252a;

        public /* synthetic */ k(B b10, a aVar) {
            this(b10);
        }

        @S(Lifecycle.Event.ON_START)
        public void onStart() {
            B b10 = this.f112252a.get();
            if (b10 != null) {
                b10.o();
            }
        }

        public k(B b10) {
            this.f112252a = new WeakReference<>(b10);
        }
    }

    public static abstract class l extends t.a implements androidx.databinding.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f112253a;

        public l(int i10) {
            this.f112253a = i10;
        }

        @Override // androidx.databinding.t.a
        public void f(t tVar, int i10) {
            if (i10 == this.f112253a || i10 == 0) {
                a();
            }
        }
    }

    public static class m extends v.a implements x<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D<v> f112254a;

        public m(B b10, int i10, ReferenceQueue<B> referenceQueue) {
            this.f112254a = new D<>(b10, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.v.a
        public void a(v vVar) {
            v vVarB;
            B bA = this.f112254a.a();
            if (bA != null && (vVarB = this.f112254a.b()) == vVar) {
                bA.Q(this.f112254a.f112265b, vVarB, 0);
            }
        }

        @Override // androidx.databinding.x
        public void b(androidx.lifecycle.B b10) {
        }

        @Override // androidx.databinding.x
        public D<v> c() {
            return this.f112254a;
        }

        @Override // androidx.databinding.v.a
        public void f(v vVar, int i10, int i11) {
            a(vVar);
        }

        @Override // androidx.databinding.v.a
        public void g(v vVar, int i10, int i11) {
            a(vVar);
        }

        @Override // androidx.databinding.v.a
        public void h(v vVar, int i10, int i11, int i12) {
            a(vVar);
        }

        @Override // androidx.databinding.v.a
        public void i(v vVar, int i10, int i11) {
            a(vVar);
        }

        @Override // androidx.databinding.x
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(v vVar) {
            vVar.Y1(this);
        }

        @Override // androidx.databinding.x
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void d(v vVar) {
            vVar.n2(this);
        }
    }

    public static class n extends w.a implements x<w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D<w> f112255a;

        public n(B b10, int i10, ReferenceQueue<B> referenceQueue) {
            this.f112255a = new D<>(b10, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.w.a
        public void a(w wVar, Object obj) {
            B bA = this.f112255a.a();
            if (bA == null || wVar != this.f112255a.b()) {
                return;
            }
            bA.Q(this.f112255a.f112265b, wVar, 0);
        }

        @Override // androidx.databinding.x
        public void b(androidx.lifecycle.B b10) {
        }

        @Override // androidx.databinding.x
        public D<w> c() {
            return this.f112255a;
        }

        @Override // androidx.databinding.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void e(w wVar) {
            wVar.g(this);
        }

        @Override // androidx.databinding.x
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(w wVar) {
            wVar.d3(this);
        }
    }

    public static class o extends t.a implements x<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D<t> f112256a;

        public o(B b10, int i10, ReferenceQueue<B> referenceQueue) {
            this.f112256a = new D<>(b10, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.x
        public void b(androidx.lifecycle.B b10) {
        }

        @Override // androidx.databinding.x
        public D<t> c() {
            return this.f112256a;
        }

        @Override // androidx.databinding.t.a
        public void f(t tVar, int i10) {
            B bA = this.f112256a.a();
            if (bA != null && this.f112256a.b() == tVar) {
                bA.Q(this.f112256a.f112265b, tVar, i10);
            }
        }

        @Override // androidx.databinding.x
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(t tVar) {
            tVar.addOnPropertyChangedCallback(this);
        }

        @Override // androidx.databinding.x
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(t tVar) {
            tVar.removeOnPropertyChangedCallback(this);
        }
    }

    public B(DataBindingComponent dataBindingComponent, View view, int i10) {
        this.f112229a = new g();
        this.f112230b = false;
        this.f112231c = false;
        this.f112239k = dataBindingComponent;
        this.f112232d = new D[i10];
        this.f112233e = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (f112225w) {
            this.f112236h = Choreographer.getInstance();
            this.f112237i = new h();
        } else {
            this.f112237i = null;
            this.f112238j = new Handler(Looper.myLooper());
        }
    }

    public static double A(double[] dArr, int i10) {
        if (dArr == null || i10 < 0 || i10 >= dArr.length) {
            return 0.0d;
        }
        return dArr[i10];
    }

    public static <T> void A0(SparseArray<T> sparseArray, int i10, T t10) {
        if (sparseArray == null || i10 < 0 || i10 >= sparseArray.size()) {
            return;
        }
        sparseArray.put(i10, t10);
    }

    public static float B(float[] fArr, int i10) {
        if (fArr == null || i10 < 0 || i10 >= fArr.length) {
            return 0.0f;
        }
        return fArr[i10];
    }

    public static void B0(SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        if (sparseBooleanArray == null || i10 < 0 || i10 >= sparseBooleanArray.size()) {
            return;
        }
        sparseBooleanArray.put(i10, z10);
    }

    public static int C(int[] iArr, int i10) {
        if (iArr == null || i10 < 0 || i10 >= iArr.length) {
            return 0;
        }
        return iArr[i10];
    }

    public static void C0(SparseIntArray sparseIntArray, int i10, int i11) {
        if (sparseIntArray == null || i10 < 0 || i10 >= sparseIntArray.size()) {
            return;
        }
        sparseIntArray.put(i10, i11);
    }

    public static long D(long[] jArr, int i10) {
        if (jArr == null || i10 < 0 || i10 >= jArr.length) {
            return 0L;
        }
        return jArr[i10];
    }

    @TargetApi(18)
    public static void D0(SparseLongArray sparseLongArray, int i10, long j10) {
        if (sparseLongArray == null || i10 < 0 || i10 >= sparseLongArray.size()) {
            return;
        }
        sparseLongArray.put(i10, j10);
    }

    public static <T> T E(T[] tArr, int i10) {
        if (tArr == null || i10 < 0 || i10 >= tArr.length) {
            return null;
        }
        return tArr[i10];
    }

    public static <T> void E0(C1531f0<T> c1531f0, int i10, T t10) {
        if (c1531f0 == null || i10 < 0 || i10 >= c1531f0.w()) {
            return;
        }
        c1531f0.m(i10, t10);
    }

    public static short F(short[] sArr, int i10) {
        if (sArr == null || i10 < 0 || i10 >= sArr.length) {
            return (short) 0;
        }
        return sArr[i10];
    }

    public static <T> void F0(List<T> list, int i10, T t10) {
        if (list == null || i10 < 0 || i10 >= list.size()) {
            return;
        }
        list.set(i10, t10);
    }

    public static boolean G(boolean[] zArr, int i10) {
        if (zArr == null || i10 < 0 || i10 >= zArr.length) {
            return false;
        }
        return zArr[i10];
    }

    public static <K, T> void G0(Map<K, T> map, K k10, T t10) {
        if (map == null) {
            return;
        }
        map.put(k10, t10);
    }

    public static int H(SparseIntArray sparseIntArray, int i10) {
        if (sparseIntArray == null || i10 < 0) {
            return 0;
        }
        return sparseIntArray.get(i10);
    }

    public static void H0(byte[] bArr, int i10, byte b10) {
        if (bArr == null || i10 < 0 || i10 >= bArr.length) {
            return;
        }
        bArr[i10] = b10;
    }

    @TargetApi(18)
    public static long I(SparseLongArray sparseLongArray, int i10) {
        if (sparseLongArray == null || i10 < 0) {
            return 0L;
        }
        return sparseLongArray.get(i10);
    }

    public static void I0(char[] cArr, int i10, char c10) {
        if (cArr == null || i10 < 0 || i10 >= cArr.length) {
            return;
        }
        cArr[i10] = c10;
    }

    @TargetApi(16)
    public static <T> T J(LongSparseArray<T> longSparseArray, int i10) {
        if (longSparseArray == null || i10 < 0) {
            return null;
        }
        return longSparseArray.get(i10);
    }

    public static void J0(double[] dArr, int i10, double d10) {
        if (dArr == null || i10 < 0 || i10 >= dArr.length) {
            return;
        }
        dArr[i10] = d10;
    }

    public static <T> T K(SparseArray<T> sparseArray, int i10) {
        if (sparseArray == null || i10 < 0) {
            return null;
        }
        return sparseArray.get(i10);
    }

    public static void K0(float[] fArr, int i10, float f10) {
        if (fArr == null || i10 < 0 || i10 >= fArr.length) {
            return;
        }
        fArr[i10] = f10;
    }

    public static <T> T L(C1531f0<T> c1531f0, int i10) {
        if (c1531f0 == null || i10 < 0) {
            return null;
        }
        return c1531f0.g(i10);
    }

    public static void L0(int[] iArr, int i10, int i11) {
        if (iArr == null || i10 < 0 || i10 >= iArr.length) {
            return;
        }
        iArr[i10] = i11;
    }

    public static <T> T M(List<T> list, int i10) {
        if (list == null || i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static void M0(long[] jArr, int i10, long j10) {
        if (jArr == null || i10 < 0 || i10 >= jArr.length) {
            return;
        }
        jArr[i10] = j10;
    }

    public static boolean N(SparseBooleanArray sparseBooleanArray, int i10) {
        if (sparseBooleanArray == null || i10 < 0) {
            return false;
        }
        return sparseBooleanArray.get(i10);
    }

    public static <T> void N0(T[] tArr, int i10, T t10) {
        if (tArr == null || i10 < 0 || i10 >= tArr.length) {
            return;
        }
        tArr[i10] = t10;
    }

    public static void O0(short[] sArr, int i10, short s10) {
        if (sArr == null || i10 < 0 || i10 >= sArr.length) {
            return;
        }
        sArr[i10] = s10;
    }

    public static void P0(boolean[] zArr, int i10, boolean z10) {
        if (zArr == null || i10 < 0 || i10 >= zArr.length) {
            return;
        }
        zArr[i10] = z10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static <T extends B> T S(@NonNull LayoutInflater layoutInflater, int i10, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (T) androidx.databinding.l.k(layoutInflater, i10, viewGroup, z10, j(obj));
    }

    public static boolean U(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return false;
        }
        while (i10 < length) {
            if (!Character.isDigit(str.charAt(i10))) {
                return false;
            }
            i10++;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void V(androidx.databinding.DataBindingComponent r18, android.view.View r19, java.lang.Object[] r20, androidx.databinding.B.i r21, android.util.SparseIntArray r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.B.V(androidx.databinding.DataBindingComponent, android.view.View, java.lang.Object[], androidx.databinding.B$i, android.util.SparseIntArray, boolean):void");
    }

    public static Object[] W(DataBindingComponent dataBindingComponent, View view, int i10, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        V(dataBindingComponent, view, objArr, iVar, sparseIntArray, true);
        return objArr;
    }

    public static Object[] X(DataBindingComponent dataBindingComponent, View[] viewArr, int i10, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        for (View view : viewArr) {
            V(dataBindingComponent, view, objArr, iVar, sparseIntArray, true);
        }
        return objArr;
    }

    public static byte Z(String str, byte b10) {
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b10;
        }
    }

    public static char a0(String str, char c10) {
        return (str == null || str.isEmpty()) ? c10 : str.charAt(0);
    }

    public static double b0(String str, double d10) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d10;
        }
    }

    public static float c0(String str, float f10) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f10;
        }
    }

    public static int d0(String str, int i10) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static long e0(String str, long j10) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static short f0(String str, short s10) {
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s10;
        }
    }

    public static boolean g0(String str, boolean z10) {
        return str == null ? z10 : Boolean.parseBoolean(str);
    }

    public static int h0(String str, int i10) {
        int iCharAt = 0;
        while (i10 < str.length()) {
            iCharAt = (iCharAt * 10) + (str.charAt(i10) - '0');
            i10++;
        }
        return iCharAt;
    }

    public static B i(Object obj, View view, int i10) {
        return androidx.databinding.l.c(j(obj), view, i10);
    }

    public static void i0() {
        while (true) {
            Reference<? extends B> referencePoll = f112217C.poll();
            if (referencePoll == null) {
                return;
            }
            if (referencePoll instanceof D) {
                ((D) referencePoll).e();
            }
        }
    }

    public static DataBindingComponent j(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof DataBindingComponent) {
            return (DataBindingComponent) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public static byte m0(Byte b10) {
        if (b10 == null) {
            return (byte) 0;
        }
        return b10.byteValue();
    }

    public static void n(B b10) {
        b10.m();
    }

    public static char n0(Character ch) {
        if (ch == null) {
            return (char) 0;
        }
        return ch.charValue();
    }

    public static double o0(Double d10) {
        if (d10 == null) {
            return 0.0d;
        }
        return d10.doubleValue();
    }

    public static int p(String str, int i10, i iVar, int i11) {
        CharSequence charSequenceSubSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = iVar.f112247a[i11];
        int length = strArr.length;
        while (i10 < length) {
            if (TextUtils.equals(charSequenceSubSequence, strArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static float p0(Float f10) {
        if (f10 == null) {
            return 0.0f;
        }
        return f10.floatValue();
    }

    public static int q(ViewGroup viewGroup, int i10) {
        String str = (String) viewGroup.getChildAt(i10).getTag();
        String strA = C0922f.a(str, 1, 0);
        int length = strA.length();
        int childCount = viewGroup.getChildCount();
        for (int i11 = i10 + 1; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(strA)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    break;
                }
                if (U(str2, length)) {
                    i10 = i11;
                }
            }
        }
        return i10;
    }

    public static int q0(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static long r0(Long l10) {
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public static B s(View view) {
        if (view != null) {
            return (B) view.getTag(C4485a.C0742a.f202388a);
        }
        return null;
    }

    public static short s0(Short sh) {
        if (sh == null) {
            return (short) 0;
        }
        return sh.shortValue();
    }

    public static int t() {
        return f112219q;
    }

    public static boolean t0(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static int u(View view, int i10) {
        return view.getContext().getColor(i10);
    }

    public static void u0(B b10, androidx.databinding.n nVar, l lVar) {
        if (nVar != lVar) {
            if (nVar != null) {
                b10.removeOnPropertyChangedCallback((l) nVar);
            }
            if (lVar != null) {
                b10.addOnPropertyChangedCallback(lVar);
            }
        }
    }

    public static ColorStateList v(View view, int i10) {
        return view.getContext().getColorStateList(i10);
    }

    public static Drawable w(View view, int i10) {
        return view.getContext().getDrawable(i10);
    }

    public static <K, T> T x(Map<K, T> map, K k10) {
        if (map == null) {
            return null;
        }
        return map.get(k10);
    }

    public static byte y(byte[] bArr, int i10) {
        if (bArr == null || i10 < 0 || i10 >= bArr.length) {
            return (byte) 0;
        }
        return bArr[i10];
    }

    public static char z(char[] cArr, int i10) {
        if (cArr == null || i10 < 0 || i10 >= cArr.length) {
            return (char) 0;
        }
        return cArr[i10];
    }

    @TargetApi(16)
    public static <T> void z0(LongSparseArray<T> longSparseArray, int i10, T t10) {
        if (longSparseArray == null || i10 < 0 || i10 >= longSparseArray.size()) {
            return;
        }
        longSparseArray.put(i10, t10);
    }

    @Nullable
    public androidx.lifecycle.B O() {
        return this.f112241m;
    }

    public Object P(int i10) {
        D d10 = this.f112232d[i10];
        if (d10 == null) {
            return null;
        }
        return d10.b();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void Q(int i10, Object obj, int i11) {
        if (this.f112243o || this.f112244p || !Y(i10, obj, i11)) {
            return;
        }
        l0();
    }

    public abstract boolean Q0(int i10, @Nullable Object obj);

    public abstract boolean R();

    public void R0() {
        for (D d10 : this.f112232d) {
            if (d10 != null) {
                d10.e();
            }
        }
    }

    public boolean S0(int i10) {
        D d10 = this.f112232d[i10];
        if (d10 != null) {
            return d10.e();
        }
        return false;
    }

    public abstract void T();

    public boolean T0(int i10, K<?> k10) {
        this.f112243o = true;
        try {
            return X0(i10, k10, f112215A);
        } finally {
            this.f112243o = false;
        }
    }

    public boolean U0(int i10, t tVar) {
        return X0(i10, tVar, f112226x);
    }

    public boolean V0(int i10, v vVar) {
        return X0(i10, vVar, f112227y);
    }

    public boolean W0(int i10, w wVar) {
        return X0(i10, wVar, f112228z);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean X0(int i10, Object obj, androidx.databinding.j jVar) {
        if (obj == null) {
            return S0(i10);
        }
        D d10 = this.f112232d[i10];
        if (d10 == null) {
            j0(i10, obj, jVar);
            return true;
        }
        if (d10.b() == obj) {
            return false;
        }
        S0(i10);
        j0(i10, obj, jVar);
        return true;
    }

    public abstract boolean Y(int i10, Object obj, int i11);

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f112233e;
    }

    public void h(@NonNull y yVar) {
        if (this.f112234f == null) {
            this.f112234f = new androidx.databinding.i<>(f112216B);
        }
        this.f112234f.a(yVar);
    }

    public void j0(int i10, Object obj, androidx.databinding.j jVar) {
        if (obj == null) {
            return;
        }
        D dA = this.f112232d[i10];
        if (dA == null) {
            dA = jVar.a(this, i10, f112217C);
            this.f112232d[i10] = dA;
            androidx.lifecycle.B b10 = this.f112241m;
            if (b10 != null) {
                dA.c(b10);
            }
        }
        dA.d(obj);
    }

    public void k(Class<?> cls) {
        if (this.f112239k != null) {
            return;
        }
        throw new IllegalStateException("Required DataBindingComponent is null in class " + getClass().getSimpleName() + ". A BindingAdapter in " + cls.getCanonicalName() + " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
    }

    public void k0(@NonNull y yVar) {
        androidx.databinding.i<y, B, Void> iVar = this.f112234f;
        if (iVar != null) {
            iVar.n(yVar);
        }
    }

    public abstract void l();

    public void l0() {
        B b10 = this.f112240l;
        if (b10 != null) {
            b10.l0();
            return;
        }
        androidx.lifecycle.B b11 = this.f112241m;
        if (b11 == null || b11.getLifecycle().d().isAtLeast(Lifecycle.State.STARTED)) {
            synchronized (this) {
                try {
                    if (this.f112230b) {
                        return;
                    }
                    this.f112230b = true;
                    if (f112225w) {
                        this.f112236h.postFrameCallback(this.f112237i);
                    } else {
                        this.f112238j.post(this.f112229a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void m() {
        if (this.f112235g) {
            l0();
            return;
        }
        if (R()) {
            this.f112235g = true;
            this.f112231c = false;
            androidx.databinding.i<y, B, Void> iVar = this.f112234f;
            if (iVar != null) {
                iVar.i(this, 1, null);
                if (this.f112231c) {
                    this.f112234f.i(this, 2, null);
                }
            }
            if (!this.f112231c) {
                l();
                androidx.databinding.i<y, B, Void> iVar2 = this.f112234f;
                if (iVar2 != null) {
                    iVar2.i(this, 3, null);
                }
            }
            this.f112235g = false;
        }
    }

    public void o() {
        B b10 = this.f112240l;
        if (b10 == null) {
            m();
        } else {
            b10.o();
        }
    }

    public void r() {
        l();
    }

    public void v0(B b10) {
        if (b10 != null) {
            b10.f112240l = this;
        }
    }

    @I
    public void w0(@Nullable androidx.lifecycle.B b10) {
        if (b10 instanceof Fragment) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        androidx.lifecycle.B b11 = this.f112241m;
        if (b11 == b10) {
            return;
        }
        if (b11 != null) {
            b11.getLifecycle().g(this.f112242n);
        }
        this.f112241m = b10;
        if (b10 != null) {
            if (this.f112242n == null) {
                this.f112242n = new k(this);
            }
            b10.getLifecycle().c(this.f112242n);
        }
        for (D d10 : this.f112232d) {
            if (d10 != null) {
                d10.c(b10);
            }
        }
    }

    public void x0(View view) {
        view.setTag(C4485a.C0742a.f202388a, this);
    }

    public void y0(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(C4485a.C0742a.f202388a, this);
        }
    }

    public B(Object obj, View view, int i10) {
        this(j(obj), view, i10);
    }
}
