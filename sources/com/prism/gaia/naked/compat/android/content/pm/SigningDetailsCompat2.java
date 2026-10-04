package com.prism.gaia.naked.compat.android.content.pm;

import android.content.pm.Signature;
import android.util.ArraySet;
import com.prism.gaia.naked.metadata.android.content.pm.SigningDetailsCAG;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes6.dex */
public class SigningDetailsCompat2 {

    public static class Util {
        public static Object ctor(Signature[] signatureArr, int i10, ArraySet<PublicKey> arraySet, Signature[] signatureArr2) {
            return SigningDetailsCAG.T33.ctor().newInstance(signatureArr, Integer.valueOf(i10), arraySet, signatureArr2);
        }
    }
}
