package com.bytedance.sdk.openadsdk.multipro.ZRu;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.media.e;
import android.text.TextUtils;
import com.bytedance.sdk.component.Ht.ZRu.Ht;
import com.bytedance.sdk.openadsdk.core.TFq;
import com.bytedance.sdk.openadsdk.multipro.uR;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {
    private static final ConcurrentHashMap<String, Object> NOt = new ConcurrentHashMap<>();
    public static Ht ZRu;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0002, B:4:0x0005, B:6:0x0009, B:8:0x000f, B:9:0x001f), top: B:14:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bytedance.sdk.component.Ht.ZRu.Ht ZRu(android.content.Context r1) {
        /*
            if (r1 != 0) goto L5
            com.bytedance.sdk.openadsdk.core.WMI.ZRu()     // Catch: java.lang.Throwable -> L26
        L5:
            com.bytedance.sdk.component.Ht.ZRu.Ht r1 = com.bytedance.sdk.openadsdk.multipro.ZRu.ZRu.ZRu     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L2b
            boolean r1 = com.bytedance.sdk.openadsdk.multipro.NOt.mZ()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L1f
            com.bytedance.sdk.openadsdk.multipro.aidl.ZRu r1 = com.bytedance.sdk.openadsdk.multipro.aidl.ZRu.ZRu()     // Catch: java.lang.Throwable -> L26
            r0 = 5
            android.os.IBinder r1 = r1.ZRu(r0)     // Catch: java.lang.Throwable -> L26
            com.bytedance.sdk.component.Ht.ZRu.Ht r1 = com.bytedance.sdk.component.Ht.ZRu.Ht.ZRu.ZRu(r1)     // Catch: java.lang.Throwable -> L26
            com.bytedance.sdk.openadsdk.multipro.ZRu.ZRu.ZRu = r1     // Catch: java.lang.Throwable -> L26
            goto L2b
        L1f:
            com.bytedance.sdk.openadsdk.multipro.aidl.ZRu.Ht r1 = com.bytedance.sdk.openadsdk.multipro.aidl.ZRu.Ht.NOt()     // Catch: java.lang.Throwable -> L26
            com.bytedance.sdk.openadsdk.multipro.ZRu.ZRu.ZRu = r1     // Catch: java.lang.Throwable -> L26
            goto L2b
        L26:
            java.lang.String r1 = "binder error"
            com.bytedance.sdk.openadsdk.utils.Yx.FA(r1)
        L2b:
            com.bytedance.sdk.component.Ht.ZRu.Ht r1 = com.bytedance.sdk.openadsdk.multipro.ZRu.ZRu.ZRu
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.multipro.ZRu.ZRu.ZRu(android.content.Context):com.bytedance.sdk.component.Ht.ZRu.Ht");
    }

    private static String ZRu() {
        return e.a(new StringBuilder(), uR.NOt, "/t_db/ttopensdk.db/");
    }

    public static void ZRu(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (ZRu(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                TFq.ZRu(context).ZRu().ZRu(str, (String) null, contentValues);
                return;
            }
            Ht htZRu = ZRu(context);
            if (htZRu != null) {
                htZRu.ZRu(Uri.parse(ZRu() + str), contentValues);
            }
        }
    }

    public static int ZRu(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (ZRu(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                return TFq.ZRu(context).ZRu().ZRu(str, str2, strArr);
            }
            Ht htZRu = ZRu(context);
            if (htZRu != null) {
                return htZRu.ZRu(Uri.parse(ZRu() + str), str2, strArr);
            }
            return 0;
        }
    }

    public static int ZRu(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (ZRu(str)) {
                if (!com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                    return TFq.ZRu(context).ZRu().ZRu(str, contentValues, str2, strArr);
                }
                Ht htZRu = ZRu(context);
                if (htZRu != null) {
                    return htZRu.ZRu(Uri.parse(ZRu() + str), contentValues, str2, strArr);
                }
            }
        }
        return 0;
    }

    public static Map<String, List<String>> ZRu(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (ZRu(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                return ZRu(TFq.ZRu(context).ZRu().ZRu(str, strArr, str2, strArr2, str3, str4, str5));
            }
            Ht htZRu = ZRu(context);
            if (htZRu != null) {
                return htZRu.ZRu(Uri.parse(ZRu() + str), strArr, str2, strArr2, str5);
            }
            return null;
        }
    }

    public static Map<String, List<String>> ZRu(Cursor cursor) {
        HashMap map = new HashMap();
        if (cursor != null) {
            try {
                String[] columnNames = cursor.getColumnNames();
                while (cursor.getCount() > 0 && cursor.moveToNext()) {
                    for (String str : columnNames) {
                        if (!map.containsKey(str)) {
                            map.put(str, new LinkedList());
                        }
                        ((List) map.get(str)).add(cursor.getString(cursor.getColumnIndex(str)));
                    }
                }
                cursor.close();
                return map;
            } catch (Throwable unused) {
                cursor.close();
            }
        }
        return map;
    }

    private static Object ZRu(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = NOt;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (ZRu.class) {
            try {
                obj = concurrentHashMap.get(str);
                if (obj == null) {
                    obj = new Object();
                    concurrentHashMap.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
