package androidx.compose.ui.platform;

import androidx.lifecycle.InterfaceC2611y;
import androidx.lifecycle.Lifecycle;
import ed.InterfaceC4376a;

/* JADX INFO: loaded from: classes.dex */
public final class ViewCompositionStrategy_androidKt {
    public static final InterfaceC4376a<kotlin.L0> c(final AbstractComposeView abstractComposeView, final Lifecycle lifecycle) {
        if (lifecycle.d().compareTo(Lifecycle.State.DESTROYED) > 0) {
            final InterfaceC2611y interfaceC2611y = new InterfaceC2611y() { // from class: androidx.compose.ui.platform.E1
                @Override // androidx.lifecycle.InterfaceC2611y
                public final void onStateChanged(androidx.lifecycle.B b10, Lifecycle.Event event) {
                    ViewCompositionStrategy_androidKt.d(abstractComposeView, b10, event);
                }
            };
            lifecycle.c(interfaceC2611y);
            return new InterfaceC4376a<kotlin.L0>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // ed.InterfaceC4376a
                public /* bridge */ /* synthetic */ kotlin.L0 invoke() {
                    invoke2();
                    return kotlin.L0.f217464a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    lifecycle.g(interfaceC2611y);
                }
            };
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    }

    public static final void d(AbstractComposeView abstractComposeView, androidx.lifecycle.B b10, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            abstractComposeView.g();
        }
    }
}
