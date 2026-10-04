package com.bytedance.sdk.openadsdk.lp;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* JADX INFO: loaded from: classes3.dex */
public class FA {
    private final AudioManager ZRu;
    private int NOt = -1;
    private boolean mZ = false;

    public FA(Context context) {
        this.ZRu = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public boolean NOt() {
        if (!this.mZ) {
            return false;
        }
        this.mZ = false;
        return true;
    }

    public int ZRu() {
        return this.NOt;
    }

    public void ZRu(int i10) {
        this.NOt = i10;
    }

    public void ZRu(boolean z10) {
        ZRu(z10, false);
    }

    public void ZRu(boolean z10, boolean z11) {
        if (this.ZRu == null) {
            return;
        }
        int i10 = 0;
        if (z10) {
            int iMm = DeviceUtils.Mm();
            if (iMm != 0) {
                this.NOt = iMm;
            } else if (!z11) {
                return;
            }
            ZRu(3, 0, 0);
            this.mZ = true;
            return;
        }
        int iVor = this.NOt;
        if (iVor == 0) {
            iVor = DeviceUtils.Vor() / 15;
        } else {
            if (iVor == -1) {
                if (!z11) {
                    return;
                } else {
                    iVor = DeviceUtils.Vor() / 15;
                }
            }
            this.NOt = -1;
            ZRu(3, iVor, i10);
            this.mZ = true;
        }
        i10 = 1;
        this.NOt = -1;
        ZRu(3, iVor, i10);
        this.mZ = true;
    }

    private void ZRu(int i10, int i11, int i12) {
        try {
            this.ZRu.setStreamVolume(i10, i11, i12);
        } catch (Throwable unused) {
        }
    }
}
