package com.prism.gaia.naked.compat.android.content.pm;

import android.os.IInterface;
import com.prism.gaia.naked.metadata.android.content.pm.IPackageDataObserverCAG;

/* JADX INFO: loaded from: classes6.dex */
public class IPackageDataObserverCompat2 {

    public static class Util {
        public static void onRemoveCompleted(IInterface iInterface, String str, boolean z10) {
            if (iInterface == null) {
                return;
            }
            IPackageDataObserverCAG.f165640G.onRemoveCompleted().call(iInterface, str, Boolean.valueOf(z10));
        }
    }
}
