package androidx.compose.ui.text.input;

import android.view.KeyEvent;
import java.util.List;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC4982o(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
public interface InterfaceC2349s {
    void a(int i10);

    void b(@NotNull List<? extends InterfaceC2340i> list);

    void c(@NotNull KeyEvent keyEvent);

    void d(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15);

    void e(@NotNull S s10);
}
