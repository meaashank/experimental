package com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.preference.s;
import com.bytedance.sdk.component.FA.Vor;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class mZ {
    private static volatile mZ NOt;
    private volatile SQLiteStatement TFq;
    private final SparseArray<Map<String, ZRu>> ZRu;
    private final uR mZ;
    private final Executor uR;

    private mZ(Context context) {
        SparseArray<Map<String, ZRu>> sparseArray = new SparseArray<>(2);
        this.ZRu = sparseArray;
        this.uR = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new Vor(5, "video_proxy_db"));
        this.mZ = new uR(context.getApplicationContext());
        sparseArray.put(0, new ConcurrentHashMap());
        sparseArray.put(1, new ConcurrentHashMap());
    }

    private String NOt(int i10) {
        if (i10 <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i10 << 1);
        sb2.append("?");
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(",?");
        }
        return sb2.toString();
    }

    public static mZ ZRu(Context context) {
        if (NOt == null) {
            synchronized (mZ.class) {
                try {
                    if (NOt == null) {
                        NOt = new mZ(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return NOt;
    }

    public ZRu ZRu(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, ZRu> map = this.ZRu.get(i10);
        ZRu zRu = map == null ? null : map.get(str);
        if (zRu != null) {
            return zRu;
        }
        try {
            Cursor cursorQuery = this.mZ.getReadableDatabase().query("video_http_header_t", null, "key=? AND flag=?", new String[]{str, String.valueOf(i10)}, null, null, null, "1");
            if (cursorQuery != null) {
                if (cursorQuery.getCount() > 0 && cursorQuery.moveToNext()) {
                    zRu = new ZRu(cursorQuery.getString(cursorQuery.getColumnIndex("key")), cursorQuery.getString(cursorQuery.getColumnIndex("mime")), cursorQuery.getInt(cursorQuery.getColumnIndex("contentLength")), i10, cursorQuery.getString(cursorQuery.getColumnIndex(s.f115701h)));
                }
                cursorQuery.close();
            }
            if (zRu != null && map != null) {
                map.put(str, zRu);
            }
            return zRu;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void ZRu(final ZRu zRu) {
        if (zRu != null) {
            Map<String, ZRu> map = this.ZRu.get(zRu.uR);
            if (map != null) {
                map.put(zRu.ZRu, zRu);
            }
            this.uR.execute(new Runnable() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.mZ.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (mZ.this.TFq == null) {
                            mZ mZVar = mZ.this;
                            mZVar.TFq = mZVar.mZ.getWritableDatabase().compileStatement("INSERT INTO video_http_header_t (key,mime,contentLength,flag,extra) VALUES(?,?,?,?,?)");
                        } else {
                            mZ.this.TFq.clearBindings();
                        }
                        mZ.this.TFq.bindString(1, zRu.ZRu);
                        mZ.this.TFq.bindString(2, zRu.NOt);
                        mZ.this.TFq.bindLong(3, zRu.mZ);
                        mZ.this.TFq.bindLong(4, zRu.uR);
                        mZ.this.TFq.bindString(5, zRu.TFq);
                        mZ.this.TFq.executeInsert();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    public void ZRu(Collection<String> collection, int i10) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        int size = collection.size() + 1;
        String[] strArr = new String[size];
        Map<String, ZRu> map = this.ZRu.get(i10);
        int i11 = -1;
        for (String str : collection) {
            if (map != null) {
                map.remove(str);
            }
            i11++;
            strArr[i11] = str;
        }
        strArr[i11 + 1] = String.valueOf(i10);
        try {
            this.mZ.getWritableDatabase().delete("video_http_header_t", "key IN(" + NOt(size) + ") AND flag=?", strArr);
        } catch (Throwable unused) {
        }
    }

    public void ZRu(final int i10) {
        Map<String, ZRu> map = this.ZRu.get(i10);
        if (map != null) {
            map.clear();
        }
        this.uR.execute(new Runnable() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.mZ.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    mZ.this.mZ.getWritableDatabase().delete("video_http_header_t", "flag=?", new String[]{String.valueOf(i10)});
                } catch (Throwable unused) {
                }
            }
        });
    }
}
