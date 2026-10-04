package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.graphics.O2;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(33)
public final class C2334c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2334c f104787a = new C2334c();

    @dd.o
    @InterfaceC4345t
    @NotNull
    public static final CursorAnchorInfo.Builder a(@NotNull CursorAnchorInfo.Builder builder, @NotNull P.j jVar) {
        return builder.setEditorBoundsInfo(androidx.compose.foundation.text.input.internal.C.a().setEditorBounds(O2.c(jVar)).setHandwritingBounds(O2.c(jVar)).build());
    }
}
