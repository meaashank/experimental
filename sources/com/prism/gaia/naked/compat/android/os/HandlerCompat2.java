package com.prism.gaia.naked.compat.android.os;

import android.os.Handler;
import com.prism.gaia.naked.metadata.android.os.HandlerCAG;

/* JADX INFO: loaded from: classes6.dex */
public class HandlerCompat2 {

    public static class Util {
        public static Handler.Callback getCallback(Handler handler) {
            return HandlerCAG.f165871G.mCallback().get(handler);
        }

        public static void setAsynchronous(Handler handler, boolean z10) {
            if (HandlerCAG.f165870C.mAsynchronous() != null) {
                HandlerCAG.f165870C.mAsynchronous().set(handler, z10);
            }
        }
    }
}
