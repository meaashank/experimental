package com.prism.gaia.naked.compat.android.content;

import W6.c;
import android.content.BroadcastReceiver;
import com.prism.gaia.naked.compat.android.app.ActivityManagerNativeCompat2;
import com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAG;
import v8.C5705o;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class BroadcastReceiverCompat2 {

    public static class Util {
        public static BroadcastReceiver.PendingResult getPendingResult(BroadcastReceiver broadcastReceiver) {
            if (BroadcastReceiverCAG.f165589C.getPendingResult() != null) {
                return BroadcastReceiverCAG.f165589C.getPendingResult().call(broadcastReceiver, new Object[0]);
            }
            C5705o.c().a(new RuntimeException("BroadcastReceiverCAG.getPendingResult() reflect failed"), "REFLECT_FAIL", null);
            return null;
        }

        public static boolean isPendingResultFinished(BroadcastReceiver.PendingResult pendingResult) {
            if (BroadcastReceiverCAG.f165589C.PendingResult.mFinished() != null) {
                return BroadcastReceiverCAG.f165589C.PendingResult.mFinished().get(pendingResult);
            }
            return true;
        }

        public static void sendFinished(BroadcastReceiver.PendingResult pendingResult) {
            ActivityManagerNativeCompat2.Util.getIActivityManager();
        }

        public static void setPendingResult(BroadcastReceiver broadcastReceiver, BroadcastReceiver.PendingResult pendingResult) {
            if (BroadcastReceiverCAG.f165589C.setPendingResult() != null) {
                BroadcastReceiverCAG.f165589C.setPendingResult().call(broadcastReceiver, pendingResult);
            } else {
                C5705o.c().a(new RuntimeException("BroadcastReceiverCAG.setPendingResult() reflect failed"), "REFLECT_FAIL", null);
            }
        }
    }
}
