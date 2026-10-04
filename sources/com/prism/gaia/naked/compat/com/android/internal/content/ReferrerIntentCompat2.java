package com.prism.gaia.naked.compat.com.android.internal.content;

import W6.c;
import android.content.Intent;
import com.prism.gaia.naked.metadata.com.android.internal.content.ReferrerIntentCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ReferrerIntentCompat2 {

    public static class Util {
        public static Object ctor(Intent intent, String str) {
            return ReferrerIntentCAG.f165983G.ctor().newInstance(intent, str);
        }

        public static String getMReferrer(Object obj) {
            return ReferrerIntentCAG.f165983G.mReferrer().get(obj);
        }
    }
}
