package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.runtime.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/AbstractApplier\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,289:1\n50#2,7:290\n*S KotlinDebug\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/AbstractApplier\n*L\n206#1:290,7\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public abstract class AbstractC1883a<T> implements InterfaceC1908f<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f99409d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f99410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<T> f99411b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f99412c;

    public AbstractC1883a(T t10) {
        this.f99410a = t10;
        this.f99412c = t10;
    }

    @Override // androidx.compose.runtime.InterfaceC1908f
    public T b() {
        return this.f99412c;
    }

    @Override // androidx.compose.runtime.InterfaceC1908f
    public /* synthetic */ void c() {
    }

    @Override // androidx.compose.runtime.InterfaceC1908f
    public final void clear() {
        this.f99411b.clear();
        n(this.f99410a);
        l();
    }

    @Override // androidx.compose.runtime.InterfaceC1908f
    public /* synthetic */ void d() {
    }

    @Override // androidx.compose.runtime.InterfaceC1908f
    public void h(T t10) {
        this.f99411b.add(b());
        n(t10);
    }

    @Override // androidx.compose.runtime.InterfaceC1908f
    public void i() {
        if (this.f99411b.isEmpty()) {
            U0.e("empty stack");
            throw null;
        }
        n(this.f99411b.remove(r0.size() - 1));
    }

    public final T j() {
        return this.f99410a;
    }

    public final void k(@NotNull List<T> list, int i10, int i11, int i12) {
        int i13 = i10 > i11 ? i11 : i11 - i12;
        if (i12 != 1) {
            List<T> listSubList = list.subList(i10, i12 + i10);
            List listD6 = kotlin.collections.U.d6(listSubList);
            listSubList.clear();
            list.addAll(i13, listD6);
            return;
        }
        if (i10 == i11 + 1 || i10 == i11 - 1) {
            list.set(i10, list.set(i11, list.get(i10)));
        } else {
            list.add(i13, list.remove(i10));
        }
    }

    public abstract void l();

    public final void m(@NotNull List<T> list, int i10, int i11) {
        if (i11 == 1) {
            list.remove(i10);
        } else {
            list.subList(i10, i11 + i10).clear();
        }
    }

    public void n(T t10) {
        this.f99412c = t10;
    }
}
