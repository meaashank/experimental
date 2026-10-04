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
public class ZRu extends mZ {
    protected List<String> ZRu;
    private final Context mZ;
    private com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu uR;

    public ZRu(Context context, com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRu) {
        super(context);
        this.ZRu = new ArrayList();
        this.mZ = context;
        this.uR = zRu;
        if (zRu == null) {
            this.uR = com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu.mZ();
        }
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.mZ
    public String NOt() {
        com.bytedance.sdk.component.Ht.ZRu.ZRu.TFq tFqUR = FA.Mm().uR();
        if (tFqUR != null) {
            return tFqUR.NOt();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0027 A[EXC_TOP_SPLITTER, PHI: r0 r1
      0x0027: PHI (r0v3 int) = (r0v0 int), (r0v5 int) binds: [B:15:0x0031, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0027: PHI (r1v3 android.database.Cursor) = (r1v2 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:15:0x0031, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int ZRu() {
        /*
            r10 = this;
            r1 = 0
            r0 = 0
            android.content.Context r2 = r10.TFq()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L31
            java.lang.String r3 = r10.NOt()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L31
            java.lang.String r4 = "count(1)"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L31
            r8 = 0
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.mZ.ZRu(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L31
            if (r1 == 0) goto L25
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L31
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L31
            goto L25
        L23:
            r0 = move-exception
            goto L2b
        L25:
            if (r1 == 0) goto L34
        L27:
            r1.close()     // Catch: java.lang.Exception -> L34
            goto L34
        L2b:
            if (r1 == 0) goto L30
            r1.close()     // Catch: java.lang.Exception -> L30
        L30:
            throw r0
        L31:
            if (r1 == 0) goto L34
            goto L27
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.ZRu.ZRu():int");
    }

    public byte mZ() {
        return (byte) 2;
    }

    public byte uR() {
        return (byte) 0;
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

    public List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> ZRu(int i10, String str) {
        String str2;
        String[] strArr;
        String str3;
        byte b10;
        Cursor cursorZRu;
        long jZRu = com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.ZRu(i10, TFq());
        NOt();
        if (jZRu <= 0) {
            jZRu = 1;
        } else if (jZRu > 100) {
            jZRu = 100;
        }
        String str4 = str + " DESC limit " + jZRu;
        ArrayList arrayList = new ArrayList();
        this.ZRu.clear();
        long jWMI = FA.Mm().WMI();
        if (jWMI > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - jWMI)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.Ht.ZRu.mZ.ZRu.uR() && uR() == 3) {
            str3 = "id";
            b10 = 3;
            cursorZRu = com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.mZ.ZRu(TFq(), NOt(), new String[]{"id", "value", "encrypt", "channel"}, str2, strArr, null, null, str4);
        } else {
            str3 = "id";
            b10 = 3;
            cursorZRu = com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.mZ.ZRu(TFq(), NOt(), new String[]{str3, "value", "encrypt"}, str2, strArr, null, null, str4);
        }
        Cursor cursor = cursorZRu;
        if (cursor != null) {
            try {
                com.bytedance.sdk.component.Ht.ZRu.TFq tFqYBV = FA.Mm().yBV();
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(str3));
                        String string2 = cursor.getString(cursor.getColumnIndex("value"));
                        int i11 = cursor.getInt(cursor.getColumnIndex("encrypt"));
                        int i12 = (com.bytedance.sdk.component.Ht.ZRu.mZ.ZRu.uR() && uR() == b10) ? cursor.getInt(cursor.getColumnIndex("channel")) : 0;
                        if (i11 == 1) {
                            try {
                                string2 = tFqYBV.ZRu(string2);
                            } catch (Throwable th) {
                                th = th;
                                th.getMessage();
                            }
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.ZRu.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(string2);
                            com.bytedance.sdk.component.Ht.ZRu.uR.ZRu.ZRu zRu = new com.bytedance.sdk.component.Ht.ZRu.uR.ZRu.ZRu(string, jSONObject);
                            zRu.ZRu(uR());
                            zRu.NOt(mZ());
                            if (com.bytedance.sdk.component.Ht.ZRu.mZ.ZRu.uR() && uR() == b10) {
                                zRu.ZRu(i12);
                            }
                            com.bytedance.sdk.component.Ht.ZRu.mZ.ZRu.ZRu(jSONObject, zRu);
                            arrayList.add(zRu);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } finally {
                try {
                    cursor.close();
                    if (!this.ZRu.isEmpty()) {
                        ZRu(this.ZRu);
                        this.ZRu.clear();
                    }
                } catch (Exception unused) {
                }
            }
        }
        NOt();
        arrayList.size();
        return arrayList;
    }

    private void NOt(int i10, long j10) {
        if (j10 > 0 || i10 > 0) {
            com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.mZ.ZRu(TFq(), NOt(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j10), String.valueOf(i10)});
            NOt();
        }
    }

    public static String NOt(String str) {
        return i.a("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    public List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> ZRu(String str) {
        com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRu = this.uR;
        if (zRu == null) {
            return new ArrayList();
        }
        return ZRu(zRu.NOt(), str);
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
        if (this.uR == null) {
            return false;
        }
        int iZRu = ZRu();
        int iZRu2 = this.uR.ZRu();
        NOt();
        return (com.bytedance.sdk.component.Ht.ZRu.mZ.ZRu.mZ() && (i10 == 1 || i10 == 2)) ? iZRu > 0 : iZRu >= iZRu2;
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
