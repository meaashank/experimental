package com.bytedance.sdk.openadsdk.core.ZH.ZRu;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.utils.lp;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.tonyodev.fetch2core.server.FileResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class mZ {
    private static volatile mZ NOt = null;
    public static int ZRu = 20;
    private final Object mZ = new Object();
    private final LruCache<String, ZRu> uR = new LruCache<String, ZRu>(ZRu) { // from class: com.bytedance.sdk.openadsdk.core.ZH.ZRu.mZ.1
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, ZRu zRu) {
            return 1;
        }
    };

    private mZ() {
    }

    public static mZ ZRu() {
        if (NOt == null) {
            synchronized (mZ.class) {
                try {
                    if (NOt == null) {
                        NOt = new mZ();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return NOt;
    }

    public static String mZ() {
        return "CREATE TABLE IF NOT EXISTS ugen_template (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , rit TEXT , update_time TEXT)";
    }

    public static String uR() {
        return "ALTER TABLE ugen_template ADD COLUMN rit TEXT ";
    }

    public List<ZRu> NOt() {
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.multipro.aidl.mZ mZVar = new com.bytedance.sdk.openadsdk.multipro.aidl.mZ(com.bytedance.sdk.openadsdk.multipro.ZRu.ZRu.ZRu(WMI.ZRu(), "ugen_template", null, null, null, null, null, null));
        try {
            if (mZVar.moveToFirst()) {
                do {
                    int columnIndex = mZVar.getColumnIndex("id");
                    int columnIndex2 = mZVar.getColumnIndex(FileResponse.FIELD_MD5);
                    int columnIndex3 = mZVar.getColumnIndex("url");
                    int columnIndex4 = mZVar.getColumnIndex("data");
                    int columnIndex5 = mZVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = mZVar.getColumnIndex("rit");
                        String string = columnIndex6 != -1 ? mZVar.getString(columnIndex6) : null;
                        String string2 = mZVar.getString(columnIndex);
                        String string3 = mZVar.getString(columnIndex2);
                        String string4 = mZVar.getString(columnIndex3);
                        ZRu ZRu2 = new ZRu().ZRu(string2).NOt(string3).mZ(string4).uR(mZVar.getString(columnIndex4)).TFq(string).ZRu(Long.valueOf(mZVar.getLong(columnIndex5)));
                        arrayList.add(ZRu2);
                        synchronized (this.mZ) {
                            this.uR.put(string2, ZRu2);
                        }
                    }
                } while (mZVar.moveToNext());
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                lp.ZRu("UGTmplDbHelper", "getUgenTemplate error", th);
                return arrayList;
            } finally {
                mZVar.close();
            }
        }
    }

    public ZRu ZRu(String str, String str2) {
        ZRu zRu;
        ZRu ZRu2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.mZ) {
            zRu = this.uR.get(str);
        }
        if (zRu != null) {
            if (TextUtils.equals(str2, zRu.NOt())) {
                return zRu;
            }
            NOt(str2);
            return null;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.mZ mZVar = new com.bytedance.sdk.openadsdk.multipro.aidl.mZ(com.bytedance.sdk.openadsdk.multipro.ZRu.ZRu.ZRu(WMI.ZRu(), "ugen_template", null, "id=? AND md5=?", new String[]{str, str2}, null, null, null));
        try {
            if (mZVar.moveToFirst()) {
                do {
                    int columnIndex = mZVar.getColumnIndex("id");
                    int columnIndex2 = mZVar.getColumnIndex(FileResponse.FIELD_MD5);
                    int columnIndex3 = mZVar.getColumnIndex("url");
                    int columnIndex4 = mZVar.getColumnIndex("data");
                    int columnIndex5 = mZVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = mZVar.getColumnIndex("rit");
                        String string = mZVar.getString(columnIndex);
                        String string2 = mZVar.getString(columnIndex2);
                        String string3 = mZVar.getString(columnIndex3);
                        String string4 = mZVar.getString(columnIndex4);
                        if (TextUtils.isEmpty(string4)) {
                            return null;
                        }
                        ZRu2 = new ZRu().ZRu(string).NOt(string2).uR(string4).mZ(string3).TFq(columnIndex6 != -1 ? mZVar.getString(columnIndex6) : null).ZRu(Long.valueOf(mZVar.getLong(columnIndex5)));
                        synchronized (this.mZ) {
                            this.uR.put(string, ZRu2);
                        }
                    }
                    return null;
                } while (mZVar.moveToNext());
                return ZRu2;
            }
        } finally {
            try {
                return null;
            } finally {
            }
        }
        return null;
    }

    private void NOt(String str) {
        if (!TextUtils.isEmpty(str) && this.uR.size() > 0) {
            synchronized (this.mZ) {
                this.uR.remove(str);
            }
        }
    }

    public void ZRu(ZRu zRu) {
        if (zRu == null || TextUtils.isEmpty(zRu.ZRu())) {
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.mZ mZVar = new com.bytedance.sdk.openadsdk.multipro.aidl.mZ(com.bytedance.sdk.openadsdk.multipro.ZRu.ZRu.ZRu(WMI.ZRu(), "ugen_template", null, "id=?", new String[]{zRu.ZRu()}, null, null, null));
        boolean z10 = mZVar.getCount() > 0;
        try {
            mZVar.close();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", zRu.ZRu());
            contentValues.put(FileResponse.FIELD_MD5, zRu.NOt());
            contentValues.put("url", zRu.mZ());
            contentValues.put("data", zRu.TFq());
            contentValues.put("rit", zRu.Ht());
            contentValues.put("update_time", zRu.uR());
            if (z10) {
                com.bytedance.sdk.openadsdk.multipro.ZRu.ZRu.ZRu(WMI.ZRu(), "ugen_template", contentValues, "id=?", new String[]{zRu.ZRu()});
            } else {
                com.bytedance.sdk.openadsdk.multipro.ZRu.ZRu.ZRu(WMI.ZRu(), "ugen_template", contentValues);
            }
            synchronized (this.mZ) {
                this.uR.put(zRu.ZRu(), zRu);
            }
        } catch (Throwable unused) {
        }
    }

    public Set<ZRu> ZRu(String str) {
        ZRu zRu;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        com.bytedance.sdk.openadsdk.multipro.aidl.mZ mZVar = new com.bytedance.sdk.openadsdk.multipro.aidl.mZ(com.bytedance.sdk.openadsdk.multipro.ZRu.ZRu.ZRu(WMI.ZRu(), "ugen_template", null, "rit=?", new String[]{str}, null, null, null));
        try {
            if (mZVar.moveToFirst()) {
                do {
                    int columnIndex = mZVar.getColumnIndex("id");
                    if (columnIndex != -1) {
                        String string = mZVar.getString(columnIndex);
                        if (!TextUtils.isEmpty(string)) {
                            synchronized (this.mZ) {
                                zRu = this.uR.get(string);
                            }
                            if (zRu != null) {
                                hashSet.add(zRu);
                            } else {
                                ZRu zRu2 = new ZRu();
                                int columnIndex2 = mZVar.getColumnIndex("data");
                                if (columnIndex2 != -1) {
                                    String string2 = mZVar.getString(columnIndex2);
                                    if (!TextUtils.isEmpty(string2)) {
                                        zRu2.uR(string2);
                                        zRu2.ZRu(string);
                                        zRu2.TFq(str);
                                        int columnIndex3 = mZVar.getColumnIndex(FileResponse.FIELD_MD5);
                                        int columnIndex4 = mZVar.getColumnIndex("url");
                                        int columnIndex5 = mZVar.getColumnIndex("update_time");
                                        if (columnIndex3 != -1) {
                                            zRu2.NOt(mZVar.getString(columnIndex3));
                                        }
                                        if (columnIndex4 != -1) {
                                            zRu2.mZ(mZVar.getString(columnIndex4));
                                        }
                                        if (columnIndex5 != -1) {
                                            zRu2.ZRu(Long.valueOf(mZVar.getLong(columnIndex5)));
                                        }
                                        hashSet.add(zRu2);
                                        synchronized (this.mZ) {
                                            this.uR.put(string, zRu2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (mZVar.moveToNext());
            }
            return hashSet;
        } catch (Throwable th) {
            try {
                lp.ZRu("UGTmplDbHelper", "getUgenTemplateFormRit error", th);
                return hashSet;
            } finally {
                mZVar.close();
            }
        }
    }

    public void ZRu(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (String str : strArr) {
                NOt(str);
                com.bytedance.sdk.openadsdk.multipro.ZRu.ZRu.ZRu(WMI.ZRu(), "ugen_template", "id=?", new String[]{str});
            }
        }
    }
}
