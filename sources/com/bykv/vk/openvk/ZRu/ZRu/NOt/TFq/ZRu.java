package com.bykv.vk.openvk.ZRu.ZRu.NOt.TFq;

import android.os.Build;
import android.view.View;
import com.prism.gaia.server.accounts.b;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    private static final int ZRu = Build.VERSION.SDK_INT;

    public static int ZRu(long j10, long j11) {
        return Math.min(Math.max(0, j11 > 0 ? (int) (((j10 * 1.0d) / j11) * 100.0d) : 0), 100);
    }

    public static String ZRu(long j10) {
        StringBuilder sb2 = new StringBuilder();
        long j11 = j10 / 60000;
        long j12 = ((j10 % 3600000) % 60000) / 1000;
        if (j11 >= 10) {
            sb2.append(j11);
        } else if (j11 > 0) {
            sb2.append(0);
            sb2.append(j11);
        } else {
            sb2.append("00");
        }
        sb2.append(b.f166434b0);
        if (j12 >= 10) {
            sb2.append(j12);
        } else if (j12 > 0) {
            sb2.append(0);
            sb2.append(j12);
        } else {
            sb2.append("00");
        }
        return sb2.toString();
    }

    public static void ZRu(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (z10) {
            view.setSystemUiVisibility(0);
            return;
        }
        int i10 = ZRu;
        if (i10 >= 19) {
            view.setSystemUiVisibility(3846);
        } else if (i10 >= 16) {
            view.setSystemUiVisibility(5);
        } else {
            view.setSystemUiVisibility(1);
        }
    }
}
