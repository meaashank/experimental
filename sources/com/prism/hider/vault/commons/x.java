package com.prism.hider.vault.commons;

import android.app.Activity;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public interface x {
    boolean onActivityPaused(@NonNull Activity activity);

    boolean onActivityResumed(@NonNull Activity activity);

    boolean onActivityStarted(@NonNull Activity activity);

    boolean onActivityStopped(@NonNull Activity activity);
}
