package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.InterfaceC4850b0;
import kotlinx.coroutines.InterfaceC5120x0;
import kotlinx.coroutines.internal.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nThreadSafeHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n24#2,4:160\n24#2,4:165\n24#2,4:170\n24#2,4:175\n24#2,4:180\n24#2,4:185\n24#2,4:190\n16#3:164\n16#3:169\n16#3:174\n16#3:179\n16#3:184\n16#3:189\n16#3:194\n1#4:195\n*S KotlinDebug\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n33#1:160,4\n41#1:165,4\n43#1:170,4\n51#1:175,4\n60#1:180,4\n63#1:185,4\n72#1:190,4\n33#1:164\n41#1:169\n43#1:174\n51#1:179\n60#1:184\n63#1:189\n72#1:194\n*E\n"})
@InterfaceC5120x0
public class a0<T extends b0 & Comparable<? super T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f220325b = AtomicIntegerFieldUpdater.newUpdater(a0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public T[] f220326a;

    @InterfaceC4850b0
    public final void a(@NotNull T t10) {
        t10.a(this);
        b0[] b0VarArrK = k();
        int i10 = f220325b.get(this);
        p(i10 + 1);
        b0VarArrK[i10] = t10;
        t10.setIndex(i10);
        s(i10);
    }

    public final void b(@NotNull T t10) {
        synchronized (this) {
            a(t10);
        }
    }

    public final boolean c(@NotNull T t10, @NotNull ed.l<? super T, Boolean> lVar) {
        boolean z10;
        synchronized (this) {
            if (lVar.invoke(e()).booleanValue()) {
                a(t10);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Nullable
    public final T d(@NotNull ed.l<? super T, Boolean> lVar) {
        T t10;
        synchronized (this) {
            try {
                int i10 = f220325b.get(this);
                int i11 = 0;
                while (true) {
                    t10 = null;
                    if (i11 >= i10) {
                        break;
                    }
                    T[] tArr = this.f220326a;
                    if (tArr != null) {
                        t10 = (Object) tArr[i11];
                    }
                    kotlin.jvm.internal.G.m(t10);
                    if (lVar.invoke(t10).booleanValue()) {
                        break;
                    }
                    i11++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t10;
    }

    @InterfaceC4850b0
    @Nullable
    public final T e() {
        T[] tArr = this.f220326a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int f() {
        return f220325b.get(this);
    }

    public final /* synthetic */ int g() {
        return this._size$volatile;
    }

    public final boolean i() {
        return f220325b.get(this) == 0;
    }

    @Nullable
    public final T j() {
        T t10;
        synchronized (this) {
            t10 = (T) e();
        }
        return t10;
    }

    public final T[] k() {
        T[] tArr = this.f220326a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new b0[4];
            this.f220326a = tArr2;
            return tArr2;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f220325b;
        if (atomicIntegerFieldUpdater.get(this) < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, atomicIntegerFieldUpdater.get(this) * 2);
        kotlin.jvm.internal.G.o(objArrCopyOf, "copyOf(...)");
        T[] tArr3 = (T[]) ((b0[]) objArrCopyOf);
        this.f220326a = tArr3;
        return tArr3;
    }

    public final boolean l(@NotNull T t10) {
        boolean z10;
        synchronized (this) {
            if (t10.c() == null) {
                z10 = false;
            } else {
                m(t10.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    @kotlin.InterfaceC4850b0
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T m(int r7) {
        /*
            r6 = this;
            T extends kotlinx.coroutines.internal.b0 & java.lang.Comparable<? super T>[] r0 = r6.f220326a
            kotlin.jvm.internal.G.m(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.internal.a0.f220325b
            int r2 = r1.get(r6)
            r3 = -1
            int r2 = r2 + r3
            r6.p(r2)
            int r2 = r1.get(r6)
            if (r7 >= r2) goto L3f
            int r2 = r1.get(r6)
            r6.t(r7, r2)
            int r2 = r7 + (-1)
            int r2 = r2 / 2
            if (r7 <= 0) goto L3c
            r4 = r0[r7]
            kotlin.jvm.internal.G.m(r4)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            r5 = r0[r2]
            kotlin.jvm.internal.G.m(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3c
            r6.t(r7, r2)
            r6.s(r2)
            goto L3f
        L3c:
            r6.r(r7)
        L3f:
            int r7 = r1.get(r6)
            r7 = r0[r7]
            kotlin.jvm.internal.G.m(r7)
            r2 = 0
            r7.a(r2)
            r7.setIndex(r3)
            int r1 = r1.get(r6)
            r0[r1] = r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.a0.m(int):kotlinx.coroutines.internal.b0");
    }

    @Nullable
    public final T n(@NotNull ed.l<? super T, Boolean> lVar) {
        synchronized (this) {
            b0 b0VarE = e();
            T t10 = null;
            if (b0VarE == null) {
                return null;
            }
            if (lVar.invoke(b0VarE).booleanValue()) {
                t10 = (T) m(0);
            }
            return t10;
        }
    }

    @Nullable
    public final T o() {
        T t10;
        synchronized (this) {
            t10 = f220325b.get(this) > 0 ? (T) m(0) : null;
        }
        return t10;
    }

    public final void p(int i10) {
        f220325b.set(this, i10);
    }

    public final /* synthetic */ void q(int i10) {
        this._size$volatile = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.internal.a0.f220325b
            int r3 = r2.get(r5)
            if (r1 < r3) goto Ld
            goto L40
        Ld:
            T extends kotlinx.coroutines.internal.b0 & java.lang.Comparable<? super T>[] r3 = r5.f220326a
            kotlin.jvm.internal.G.m(r3)
            int r0 = r0 + 2
            int r2 = r2.get(r5)
            if (r0 >= r2) goto L2d
            r2 = r3[r0]
            kotlin.jvm.internal.G.m(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r4 = r3[r1]
            kotlin.jvm.internal.G.m(r4)
            int r2 = r2.compareTo(r4)
            if (r2 >= 0) goto L2d
            goto L2e
        L2d:
            r0 = r1
        L2e:
            r1 = r3[r6]
            kotlin.jvm.internal.G.m(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r3[r0]
            kotlin.jvm.internal.G.m(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L41
        L40:
            return
        L41:
            r5.t(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.a0.r(int):void");
    }

    public final void s(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f220326a;
            kotlin.jvm.internal.G.m(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            kotlin.jvm.internal.G.m(t10);
            T t11 = tArr[i10];
            kotlin.jvm.internal.G.m(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            t(i10, i11);
            i10 = i11;
        }
    }

    public final void t(int i10, int i11) {
        T[] tArr = this.f220326a;
        kotlin.jvm.internal.G.m(tArr);
        T t10 = tArr[i11];
        kotlin.jvm.internal.G.m(t10);
        T t11 = tArr[i10];
        kotlin.jvm.internal.G.m(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.setIndex(i10);
        t11.setIndex(i11);
    }
}
