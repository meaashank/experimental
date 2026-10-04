package com.prism.gaia.naked.metadata.android.app.admin;

import W6.b;
import W6.c;
import W6.i;
import W6.l;
import W6.n;
import android.app.admin.DevicePolicyManager;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public class DevicePolicyManagerCAGI {

    @l
    @i(DevicePolicyManager.class)
    public interface G extends ClassAccessor {
        @n("mService")
        NakedObject<IInterface> mService();
    }
}
