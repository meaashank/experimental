package com.bytedance.sdk.component.Ht.ZRu;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.WMI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class uR {
    public static final uR ZRu = new uR();

    private boolean mZ() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    private void NOt(ZRu zRu, Context context) {
        mZ.ZRu(context, "context == null");
        mZ.ZRu(zRu, "AdLogConfig == null");
        mZ.ZRu(zRu.uR(), "AdLogDepend ==null");
    }

    public void NOt() {
        final TFq tFqYBV = FA.Mm().yBV();
        if (tFqYBV == null || FA.Mm().Ht() == null || tFqYBV.uR() == null) {
            return;
        }
        if (FA.Mm().NOt()) {
            if (ZRu(FA.Mm().Ht(), tFqYBV)) {
                FA.Mm().ZH();
                return;
            } else if (mZ()) {
                tFqYBV.uR().execute(new com.bytedance.sdk.component.Ht.ZRu.TFq.TFq("stop") { // from class: com.bytedance.sdk.component.Ht.ZRu.uR.3
                    @Override // java.lang.Runnable
                    public void run() {
                        uR.this.NOt(tFqYBV.Ht());
                    }
                });
                return;
            } else {
                NOt(tFqYBV.Ht());
                return;
            }
        }
        FA.Mm().ZH();
    }

    public void ZRu(ZRu zRu, Context context) {
        NOt(zRu, context);
        FA.Mm().ZRu(context);
        FA.Mm().ZRu(zRu.aT());
        FA.Mm().NOt(zRu.Mm());
        FA.Mm().mZ(zRu.FA());
        FA.Mm().ZRu(zRu.NOt());
        FA.Mm().uR(zRu.Vor());
        FA.Mm().TFq(zRu.Ht());
        FA.Mm().ZRu(zRu.ZRu() == null ? com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.TFq.ZRu : zRu.ZRu());
        FA.Mm().NOt(zRu.ZH());
        FA.Mm().ZRu(zRu.uR());
        FA.Mm().ZRu(zRu.mZ());
        FA.Mm().ZRu(zRu.TFq());
        com.bytedance.sdk.component.Ht.ZRu.NOt.mZ.mZ.ZRu(zRu.sAl());
        com.bytedance.sdk.component.Ht.ZRu.NOt.mZ.mZ.NOt(zRu.lp());
        ZRu(zRu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(int i10) {
        if (i10 == 0) {
            com.bytedance.sdk.component.Ht.ZRu.NOt.NOt.ZRu.NOt();
        } else if (i10 == 1) {
            com.bytedance.sdk.component.Ht.ZRu.NOt.NOt.NOt.NOt();
        }
    }

    private void NOt(final com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu) {
        final TFq tFqYBV = FA.Mm().yBV();
        if (zRu == null || tFqYBV == null || FA.Mm().Ht() == null || tFqYBV.uR() == null) {
            return;
        }
        if (FA.Mm().NOt()) {
            if (ZRu(FA.Mm().Ht(), tFqYBV)) {
                FA.Mm().ZRu(zRu);
                return;
            }
            mZ();
            if (mZ()) {
                tFqYBV.uR().execute(new com.bytedance.sdk.component.Ht.ZRu.TFq.TFq("dispatchEvent") { // from class: com.bytedance.sdk.component.Ht.ZRu.uR.4
                    @Override // java.lang.Runnable
                    public void run() {
                        uR.this.ZRu(zRu, tFqYBV.Ht());
                    }
                });
                return;
            } else {
                ZRu(zRu, tFqYBV.Ht());
                return;
            }
        }
        FA.Mm().ZRu(zRu);
    }

    private void ZRu(ZRu zRu) {
        Executor executorTFq;
        if (Looper.myLooper() != Looper.getMainLooper() && com.bytedance.sdk.component.Ht.ZRu.mZ.ZRu.NOt()) {
            com.bytedance.sdk.component.Ht.ZRu.mZ.ZRu.ZRu();
            return;
        }
        TFq tFqUR = zRu.uR();
        if (tFqUR == null || !com.bytedance.sdk.component.Ht.ZRu.mZ.ZRu.NOt() || (executorTFq = tFqUR.TFq()) == null) {
            return;
        }
        executorTFq.execute(new Runnable() { // from class: com.bytedance.sdk.component.Ht.ZRu.uR.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.Ht.ZRu.mZ.ZRu.ZRu();
            }
        });
    }

    public void ZRu(boolean z10) {
        FA.Mm().ZRu(z10);
    }

    private boolean ZRu(Context context, TFq tFq) {
        if (context == null || tFq == null) {
            return false;
        }
        if (tFq.Ht() == 2) {
            return true;
        }
        if (tFq.Ht() == 1) {
            return tFq.edo();
        }
        try {
            return WMI.ZRu(context);
        } catch (Throwable th) {
            th.getMessage();
            return true;
        }
    }

    public void ZRu() {
        final TFq tFqYBV = FA.Mm().yBV();
        if (tFqYBV == null || FA.Mm().Ht() == null || tFqYBV.uR() == null) {
            return;
        }
        if (FA.Mm().NOt()) {
            if (ZRu(FA.Mm().Ht(), tFqYBV)) {
                FA.Mm().Vor();
                return;
            } else if (mZ()) {
                tFqYBV.uR().execute(new com.bytedance.sdk.component.Ht.ZRu.TFq.TFq("start") { // from class: com.bytedance.sdk.component.Ht.ZRu.uR.2
                    @Override // java.lang.Runnable
                    public void run() {
                        uR.this.ZRu(tFqYBV.Ht());
                    }
                });
                return;
            } else {
                ZRu(tFqYBV.Ht());
                return;
            }
        }
        FA.Mm().Vor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(int i10) {
        if (i10 == 0) {
            com.bytedance.sdk.component.Ht.ZRu.NOt.NOt.ZRu.ZRu();
        } else if (i10 == 1) {
            com.bytedance.sdk.component.Ht.ZRu.NOt.NOt.NOt.ZRu();
        }
    }

    public void ZRu(com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu) {
        NOt(zRu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu, int i10) {
        if (i10 == 0) {
            com.bytedance.sdk.component.Ht.ZRu.NOt.NOt.ZRu.ZRu(zRu);
        } else if (i10 == 1) {
            com.bytedance.sdk.component.Ht.ZRu.NOt.NOt.NOt.ZRu(zRu);
        }
    }

    public void ZRu(final String str, final List<String> list, final boolean z10, Map<String, String> map, final int i10, final String str2) {
        final TFq tFqYBV = FA.Mm().yBV();
        if (tFqYBV == null || FA.Mm().Ht() == null || tFqYBV.uR() == null || !tFqYBV.FA()) {
            return;
        }
        if (tFqYBV.Ht() == 1) {
            if (list == null || list.isEmpty()) {
                return;
            }
        } else if (tFqYBV.Ht() == 0 && (TextUtils.isEmpty(str) || list == null || list.isEmpty())) {
            return;
        }
        if (FA.Mm().NOt() && !ZRu(FA.Mm().Ht(), tFqYBV)) {
            if (mZ()) {
                tFqYBV.uR().execute(new com.bytedance.sdk.component.Ht.ZRu.TFq.TFq("trackFailed") { // from class: com.bytedance.sdk.component.Ht.ZRu.uR.5
                    @Override // java.lang.Runnable
                    public void run() {
                        uR.this.ZRu(str, (List<String>) list, z10, tFqYBV.Ht(), i10, str2);
                    }
                });
                return;
            } else {
                ZRu(str, list, z10, tFqYBV.Ht(), i10, str2);
                return;
            }
        }
        FA.Mm().ZRu(str, list, z10, map, i10, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(String str, List<String> list, boolean z10, int i10, int i11, String str2) {
        if (i10 == 0) {
            com.bytedance.sdk.component.Ht.ZRu.NOt.NOt.ZRu.ZRu(str, list, z10);
        } else if (i10 == 1) {
            com.bytedance.sdk.component.Ht.ZRu.NOt.NOt.NOt.ZRu(str, list, z10, i11, str2);
        }
    }

    public void ZRu(final String str, final boolean z10) {
        final TFq tFqYBV = FA.Mm().yBV();
        if (tFqYBV == null || FA.Mm().Ht() == null || tFqYBV.uR() == null || !tFqYBV.FA() || (tFqYBV.Ht() == 0 && TextUtils.isEmpty(str))) {
            return;
        }
        if (FA.Mm().NOt() && !ZRu(FA.Mm().Ht(), tFqYBV)) {
            if (mZ()) {
                tFqYBV.uR().execute(new com.bytedance.sdk.component.Ht.ZRu.TFq.TFq("trackFailed") { // from class: com.bytedance.sdk.component.Ht.ZRu.uR.6
                    @Override // java.lang.Runnable
                    public void run() {
                        uR.this.ZRu(str, tFqYBV.Ht(), z10);
                    }
                });
                return;
            } else {
                ZRu(str, tFqYBV.Ht(), z10);
                return;
            }
        }
        FA.Mm().ZRu(str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(String str, int i10, boolean z10) {
        if (i10 == 0) {
            com.bytedance.sdk.component.Ht.ZRu.NOt.NOt.ZRu.ZRu(str);
        } else if (i10 == 1) {
            com.bytedance.sdk.component.Ht.ZRu.NOt.NOt.NOt.ZRu(str, z10);
        }
    }
}
