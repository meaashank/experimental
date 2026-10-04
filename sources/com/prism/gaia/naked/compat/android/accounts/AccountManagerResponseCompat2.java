package com.prism.gaia.naked.compat.android.accounts;

import W6.c;
import android.os.IInterface;
import com.prism.gaia.naked.metadata.android.accounts.AccountManagerResponseCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class AccountManagerResponseCompat2 {

    public static class Util {
        public static Object ctor(IInterface iInterface) {
            if (AccountManagerResponseCAG.f165234C.ctor() != null) {
                return AccountManagerResponseCAG.f165234C.ctor().newInstance(iInterface);
            }
            return null;
        }
    }
}
