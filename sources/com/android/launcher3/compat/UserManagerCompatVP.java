package com.android.launcher3.compat;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.UserHandle;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(28)
public class UserManagerCompatVP extends UserManagerCompatVNMr1 {
    public UserManagerCompatVP(Context context) {
        super(context);
    }

    @Override // com.android.launcher3.compat.UserManagerCompatVL, com.android.launcher3.compat.UserManagerCompat
    public boolean requestQuietModeEnabled(boolean z10, UserHandle userHandle) {
        return this.mUserManager.requestQuietModeEnabled(z10, userHandle);
    }
}
