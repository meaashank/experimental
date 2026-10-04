package androidx.lifecycle;

import android.view.View;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;

/* JADX INFO: loaded from: classes2.dex */
@dd.j(name = "ViewKt")
public final class j0 {
    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Replaced by View.findViewTreeLifecycleOwner() from lifecycle module", replaceWith = @InterfaceC4852c0(expression = "findViewTreeLifecycleOwner()", imports = {"androidx.lifecycle.findViewTreeLifecycleOwner"}))
    public static final /* synthetic */ B a(View view) {
        kotlin.jvm.internal.G.p(view, "view");
        return ViewTreeLifecycleOwner.a(view);
    }
}
