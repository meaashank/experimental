package com.google.firebase.sessions;

import android.content.ServiceConnection;
import android.os.Messenger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface SessionLifecycleServiceBinder {
    void bindToService(@NotNull Messenger messenger, @NotNull ServiceConnection serviceConnection);
}
