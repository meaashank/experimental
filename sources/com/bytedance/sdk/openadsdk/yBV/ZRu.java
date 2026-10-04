package com.bytedance.sdk.openadsdk.yBV;

import Y6.d;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.preference.s;
import com.bytedance.sdk.openadsdk.BusMonitorDependWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {
    private static final long TFq = System.currentTimeMillis();
    private static Context uR;
    private com.bytedance.sdk.openadsdk.yBV.mZ.ZRu NOt;
    private NOt ZRu;
    private Boolean mZ;
    private int Ht = 0;
    private final ArrayList<uR> Mm = new ArrayList<>();
    private Runnable FA = new Runnable() { // from class: com.bytedance.sdk.openadsdk.yBV.ZRu.2
        @Override // java.lang.Runnable
        public void run() {
            ZRu zRu = ZRu.this;
            zRu.mZ = Boolean.valueOf(zRu.ZRu.isMonitorOpen());
            if (ZRu.this.mZ.booleanValue()) {
                ZRu zRu2 = ZRu.this;
                zRu2.ZRu(zRu2.Mm);
                ZRu.this.Mm.clear();
            }
        }
    };
    private Runnable Vor = new Runnable() { // from class: com.bytedance.sdk.openadsdk.yBV.ZRu.4
        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2;
            String str3;
            ArrayList arrayList;
            String str4 = "BusMonitorCenter";
            String str5 = "is_init";
            String str6 = "mediation";
            try {
                SQLiteDatabase sQLiteDatabaseNOt = com.bytedance.sdk.openadsdk.yBV.ZRu.ZRu.NOt();
                if (sQLiteDatabaseNOt != null) {
                    String[] strArr = {"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", d.C0152d.f79310d, "label", "timestamp", "mediation", "is_init", s.f115701h};
                    String[] strArr2 = {String.valueOf(ZRu.TFq)};
                    int iMax = Math.max(10, ZRu.this.ZRu.getOnceLogCount());
                    int i10 = iMax > 100 ? 10 : iMax;
                    int i11 = i10;
                    Cursor cursorQuery = sQLiteDatabaseNOt.query("monitor_table", strArr, "timestamp <= ?", strArr2, null, null, null, String.valueOf(i10));
                    if (cursorQuery != null) {
                        ArrayList arrayList2 = new ArrayList();
                        try {
                            ArrayList arrayList3 = new ArrayList();
                            while (cursorQuery.moveToNext()) {
                                str = str4;
                                try {
                                    com.bytedance.sdk.openadsdk.yBV.NOt.ZRu zRu = new com.bytedance.sdk.openadsdk.yBV.NOt.ZRu();
                                    if (cursorQuery.getColumnIndex("_id") >= 0) {
                                        arrayList = arrayList2;
                                        str2 = str5;
                                        str3 = str6;
                                        long j10 = cursorQuery.getLong(cursorQuery.getColumnIndex("_id"));
                                        zRu.ZRu(j10);
                                        arrayList3.add(String.valueOf(j10));
                                    } else {
                                        str2 = str5;
                                        str3 = str6;
                                        arrayList = arrayList2;
                                    }
                                    if (cursorQuery.getColumnIndex("sdk_version") >= 0) {
                                        zRu.ZRu(cursorQuery.getString(cursorQuery.getColumnIndex("sdk_version")));
                                    }
                                    if (cursorQuery.getColumnIndex("scene") >= 0) {
                                        zRu.NOt(cursorQuery.getString(cursorQuery.getColumnIndex("scene")));
                                    }
                                    if (cursorQuery.getColumnIndex("start_count") >= 0) {
                                        zRu.ZRu(cursorQuery.getInt(cursorQuery.getColumnIndex("start_count")));
                                    }
                                    if (cursorQuery.getColumnIndex("success_count") >= 0) {
                                        zRu.NOt(cursorQuery.getInt(cursorQuery.getColumnIndex("success_count")));
                                    }
                                    if (cursorQuery.getColumnIndex("fail_count") >= 0) {
                                        zRu.mZ(cursorQuery.getInt(cursorQuery.getColumnIndex("fail_count")));
                                    }
                                    if (cursorQuery.getColumnIndex("rit") >= 0) {
                                        zRu.mZ(cursorQuery.getString(cursorQuery.getColumnIndex("rit")));
                                    }
                                    if (cursorQuery.getColumnIndex(d.C0152d.f79310d) >= 0) {
                                        zRu.uR(cursorQuery.getString(cursorQuery.getColumnIndex(d.C0152d.f79310d)));
                                    }
                                    if (cursorQuery.getColumnIndex("label") >= 0) {
                                        zRu.TFq(cursorQuery.getString(cursorQuery.getColumnIndex("label")));
                                    }
                                    String str7 = str3;
                                    if (cursorQuery.getColumnIndex(str7) >= 0) {
                                        zRu.Ht(cursorQuery.getString(cursorQuery.getColumnIndex(str7)));
                                    }
                                    String str8 = str2;
                                    if (cursorQuery.getColumnIndex(str8) >= 0) {
                                        zRu.uR(cursorQuery.getInt(cursorQuery.getColumnIndex(str8)));
                                    }
                                    if (cursorQuery.getColumnIndex(s.f115701h) >= 0) {
                                        zRu.Mm(cursorQuery.getString(cursorQuery.getColumnIndex(s.f115701h)));
                                    }
                                    arrayList2 = arrayList;
                                    arrayList2.add(zRu);
                                    str6 = str7;
                                    str5 = str8;
                                    str4 = str;
                                } catch (Throwable th) {
                                    th = th;
                                    str4 = str;
                                    Log.e(str4, th.getMessage());
                                }
                            }
                            str = str4;
                            cursorQuery.close();
                            str4 = str;
                            Log.i(str4, "exec upload ...");
                            if (arrayList2.isEmpty()) {
                                return;
                            }
                            try {
                                ZRu.this.ZRu.onMonitorUpload(arrayList2);
                                SQLiteDatabase sQLiteDatabaseZRu = com.bytedance.sdk.openadsdk.yBV.ZRu.ZRu.ZRu();
                                if (sQLiteDatabaseZRu != null && sQLiteDatabaseZRu.isOpen()) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("_id IN (");
                                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                        sb2.append("?");
                                        if (i12 < arrayList3.size() - 1) {
                                            sb2.append(",");
                                        }
                                    }
                                    sb2.append(")");
                                    sQLiteDatabaseZRu.delete("monitor_table", sb2.toString(), (String[]) arrayList3.toArray(new String[0]));
                                    if (ZRu.this.NOt != null) {
                                        ZRu.this.NOt.ZRu(ZRu.TFq);
                                    }
                                }
                                if (arrayList2.size() < i11 || ZRu.this.Ht > 1000) {
                                    return;
                                }
                                ZRu.this.ZRu(false);
                            } catch (Throwable th2) {
                                th = th2;
                                Log.e(str4, th.getMessage());
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    };

    private ZRu(NOt nOt) {
        try {
            this.ZRu = new BusMonitorDependWrapper(nOt);
            this.NOt = new com.bytedance.sdk.openadsdk.yBV.mZ.ZRu(nOt.getContext());
            uR = nOt.getContext();
        } catch (Throwable th) {
            Log.e("BusMonitorCenter", th.getMessage());
        }
    }

    public static /* synthetic */ int uR(ZRu zRu) {
        int i10 = zRu.Ht;
        zRu.Ht = i10 + 1;
        return i10;
    }

    private boolean mZ() {
        if (this.mZ == null) {
            NOt nOt = this.ZRu;
            return (nOt == null || nOt.getContext() == null || this.ZRu.getHandler() == null) ? false : true;
        }
        NOt nOt2 = this.ZRu;
        return (nOt2 == null || nOt2.getContext() == null || !this.ZRu.isMonitorOpen() || this.ZRu.getHandler() == null) ? false : true;
    }

    public static ZRu ZRu(NOt nOt) {
        return new ZRu(nOt);
    }

    public static Context ZRu() {
        Context context = uR;
        return context != null ? context : BusMonitorDependWrapper.getReflectContext();
    }

    public void ZRu(final uR uRVar) {
        if (uRVar == null || !mZ()) {
            return;
        }
        this.ZRu.getHandler().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yBV.ZRu.1
            @Override // java.lang.Runnable
            public void run() {
                ZRu zRu = ZRu.this;
                zRu.mZ = Boolean.valueOf(zRu.ZRu.isMonitorOpen());
                if (ZRu.this.mZ.booleanValue()) {
                    ZRu.this.Mm.add(uRVar);
                    if (ZRu.this.Mm.size() >= 10) {
                        ZRu zRu2 = ZRu.this;
                        zRu2.ZRu(zRu2.Mm);
                        ZRu.this.Mm.clear();
                    }
                }
            }
        });
        this.ZRu.getHandler().removeCallbacks(this.FA);
        this.ZRu.getHandler().postDelayed(this.FA, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ee A[Catch: all -> 0x01d9, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x01d9, blocks: (B:66:0x01ee, B:57:0x01d5), top: B:81:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ZRu(java.util.List<com.bytedance.sdk.openadsdk.yBV.uR> r27) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.yBV.ZRu.ZRu(java.util.List):void");
    }

    public void ZRu(final boolean z10) {
        NOt nOt = this.ZRu;
        if (nOt == null || nOt.getHandler() == null || this.ZRu.getContext() == null || this.NOt == null || !this.ZRu.isMonitorOpen()) {
            return;
        }
        this.ZRu.getHandler().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yBV.ZRu.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ZRu.uR(ZRu.this);
                    if (z10) {
                        long jZRu = ZRu.this.NOt.ZRu();
                        if (jZRu == 0) {
                            ZRu.this.NOt.ZRu(System.currentTimeMillis());
                            return;
                        } else if (ZRu.TFq - jZRu < ZRu.this.ZRu.getUploadIntervalTime()) {
                            return;
                        }
                    }
                    if (ZRu.this.ZRu.getHandler() != null) {
                        ZRu.this.ZRu.getHandler().post(ZRu.this.Vor);
                    }
                } catch (Throwable th) {
                    Log.e("BusMonitorCenter", th.getMessage());
                }
            }
        }, Math.max(this.ZRu.getOnceLogInterval(), 10000));
    }
}
