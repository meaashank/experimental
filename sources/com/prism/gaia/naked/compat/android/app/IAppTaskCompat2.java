package com.prism.gaia.naked.compat.android.app;

import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.metadata.android.app.IAppTaskCAG;

/* JADX INFO: loaded from: classes6.dex */
public class IAppTaskCompat2 {

    public static class Util {
        public static IInterface asInterface(IBinder iBinder) {
            return IAppTaskCAG.f165325G.Stub.asInterface().call(iBinder);
        }
    }
}
