package androidx.compose.foundation.relocation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.layout.C2189y;
import androidx.compose.ui.layout.InterfaceC2188x;
import androidx.compose.ui.node.C2205i;
import androidx.compose.ui.node.InterfaceC2203g;
import ed.InterfaceC4376a;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    public static final class a implements androidx.compose.foundation.relocation.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2203g f92585a;

        public a(InterfaceC2203g interfaceC2203g) {
            this.f92585a = interfaceC2203g;
        }

        @Override // androidx.compose.foundation.relocation.a
        @Nullable
        public final Object o1(@NotNull InterfaceC2188x interfaceC2188x, @NotNull InterfaceC4376a<P.j> interfaceC4376a, @NotNull kotlin.coroutines.e<? super L0> eVar) {
            View viewA = C2205i.a(this.f92585a);
            long jF = C2189y.f(interfaceC2188x);
            P.j jVarInvoke = interfaceC4376a.invoke();
            P.j jVarT = jVarInvoke != null ? jVarInvoke.T(jF) : null;
            if (jVarT != null) {
                viewA.requestRectangleOnScreen(i.c(jVarT), false);
            }
            return L0.f217464a;
        }
    }

    @NotNull
    public static final androidx.compose.foundation.relocation.a b(@NotNull InterfaceC2203g interfaceC2203g) {
        return new a(interfaceC2203g);
    }

    public static final Rect c(P.j jVar) {
        return new Rect((int) jVar.f65511a, (int) jVar.f65512b, (int) jVar.f65513c, (int) jVar.f65514d);
    }
}
