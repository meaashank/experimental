package com.prism.gaia.naked.compat.android.os;

import W6.c;
import com.prism.gaia.naked.metadata.android.os.UserHandlerCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class UserHandlerCompat2 {

    public static class Util {
        public static int getPerUserRange() {
            if (UserHandlerCAG.f165895C.PER_USER_RANGE() != null) {
                return UserHandlerCAG.f165895C.PER_USER_RANGE().get();
            }
            return -1;
        }

        public static boolean isMuEnabled() {
            if (UserHandlerCAG.f165895C.MU_ENABLED() != null) {
                return UserHandlerCAG.f165895C.MU_ENABLED().get();
            }
            return false;
        }
    }
}
