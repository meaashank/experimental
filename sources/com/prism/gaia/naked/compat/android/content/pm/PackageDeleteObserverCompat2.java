package com.prism.gaia.naked.compat.android.content.pm;

import android.os.IInterface;
import com.prism.gaia.naked.metadata.android.content.pm.IPackageDataObserver2CAG;
import com.prism.gaia.naked.metadata.android.content.pm.IPackageDeleteObserverCAG;

/* JADX INFO: loaded from: classes6.dex */
public class PackageDeleteObserverCompat2 {
    public static final int DELETE_SUCCEEDED = 1;
    private static final String TAG = "PackageDeleteObserver";

    public static class Util {
        public static boolean deleted(IInterface iInterface, String str, int i10) {
            String interfaceDescriptor;
            if (iInterface == null) {
                return false;
            }
            try {
                interfaceDescriptor = iInterface.asBinder().getInterfaceDescriptor();
            } catch (Throwable th) {
                th.getMessage();
                interfaceDescriptor = null;
            }
            if (interfaceDescriptor != null) {
                try {
                    if (interfaceDescriptor.endsWith("IPackageDeleteObserver2")) {
                        IPackageDataObserver2CAG.f165639G.onPackageDeleted().call(iInterface, str, Integer.valueOf(i10), null);
                        return true;
                    }
                } catch (Throwable th2) {
                    th2.getMessage();
                    return false;
                }
            }
            if (interfaceDescriptor != null && interfaceDescriptor.endsWith("IPackageDeleteObserver")) {
                IPackageDeleteObserverCAG.f165641G.packageDeleted().call(iInterface, str, Integer.valueOf(i10));
                return true;
            }
            try {
                IPackageDeleteObserverCAG.f165641G.packageDeleted().call(iInterface, str, Integer.valueOf(i10));
                return true;
            } catch (Throwable unused) {
                IPackageDataObserver2CAG.f165639G.onPackageDeleted().call(iInterface, str, Integer.valueOf(i10), null);
                return true;
            }
        }
    }
}
