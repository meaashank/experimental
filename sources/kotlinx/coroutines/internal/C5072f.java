package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n1#1,265:1\n42#1,8:280\n103#2,7:266\n103#2,7:273\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n70#1:280,8\n23#1:266,7\n81#1:273,7\n*E\n"})
public final class C5072f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f220338a = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Q f220339b = new Q("CLOSED");

    public static final /* synthetic */ boolean b(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, int i10, ed.l<? super Integer, Boolean> lVar) {
        int i11;
        do {
            i11 = atomicIntegerFieldUpdater.get(obj);
            if (!lVar.invoke(Integer.valueOf(i11)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i11, i11 + i10));
        return true;
    }

    public static final /* synthetic */ boolean c(AtomicIntegerArray atomicIntegerArray, int i10, int i11, ed.l<? super Integer, Boolean> lVar) {
        int i12;
        do {
            i12 = atomicIntegerArray.get(i10);
            if (!lVar.invoke(Integer.valueOf(i12)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerArray.compareAndSet(i10, i12, i12 + i11));
        return true;
    }

    @NotNull
    public static final <N extends AbstractC5073g<N>> N d(@NotNull N n10) {
        while (true) {
            Object objB = AbstractC5073g.b(n10);
            if (objB == f220339b) {
                return n10;
            }
            AbstractC5073g abstractC5073g = (AbstractC5073g) objB;
            if (abstractC5073g != null) {
                n10 = (N) abstractC5073g;
            } else if (n10.o()) {
                return n10;
            }
        }
    }

    public static final /* synthetic */ <S extends N<S>> Object e(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, long j10, S s10, ed.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            Object objG = g(s10, j10, pVar);
            if (O.h(objG)) {
                return objG;
            }
            N nF = O.f(objG);
            while (true) {
                N n10 = (N) atomicReferenceFieldUpdater.get(obj);
                if (n10.f220301c >= nF.f220301c) {
                    return objG;
                }
                if (!nF.C()) {
                    break;
                }
                if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, obj, n10, nF)) {
                    if (n10.v()) {
                        n10.q();
                    }
                    return objG;
                }
                if (nF.v()) {
                    nF.q();
                }
            }
        }
    }

    public static final /* synthetic */ <S extends N<S>> Object f(AtomicReferenceArray atomicReferenceArray, int i10, long j10, S s10, ed.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            Object objG = g(s10, j10, pVar);
            if (O.h(objG)) {
                return objG;
            }
            N nF = O.f(objG);
            while (true) {
                N n10 = (N) atomicReferenceArray.get(i10);
                if (n10.f220301c >= nF.f220301c) {
                    return objG;
                }
                if (!nF.C()) {
                    break;
                }
                if (com.google.common.util.concurrent.r.a(atomicReferenceArray, i10, n10, nF)) {
                    if (n10.v()) {
                        n10.q();
                    }
                    return objG;
                }
                if (nF.v()) {
                    nF.q();
                }
            }
        }
    }

    @NotNull
    public static final <S extends N<S>> Object g(@NotNull S s10, long j10, @NotNull ed.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            if (s10.f220301c >= j10 && !s10.m()) {
                return s10;
            }
            Object obj = AbstractC5073g.f220340a.get(s10);
            Q q10 = f220339b;
            if (obj == q10) {
                return q10;
            }
            S sInvoke = (S) ((AbstractC5073g) obj);
            if (sInvoke == null) {
                sInvoke = pVar.invoke(Long.valueOf(s10.f220301c + 1), s10);
                if (s10.t(sInvoke)) {
                    if (s10.m()) {
                        s10.q();
                    }
                }
            }
            s10 = (Object) sInvoke;
        }
    }

    public static final /* synthetic */ <S extends N<S>> boolean j(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, S s10) {
        while (true) {
            N n10 = (N) atomicReferenceFieldUpdater.get(obj);
            if (n10.f220301c >= s10.f220301c) {
                return true;
            }
            if (!s10.C()) {
                return false;
            }
            if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, obj, n10, s10)) {
                if (n10.v()) {
                    n10.q();
                }
                return true;
            }
            if (s10.v()) {
                s10.q();
            }
        }
    }

    public static final /* synthetic */ <S extends N<S>> boolean k(AtomicReferenceArray atomicReferenceArray, int i10, S s10) {
        while (true) {
            N n10 = (N) atomicReferenceArray.get(i10);
            if (n10.f220301c >= s10.f220301c) {
                return true;
            }
            if (!s10.C()) {
                return false;
            }
            if (com.google.common.util.concurrent.r.a(atomicReferenceArray, i10, n10, s10)) {
                if (n10.v()) {
                    n10.q();
                }
                return true;
            }
            if (s10.v()) {
                s10.q();
            }
        }
    }
}
