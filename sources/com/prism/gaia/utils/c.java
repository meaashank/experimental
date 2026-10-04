package com.prism.gaia.utils;

import android.os.IBinder;
import com.prism.gaia.naked.metadata.android.os.BinderCAG;

/* JADX INFO: loaded from: classes6.dex */
public class c {
    public static IBinder a(IBinder iBinder) {
        return BinderCAG.f165855C.allowBlocking() == null ? iBinder : BinderCAG.f165855C.allowBlocking().call(iBinder);
    }
}
