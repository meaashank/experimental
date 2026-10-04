package com.prism.gaia.naked.compat.android.os;

import android.os.Looper;
import android.os.MessageQueue;
import com.prism.gaia.naked.metadata.android.os.LooperCAG;

/* JADX INFO: loaded from: classes6.dex */
public class LooperCompat2 {

    public static class Util {
        public static MessageQueue getQueue(Looper looper) {
            return LooperCAG.f165880G.mQueue().get(looper);
        }
    }
}
