package com.android.launcher3.util;

import android.view.Window;
import com.android.launcher3.Utilities;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class SystemUiController {
    public static final int FLAG_DARK_NAV = 2;
    public static final int FLAG_DARK_STATUS = 8;
    public static final int FLAG_LIGHT_NAV = 1;
    public static final int FLAG_LIGHT_STATUS = 4;
    public static final int UI_STATE_ALL_APPS = 1;
    public static final int UI_STATE_BASE_WINDOW = 0;
    public static final int UI_STATE_OVERVIEW = 4;
    public static final int UI_STATE_ROOT_VIEW = 3;
    public static final int UI_STATE_WIDGET_BOTTOM_SHEET = 2;
    private final int[] mStates = new int[5];
    private final Window mWindow;

    public SystemUiController(Window window) {
        this.mWindow = window;
    }

    public String toString() {
        return "mStates=" + Arrays.toString(this.mStates);
    }

    public void updateUiState(int i10, boolean z10) {
        updateUiState(i10, z10 ? 5 : 10);
    }

    public void updateUiState(int i10, int i11) {
        int[] iArr = this.mStates;
        if (iArr[i10] == i11) {
            return;
        }
        iArr[i10] = i11;
        int systemUiVisibility = this.mWindow.getDecorView().getSystemUiVisibility();
        int i12 = systemUiVisibility;
        for (int i13 : this.mStates) {
            if (Utilities.ATLEAST_OREO) {
                if ((i13 & 1) != 0) {
                    i12 |= 16;
                } else if ((i13 & 2) != 0) {
                    i12 &= -17;
                }
            }
            if ((i13 & 4) != 0) {
                i12 |= 8192;
            } else if ((i13 & 8) != 0) {
                i12 &= -8193;
            }
        }
        if (i12 != systemUiVisibility) {
            this.mWindow.getDecorView().setSystemUiVisibility(i12);
        }
    }
}
