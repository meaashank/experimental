package androidx.lifecycle;

import android.view.View;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;

/* JADX INFO: loaded from: classes2.dex */
@dd.j(name = "ViewTreeViewModelKt")
public final class r0 {
    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Replaced by View.findViewTreeViewModelStoreOwner in ViewTreeViewModelStoreOwner", replaceWith = @InterfaceC4852c0(expression = "View.findViewTreeViewModelStoreOwner", imports = {"androidx.lifecycle.ViewTreeViewModelStoreOwner"}))
    public static final /* synthetic */ q0 a(View view) {
        kotlin.jvm.internal.G.p(view, "view");
        return ViewTreeViewModelStoreOwner.a(view);
    }
}
