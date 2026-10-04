package com.prism.gaia.naked.compat.android.app;

import android.os.IInterface;
import com.prism.gaia.naked.metadata.android.app.ActivityClientCAG;

/* JADX INFO: loaded from: classes6.dex */
public class ActivityClientCompat2 {

    public static class Util {
        public static IInterface getActivityClientController() {
            if (ActivityClientCAG.f165270C.getActivityClientController() == null) {
                return null;
            }
            return ActivityClientCAG.f165270C.getActivityClientController().call(new Object[0]);
        }

        public static Object getActivityClientControllerSingleton() {
            if (ActivityClientCAG.f165270C.INTERFACE_SINGLETON() == null) {
                return null;
            }
            return ActivityClientCAG.f165270C.INTERFACE_SINGLETON().get();
        }

        public static boolean setActivityClientController(IInterface iInterface) {
            if (ActivityClientCAG.f165270C.setActivityClientController() == null) {
                return false;
            }
            ActivityClientCAG.f165270C.setActivityClientController().call(iInterface);
            return true;
        }
    }
}
