package androidx.compose.ui.focus;

import androidx.compose.ui.layout.u0;
import androidx.compose.ui.node.InterfaceC2199e;
import androidx.compose.ui.p;
import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class FocusRestorerNode extends p.d implements InterfaceC2199e, x, F {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f100604s = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public InterfaceC4376a<FocusRequester> f100605o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public u0.a f100606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final ed.l<C1989d, FocusRequester> f100607q = new ed.l<C1989d, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusRestorerNode$onExit$1
        {
            super(1);
        }

        @NotNull
        public final FocusRequester e(int i10) {
            FocusRequesterModifierNodeKt.f(this.f100610d);
            u0.a aVar = this.f100610d.f100606p;
            if (aVar != null) {
                aVar.release();
            }
            FocusRestorerNode focusRestorerNode = this.f100610d;
            focusRestorerNode.f100606p = FocusRequesterModifierNodeKt.c(focusRestorerNode);
            FocusRequester.f100591b.getClass();
            return FocusRequester.f100593d;
        }

        @Override // ed.l
        public /* synthetic */ FocusRequester invoke(C1989d c1989d) {
            return e(c1989d.f100660a);
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final ed.l<C1989d, FocusRequester> f100608r = new ed.l<C1989d, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusRestorerNode$onEnter$1
        {
            super(1);
        }

        @NotNull
        public final FocusRequester e(int i10) {
            FocusRequester focusRequesterInvoke;
            if (FocusRequesterModifierNodeKt.e(this.f100609d)) {
                FocusRequester.f100591b.getClass();
                focusRequesterInvoke = FocusRequester.f100594e;
            } else {
                InterfaceC4376a<FocusRequester> interfaceC4376a = this.f100609d.f100605o;
                focusRequesterInvoke = interfaceC4376a != null ? interfaceC4376a.invoke() : null;
            }
            u0.a aVar = this.f100609d.f100606p;
            if (aVar != null) {
                aVar.release();
            }
            this.f100609d.f100606p = null;
            if (focusRequesterInvoke != null) {
                return focusRequesterInvoke;
            }
            FocusRequester.f100591b.getClass();
            return FocusRequester.f100593d;
        }

        @Override // ed.l
        public /* synthetic */ FocusRequester invoke(C1989d c1989d) {
            return e(c1989d.f100660a);
        }
    };

    public FocusRestorerNode(@Nullable InterfaceC4376a<FocusRequester> interfaceC4376a) {
        this.f100605o = interfaceC4376a;
    }

    public static /* synthetic */ void g3() {
    }

    @Override // androidx.compose.ui.p.d
    public void P2() {
        u0.a aVar = this.f100606p;
        if (aVar != null) {
            aVar.release();
        }
        this.f100606p = null;
    }

    @Override // androidx.compose.ui.focus.x
    public void Z1(@NotNull v vVar) {
        vVar.e(this.f100608r);
        vVar.u(this.f100607q);
    }

    @Nullable
    public final InterfaceC4376a<FocusRequester> h3() {
        return this.f100605o;
    }

    public final void i3(@Nullable InterfaceC4376a<FocusRequester> interfaceC4376a) {
        this.f100605o = interfaceC4376a;
    }
}
