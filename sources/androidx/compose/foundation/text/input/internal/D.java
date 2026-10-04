package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.graphics.O2;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.T(33)
@androidx.compose.runtime.internal.r(parameters = 1)
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final D f93704a = new D();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f93705b = 0;

    @dd.o
    @InterfaceC4345t
    @NotNull
    public static final CursorAnchorInfo.Builder a(@NotNull CursorAnchorInfo.Builder builder, @NotNull P.j jVar) {
        return builder.setEditorBoundsInfo(C.a().setEditorBounds(O2.c(jVar)).setHandwritingBounds(O2.c(jVar)).build());
    }
}
