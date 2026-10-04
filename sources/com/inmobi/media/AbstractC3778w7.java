package com.inmobi.media;

import androidx.room.C2650a;
import java.util.Locale;

/* JADX INFO: renamed from: com.inmobi.media.w7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3778w7 {
    public static byte a(String referencedCreativeString) {
        kotlin.jvm.internal.G.p(referencedCreativeString, "referencedCreativeString");
        Locale locale = Locale.US;
        String strA = C2650a.a(locale, "US", referencedCreativeString, locale, "this as java.lang.String).toLowerCase(locale)");
        int length = strA.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.G.t(strA.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String strA2 = R6.a(length, 1, strA, i10);
        int iHashCode = strA2.hashCode();
        if (iHashCode != -1412832500) {
            return iHashCode != 0 ? (byte) 1 : (byte) 1;
        }
        if (strA2.equals("companion")) {
            return (byte) 2;
        }
        return (byte) 0;
    }
}
