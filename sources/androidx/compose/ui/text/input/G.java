package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@e.T(25)
public class G extends F {
    public G(@NotNull InputConnection inputConnection, @NotNull ed.l<? super A, L0> lVar) {
        super(inputConnection, lVar);
    }

    @Override // androidx.compose.ui.text.input.B, android.view.inputmethod.InputConnection
    public final boolean commitContent(@NotNull InputContentInfo inputContentInfo, int i10, @Nullable Bundle bundle) {
        InputConnection inputConnection = this.f104678b;
        if (inputConnection != null) {
            return inputConnection.commitContent(inputContentInfo, i10, bundle);
        }
        return false;
    }
}
