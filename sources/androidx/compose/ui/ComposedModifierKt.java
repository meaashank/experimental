package androidx.compose.ui;

import androidx.compose.runtime.InterfaceC1946s;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.L0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class ComposedModifierKt {
    @NotNull
    public static final p b(@NotNull p pVar, @NotNull ed.l<? super C2278s0, L0> lVar, @NotNull ed.q<? super p, ? super InterfaceC1946s, ? super Integer, ? extends p> qVar) {
        return pVar.P0(new g(lVar, qVar));
    }

    @i
    @NotNull
    public static final p c(@NotNull p pVar, @NotNull String str, @Nullable Object obj, @NotNull ed.l<? super C2278s0, L0> lVar, @NotNull ed.q<? super p, ? super InterfaceC1946s, ? super Integer, ? extends p> qVar) {
        return pVar.P0(new k(str, obj, lVar, qVar));
    }

    @i
    @NotNull
    public static final p d(@NotNull p pVar, @NotNull String str, @Nullable Object obj, @Nullable Object obj2, @NotNull ed.l<? super C2278s0, L0> lVar, @NotNull ed.q<? super p, ? super InterfaceC1946s, ? super Integer, ? extends p> qVar) {
        return pVar.P0(new l(str, obj, obj2, lVar, qVar));
    }

    @i
    @NotNull
    public static final p e(@NotNull p pVar, @NotNull String str, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull ed.l<? super C2278s0, L0> lVar, @NotNull ed.q<? super p, ? super InterfaceC1946s, ? super Integer, ? extends p> qVar) {
        return pVar.P0(new m(str, obj, obj2, obj3, lVar, qVar));
    }

    @i
    @NotNull
    public static final p f(@NotNull p pVar, @NotNull String str, @NotNull Object[] objArr, @NotNull ed.l<? super C2278s0, L0> lVar, @NotNull ed.q<? super p, ? super InterfaceC1946s, ? super Integer, ? extends p> qVar) {
        return pVar.P0(new n(str, objArr, lVar, qVar));
    }

    public static /* synthetic */ p g(p pVar, ed.l lVar, ed.q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = InspectableValueKt.b();
        }
        return b(pVar, lVar, qVar);
    }

    public static /* synthetic */ p h(p pVar, String str, Object obj, ed.l lVar, ed.q qVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            lVar = InspectableValueKt.b();
        }
        return c(pVar, str, obj, lVar, qVar);
    }

    public static /* synthetic */ p i(p pVar, String str, Object obj, Object obj2, ed.l lVar, ed.q qVar, int i10, Object obj3) {
        if ((i10 & 8) != 0) {
            lVar = InspectableValueKt.b();
        }
        return d(pVar, str, obj, obj2, lVar, qVar);
    }

    public static /* synthetic */ p j(p pVar, String str, Object obj, Object obj2, Object obj3, ed.l lVar, ed.q qVar, int i10, Object obj4) {
        if ((i10 & 16) != 0) {
            lVar = InspectableValueKt.b();
        }
        return e(pVar, str, obj, obj2, obj3, lVar, qVar);
    }

    public static /* synthetic */ p k(p pVar, String str, Object[] objArr, ed.l lVar, ed.q qVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            lVar = InspectableValueKt.b();
        }
        return f(pVar, str, objArr, lVar, qVar);
    }

    public static final p m(final InterfaceC1946s interfaceC1946s, p pVar) {
        if (pVar.S(new ed.l<p.c, Boolean>() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$1
            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull p.c cVar) {
                return Boolean.valueOf(!(cVar instanceof g));
            }
        })) {
            return pVar;
        }
        interfaceC1946s.Z(1219399079);
        p pVar2 = (p) pVar.l0(p.f103112M2, new ed.p<p, p.c, p>() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$result$1
            {
                super(2);
            }

            @Override // ed.p
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final p invoke(@NotNull p pVar3, @NotNull p.c cVar) {
                boolean z10 = cVar instanceof g;
                p pVarM = cVar;
                if (z10) {
                    ed.q<p, InterfaceC1946s, Integer, p> qVar = ((g) cVar).f100671d;
                    G.n(qVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                    Y.q(qVar, 3);
                    pVarM = ComposedModifierKt.m(interfaceC1946s, qVar.invoke(p.f103112M2, interfaceC1946s, 0));
                }
                return pVar3.P0(pVarM);
            }
        });
        interfaceC1946s.l0();
        return pVar2;
    }

    @dd.j(name = "materializeModifier")
    @NotNull
    public static final p n(@NotNull InterfaceC1946s interfaceC1946s, @NotNull p pVar) {
        interfaceC1946s.y(439770924);
        p pVarM = m(interfaceC1946s, pVar);
        interfaceC1946s.u();
        return pVarM;
    }

    @NotNull
    public static final p o(@NotNull InterfaceC1946s interfaceC1946s, @NotNull p pVar) {
        return pVar == p.f103112M2 ? pVar : n(interfaceC1946s, o.a(new CompositionLocalMapInjectionElement(interfaceC1946s.g()), pVar));
    }
}
