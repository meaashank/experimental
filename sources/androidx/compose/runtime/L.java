package androidx.compose.runtime;

import ed.InterfaceC4376a;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface L extends InterfaceC1971v {
    void a(@NotNull Object obj);

    @InterfaceC1936o0
    void c(@NotNull A0 a02);

    boolean e(@NotNull Set<? extends Object> set);

    void f();

    <R> R h(@Nullable L l10, int i10, @NotNull InterfaceC4376a<? extends R> interfaceC4376a);

    void invalidateAll();

    void j(@NotNull InterfaceC4376a<kotlin.L0> interfaceC4376a);

    void m();

    @InterfaceC1936o0
    void n(@NotNull List<Pair<B0, B0>> list);

    boolean o();

    boolean p();

    @InterfaceC1936o0
    void q();

    void r(@NotNull Set<? extends Object> set);

    void s();

    boolean t();

    void u(@NotNull Object obj);

    void w(@NotNull ed.p<? super InterfaceC1946s, ? super Integer, kotlin.L0> pVar);

    void y();
}
