package com.prism.gaia.naked.compat.android.content;

import W6.c;
import android.content.SyncAdapterType;
import com.prism.gaia.naked.metadata.android.content.SyncAdapterTypeCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class SyncAdapterTypeCompat2 {

    public static class Util {
        private static final String TAG = "asdf-".concat(Util.class.getSimpleName());

        public static SyncAdapterType ctor(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, String str3, String str4) {
            if (SyncAdapterTypeCAG.CN24.ctor() != null) {
                return SyncAdapterTypeCAG.CN24.ctor().newInstance(str, str2, Boolean.valueOf(z10), Boolean.valueOf(z11), Boolean.valueOf(z12), Boolean.valueOf(z13), str3, str4);
            }
            if (SyncAdapterTypeCAG.f165603C.ctor() != null) {
                return SyncAdapterTypeCAG.f165603C.ctor().newInstance(str, str2, Boolean.valueOf(z10), Boolean.valueOf(z11), Boolean.valueOf(z12), Boolean.valueOf(z13), str3);
            }
            return null;
        }
    }
}
