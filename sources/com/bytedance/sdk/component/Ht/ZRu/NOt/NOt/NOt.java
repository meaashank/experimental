package com.bytedance.sdk.component.Ht.ZRu.NOt.NOt;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.media.e;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.Ht.ZRu.FA;
import com.bytedance.sdk.component.Ht.ZRu.Ht;
import com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.Mm;
import com.bytedance.sdk.component.Ht.ZRu.uR;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {
    public static Ht ZRu;

    public static void NOt() {
        if (FA.Mm().Ht() == null) {
            return;
        }
        try {
            Ht htZRu = ZRu(FA.Mm().Ht());
            if (htZRu != null) {
                htZRu.ZRu(Uri.parse(uR() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    private static String uR() {
        return e.a(new StringBuilder(), Mm.NOt, "/ad_log_event/");
    }

    public int ZRu(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public String mZ() {
        return "ad_log_event";
    }

    public int ZRu(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public Cursor ZRu(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public Uri ZRu(Uri uri, ContentValues contentValues) {
        return null;
    }

    public static Ht ZRu(Context context) {
        try {
            if (ZRu == null) {
                ZRu = FA.Mm().yBV().ZH();
            }
        } catch (Exception unused) {
        }
        return ZRu;
    }

    public static void ZRu() {
        if (FA.Mm().Ht() == null) {
            return;
        }
        try {
            Ht htZRu = ZRu(FA.Mm().Ht());
            if (htZRu != null) {
                htZRu.ZRu(Uri.parse(uR() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void ZRu(com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu) {
        if (zRu == null) {
            return;
        }
        try {
            Ht htZRu = ZRu(FA.Mm().Ht());
            if (htZRu != null) {
                htZRu.ZRu(Uri.parse(uR() + "adLogDispatch?event=" + com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.Ht.ZRu(zRu.Ht())));
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public static void ZRu(String str, List<String> list, boolean z10, int i10, String str2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb2.append(com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.Ht.ZRu(it.next()));
                sb2.append(",");
            }
            String str3 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.Ht.ZRu(sb2.toString())) + "&replace=" + String.valueOf(z10) + "&urlType=" + String.valueOf(i10) + "&adId=" + str2;
            Ht htZRu = ZRu(FA.Mm().Ht());
            if (htZRu != null) {
                htZRu.ZRu(Uri.parse(uR() + "trackAdUrl" + str3));
            }
        } catch (Throwable unused) {
        }
    }

    public static void ZRu(String str, boolean z10) {
        if (FA.Mm().yBV().Ht() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Ht htZRu = ZRu(FA.Mm().Ht());
            if (htZRu != null) {
                htZRu.ZRu(Uri.parse(uR() + "trackAdFailed?did=" + String.valueOf(str) + "&triggerOnInit=" + z10));
            }
        } catch (Throwable unused) {
        }
    }

    public String ZRu(Uri uri) {
        int i10;
        com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRuMZ;
        String str = uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING)[2];
        str.getClass();
        i10 = 0;
        switch (str) {
            case "trackAdFailed":
                com.bytedance.sdk.component.Ht.ZRu.Ht.ZRu.ZRu().ZRu(uri.getQueryParameter("did"), uri.getBooleanQueryParameter("triggerOnInit", false));
                break;
            case "adLogStart":
                FA.Mm().Vor();
                break;
            case "adLogStop":
                FA.Mm().ZH();
                break;
            case "adLogDispatch":
                String queryParameter = uri.getQueryParameter(NotificationCompat.CATEGORY_EVENT);
                if (!TextUtils.isEmpty(queryParameter) && (zRuMZ = com.bytedance.sdk.component.Ht.ZRu.uR.ZRu.ZRu.mZ(com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.Ht.NOt(queryParameter))) != null) {
                    uR.ZRu.ZRu(zRuMZ);
                    break;
                }
                break;
            case "trackAdUrl":
                try {
                    String queryParameter2 = uri.getQueryParameter("did");
                    boolean zBooleanValue = Boolean.valueOf(uri.getQueryParameter("replace")).booleanValue();
                    String queryParameter3 = uri.getQueryParameter("track");
                    String queryParameter4 = uri.getQueryParameter("urlType");
                    String queryParameter5 = uri.getQueryParameter("adId");
                    String[] strArrSplit = com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.Ht.NOt(queryParameter3).split(",");
                    if (strArrSplit.length > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : strArrSplit) {
                            String strNOt = com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.Ht.NOt(str2);
                            if (!TextUtils.isEmpty(strNOt)) {
                                arrayList.add(strNOt);
                            }
                        }
                        try {
                            if (!TextUtils.isEmpty(queryParameter4)) {
                                i10 = Integer.parseInt(queryParameter4);
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        com.bytedance.sdk.component.Ht.ZRu.Ht.ZRu.ZRu().ZRu(queryParameter2, arrayList, zBooleanValue, null, i10, queryParameter5);
                    }
                    break;
                } catch (Throwable unused2) {
                    return null;
                }
                break;
        }
        return null;
    }
}
