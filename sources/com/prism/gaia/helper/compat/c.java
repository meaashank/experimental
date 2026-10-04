package com.prism.gaia.helper.compat;

import android.os.IBinder;
import android.os.IInterface;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.naked.metadata.android.app.ApplicationThreadNativeCAG;
import com.prism.gaia.naked.metadata.android.app.IApplicationThreadCAG;

/* JADX INFO: loaded from: classes6.dex */
public class c {
    public static IInterface a(IBinder iBinder) {
        return C3841e.s() ? IApplicationThreadCAG.O26.Stub.asInterface().call(iBinder) : ApplicationThreadNativeCAG.f165278G.asInterface().call(iBinder);
    }
}
