package com.google.android.material.motion;

import androidx.activity.C1478e;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface MaterialBackHandler {
    void cancelBackProgress();

    void handleBackInvoked();

    void startBackProgress(@NonNull C1478e c1478e);

    void updateBackProgress(@NonNull C1478e c1478e);
}
