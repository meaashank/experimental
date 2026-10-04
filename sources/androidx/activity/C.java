package androidx.activity;

import ed.InterfaceC4376a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nOnBackPressedCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1855#2,2:116\n*S KotlinDebug\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n*L\n67#1:116,2\n*E\n"})
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f84852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<InterfaceC1479f> f84853b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public InterfaceC4376a<L0> f84854c;

    public C(boolean z10) {
        this.f84852a = z10;
    }

    @dd.j(name = "addCancellable")
    public final void d(@NotNull InterfaceC1479f cancellable) {
        kotlin.jvm.internal.G.p(cancellable, "cancellable");
        this.f84853b.add(cancellable);
    }

    @Nullable
    public final InterfaceC4376a<L0> e() {
        return this.f84854c;
    }

    @e.I
    public void f() {
    }

    @e.I
    public abstract void g();

    @e.I
    public void h(@NotNull C1478e backEvent) {
        kotlin.jvm.internal.G.p(backEvent, "backEvent");
    }

    @e.I
    public void i(@NotNull C1478e backEvent) {
        kotlin.jvm.internal.G.p(backEvent, "backEvent");
    }

    @e.I
    public final boolean j() {
        return this.f84852a;
    }

    @e.I
    public final void k() {
        Iterator<T> it = this.f84853b.iterator();
        while (it.hasNext()) {
            ((InterfaceC1479f) it.next()).cancel();
        }
    }

    @dd.j(name = "removeCancellable")
    public final void l(@NotNull InterfaceC1479f cancellable) {
        kotlin.jvm.internal.G.p(cancellable, "cancellable");
        this.f84853b.remove(cancellable);
    }

    @e.I
    public final void m(boolean z10) {
        this.f84852a = z10;
        InterfaceC4376a<L0> interfaceC4376a = this.f84854c;
        if (interfaceC4376a != null) {
            interfaceC4376a.invoke();
        }
    }

    public final void n(@Nullable InterfaceC4376a<L0> interfaceC4376a) {
        this.f84854c = interfaceC4376a;
    }
}
