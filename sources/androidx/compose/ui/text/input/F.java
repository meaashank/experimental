package androidx.compose.ui.text.input;

import android.os.Handler;
import android.view.inputmethod.InputConnection;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@e.T(24)
public class F extends B {
    public F(@NotNull InputConnection inputConnection, @NotNull ed.l<? super A, L0> lVar) {
        super(inputConnection, lVar);
    }

    @Override // androidx.compose.ui.text.input.B
    public final void b(@NotNull InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // androidx.compose.ui.text.input.B, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        InputConnection inputConnection = this.f104678b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingTextInCodePoints(i10, i11);
        }
        return false;
    }

    @Override // androidx.compose.ui.text.input.B, android.view.inputmethod.InputConnection
    @Nullable
    public final Handler getHandler() {
        InputConnection inputConnection = this.f104678b;
        if (inputConnection != null) {
            return inputConnection.getHandler();
        }
        return null;
    }
}
