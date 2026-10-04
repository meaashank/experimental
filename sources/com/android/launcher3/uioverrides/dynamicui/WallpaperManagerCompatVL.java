package com.android.launcher3.uioverrides.dynamicui;

import android.app.WallpaperManager;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.android.launcher3.Utilities;
import com.android.launcher3.uioverrides.dynamicui.WallpaperManagerCompat;
import com.prism.commons.utils.C3840d;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperManagerCompatVL extends WallpaperManagerCompat {
    private static final String ACTION_EXTRACTION_COMPLETE = "com.android.launcher3.uioverrides.dynamicui.WallpaperManagerCompatVL.EXTRACTION_COMPLETE";
    private static final String KEY_COLORS = "wallpaper_parsed_colors";
    private static final String TAG = "WMCompatVL";
    private static final String VERSION_PREFIX = "1,";
    private WallpaperColorsCompat mColorsCompat;
    private final Context mContext;
    private final ArrayList<WallpaperManagerCompat.OnColorsChangedListenerCompat> mListeners = new ArrayList<>();

    public static class ColorExtractionService extends JobService implements Runnable {
        private static final int MAX_WALLPAPER_EXTRACTION_AREA = 12544;
        private Handler mWorkerHandler;
        private HandlerThread mWorkerThread;

        @Override // android.app.Service
        public void onCreate() {
            super.onCreate();
            HandlerThread handlerThread = new HandlerThread("ColorExtractionService");
            this.mWorkerThread = handlerThread;
            handlerThread.start();
            this.mWorkerHandler = new Handler(this.mWorkerThread.getLooper());
        }

        @Override // android.app.Service
        public void onDestroy() {
            super.onDestroy();
            this.mWorkerThread.quit();
        }

        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            this.mWorkerHandler.post(this);
            return true;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            this.mWorkerHandler.removeCallbacksAndMessages(null);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00eb  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 286
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.uioverrides.dynamicui.WallpaperManagerCompatVL.ColorExtractionService.run():void");
        }
    }

    public WallpaperManagerCompatVL(Context context) {
        int iIntValue;
        this.mContext = context;
        String string = Utilities.getDevicePrefs(context).getString(KEY_COLORS, "");
        if (string.startsWith(VERSION_PREFIX)) {
            Pair<Integer, WallpaperColorsCompat> value = parseValue(string);
            iIntValue = ((Integer) value.first).intValue();
            this.mColorsCompat = (WallpaperColorsCompat) value.second;
        } else {
            iIntValue = -1;
        }
        if (iIntValue == -1 || iIntValue != getWallpaperId(context)) {
            reloadColors();
        }
        C3840d.a(context, new BroadcastReceiver() { // from class: com.android.launcher3.uioverrides.dynamicui.WallpaperManagerCompatVL.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                WallpaperManagerCompatVL.this.reloadColors();
            }
        }, new IntentFilter("android.intent.action.WALLPAPER_CHANGED"));
        String str = null;
        try {
            for (PermissionInfo permissionInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).permissions) {
                if ((permissionInfo.protectionLevel & 2) != 0) {
                    str = permissionInfo.name;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.d(TAG, "Unable to get permission info", e10);
        }
        C3840d.b(this.mContext, new BroadcastReceiver() { // from class: com.android.launcher3.uioverrides.dynamicui.WallpaperManagerCompatVL.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                WallpaperManagerCompatVL.this.handleResult(intent.getStringExtra(WallpaperManagerCompatVL.KEY_COLORS));
            }
        }, new IntentFilter(ACTION_EXTRACTION_COMPLETE), str, new Handler());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getWallpaperId(Context context) {
        if (Utilities.ATLEAST_NOUGAT) {
            return ((WallpaperManager) context.getSystemService(WallpaperManager.class)).getWallpaperId(1);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResult(String str) {
        Utilities.getDevicePrefs(this.mContext).edit().putString(KEY_COLORS, str).apply();
        this.mColorsCompat = (WallpaperColorsCompat) parseValue(str).second;
        ArrayList<WallpaperManagerCompat.OnColorsChangedListenerCompat> arrayList = this.mListeners;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            WallpaperManagerCompat.OnColorsChangedListenerCompat onColorsChangedListenerCompat = arrayList.get(i10);
            i10++;
            onColorsChangedListenerCompat.onColorsChanged(this.mColorsCompat, 1);
        }
    }

    private static Pair<Integer, WallpaperColorsCompat> parseValue(String str) {
        String[] strArrSplit = str.split(",");
        Integer numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1]));
        if (strArrSplit.length == 2) {
            return Pair.create(numValueOf, null);
        }
        return Pair.create(numValueOf, new WallpaperColorsCompat(strArrSplit.length > 2 ? Integer.parseInt(strArrSplit[2]) : 0, strArrSplit.length > 3 ? Integer.parseInt(strArrSplit[3]) : 0, strArrSplit.length > 4 ? Integer.parseInt(strArrSplit[4]) : 0, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reloadColors() {
        ((JobScheduler) this.mContext.getSystemService(K7.a.f58426e)).schedule(new JobInfo.Builder(2, new ComponentName(this.mContext, (Class<?>) ColorExtractionService.class)).setMinimumLatency(0L).build());
    }

    @Override // com.android.launcher3.uioverrides.dynamicui.WallpaperManagerCompat
    public void addOnColorsChangedListener(WallpaperManagerCompat.OnColorsChangedListenerCompat onColorsChangedListenerCompat) {
        this.mListeners.add(onColorsChangedListenerCompat);
    }

    @Override // com.android.launcher3.uioverrides.dynamicui.WallpaperManagerCompat
    @Nullable
    public WallpaperColorsCompat getWallpaperColors(int i10) {
        if (i10 == 1) {
            return this.mColorsCompat;
        }
        return null;
    }
}
