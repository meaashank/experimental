package com.android.launcher3.compat;

import android.annotation.TargetApi;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(25)
public class UserManagerCompatVNMr1 extends UserManagerCompatVN {
    public UserManagerCompatVNMr1(Context context) {
        super(context);
    }

    @Override // com.android.launcher3.compat.UserManagerCompatVL, com.android.launcher3.compat.UserManagerCompat
    public boolean isDemoUser() {
        return this.mUserManager.isDemoUser();
    }
}
