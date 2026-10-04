package com.android.launcher3.uioverrides.dynamicui;

import android.content.Context;
import androidx.annotation.Nullable;
import com.android.launcher3.Utilities;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WallpaperManagerCompat {
    private static WallpaperManagerCompat sInstance;
    private static final Object sInstanceLock = new Object();

    public interface OnColorsChangedListenerCompat {
        void onColorsChanged(WallpaperColorsCompat wallpaperColorsCompat, int i10);
    }

    public static WallpaperManagerCompat getInstance(Context context) {
        WallpaperManagerCompat wallpaperManagerCompat;
        synchronized (sInstanceLock) {
            try {
                if (sInstance == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (Utilities.ATLEAST_OREO_MR1) {
                        try {
                            sInstance = new WallpaperManagerCompatVOMR1(applicationContext);
                        } catch (Throwable unused) {
                        }
                    }
                    if (sInstance == null) {
                        sInstance = new WallpaperManagerCompatVL(applicationContext);
                    }
                }
                wallpaperManagerCompat = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wallpaperManagerCompat;
    }

    public abstract void addOnColorsChangedListener(OnColorsChangedListenerCompat onColorsChangedListenerCompat);

    @Nullable
    public abstract WallpaperColorsCompat getWallpaperColors(int i10);
}
