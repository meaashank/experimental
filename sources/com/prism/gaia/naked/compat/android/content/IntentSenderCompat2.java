package com.prism.gaia.naked.compat.android.content;

import W6.c;
import android.content.IntentSender;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.metadata.android.content.IntentSenderCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class IntentSenderCompat2 {

    public static class Util {
        public static Object getTarget(IntentSender intentSender) {
            return IntentSenderCAG.f165601G.mTarget().get(intentSender);
        }

        public static IBinder getTargetAsBinder(IntentSender intentSender) {
            IInterface iInterface = (IInterface) getTarget(intentSender);
            if (iInterface == null) {
                return null;
            }
            return iInterface.asBinder();
        }
    }
}
