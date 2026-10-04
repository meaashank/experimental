package com.prism.gaia.naked.compat.android.content;

import W6.c;
import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.prism.gaia.naked.metadata.android.content.IIntentReceiverCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class IIntentReceiverCompat2 {

    public static class Util {
        public static void performReceive(IInterface iInterface, Intent intent, int i10, String str, Bundle bundle, boolean z10, boolean z11, int i11) {
            IIntentReceiverCAG.J17.performReceive().call(iInterface, intent, Integer.valueOf(i10), str, bundle, Boolean.valueOf(z10), Boolean.valueOf(z11), Integer.valueOf(i11));
        }
    }
}
