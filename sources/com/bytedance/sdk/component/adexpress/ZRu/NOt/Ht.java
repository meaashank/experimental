package com.bytedance.sdk.component.adexpress.ZRu.NOt;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.bytedance.sdk.component.utils.lp;
import com.tonyodev.fetch2core.server.FileResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class Ht {
    private static volatile Ht NOt = null;
    public static int ZRu = 20;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.component.adexpress.ZRu.mZ.mZ> TFq;
    private final Object uR = new Object();
    private AtomicBoolean Ht = new AtomicBoolean(false);
    private LruCache<String, com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt> Mm = new LruCache<String, com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt>(ZRu) { // from class: com.bytedance.sdk.component.adexpress.ZRu.NOt.Ht.1
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt nOt) {
            return 1;
        }
    };
    private Set<String> mZ = Collections.synchronizedSet(new HashSet());

    private Ht() {
    }

    public static void ZRu(int i10) {
        ZRu = i10;
    }

    private void uR(String str) {
        LruCache<String, com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt> lruCache;
        if (TextUtils.isEmpty(str) || (lruCache = this.Mm) == null || lruCache.size() <= 0) {
            return;
        }
        synchronized (this.uR) {
            this.Mm.remove(str);
        }
    }

    public Set<String> NOt(String str) {
        if (!TextUtils.isEmpty(str) && com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().NOt() != null) {
            HashSet hashSet = new HashSet();
            Cursor cursorZRu = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().NOt().ZRu("template_diff_new", null, "rit=?", new String[]{str}, null, null, null);
            if (cursorZRu != null) {
                try {
                    try {
                        if (cursorZRu.moveToFirst()) {
                            do {
                                hashSet.add(cursorZRu.getString(cursorZRu.getColumnIndex("id")));
                            } while (cursorZRu.moveToNext());
                            return hashSet;
                        }
                    } catch (Exception e10) {
                        Log.e("TmplDbHelper", "", e10);
                    }
                } finally {
                    cursorZRu.close();
                }
            }
        }
        return null;
    }

    public void mZ(String str) {
        com.bytedance.sdk.component.adexpress.ZRu.mZ.mZ mZVar;
        try {
            if (this.TFq != null && !this.TFq.isEmpty() && (mZVar = this.TFq.get(str)) != null) {
                if (!TextUtils.isEmpty(mZVar.ZRu()) && com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().Ht() != null) {
                    com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().Ht();
                }
                this.TFq.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    public static Ht ZRu() {
        if (NOt == null) {
            synchronized (Ht.class) {
                try {
                    if (NOt == null) {
                        NOt = new Ht();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return NOt;
    }

    public static String mZ() {
        return "CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)";
    }

    public com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt ZRu(String str) {
        com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt nOt;
        com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt nOtZRu;
        if (TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().NOt() == null) {
            return null;
        }
        synchronized (this.uR) {
            nOt = this.Mm.get(String.valueOf(str));
        }
        if (nOt != null) {
            return nOt;
        }
        Cursor cursorZRu = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().NOt().ZRu("template_diff_new", null, "id=?", new String[]{str}, null, null, null);
        if (cursorZRu != null) {
            try {
                if (cursorZRu.moveToFirst()) {
                    do {
                        String string = cursorZRu.getString(cursorZRu.getColumnIndex("rit"));
                        String string2 = cursorZRu.getString(cursorZRu.getColumnIndex("id"));
                        String string3 = cursorZRu.getString(cursorZRu.getColumnIndex(FileResponse.FIELD_MD5));
                        String string4 = cursorZRu.getString(cursorZRu.getColumnIndex("url"));
                        String string5 = cursorZRu.getString(cursorZRu.getColumnIndex("data"));
                        String string6 = cursorZRu.getString(cursorZRu.getColumnIndex("version"));
                        nOtZRu = new com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt().ZRu(string).NOt(string2).mZ(string3).uR(string4).TFq(string5).Ht(string6).ZRu(Long.valueOf(cursorZRu.getLong(cursorZRu.getColumnIndex("update_time"))));
                        synchronized (this.uR) {
                            this.Mm.put(string2, nOtZRu);
                        }
                        this.mZ.add(string2);
                    } while (cursorZRu.moveToNext());
                    return nOtZRu;
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        return null;
    }

    public List<com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt> NOt() {
        if (com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().NOt() == null) {
            return null;
        }
        boolean z10 = this.Ht.get();
        this.Ht.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor cursorZRu = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().NOt().ZRu("template_diff_new", null, null, null, null, null, null);
        if (cursorZRu == null) {
            return arrayList;
        }
        while (cursorZRu.moveToNext()) {
            try {
                String string = cursorZRu.getString(cursorZRu.getColumnIndex("rit"));
                String string2 = cursorZRu.getString(cursorZRu.getColumnIndex("id"));
                String string3 = cursorZRu.getString(cursorZRu.getColumnIndex(FileResponse.FIELD_MD5));
                String string4 = cursorZRu.getString(cursorZRu.getColumnIndex("url"));
                String string5 = cursorZRu.getString(cursorZRu.getColumnIndex("data"));
                String string6 = cursorZRu.getString(cursorZRu.getColumnIndex("version"));
                arrayList.add(new com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt().ZRu(string).NOt(string2).mZ(string3).uR(string4).TFq(string5).Ht(string6).ZRu(Long.valueOf(cursorZRu.getLong(cursorZRu.getColumnIndex("update_time")))));
                synchronized (this.uR) {
                    this.Mm.put(string2, (com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt) arrayList.get(arrayList.size() - 1));
                }
                this.mZ.add(string2);
                if (!z10 && com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().Ht() != null) {
                    if (this.TFq == null) {
                        this.TFq = new ConcurrentHashMap<>();
                    }
                    if (string2 != null && !this.TFq.contains(string2)) {
                        this.TFq.put(string2, new com.bytedance.sdk.component.adexpress.ZRu.mZ.mZ(string, string2, string3));
                    }
                }
            } catch (Throwable th) {
                try {
                    lp.ZRu("TmplDbHelper", "getTemplate error", th);
                    return arrayList;
                } finally {
                    cursorZRu.close();
                }
            }
        }
        return arrayList;
    }

    public void ZRu(com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt nOt, boolean z10) {
        if (nOt == null || com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().NOt() == null || TextUtils.isEmpty(nOt.NOt())) {
            return;
        }
        Cursor cursorZRu = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().NOt().ZRu("template_diff_new", null, "id=?", new String[]{nOt.NOt()}, null, null, null);
        boolean z11 = cursorZRu != null && cursorZRu.getCount() > 0;
        if (cursorZRu != null) {
            try {
                string = cursorZRu.moveToFirst() ? cursorZRu.getString(cursorZRu.getColumnIndex("rit")) : null;
                cursorZRu.close();
            } catch (Throwable unused) {
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", nOt.ZRu());
        contentValues.put("id", nOt.NOt());
        contentValues.put(FileResponse.FIELD_MD5, nOt.mZ());
        contentValues.put("url", nOt.uR());
        contentValues.put("data", nOt.TFq());
        contentValues.put("version", nOt.Ht());
        contentValues.put("update_time", nOt.Mm());
        if (z11) {
            com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().NOt().ZRu("template_diff_new", contentValues, "id=?", new String[]{nOt.NOt()});
        } else {
            com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().NOt().ZRu("template_diff_new", contentValues);
        }
        synchronized (this.uR) {
            this.Mm.put(nOt.NOt(), nOt);
        }
        this.mZ.add(nOt.NOt());
        if (z10) {
            return;
        }
        try {
            if (com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().Ht() == null) {
                return;
            }
            if (this.TFq == null) {
                this.TFq = new ConcurrentHashMap<>();
            }
            com.bytedance.sdk.component.adexpress.ZRu.mZ.mZ mZVar = new com.bytedance.sdk.component.adexpress.ZRu.mZ.mZ(nOt.ZRu(), nOt.NOt(), nOt.mZ());
            this.TFq.put(nOt.NOt(), mZVar);
            if (string != null) {
                com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().Ht();
                mZVar.NOt();
            }
            com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().Ht();
            nOt.ZRu();
        } catch (Throwable unused2) {
        }
    }

    public void ZRu(Set<String> set) {
        if (set == null || set.isEmpty() || com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().NOt() == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uR(strArr[i10]);
                com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().NOt().ZRu("template_diff_new", "id=?", new String[]{strArr[i10]});
                mZ(strArr[i10]);
            }
        }
    }
}
