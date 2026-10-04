package com.prism.gaia.naked.compat.android.content;

import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.metadata.android.content.ContentProviderNativeCAG;

/* JADX INFO: loaded from: classes6.dex */
public class ContentProviderCompat2 {

    public static class Util {
        public static IInterface asInterface(IBinder iBinder) {
            return ContentProviderNativeCAG.f165592G.asInterface().call(iBinder);
        }
    }
}
