package com.android.launcher3.uioverrides;

import android.content.Context;
import android.util.Pair;
import com.android.launcher3.uioverrides.dynamicui.ColorExtractionAlgorithm;
import com.android.launcher3.uioverrides.dynamicui.WallpaperColorsCompat;
import com.android.launcher3.uioverrides.dynamicui.WallpaperManagerCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperColorInfo implements WallpaperManagerCompat.OnColorsChangedListenerCompat {
    private static final int FALLBACK_COLOR = -1;
    private static WallpaperColorInfo sInstance;
    private static final Object sInstanceLock = new Object();
    private final ColorExtractionAlgorithm mExtractionType;
    private boolean mIsDark;
    private final ArrayList<OnChangeListener> mListeners = new ArrayList<>();
    private int mMainColor;
    private int mSecondaryColor;
    private boolean mSupportsDarkText;
    private OnChangeListener[] mTempListeners;
    private final WallpaperManagerCompat mWallpaperManager;

    public interface OnChangeListener {
        void onExtractedColorsChanged(WallpaperColorInfo wallpaperColorInfo);
    }

    private WallpaperColorInfo(Context context) {
        WallpaperManagerCompat wallpaperManagerCompat = WallpaperManagerCompat.getInstance(context);
        this.mWallpaperManager = wallpaperManagerCompat;
        wallpaperManagerCompat.addOnColorsChangedListener(this);
        this.mExtractionType = ColorExtractionAlgorithm.newInstance(context);
        update(wallpaperManagerCompat.getWallpaperColors(1));
    }

    public static WallpaperColorInfo getInstance(Context context) {
        WallpaperColorInfo wallpaperColorInfo;
        synchronized (sInstanceLock) {
            try {
                if (sInstance == null) {
                    sInstance = new WallpaperColorInfo(context.getApplicationContext());
                }
                wallpaperColorInfo = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wallpaperColorInfo;
    }

    private void notifyChange() {
        OnChangeListener[] onChangeListenerArr = this.mTempListeners;
        OnChangeListener[] onChangeListenerArr2 = (OnChangeListener[]) this.mListeners.toArray((onChangeListenerArr == null || onChangeListenerArr.length != this.mListeners.size()) ? new OnChangeListener[this.mListeners.size()] : this.mTempListeners);
        this.mTempListeners = onChangeListenerArr2;
        for (OnChangeListener onChangeListener : onChangeListenerArr2) {
            onChangeListener.onExtractedColorsChanged(this);
        }
    }

    private void update(WallpaperColorsCompat wallpaperColorsCompat) {
        Pair<Integer, Integer> pairExtractInto = this.mExtractionType.extractInto(wallpaperColorsCompat);
        this.mMainColor = ((Integer) pairExtractInto.first).intValue();
        this.mSecondaryColor = ((Integer) pairExtractInto.second).intValue();
        this.mSupportsDarkText = wallpaperColorsCompat != null && (wallpaperColorsCompat.getColorHints() & 1) > 0;
        this.mIsDark = wallpaperColorsCompat != null && (wallpaperColorsCompat.getColorHints() & 2) > 0;
    }

    public void addOnChangeListener(OnChangeListener onChangeListener) {
        this.mListeners.add(onChangeListener);
    }

    public int getMainColor() {
        return this.mMainColor;
    }

    public int getSecondaryColor() {
        return this.mSecondaryColor;
    }

    public boolean isDark() {
        return this.mIsDark;
    }

    @Override // com.android.launcher3.uioverrides.dynamicui.WallpaperManagerCompat.OnColorsChangedListenerCompat
    public void onColorsChanged(WallpaperColorsCompat wallpaperColorsCompat, int i10) {
        if ((i10 & 1) != 0) {
            update(wallpaperColorsCompat);
            notifyChange();
        }
    }

    public void removeOnChangeListener(OnChangeListener onChangeListener) {
        this.mListeners.remove(onChangeListener);
    }

    public boolean supportsDarkText() {
        return this.mSupportsDarkText;
    }
}
