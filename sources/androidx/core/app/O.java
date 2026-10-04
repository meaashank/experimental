package androidx.core.app;

import android.content.Intent;
import androidx.core.util.InterfaceC2427d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface O {
    void addOnNewIntentListener(@NotNull InterfaceC2427d<Intent> interfaceC2427d);

    void removeOnNewIntentListener(@NotNull InterfaceC2427d<Intent> interfaceC2427d);
}
