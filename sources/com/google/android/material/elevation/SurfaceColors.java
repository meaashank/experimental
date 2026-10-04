package com.google.android.material.elevation;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import e.InterfaceC4337k;
import e.InterfaceC4342p;
import e.InterfaceC4343q;

/* JADX INFO: loaded from: classes4.dex */
public enum SurfaceColors {
    SURFACE_0(R.dimen.m3_sys_elevation_level0),
    SURFACE_1(R.dimen.m3_sys_elevation_level1),
    SURFACE_2(R.dimen.m3_sys_elevation_level2),
    SURFACE_3(R.dimen.m3_sys_elevation_level3),
    SURFACE_4(R.dimen.m3_sys_elevation_level4),
    SURFACE_5(R.dimen.m3_sys_elevation_level5);

    private final int elevationResId;

    SurfaceColors(@InterfaceC4342p int i10) {
        this.elevationResId = i10;
    }

    @InterfaceC4337k
    public static int getColorForElevation(@NonNull Context context, @InterfaceC4343q float f10) {
        return new ElevationOverlayProvider(context).compositeOverlay(MaterialColors.getColor(context, R.attr.colorSurface, 0), f10);
    }

    @InterfaceC4337k
    public int getColor(@NonNull Context context) {
        return getColorForElevation(context, context.getResources().getDimension(this.elevationResId));
    }
}
