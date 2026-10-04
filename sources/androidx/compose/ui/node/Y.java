package androidx.compose.ui.node;

import ed.InterfaceC4376a;
import java.util.List;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nMutableVectorWithMutationTracking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,54:1\n460#2,11:55\n523#2:66\n*S KotlinDebug\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n*L\n48#1:55,11\n52#1:66\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class Y<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f103025c = androidx.compose.runtime.collection.c.f99563d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.collection.c<T> f103026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<L0> f103027b;

    public Y(@NotNull androidx.compose.runtime.collection.c<T> cVar, @NotNull InterfaceC4376a<L0> interfaceC4376a) {
        this.f103026a = cVar;
        this.f103027b = interfaceC4376a;
    }

    public final void a(int i10, T t10) {
        this.f103026a.a(i10, t10);
        this.f103027b.invoke();
    }

    @NotNull
    public final List<T> b() {
        return this.f103026a.o();
    }

    public final void c() {
        this.f103026a.q();
        this.f103027b.invoke();
    }

    public final void d(@NotNull ed.l<? super T, L0> lVar) {
        androidx.compose.runtime.collection.c<T> cVar = this.f103026a;
        int i10 = cVar.f99566c;
        if (i10 > 0) {
            T[] tArr = cVar.f99564a;
            int i11 = 0;
            do {
                lVar.invoke(tArr[i11]);
                i11++;
            } while (i11 < i10);
        }
    }

    public final T e(int i10) {
        return this.f103026a.f99564a[i10];
    }

    @NotNull
    public final InterfaceC4376a<L0> f() {
        return this.f103027b;
    }

    public final int g() {
        return this.f103026a.f99566c;
    }

    @NotNull
    public final androidx.compose.runtime.collection.c<T> h() {
        return this.f103026a;
    }

    public final T i(int i10) {
        T tL0 = this.f103026a.l0(i10);
        this.f103027b.invoke();
        return tL0;
    }
}
