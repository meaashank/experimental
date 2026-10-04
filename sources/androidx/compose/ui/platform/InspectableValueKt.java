package androidx.compose.ui.platform;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class InspectableValueKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ed.l<C2278s0, kotlin.L0> f103595a = new ed.l<C2278s0, kotlin.L0>() { // from class: androidx.compose.ui.platform.InspectableValueKt$NoInspectorInfo$1
        public final void e(@NotNull C2278s0 c2278s0) {
        }

        @Override // ed.l
        public /* bridge */ /* synthetic */ kotlin.L0 invoke(C2278s0 c2278s0) {
            return kotlin.L0.f217464a;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f103596b;

    @NotNull
    public static final ed.l<C2278s0, kotlin.L0> a(@NotNull final ed.l<? super C2278s0, kotlin.L0> lVar) {
        return f103596b ? new ed.l<C2278s0, kotlin.L0>() { // from class: androidx.compose.ui.platform.InspectableValueKt$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void e(@NotNull C2278s0 c2278s0) {
                lVar.invoke(c2278s0);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(C2278s0 c2278s0) {
                e(c2278s0);
                return kotlin.L0.f217464a;
            }
        } : f103595a;
    }

    @NotNull
    public static final ed.l<C2278s0, kotlin.L0> b() {
        return f103595a;
    }

    @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "This API will create more invalidations of your modifier than necessary, so it's use is discouraged. Implementing the inspectableProperties method on ModifierNodeElement is the recommended zero-cost alternative to exposing properties on a Modifier to tooling.")
    @NotNull
    public static final androidx.compose.ui.p c(@NotNull androidx.compose.ui.p pVar, @NotNull ed.l<? super C2278s0, kotlin.L0> lVar, @NotNull ed.l<? super androidx.compose.ui.p, ? extends androidx.compose.ui.p> lVar2) {
        return d(pVar, lVar, lVar2.invoke(androidx.compose.ui.p.f103112M2));
    }

    @InterfaceC4850b0
    @NotNull
    public static final androidx.compose.ui.p d(@NotNull androidx.compose.ui.p pVar, @NotNull ed.l<? super C2278s0, kotlin.L0> lVar, @NotNull androidx.compose.ui.p pVar2) {
        C2270p0 c2270p0 = new C2270p0(lVar);
        return pVar.P0(c2270p0).P0(pVar2).P0(c2270p0.f103909d);
    }

    public static final boolean e() {
        return f103596b;
    }

    public static final void f(boolean z10) {
        f103596b = z10;
    }
}
