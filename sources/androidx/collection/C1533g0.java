package androidx.collection;

import ed.InterfaceC4376a;
import fd.InterfaceC4418a;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.collections.C4875q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: androidx.collection.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n*L\n1#1,607:1\n257#1,6:608\n257#1,6:614\n329#1,18:620\n329#1,18:638\n329#1,18:661\n329#1,18:684\n329#1,18:707\n329#1,18:725\n329#1,18:743\n329#1,18:761\n46#2,5:656\n46#2,5:679\n46#2,5:702\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n244#1:608,6\n249#1:614,6\n361#1:620,18\n411#1:638,18\n426#1:661,18\n438#1:684,18\n452#1:707,18\n460#1:725,18\n468#1:743,18\n506#1:761,18\n421#1:656,5\n433#1:679,5\n447#1:702,5\n*E\n"})
public final class C1533g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Object f86960a = new Object();

    /* JADX INFO: renamed from: androidx.collection.g0$a */
    public static final class a extends kotlin.collections.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f86961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1531f0<T> f86962b;

        public a(C1531f0<T> c1531f0) {
            this.f86962b = c1531f0;
        }

        public final int b() {
            return this.f86961a;
        }

        public final void d(int i10) {
            this.f86961a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f86961a < this.f86962b.w();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.collections.g0
        public long nextLong() {
            C1531f0<T> c1531f0 = this.f86962b;
            int i10 = this.f86961a;
            this.f86961a = i10 + 1;
            return c1531f0.l(i10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.collection.g0$b */
    public static final class b<T> implements Iterator<T>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f86963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1531f0<T> f86964b;

        public b(C1531f0<T> c1531f0) {
            this.f86964b = c1531f0;
        }

        public final int b() {
            return this.f86963a;
        }

        public final void d(int i10) {
            this.f86963a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f86963a < this.f86964b.w();
        }

        @Override // java.util.Iterator
        public T next() {
            C1531f0<T> c1531f0 = this.f86964b;
            int i10 = this.f86963a;
            this.f86963a = i10 + 1;
            return c1531f0.x(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> void A(@NotNull C1531f0<T> c1531f0, @NotNull ed.p<? super Long, ? super T, kotlin.L0> action) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int iW = c1531f0.w();
        for (int i10 = 0; i10 < iW; i10++) {
            action.invoke(Long.valueOf(c1531f0.l(i10)), c1531f0.x(i10));
        }
    }

    public static final <T> T B(@NotNull C1531f0<T> c1531f0, long j10, T t10) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        return c1531f0.h(j10, t10);
    }

    public static final <T> T C(@NotNull C1531f0<T> c1531f0, long j10, @NotNull InterfaceC4376a<? extends T> defaultValue) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        T tG = c1531f0.g(j10);
        return tG == null ? defaultValue.invoke() : tG;
    }

    public static final <T> int D(@NotNull C1531f0<T> c1531f0) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        return c1531f0.w();
    }

    public static /* synthetic */ void E(C1531f0 c1531f0) {
    }

    public static final <T> boolean F(@NotNull C1531f0<T> c1531f0) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        return !c1531f0.k();
    }

    @NotNull
    public static final <T> kotlin.collections.g0 G(@NotNull C1531f0<T> c1531f0) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        return new a(c1531f0);
    }

    @NotNull
    public static final <T> C1531f0<T> H(@NotNull C1531f0<T> c1531f0, @NotNull C1531f0<T> other) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        C1531f0<T> c1531f02 = new C1531f0<>(other.w() + c1531f0.w());
        c1531f02.n(c1531f0);
        c1531f02.n(other);
        return c1531f02;
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean I(C1531f0 c1531f0, long j10, Object obj) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        return c1531f0.r(j10, obj);
    }

    public static final <T> void J(@NotNull C1531f0<T> c1531f0, long j10, T t10) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        c1531f0.m(j10, t10);
    }

    @NotNull
    public static final <T> Iterator<T> K(@NotNull C1531f0<T> c1531f0) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        return new b(c1531f0);
    }

    public static final <E> void b(@NotNull C1531f0<E> c1531f0, long j10, E e10) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        int i10 = c1531f0.f86958d;
        if (i10 != 0 && j10 <= c1531f0.f86956b[i10 - 1]) {
            c1531f0.m(j10, e10);
            return;
        }
        if (c1531f0.f86955a) {
            long[] jArr = c1531f0.f86956b;
            if (i10 >= jArr.length) {
                Object[] objArr = c1531f0.f86957c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != f86960a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                c1531f0.f86955a = false;
                c1531f0.f86958d = i11;
            }
        }
        int i13 = c1531f0.f86958d;
        if (i13 >= c1531f0.f86956b.length) {
            int iF = A.a.f(i13 + 1);
            long[] jArrCopyOf = Arrays.copyOf(c1531f0.f86956b, iF);
            kotlin.jvm.internal.G.o(jArrCopyOf, "copyOf(this, newSize)");
            c1531f0.f86956b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(c1531f0.f86957c, iF);
            kotlin.jvm.internal.G.o(objArrCopyOf, "copyOf(this, newSize)");
            c1531f0.f86957c = objArrCopyOf;
        }
        c1531f0.f86956b[i13] = j10;
        c1531f0.f86957c[i13] = e10;
        c1531f0.f86958d = i13 + 1;
    }

    public static final <E> void c(@NotNull C1531f0<E> c1531f0) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        int i10 = c1531f0.f86958d;
        Object[] objArr = c1531f0.f86957c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        c1531f0.f86958d = 0;
        c1531f0.f86955a = false;
    }

    public static final <E> boolean d(@NotNull C1531f0<E> c1531f0, long j10) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        return c1531f0.i(j10) >= 0;
    }

    public static final <E> boolean e(@NotNull C1531f0<E> c1531f0, E e10) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        return c1531f0.j(e10) >= 0;
    }

    public static final <E> void f(@NotNull C1531f0<E> c1531f0) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        int i10 = c1531f0.f86958d;
        long[] jArr = c1531f0.f86956b;
        Object[] objArr = c1531f0.f86957c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f86960a) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        c1531f0.f86955a = false;
        c1531f0.f86958d = i11;
    }

    @Nullable
    public static final <E> E g(@NotNull C1531f0<E> c1531f0, long j10) {
        E e10;
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        int iB = A.a.b(c1531f0.f86956b, c1531f0.f86958d, j10);
        if (iB < 0 || (e10 = (E) c1531f0.f86957c[iB]) == f86960a) {
            return null;
        }
        return e10;
    }

    public static final <E> E h(@NotNull C1531f0<E> c1531f0, long j10, E e10) {
        E e11;
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        int iB = A.a.b(c1531f0.f86956b, c1531f0.f86958d, j10);
        return (iB < 0 || (e11 = (E) c1531f0.f86957c[iB]) == f86960a) ? e10 : e11;
    }

    public static final <T extends E, E> T i(@NotNull C1531f0<E> c1531f0, long j10, T t10) {
        T t11;
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        int iB = A.a.b(c1531f0.f86956b, c1531f0.f86958d, j10);
        return (iB < 0 || (t11 = (T) c1531f0.f86957c[iB]) == f86960a) ? t10 : t11;
    }

    public static final <E> int j(@NotNull C1531f0<E> c1531f0, long j10) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        if (c1531f0.f86955a) {
            int i10 = c1531f0.f86958d;
            long[] jArr = c1531f0.f86956b;
            Object[] objArr = c1531f0.f86957c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != f86960a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            c1531f0.f86955a = false;
            c1531f0.f86958d = i11;
        }
        return A.a.b(c1531f0.f86956b, c1531f0.f86958d, j10);
    }

    public static final <E> int k(@NotNull C1531f0<E> c1531f0, E e10) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        if (c1531f0.f86955a) {
            int i10 = c1531f0.f86958d;
            long[] jArr = c1531f0.f86956b;
            Object[] objArr = c1531f0.f86957c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != f86960a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            c1531f0.f86955a = false;
            c1531f0.f86958d = i11;
        }
        int i13 = c1531f0.f86958d;
        for (int i14 = 0; i14 < i13; i14++) {
            if (c1531f0.f86957c[i14] == e10) {
                return i14;
            }
        }
        return -1;
    }

    public static final <E> boolean l(@NotNull C1531f0<E> c1531f0) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        return c1531f0.w() == 0;
    }

    public static final <E> long m(@NotNull C1531f0<E> c1531f0, int i10) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        if (!(i10 >= 0 && i10 < c1531f0.f86958d)) {
            A.f.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (c1531f0.f86955a) {
            int i11 = c1531f0.f86958d;
            long[] jArr = c1531f0.f86956b;
            Object[] objArr = c1531f0.f86957c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != f86960a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            c1531f0.f86955a = false;
            c1531f0.f86958d = i12;
        }
        return c1531f0.f86956b[i10];
    }

    public static final <E> void n(@NotNull C1531f0<E> c1531f0, long j10, E e10) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        int iB = A.a.b(c1531f0.f86956b, c1531f0.f86958d, j10);
        if (iB >= 0) {
            c1531f0.f86957c[iB] = e10;
            return;
        }
        int i10 = ~iB;
        int i11 = c1531f0.f86958d;
        if (i10 < i11) {
            Object[] objArr = c1531f0.f86957c;
            if (objArr[i10] == f86960a) {
                c1531f0.f86956b[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (c1531f0.f86955a) {
            long[] jArr = c1531f0.f86956b;
            if (i11 >= jArr.length) {
                Object[] objArr2 = c1531f0.f86957c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr2[i13];
                    if (obj != f86960a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr2[i12] = obj;
                            objArr2[i13] = null;
                        }
                        i12++;
                    }
                }
                c1531f0.f86955a = false;
                c1531f0.f86958d = i12;
                i10 = ~A.a.b(c1531f0.f86956b, i12, j10);
            }
        }
        int i14 = c1531f0.f86958d;
        if (i14 >= c1531f0.f86956b.length) {
            int iF = A.a.f(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(c1531f0.f86956b, iF);
            kotlin.jvm.internal.G.o(jArrCopyOf, "copyOf(this, newSize)");
            c1531f0.f86956b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(c1531f0.f86957c, iF);
            kotlin.jvm.internal.G.o(objArrCopyOf, "copyOf(this, newSize)");
            c1531f0.f86957c = objArrCopyOf;
        }
        int i15 = c1531f0.f86958d;
        if (i15 - i10 != 0) {
            long[] jArr2 = c1531f0.f86956b;
            int i16 = i10 + 1;
            C4875q.A0(jArr2, jArr2, i16, i10, i15);
            Object[] objArr3 = c1531f0.f86957c;
            C4875q.B0(objArr3, objArr3, i16, i10, c1531f0.f86958d);
        }
        c1531f0.f86956b[i10] = j10;
        c1531f0.f86957c[i10] = e10;
        c1531f0.f86958d++;
    }

    public static final <E> void o(@NotNull C1531f0<E> c1531f0, @NotNull C1531f0<? extends E> other) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int iW = other.w();
        for (int i10 = 0; i10 < iW; i10++) {
            c1531f0.m(other.l(i10), other.x(i10));
        }
    }

    @Nullable
    public static final <E> E p(@NotNull C1531f0<E> c1531f0, long j10, E e10) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        E eG = c1531f0.g(j10);
        if (eG == null) {
            c1531f0.m(j10, e10);
        }
        return eG;
    }

    public static final <E> void q(@NotNull C1531f0<E> c1531f0, long j10) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        int iB = A.a.b(c1531f0.f86956b, c1531f0.f86958d, j10);
        if (iB >= 0) {
            Object[] objArr = c1531f0.f86957c;
            Object obj = objArr[iB];
            Object obj2 = f86960a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                c1531f0.f86955a = true;
            }
        }
    }

    public static final <E> boolean r(@NotNull C1531f0<E> c1531f0, long j10, E e10) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        int i10 = c1531f0.i(j10);
        if (i10 < 0 || !kotlin.jvm.internal.G.g(e10, c1531f0.x(i10))) {
            return false;
        }
        c1531f0.s(i10);
        return true;
    }

    public static final <E> void s(@NotNull C1531f0<E> c1531f0, int i10) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        Object[] objArr = c1531f0.f86957c;
        Object obj = objArr[i10];
        Object obj2 = f86960a;
        if (obj != obj2) {
            objArr[i10] = obj2;
            c1531f0.f86955a = true;
        }
    }

    @Nullable
    public static final <E> E t(@NotNull C1531f0<E> c1531f0, long j10, E e10) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        int i10 = c1531f0.i(j10);
        if (i10 < 0) {
            return null;
        }
        Object[] objArr = c1531f0.f86957c;
        E e11 = (E) objArr[i10];
        objArr[i10] = e10;
        return e11;
    }

    public static final <E> boolean u(@NotNull C1531f0<E> c1531f0, long j10, E e10, E e11) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        int i10 = c1531f0.i(j10);
        if (i10 < 0 || !kotlin.jvm.internal.G.g(c1531f0.f86957c[i10], e10)) {
            return false;
        }
        c1531f0.f86957c[i10] = e11;
        return true;
    }

    public static final <E> void v(@NotNull C1531f0<E> c1531f0, int i10, E e10) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        if (!(i10 >= 0 && i10 < c1531f0.f86958d)) {
            A.f.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (c1531f0.f86955a) {
            int i11 = c1531f0.f86958d;
            long[] jArr = c1531f0.f86956b;
            Object[] objArr = c1531f0.f86957c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != f86960a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            c1531f0.f86955a = false;
            c1531f0.f86958d = i12;
        }
        c1531f0.f86957c[i10] = e10;
    }

    public static final <E> int w(@NotNull C1531f0<E> c1531f0) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        if (c1531f0.f86955a) {
            int i10 = c1531f0.f86958d;
            long[] jArr = c1531f0.f86956b;
            Object[] objArr = c1531f0.f86957c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != f86960a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            c1531f0.f86955a = false;
            c1531f0.f86958d = i11;
        }
        return c1531f0.f86958d;
    }

    @NotNull
    public static final <E> String x(@NotNull C1531f0<E> c1531f0) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        if (c1531f0.w() <= 0) {
            return Ib.b.f53002g;
        }
        StringBuilder sb2 = new StringBuilder(c1531f0.f86958d * 28);
        sb2.append('{');
        int i10 = c1531f0.f86958d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(U6.j.f68738d);
            }
            sb2.append(c1531f0.l(i11));
            sb2.append(SignatureVisitor.INSTANCEOF);
            E eX = c1531f0.x(i11);
            if (eX != sb2) {
                sb2.append(eX);
            } else {
                sb2.append("(this Map)");
            }
        }
        return C1526d.a(sb2, '}', "StringBuilder(capacity).…builderAction).toString()");
    }

    public static final <E> E y(@NotNull C1531f0<E> c1531f0, int i10) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        if (!(i10 >= 0 && i10 < c1531f0.f86958d)) {
            A.f.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (c1531f0.f86955a) {
            int i11 = c1531f0.f86958d;
            long[] jArr = c1531f0.f86956b;
            Object[] objArr = c1531f0.f86957c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != f86960a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            c1531f0.f86955a = false;
            c1531f0.f86958d = i12;
        }
        return (E) c1531f0.f86957c[i10];
    }

    public static final <T> boolean z(@NotNull C1531f0<T> c1531f0, long j10) {
        kotlin.jvm.internal.G.p(c1531f0, "<this>");
        return c1531f0.d(j10);
    }
}
