package androidx.compose.runtime;

import kotlin.InterfaceC4850b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.runtime.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class C1967t1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC1946s f100211a;

    public /* synthetic */ C1967t1(InterfaceC1946s interfaceC1946s) {
        this.f100211a = interfaceC1946s;
    }

    public static final /* synthetic */ C1967t1 a(InterfaceC1946s interfaceC1946s) {
        return new C1967t1(interfaceC1946s);
    }

    @NotNull
    public static <T> InterfaceC1946s b(@NotNull InterfaceC1946s interfaceC1946s) {
        return interfaceC1946s;
    }

    public static boolean c(InterfaceC1946s interfaceC1946s, Object obj) {
        return (obj instanceof C1967t1) && kotlin.jvm.internal.G.g(interfaceC1946s, ((C1967t1) obj).f100211a);
    }

    public static final boolean d(InterfaceC1946s interfaceC1946s, InterfaceC1946s interfaceC1946s2) {
        return kotlin.jvm.internal.G.g(interfaceC1946s, interfaceC1946s2);
    }

    @InterfaceC4850b0
    public static /* synthetic */ void e() {
    }

    public static int f(InterfaceC1946s interfaceC1946s) {
        return interfaceC1946s.hashCode();
    }

    public static String g(InterfaceC1946s interfaceC1946s) {
        return "SkippableUpdater(composer=" + interfaceC1946s + ')';
    }

    public static final void i(InterfaceC1946s interfaceC1946s, @NotNull ed.l<? super Updater<T>, kotlin.L0> lVar) {
        interfaceC1946s.Z(509942095);
        lVar.invoke(new Updater(interfaceC1946s));
        interfaceC1946s.l0();
    }

    public boolean equals(Object obj) {
        return c(this.f100211a, obj);
    }

    public final /* synthetic */ InterfaceC1946s h() {
        return this.f100211a;
    }

    public int hashCode() {
        return this.f100211a.hashCode();
    }

    public String toString() {
        return g(this.f100211a);
    }
}
