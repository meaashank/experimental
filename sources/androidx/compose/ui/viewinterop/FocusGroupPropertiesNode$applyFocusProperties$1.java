package androidx.compose.ui.viewinterop;

import androidx.compose.ui.focus.C1989d;
import androidx.compose.ui.focus.FocusRequester;
import ed.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class FocusGroupPropertiesNode$applyFocusProperties$1 extends FunctionReferenceImpl implements l<C1989d, FocusRequester> {
    public FocusGroupPropertiesNode$applyFocusProperties$1(Object obj) {
        super(1, obj, FocusGroupPropertiesNode.class, "onEnter", "onEnter-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
    }

    @NotNull
    public final FocusRequester e(int i10) {
        return ((FocusGroupPropertiesNode) this.receiver).g3(i10);
    }

    @Override // ed.l
    public /* synthetic */ FocusRequester invoke(C1989d c1989d) {
        return e(c1989d.f100660a);
    }
}
