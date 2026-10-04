package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt;
import androidx.compose.foundation.text.input.internal.InterfaceC1802q;
import androidx.compose.ui.focus.H;
import androidx.compose.ui.focus.InterfaceC1993h;
import androidx.compose.ui.node.C2205i;
import androidx.compose.ui.p;
import ed.InterfaceC4376a;
import kotlin.G;
import kotlin.I;
import kotlin.LazyThreadSafetyMode;
import kotlinx.coroutines.C5092j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class HandwritingHandlerNode extends p.d implements InterfaceC1993h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public H f93578o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final G f93579p = I.c(LazyThreadSafetyMode.NONE, new InterfaceC4376a<InterfaceC1802q>() { // from class: androidx.compose.foundation.text.handwriting.HandwritingHandlerNode$composeImm$2
        {
            super(0);
        }

        @Override // ed.InterfaceC4376a
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1802q invoke() {
            return ComposeInputMethodManager_androidKt.a(C2205i.a(this.f93580d));
        }
    });

    @Override // androidx.compose.ui.focus.InterfaceC1993h
    public void a0(@NotNull H h10) {
        if (kotlin.jvm.internal.G.g(this.f93578o, h10)) {
            return;
        }
        this.f93578o = h10;
        if (h10.getHasFocus()) {
            C5092j.f(B2(), null, null, new HandwritingHandlerNode$onFocusEvent$1(this, null), 3, null);
        }
    }

    public final InterfaceC1802q f3() {
        return (InterfaceC1802q) this.f93579p.getValue();
    }
}
