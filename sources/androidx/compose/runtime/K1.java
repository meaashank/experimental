package androidx.compose.runtime;

import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,400:1\n1188#2:401\n460#3,11:402\n460#3,11:413\n48#3:424\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n*L\n367#1:401\n373#1:402,11\n377#1:413,11\n397#1:424\n*E\n"})
public final /* synthetic */ class K1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final N1<androidx.compose.runtime.internal.l> f99127a = new N1<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final N1<androidx.compose.runtime.collection.c<O>> f99128b = new N1<>();

    @NotNull
    public static final androidx.compose.runtime.collection.c<O> b() {
        N1<androidx.compose.runtime.collection.c<O>> n12 = f99128b;
        androidx.compose.runtime.collection.c<O> cVarA = n12.a();
        if (cVarA != null) {
            return cVarA;
        }
        androidx.compose.runtime.collection.c<O> cVar = new androidx.compose.runtime.collection.c<>(new O[0], 0);
        n12.b(cVar);
        return cVar;
    }

    @androidx.compose.runtime.snapshots.C
    @NotNull
    public static final <T> X1<T> c(@NotNull H1<T> h12, @NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        return new DerivedSnapshotState(interfaceC4376a, h12);
    }

    @androidx.compose.runtime.snapshots.C
    @NotNull
    public static final <T> X1<T> d(@NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        return new DerivedSnapshotState(interfaceC4376a, null);
    }

    public static final <R> R e(N<?> n10, InterfaceC4376a<? extends R> interfaceC4376a) {
        androidx.compose.runtime.collection.c<O> cVarB = b();
        int i10 = cVarB.f99566c;
        int i11 = 0;
        if (i10 > 0) {
            O[] oArr = cVarB.f99564a;
            int i12 = 0;
            do {
                oArr[i12].b(n10);
                i12++;
            } while (i12 < i10);
        }
        try {
            R rInvoke = interfaceC4376a.invoke();
            int i13 = cVarB.f99566c;
            if (i13 > 0) {
                O[] oArr2 = cVarB.f99564a;
                do {
                    oArr2[i11].a(n10);
                    i11++;
                } while (i11 < i13);
            }
            return rInvoke;
        } catch (Throwable th) {
            int i14 = cVarB.f99566c;
            if (i14 > 0) {
                O[] oArr3 = cVarB.f99564a;
                do {
                    oArr3[i11].a(n10);
                    i11++;
                } while (i11 < i14);
            }
            throw th;
        }
    }

    public static final <R> void f(@NotNull O o10, @NotNull InterfaceC4376a<? extends R> interfaceC4376a) {
        androidx.compose.runtime.collection.c<O> cVarB = b();
        try {
            cVarB.b(o10);
            interfaceC4376a.invoke();
        } finally {
            cVarB.l0(cVarB.f99566c - 1);
        }
    }

    public static final <T> T g(ed.l<? super androidx.compose.runtime.internal.l, ? extends T> lVar) {
        N1<androidx.compose.runtime.internal.l> n12 = f99127a;
        androidx.compose.runtime.internal.l lVarA = n12.a();
        if (lVarA == null) {
            lVarA = new androidx.compose.runtime.internal.l(0);
            n12.b(lVarA);
        }
        return lVar.invoke(lVarA);
    }
}
