package com.bytedance.sdk.openadsdk.component.reward.ZRu;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.e0;
import com.bytedance.sdk.component.utils.ru;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class lp {
    private final com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu NOt;
    protected int ZRu;
    private boolean mZ = true;
    private ZRu uR;

    public static abstract class ZRu implements View.OnLayoutChangeListener {
        private int NOt;
        private int ZRu;

        private ZRu() {
        }

        public abstract void ZRu(int i10, int i11);

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18 = i12 - i10;
            int i19 = i13 - i11;
            if (i18 == this.ZRu && i19 == this.NOt) {
                return;
            }
            this.ZRu = i18;
            this.NOt = i19;
            ZRu(i18, i19);
        }
    }

    public lp(com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu) {
        this.ZRu = 0;
        this.NOt = zRu;
        mZ();
        if (zRu.ZRu == 2) {
            return;
        }
        try {
            this.ZRu = Cox.uR(zRu.AK, Cox.ZRu());
            if (!zRu.AK.getWindow().hasFeature(1)) {
                zRu.AK.requestWindowFeature(1);
            }
            zRu.AK.getWindow().addFlags(16777344);
            if (zRu.Gis != 2 && Cox.mZ(zRu.AK)) {
                return;
            }
            zRu.AK.getWindow().addFlags(1024);
        } catch (Throwable th) {
            Log.e("TTAD.RFSM", "init: ", th);
        }
    }

    private float Ht() {
        return Cox.uR(this.NOt.AK, Cox.Vor(this.NOt.AK));
    }

    private float TFq() {
        return Cox.uR(this.NOt.AK, Cox.aT(this.NOt.AK));
    }

    private void mZ() {
        com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu = this.NOt;
        zRu.Np = zRu.NOt.cvm();
        if (26 != Build.VERSION.SDK_INT) {
            com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu2 = this.NOt;
            zRu2.Gis = zRu2.NOt.AZ();
        } else if (this.NOt.AK.getResources().getConfiguration().orientation == 1) {
            this.NOt.Gis = 1;
        } else {
            this.NOt.Gis = 2;
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void uR() {
        com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu = this.NOt;
        if (zRu.Gis != 2) {
            ZRu(zRu.AK, 1);
        } else if (zRu.ZRJ) {
            ZRu(zRu.AK, 8);
        } else {
            ZRu(zRu.AK, 0);
        }
    }

    public void NOt(ru ruVar) {
        try {
            com.bytedance.sdk.openadsdk.activity.Ht ht = this.NOt.MO;
            if (ht == null || ht.Vor <= 0) {
                final boolean z10 = true;
                final boolean z11 = this.mZ && com.bytedance.sdk.openadsdk.core.WMI.uR().gI() == 1;
                if (!this.mZ || !Cox.mZ(this.NOt.AK)) {
                    z10 = false;
                }
                if (z10 || z11) {
                    if (this.uR == null) {
                        this.uR = new ZRu() { // from class: com.bytedance.sdk.openadsdk.component.reward.ZRu.lp.2
                            boolean ZRu;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super();
                            }

                            /* JADX WARN: Removed duplicated region for block: B:28:0x00e9 A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x001f, B:8:0x006a, B:10:0x0088, B:12:0x0097, B:14:0x00ab, B:15:0x00af, B:26:0x00e3, B:28:0x00e9, B:29:0x00ee, B:31:0x00fc, B:16:0x00b2, B:18:0x00bc, B:20:0x00d0, B:22:0x00d4, B:23:0x00da, B:25:0x00de, B:33:0x0102, B:35:0x0106, B:7:0x0045), top: B:38:0x0000 }] */
                            /* JADX WARN: Removed duplicated region for block: B:31:0x00fc A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x001f, B:8:0x006a, B:10:0x0088, B:12:0x0097, B:14:0x00ab, B:15:0x00af, B:26:0x00e3, B:28:0x00e9, B:29:0x00ee, B:31:0x00fc, B:16:0x00b2, B:18:0x00bc, B:20:0x00d0, B:22:0x00d4, B:23:0x00da, B:25:0x00de, B:33:0x0102, B:35:0x0106, B:7:0x0045), top: B:38:0x0000 }] */
                            /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
                            @Override // com.bytedance.sdk.openadsdk.component.reward.ZRu.lp.ZRu
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public void ZRu(int r7, int r8) {
                                /*
                                    Method dump skipped, instruction units count: 269
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ZRu.lp.AnonymousClass2.ZRu(int, int):void");
                            }
                        };
                    }
                    this.NOt.AK.getWindow().getDecorView().addOnLayoutChangeListener(this.uR);
                }
                this.mZ = false;
            }
        } catch (Exception unused) {
        }
    }

    public void ZRu(ru ruVar) {
        if (ruVar == null) {
            return;
        }
        ruVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ZRu.lp.1
            @Override // java.lang.Runnable
            public void run() {
                View viewFindViewById;
                try {
                    View decorView = lp.this.NOt.AK.getWindow().getDecorView();
                    if (decorView == null || (viewFindViewById = decorView.findViewById(R.id.statusBarBackground)) == null) {
                        return;
                    }
                    viewFindViewById.setVisibility(8);
                } catch (Exception unused) {
                }
            }
        }, 300L);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ZRu(boolean r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ZRu.lp.ZRu(boolean):void");
    }

    private float[] NOt(int i10) {
        float fHt = Ht();
        float fTFq = TFq();
        int i11 = this.NOt.Gis;
        if ((i11 == 1) != (fHt > fTFq)) {
            float f10 = fHt + fTFq;
            fTFq = f10 - fTFq;
            fHt = f10 - fTFq;
        }
        if (i11 == 1) {
            fHt -= i10;
        } else {
            fTFq -= i10;
        }
        return new float[]{fTFq, fHt};
    }

    public void NOt() {
        if (this.uR != null) {
            this.NOt.AK.getWindow().getDecorView().removeOnLayoutChangeListener(this.uR);
            this.uR = null;
        }
    }

    public float[] ZRu(int i10) {
        float[] fArrNOt = new float[2];
        Activity activity = this.NOt.AK;
        View decorView = activity.getWindow().getDecorView();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 35 && this.NOt.NOt.cvm() == 100.0f) {
            fArrNOt[0] = decorView.getWidth() - decorView.getPaddingLeft();
            fArrNOt[1] = decorView.getHeight() - decorView.getPaddingTop();
        } else {
            fArrNOt[0] = decorView.getWidth() - (decorView.getPaddingLeft() * 2);
            fArrNOt[1] = decorView.getHeight() - (decorView.getPaddingTop() * 2);
        }
        fArrNOt[0] = Cox.uR(activity, fArrNOt[0]);
        float fUR = Cox.uR(activity, fArrNOt[1]);
        fArrNOt[1] = fUR;
        if (fArrNOt[0] < 10.0f || fUR < 10.0f) {
            fArrNOt = NOt(this.ZRu);
        }
        if (i11 != 26 && i11 != 27 && activity.getResources() != null && activity.getResources().getConfiguration() != null) {
            if ((activity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i10) {
                if (i10 == 2) {
                    float f10 = fArrNOt[0];
                    float f11 = fArrNOt[1];
                    if (f10 < f11) {
                        fArrNOt[1] = f10;
                        fArrNOt[0] = f11;
                        return fArrNOt;
                    }
                } else {
                    float f12 = fArrNOt[0];
                    float f13 = fArrNOt[1];
                    if (f12 > f13) {
                        fArrNOt[1] = f12;
                        fArrNOt[0] = f13;
                    }
                }
            }
        }
        return fArrNOt;
    }

    public void ZRu() {
        Cox.ZRu(this.NOt.AK);
        this.NOt.AK.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ZRu.lp.3
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i10) {
                if (i10 == 0) {
                    try {
                        if (lp.this.NOt.AK.isFinishing()) {
                            return;
                        }
                        lp.this.NOt.AK.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ZRu.lp.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Cox.ZRu(lp.this.NOt.AK);
                            }
                        }, e0.f86339l);
                    } catch (Exception e10) {
                        com.bytedance.sdk.component.utils.lp.ZRu("TTAD.RFSM", e10.getMessage());
                    }
                }
            }
        });
    }

    private static void ZRu(Activity activity, int i10) {
        if (activity.getRequestedOrientation() == i10) {
            return;
        }
        activity.setRequestedOrientation(i10);
    }
}
