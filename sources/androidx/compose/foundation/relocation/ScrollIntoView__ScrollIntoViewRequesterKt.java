package androidx.compose.foundation.relocation;

import P.o;
import androidx.compose.ui.layout.InterfaceC2188x;
import androidx.compose.ui.node.C2204h;
import androidx.compose.ui.node.InterfaceC2203g;
import ed.InterfaceC4376a;
import k0.y;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ScrollIntoView__ScrollIntoViewRequesterKt {
    @Nullable
    public static final Object a(@NotNull InterfaceC2203g interfaceC2203g, @Nullable final P.j jVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        if (!interfaceC2203g.g0().f103127m) {
            return L0.f217464a;
        }
        final InterfaceC2188x interfaceC2188xP = C2204h.p(interfaceC2203g);
        a aVarC = f.c(interfaceC2203g);
        if (aVarC == null) {
            return L0.f217464a;
        }
        Object objO1 = aVarC.o1(interfaceC2188xP, new InterfaceC4376a<P.j>() { // from class: androidx.compose.foundation.relocation.ScrollIntoView__ScrollIntoViewRequesterKt$scrollIntoView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            @Nullable
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final P.j invoke() {
                P.j jVar2 = jVar;
                if (jVar2 != null) {
                    return jVar2;
                }
                InterfaceC2188x interfaceC2188x = interfaceC2188xP;
                if (!interfaceC2188x.H()) {
                    interfaceC2188x = null;
                }
                if (interfaceC2188x != null) {
                    return o.m(y.h(interfaceC2188x.b()));
                }
                return null;
            }
        }, eVar);
        return objO1 == CoroutineSingletons.COROUTINE_SUSPENDED ? objO1 : L0.f217464a;
    }

    public static Object b(InterfaceC2203g interfaceC2203g, P.j jVar, kotlin.coroutines.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = null;
        }
        return a(interfaceC2203g, jVar, eVar);
    }
}
