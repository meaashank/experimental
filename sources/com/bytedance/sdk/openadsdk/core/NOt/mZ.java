package com.bytedance.sdk.openadsdk.core.NOt;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.settings.lp;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mZ implements View.OnClickListener, View.OnTouchListener {
    private static float NOt = 0.0f;
    private static long TFq = 0;
    private static float ZRu = 0.0f;
    private static float mZ = 0.0f;
    protected static int th = 8;
    private static float uR;
    protected View fWk;
    protected float to = -1.0f;
    protected float xY = -1.0f;
    protected float Zf = -1.0f;
    protected float ru = -1.0f;
    protected long le = -1;
    protected long MR = -1;
    protected int fcs = -1;

    /* JADX INFO: renamed from: Nb, reason: collision with root package name */
    protected int f140664Nb = -1024;
    protected int VdW = -1;
    protected boolean WD = true;
    public SparseArray<ZRu> Yx = new SparseArray<>();
    private int Ht = 0;
    private int Mm = 0;

    public static class ZRu {
        public double NOt;
        public int ZRu;
        public double mZ;
        public long uR;

        public ZRu(int i10, double d10, double d11, long j10) {
            this.ZRu = i10;
            this.NOt = d10;
            this.mZ = d11;
            this.uR = j10;
        }
    }

    static {
        if (WMI.ZRu() != null) {
            th = WMI.NOt();
        }
        ZRu = 0.0f;
        NOt = 0.0f;
        mZ = 0.0f;
        uR = 0.0f;
        TFq = 0L;
    }

    private boolean ZRu(View view, Point point) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                View childAt = viewGroup.getChildAt(i14);
                if (NOt.mZ(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && (i10 = point.x) >= (i11 = iArr[0]) && i10 <= childAt.getWidth() + i11 && (i12 = point.y) >= (i13 = iArr[1]) && i12 <= childAt.getHeight() + i13;
                }
                if (ZRu(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean Mm() {
        return this.WD;
    }

    public abstract void ZRu(View view, float f10, float f11, float f12, float f13, SparseArray<ZRu> sparseArray, boolean z10);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (lp.ZRu()) {
            ZRu(view, this.to, this.xY, this.Zf, this.ru, this.Yx, this.WD);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.NOt.mZ.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
