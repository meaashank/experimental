package com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.media.i;
import android.text.TextUtils;
import androidx.concurrent.futures.a;
import androidx.room.F;
import com.bytedance.sdk.component.Ht.ZRu.FA;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Mm extends mZ {
    protected List<String> ZRu;
    private com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu mZ;

    public Mm(Context context, com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRu) {
        super(context);
        this.ZRu = new ArrayList();
        this.mZ = zRu;
        if (zRu == null) {
            this.mZ = com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu.mZ();
        }
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.mZ
    public String NOt() {
        return FA.Mm().uR().uR();
    }

    public byte ZRu() {
        return (byte) 1;
    }

    public byte mZ() {
        return (byte) 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023 A[EXC_TOP_SPLITTER, PHI: r0 r1
      0x0023: PHI (r0v2 int) = (r0v0 int), (r0v6 int) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x0023: PHI (r1v2 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int uR() {
        /*
            r9 = this;
            r0 = 0
            android.content.Context r1 = r9.TFq()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = r9.NOt()     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "count(1)"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L27
            r7 = 0
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r1 = com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.mZ.ZRu(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L21
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L28
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L28
        L21:
            if (r1 == 0) goto L2b
        L23:
            r1.close()     // Catch: java.lang.Exception -> L2b
            goto L2b
        L27:
            r1 = 0
        L28:
            if (r1 == 0) goto L2b
            goto L23
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.Mm.uR():int");
    }

    public static String mZ(String str) {
        return i.a("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    public List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> NOt(String str) {
        com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRu = this.mZ;
        return zRu == null ? new ArrayList() : ZRu(zRu.NOt(), str);
    }

    public List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> ZRu(int i10, String str) {
        long jZRu = com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.ZRu(i10, TFq());
        if (jZRu <= 0) {
            jZRu = 1;
        } else if (jZRu > 100) {
            jZRu = 100;
        }
        ArrayList arrayList = new ArrayList();
        this.ZRu.clear();
        Cursor cursorZRu = com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.mZ.ZRu(TFq(), NOt(), new String[]{"id", "value", "encrypt"}, null, null, null, null, str + " DESC limit " + jZRu);
        if (cursorZRu != null) {
            while (cursorZRu.moveToNext()) {
                try {
                    try {
                        String string = cursorZRu.getString(cursorZRu.getColumnIndex("id"));
                        String string2 = cursorZRu.getString(cursorZRu.getColumnIndex("value"));
                        if (cursorZRu.getInt(cursorZRu.getColumnIndex("encrypt")) == 1) {
                            string2 = FA.Mm().yBV().ZRu(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.ZRu.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.Ht.ZRu.uR.ZRu.ZRu zRu = new com.bytedance.sdk.component.Ht.ZRu.uR.ZRu.ZRu(string, new JSONObject(string2));
                            zRu.NOt(mZ());
                            zRu.ZRu(ZRu());
                            arrayList.add(zRu);
                        }
                    } catch (Throwable unused) {
                    }
                } finally {
                }
            }
            try {
                cursorZRu.close();
                if (!this.ZRu.isEmpty()) {
                    ZRu(this.ZRu);
                    this.ZRu.clear();
                }
            } catch (Exception unused2) {
            }
        }
        return arrayList;
    }

    public void NOt(List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu : list) {
            linkedList.add(zRu.mZ());
            com.bytedance.sdk.component.Ht.ZRu.mZ.ZRu.aT(zRu);
        }
        NOt();
        linkedList.size();
        com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.mZ.ZRu(TFq(), "DELETE FROM " + NOt() + " WHERE " + ZRu("id", linkedList, 1000, true));
        mZ(linkedList);
    }

    private void NOt(int i10, long j10) {
        com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.mZ.ZRu(TFq(), NOt(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j10), String.valueOf(i10)});
    }

    public void ZRu(List<String> list) {
        NOt();
        list.size();
        com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.mZ.ZRu(TFq(), "DELETE FROM " + NOt() + " WHERE " + ZRu("id", list, 1000, true));
        com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.gmt(), list.size());
        mZ(list);
    }

    public void ZRu(int i10, long j10) {
        NOt(i10, j10);
    }

    public boolean ZRu(int i10) {
        return this.mZ != null && uR() >= this.mZ.ZRu();
    }

    private static String ZRu(String str, List<?> list, int i10, boolean z10) {
        int i11;
        String str2 = z10 ? " IN " : " NOT IN ";
        String str3 = z10 ? " OR " : " AND ";
        int iMin = Math.min(i10, 1000);
        int size = list.size();
        if (size % iMin == 0) {
            i11 = size / iMin;
        } else {
            i11 = (size / iMin) + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i12 * iMin;
            String strZRu = ZRu(TextUtils.join("','", list.subList(i13, Math.min(i13 + iMin, size))), "");
            if (i12 != 0) {
                sb2.append(str3);
            }
            F.a(sb2, str, str2, "('", strZRu);
            sb2.append("')");
        }
        return ZRu(sb2.toString(), a.a(str, str2, "('')"));
    }

    private static String ZRu(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
