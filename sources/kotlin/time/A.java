package kotlin.time;

import ed.InterfaceC4376a;
import kotlin.InterfaceC4887e0;
import kotlin.L0;
import kotlin.O0;
import kotlin.jvm.internal.V;
import kotlin.time.F;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nmeasureTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n1#1,139:1\n63#1,3:140\n135#1,3:143\n*S KotlinDebug\n*F\n+ 1 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n24#1:140,3\n95#1:143,3\n*E\n"})
public final class A {
    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {n.class})
    public static final long a(@NotNull InterfaceC4376a<L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        F.b.f218381b.getClass();
        C c10 = C.f218376b;
        long jE = c10.e();
        block.invoke();
        return c10.d(jE);
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {n.class})
    public static final long b(@NotNull F.b bVar, @NotNull InterfaceC4376a<L0> block) {
        kotlin.jvm.internal.G.p(bVar, "<this>");
        kotlin.jvm.internal.G.p(block, "block");
        C c10 = C.f218376b;
        long jE = c10.e();
        block.invoke();
        return c10.d(jE);
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {n.class})
    public static final long c(@NotNull F f10, @NotNull InterfaceC4376a<L0> block) {
        kotlin.jvm.internal.G.p(f10, "<this>");
        kotlin.jvm.internal.G.p(block, "block");
        E eA = f10.a();
        block.invoke();
        return eA.a();
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {n.class})
    @NotNull
    public static final <T> G<T> d(@NotNull InterfaceC4376a<? extends T> block) {
        kotlin.jvm.internal.G.p(block, "block");
        F.b.f218381b.getClass();
        C c10 = C.f218376b;
        return new G<>(block.invoke(), c10.d(c10.e()));
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {n.class})
    @NotNull
    public static final <T> G<T> e(@NotNull F.b bVar, @NotNull InterfaceC4376a<? extends T> block) {
        kotlin.jvm.internal.G.p(bVar, "<this>");
        kotlin.jvm.internal.G.p(block, "block");
        C c10 = C.f218376b;
        return new G<>(block.invoke(), c10.d(c10.e()));
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {n.class})
    @NotNull
    public static final <T> G<T> f(@NotNull F f10, @NotNull InterfaceC4376a<? extends T> block) {
        kotlin.jvm.internal.G.p(f10, "<this>");
        kotlin.jvm.internal.G.p(block, "block");
        return new G<>(block.invoke(), f10.a().a());
    }
}
