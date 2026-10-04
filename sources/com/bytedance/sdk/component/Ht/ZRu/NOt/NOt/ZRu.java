package com.bytedance.sdk.component.Ht.ZRu.NOt.NOt;

import android.content.ContentResolver;
import android.net.Uri;
import android.support.v4.media.e;
import android.text.TextUtils;
import com.bytedance.sdk.component.Ht.ZRu.FA;
import com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.Ht;
import com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.Mm;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    public static void NOt() {
        if (FA.Mm().Ht() == null) {
            return;
        }
        try {
            ContentResolver contentResolverMZ = mZ();
            if (contentResolverMZ != null) {
                contentResolverMZ.getType(Uri.parse(uR() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void ZRu() {
        if (FA.Mm().Ht() == null) {
            return;
        }
        try {
            ContentResolver contentResolverMZ = mZ();
            if (contentResolverMZ != null) {
                contentResolverMZ.getType(Uri.parse(uR() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    private static ContentResolver mZ() {
        try {
            if (FA.Mm().Ht() != null) {
                return FA.Mm().Ht().getContentResolver();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String uR() {
        return e.a(new StringBuilder(), Mm.NOt, "/ad_log_event/");
    }

    public static void ZRu(com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu) {
        if (zRu == null) {
            return;
        }
        try {
            ContentResolver contentResolverMZ = mZ();
            if (contentResolverMZ != null) {
                contentResolverMZ.getType(Uri.parse(uR() + "adLogDispatch?event=" + Ht.ZRu(zRu.Ht())));
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public static void ZRu(String str, List<String> list, boolean z10) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb2.append(Ht.ZRu(it.next()));
                sb2.append(",");
            }
            String str2 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(Ht.ZRu(sb2.toString())) + "&replace=" + String.valueOf(z10);
            ContentResolver contentResolverMZ = mZ();
            if (contentResolverMZ != null) {
                contentResolverMZ.getType(Uri.parse(uR() + "trackAdUrl" + str2));
            }
        } catch (Throwable unused) {
        }
    }

    public static void ZRu(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ContentResolver contentResolverMZ = mZ();
            if (contentResolverMZ != null) {
                contentResolverMZ.getType(Uri.parse(uR() + "trackAdFailed?did=" + String.valueOf(str)));
            }
        } catch (Throwable unused) {
        }
    }
}
