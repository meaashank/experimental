package com.bumptech.glide.load.engine.cache;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import e.f0;
import y3.m;

/* JADX INFO: loaded from: classes2.dex */
public final class MemorySizeCalculator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f139576e = "MemorySizeCalculator";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @f0
    public static final int f139577f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f139578g = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f139579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f139580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f139581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f139582d;

    public static final class Builder {
        static final int ARRAY_POOL_SIZE_BYTES = 4194304;
        static final int BITMAP_POOL_TARGET_SCREENS;
        static final float LOW_MEMORY_MAX_SIZE_MULTIPLIER = 0.33f;
        static final float MAX_SIZE_MULTIPLIER = 0.4f;

        @f0
        static final int MEMORY_CACHE_TARGET_SCREENS = 2;
        ActivityManager activityManager;
        float bitmapPoolScreens;
        final Context context;
        b screenDimensions;
        float memoryCacheScreens = 2.0f;
        float maxSizeMultiplier = 0.4f;
        float lowMemoryMaxSizeMultiplier = LOW_MEMORY_MAX_SIZE_MULTIPLIER;
        int arrayPoolSizeBytes = 4194304;

        static {
            BITMAP_POOL_TARGET_SCREENS = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public Builder(Context context) {
            this.bitmapPoolScreens = BITMAP_POOL_TARGET_SCREENS;
            this.context = context;
            this.activityManager = (ActivityManager) context.getSystemService("activity");
            this.screenDimensions = new a(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !this.activityManager.isLowRamDevice()) {
                return;
            }
            this.bitmapPoolScreens = 0.0f;
        }

        public MemorySizeCalculator build() {
            return new MemorySizeCalculator(this);
        }

        @f0
        public Builder setActivityManager(ActivityManager activityManager) {
            this.activityManager = activityManager;
            return this;
        }

        public Builder setArrayPoolSize(int i10) {
            this.arrayPoolSizeBytes = i10;
            return this;
        }

        public Builder setBitmapPoolScreens(float f10) {
            m.b(f10 >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
            this.bitmapPoolScreens = f10;
            return this;
        }

        public Builder setLowMemoryMaxSizeMultiplier(float f10) {
            m.b(f10 >= 0.0f && f10 <= 1.0f, "Low memory max size multiplier must be between 0 and 1");
            this.lowMemoryMaxSizeMultiplier = f10;
            return this;
        }

        public Builder setMaxSizeMultiplier(float f10) {
            m.b(f10 >= 0.0f && f10 <= 1.0f, "Size multiplier must be between 0 and 1");
            this.maxSizeMultiplier = f10;
            return this;
        }

        public Builder setMemoryCacheScreens(float f10) {
            m.b(f10 >= 0.0f, "Memory cache screens must be greater than or equal to 0");
            this.memoryCacheScreens = f10;
            return this;
        }

        @f0
        public Builder setScreenDimensions(b bVar) {
            this.screenDimensions = bVar;
            return this;
        }
    }

    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DisplayMetrics f139583a;

        public a(DisplayMetrics displayMetrics) {
            this.f139583a = displayMetrics;
        }

        @Override // com.bumptech.glide.load.engine.cache.MemorySizeCalculator.b
        public int a() {
            return this.f139583a.heightPixels;
        }

        @Override // com.bumptech.glide.load.engine.cache.MemorySizeCalculator.b
        public int b() {
            return this.f139583a.widthPixels;
        }
    }

    public interface b {
        int a();

        int b();
    }

    public MemorySizeCalculator(Builder builder) {
        this.f139581c = builder.context;
        int i10 = builder.activityManager.isLowRamDevice() ? builder.arrayPoolSizeBytes / 2 : builder.arrayPoolSizeBytes;
        this.f139582d = i10;
        int iC = c(builder.activityManager, builder.maxSizeMultiplier, builder.lowMemoryMaxSizeMultiplier);
        float fA = builder.screenDimensions.a() * builder.screenDimensions.b() * 4;
        int iRound = Math.round(builder.bitmapPoolScreens * fA);
        int iRound2 = Math.round(fA * builder.memoryCacheScreens);
        int i11 = iC - i10;
        int i12 = iRound2 + iRound;
        if (i12 <= i11) {
            this.f139580b = iRound2;
            this.f139579a = iRound;
        } else {
            float f10 = i11;
            float f11 = builder.bitmapPoolScreens;
            float f12 = builder.memoryCacheScreens;
            float f13 = f10 / (f11 + f12);
            this.f139580b = Math.round(f12 * f13);
            this.f139579a = Math.round(f13 * builder.bitmapPoolScreens);
        }
        if (Log.isLoggable(f139576e, 3)) {
            StringBuilder sb2 = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb2.append(f(this.f139580b));
            sb2.append(", pool size: ");
            sb2.append(f(this.f139579a));
            sb2.append(", byte array size: ");
            sb2.append(f(i10));
            sb2.append(", memory class limited? ");
            sb2.append(i12 > iC);
            sb2.append(", max size: ");
            sb2.append(f(iC));
            sb2.append(", memoryClass: ");
            sb2.append(builder.activityManager.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(builder.activityManager.isLowRamDevice());
            Log.d(f139576e, sb2.toString());
        }
    }

    public static int c(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (activityManager.isLowRamDevice()) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    @TargetApi(19)
    public static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    public int a() {
        return this.f139582d;
    }

    public int b() {
        return this.f139579a;
    }

    public int d() {
        return this.f139580b;
    }

    public final String f(int i10) {
        return Formatter.formatFileSize(this.f139581c, i10);
    }
}
