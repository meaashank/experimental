package androidx.compose.foundation.text.input.internal;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(25)
public final class C1778e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1778e f94098a = new C1778e();

    @InterfaceC4345t
    public final boolean a(@NotNull InputConnection inputConnection, @NotNull InputContentInfo inputContentInfo, int i10, @Nullable Bundle bundle) {
        return inputConnection.commitContent(inputContentInfo, i10, bundle);
    }
}
