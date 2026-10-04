package com.google.ads.mediation.inmobi;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.NonNull;
import e.f0;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class InMobiMemoryCache {
    private static final String TAG = "MemoryCache";
    private final Map<String, Drawable> cache = Collections.synchronizedMap(new LinkedHashMap(10, 1.5f, true));

    @f0
    long size = 0;
    private long limit = 1000000;

    public InMobiMemoryCache() {
        setLimit(Runtime.getRuntime().maxMemory() / 4);
    }

    private void checkSize() {
        Log.i(TAG, "cache size=" + this.size + " length=" + this.cache.size());
        if (this.size > this.limit) {
            Iterator<Map.Entry<String, Drawable>> it = this.cache.entrySet().iterator();
            while (it.hasNext()) {
                this.size -= getSizeInBytes(((BitmapDrawable) it.next().getValue()).getBitmap());
                it.remove();
                if (this.size <= this.limit) {
                    break;
                }
            }
            Log.i(TAG, "Clean cache. New size " + this.cache.size());
        }
    }

    private long getSizeInBytes(Bitmap bitmap) {
        if (bitmap == null) {
            return 0L;
        }
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    private void setLimit(long j10) {
        this.limit = j10;
        Log.i(TAG, "MemoryCache will use up to " + ((this.limit / 1024.0d) / 1024.0d) + "MB");
    }

    public void clear() {
        try {
            this.cache.clear();
            this.size = 0L;
        } catch (NullPointerException e10) {
            e10.printStackTrace();
        }
    }

    public Drawable get(String str) {
        try {
            if (this.cache.containsKey(str)) {
                return this.cache.get(str);
            }
            return null;
        } catch (NullPointerException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public void put(String str, Drawable drawable) {
        try {
            if (this.cache.containsKey(str)) {
                this.size -= getSizeInBytes(((BitmapDrawable) this.cache.get(str)).getBitmap());
            }
            this.cache.put(str, drawable);
            this.size += getSizeInBytes(((BitmapDrawable) drawable).getBitmap());
            checkSize();
            Log.d(TAG, "Drawable used from cache");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @f0
    public InMobiMemoryCache(@NonNull Long l10) {
        setLimit(l10.longValue());
    }
}
