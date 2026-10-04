package androidx.compose.runtime;

import androidx.compose.animation.C1638s;
import kotlin.InterfaceC4850b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class Updater<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC1946s f99394a;

    public /* synthetic */ Updater(InterfaceC1946s interfaceC1946s) {
        this.f99394a = interfaceC1946s;
    }

    public static final /* synthetic */ Updater a(InterfaceC1946s interfaceC1946s) {
        return new Updater(interfaceC1946s);
    }

    @NotNull
    public static <T> InterfaceC1946s b(@NotNull InterfaceC1946s interfaceC1946s) {
        return interfaceC1946s;
    }

    public static boolean c(InterfaceC1946s interfaceC1946s, Object obj) {
        return (obj instanceof Updater) && kotlin.jvm.internal.G.g(interfaceC1946s, ((Updater) obj).f99394a);
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

    public static final void g(InterfaceC1946s interfaceC1946s, @NotNull final ed.l<? super T, kotlin.L0> lVar) {
        if (interfaceC1946s.J()) {
            interfaceC1946s.e(kotlin.L0.f217464a, new ed.p<T, kotlin.L0, kotlin.L0>() { // from class: androidx.compose.runtime.Updater$init$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void e(T t10, @NotNull kotlin.L0 l02) {
                    lVar.invoke(t10);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // ed.p
                public /* bridge */ /* synthetic */ kotlin.L0 invoke(Object obj, kotlin.L0 l02) {
                    e(obj, l02);
                    return kotlin.L0.f217464a;
                }
            });
        }
    }

    public static final void h(InterfaceC1946s interfaceC1946s, @NotNull final ed.l<? super T, kotlin.L0> lVar) {
        interfaceC1946s.e(kotlin.L0.f217464a, new ed.p<T, kotlin.L0, kotlin.L0>() { // from class: androidx.compose.runtime.Updater$reconcile$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void e(T t10, @NotNull kotlin.L0 l02) {
                lVar.invoke(t10);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ed.p
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(Object obj, kotlin.L0 l02) {
                e(obj, l02);
                return kotlin.L0.f217464a;
            }
        });
    }

    public static final void i(InterfaceC1946s interfaceC1946s, int i10, @NotNull ed.p<? super T, ? super Integer, kotlin.L0> pVar) {
        if (interfaceC1946s.J() || !kotlin.jvm.internal.G.g(interfaceC1946s.a0(), Integer.valueOf(i10))) {
            C1638s.a(i10, interfaceC1946s, i10, pVar);
        }
    }

    public static final <V> void j(InterfaceC1946s interfaceC1946s, V v10, @NotNull ed.p<? super T, ? super V, kotlin.L0> pVar) {
        if (interfaceC1946s.J() || !kotlin.jvm.internal.G.g(interfaceC1946s.a0(), v10)) {
            interfaceC1946s.S(v10);
            interfaceC1946s.e(v10, pVar);
        }
    }

    public static String k(InterfaceC1946s interfaceC1946s) {
        return "Updater(composer=" + interfaceC1946s + ')';
    }

    public static final void m(InterfaceC1946s interfaceC1946s, int i10, @NotNull ed.p<? super T, ? super Integer, kotlin.L0> pVar) {
        boolean zJ = interfaceC1946s.J();
        if (zJ || !kotlin.jvm.internal.G.g(interfaceC1946s.a0(), Integer.valueOf(i10))) {
            interfaceC1946s.S(Integer.valueOf(i10));
            if (zJ) {
                return;
            }
            interfaceC1946s.e(Integer.valueOf(i10), pVar);
        }
    }

    public static final <V> void n(InterfaceC1946s interfaceC1946s, V v10, @NotNull ed.p<? super T, ? super V, kotlin.L0> pVar) {
        boolean zJ = interfaceC1946s.J();
        if (zJ || !kotlin.jvm.internal.G.g(interfaceC1946s.a0(), v10)) {
            interfaceC1946s.S(v10);
            if (zJ) {
                return;
            }
            interfaceC1946s.e(v10, pVar);
        }
    }

    public boolean equals(Object obj) {
        return c(this.f99394a, obj);
    }

    public int hashCode() {
        return this.f99394a.hashCode();
    }

    public final /* synthetic */ InterfaceC1946s l() {
        return this.f99394a;
    }

    public String toString() {
        return k(this.f99394a);
    }
}
