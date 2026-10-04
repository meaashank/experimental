package com.prism.gaia.naked.compat.android.app;

import W6.c;
import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.naked.metadata.android.app.IServiceConnectionCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class IServiceConnectionCompat2 {

    public static class Util {
        public static void connected(IInterface iInterface, ComponentName componentName, IBinder iBinder, boolean z10) {
            if (C3841e.G()) {
                if (IServiceConnectionCAG.C36.connected() != null) {
                    IServiceConnectionCAG.C36.connected().call(iInterface, componentName, iBinder, null, Boolean.valueOf(z10));
                    return;
                } else {
                    IServiceConnectionCAG.O26.connected().call(iInterface, componentName, iBinder, Boolean.valueOf(z10));
                    return;
                }
            }
            if (C3841e.s()) {
                IServiceConnectionCAG.O26.connected().call(iInterface, componentName, iBinder, Boolean.valueOf(z10));
            } else {
                IServiceConnectionCAG._N25.connected().call(iInterface, componentName, iBinder);
            }
        }
    }
}
