package androidx.savedstate;

import android.view.View;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.G;

/* JADX INFO: loaded from: classes2.dex */
public final class g {
    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Replaced by View.findViewTreeSavedStateRegistryOwner() from savedstate module", replaceWith = @InterfaceC4852c0(expression = "findViewTreeSavedStateRegistryOwner()", imports = {"androidx.savedstate.findViewTreeSavedStateRegistryOwner"}))
    public static final /* synthetic */ f a(View view) {
        G.p(view, "<this>");
        return ViewTreeSavedStateRegistryOwner.a(view);
    }
}
