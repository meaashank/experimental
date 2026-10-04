package com.prism.gaia.naked.compat.android.content.pm;

import android.content.Intent;
import android.os.IInterface;
import com.prism.gaia.naked.metadata.android.content.pm.IPackageDataObserver2CAG;

/* JADX INFO: loaded from: classes6.dex */
public class IPackageDataObserver2Compat2 {

    public static class Util {
        public static void onPackageDeleted(IInterface iInterface, String str, int i10, String str2) {
            if (iInterface == null) {
                return;
            }
            IPackageDataObserver2CAG.f165639G.onPackageDeleted().call(iInterface, str, Integer.valueOf(i10), str2);
        }

        public static void onUserActionRequired(IInterface iInterface, Intent intent) {
            if (iInterface == null) {
                return;
            }
            IPackageDataObserver2CAG.f165639G.onUserActionRequired().call(iInterface, intent);
        }
    }
}
