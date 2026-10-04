package androidx.compose.ui.window;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import dd.o;
import e.InterfaceC4345t;
import e.T;
import ed.InterfaceC4376a;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T(33)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f105740a = new c();

    @o
    @InterfaceC4345t
    @NotNull
    public static final OnBackInvokedCallback b(@Nullable final InterfaceC4376a<L0> interfaceC4376a) {
        return new OnBackInvokedCallback() { // from class: androidx.compose.ui.window.b
            public final void onBackInvoked() {
                c.c(interfaceC4376a);
            }
        };
    }

    public static final void c(InterfaceC4376a interfaceC4376a) {
        if (interfaceC4376a != null) {
            interfaceC4376a.invoke();
        }
    }

    @o
    @InterfaceC4345t
    public static final void d(@NotNull View view, @Nullable Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
    }

    @o
    @InterfaceC4345t
    public static final void e(@NotNull View view, @Nullable Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
    }
}
