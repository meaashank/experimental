package com.google.android.material.color;

import android.os.Build;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i {
    @Nullable
    public static ColorResourcesOverride a() {
        int i10 = Build.VERSION.SDK_INT;
        if (30 <= i10 && i10 <= 33) {
            return ResourcesLoaderColorResourcesOverride.getInstance();
        }
        if (i10 >= 34) {
            return ResourcesLoaderColorResourcesOverride.getInstance();
        }
        return null;
    }
}
