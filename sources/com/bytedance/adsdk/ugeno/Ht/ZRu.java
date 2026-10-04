package com.bytedance.adsdk.ugeno.Ht;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.FA.mZ;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.internal.C5091z;
import s0.C5563e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZRu<T> extends FrameLayout implements mZ.uR {
    private String FA;
    private int Ht;
    private int Mm;
    protected com.bytedance.adsdk.ugeno.FA.mZ NOt;
    private final Runnable OCA;
    private int TFq;
    private float Vor;
    private com.bytedance.adsdk.ugeno.Ht.ZRu.ZRu WMI;
    private boolean ZH;
    protected List<T> ZRu;
    private boolean aT;
    private int edo;
    private boolean lp;
    private int mZ;
    private int oK;
    private mZ om;
    private C0387ZRu qF;
    private boolean sAl;
    private final Runnable to;
    private int uR;
    private int yBV;

    public class NOt extends com.bytedance.adsdk.ugeno.FA.mZ {
        public NOt(Context context) {
            super(context);
        }

        @Override // com.bytedance.adsdk.ugeno.FA.mZ, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!ZRu.this.sAl) {
                return false;
            }
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.FA.mZ, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!ZRu.this.sAl) {
                return false;
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.Ht.ZRu$ZRu, reason: collision with other inner class name */
    public class C0387ZRu extends com.bytedance.adsdk.ugeno.FA.NOt {
        public C0387ZRu() {
        }

        @Override // com.bytedance.adsdk.ugeno.FA.NOt
        public int ZRu(Object obj) {
            return -2;
        }

        @Override // com.bytedance.adsdk.ugeno.FA.NOt
        public boolean ZRu(View view, Object obj) {
            return view == obj;
        }

        @Override // com.bytedance.adsdk.ugeno.FA.NOt
        public int ZRu() {
            if (ZRu.this.lp) {
                return Integer.MAX_VALUE;
            }
            return ZRu.this.ZRu.size();
        }

        @Override // com.bytedance.adsdk.ugeno.FA.NOt
        public Object ZRu(ViewGroup viewGroup, int i10) {
            View viewZRu = ZRu.this.ZRu(i10, uR.ZRu(ZRu.this.lp, i10, ZRu.this.ZRu.size()));
            viewGroup.addView(viewZRu);
            return viewZRu;
        }

        @Override // com.bytedance.adsdk.ugeno.FA.NOt
        public void ZRu(ViewGroup viewGroup, int i10, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.bytedance.adsdk.ugeno.FA.NOt
        public float ZRu(int i10) {
            if (ZRu.this.Vor <= 0.0f) {
                return 1.0f;
            }
            return 1.0f / ZRu.this.Vor;
        }
    }

    public ZRu(Context context) {
        super(context);
        this.ZRu = new CopyOnWriteArrayList();
        this.mZ = 2000;
        this.uR = 500;
        this.TFq = 10;
        this.Ht = -1;
        this.Mm = -1;
        this.FA = "normal";
        this.Vor = 1.0f;
        this.aT = true;
        this.ZH = true;
        this.lp = true;
        this.sAl = true;
        this.edo = 0;
        this.oK = 0;
        this.yBV = 0;
        this.OCA = new Runnable() { // from class: com.bytedance.adsdk.ugeno.Ht.ZRu.1
            @Override // java.lang.Runnable
            public void run() {
                int currentItem = ZRu.this.NOt.getCurrentItem() + 1;
                if (ZRu.this.lp) {
                    if (currentItem >= Integer.MAX_VALUE) {
                        ZRu.this.NOt.ZRu(C5091z.f220373j, false);
                        return;
                    } else {
                        ZRu.this.NOt.ZRu(currentItem, true);
                        return;
                    }
                }
                if (currentItem >= ZRu.this.NOt.getAdapter().ZRu()) {
                    ZRu.this.NOt.ZRu(0, false);
                } else {
                    ZRu.this.NOt.ZRu(currentItem, true);
                }
            }
        };
        this.to = new Runnable() { // from class: com.bytedance.adsdk.ugeno.Ht.ZRu.2
            @Override // java.lang.Runnable
            public void run() {
                if (ZRu.this.ZH) {
                    int currentItem = ZRu.this.NOt.getCurrentItem() + 1;
                    if (ZRu.this.lp) {
                        if (currentItem >= Integer.MAX_VALUE) {
                            ZRu.this.NOt.ZRu(C5091z.f220373j, false);
                        } else {
                            ZRu.this.NOt.ZRu(currentItem, true);
                        }
                        ZRu zRu = ZRu.this;
                        zRu.postDelayed(zRu.to, ZRu.this.mZ);
                        return;
                    }
                    if (currentItem >= ZRu.this.NOt.getAdapter().ZRu()) {
                        ZRu.this.NOt.ZRu(0, false);
                        ZRu zRu2 = ZRu.this;
                        zRu2.postDelayed(zRu2.to, ZRu.this.mZ);
                    } else {
                        ZRu.this.NOt.ZRu(currentItem, true);
                        ZRu zRu3 = ZRu.this;
                        zRu3.postDelayed(zRu3.to, ZRu.this.mZ);
                    }
                }
            }
        };
        this.NOt = new NOt(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.NOt, layoutParams);
        com.bytedance.adsdk.ugeno.Ht.ZRu.ZRu zRu = new com.bytedance.adsdk.ugeno.Ht.ZRu.ZRu(context);
        this.WMI = zRu;
        addView(zRu);
    }

    @Override // com.bytedance.adsdk.ugeno.FA.mZ.uR
    public void FA(int i10) {
        int i11;
        if (this.om != null) {
            int iZRu = uR.ZRu(this.lp, i10, this.ZRu.size());
            i11 = i10;
            this.om.ZRu(this.lp, iZRu, i11, iZRu == 0, iZRu == this.ZRu.size() - 1);
        } else {
            i11 = i10;
        }
        if (this.aT) {
            this.WMI.ZRu(i11);
        }
    }

    public abstract View Mm(int i10);

    public void Vor(int i10) {
        ZRu(this.FA, this.TFq, this.Ht, this.Mm, true);
        if (this.qF == null) {
            this.qF = new C0387ZRu();
            this.NOt.ZRu((mZ.uR) this);
            this.NOt.setAdapter(this.qF);
        }
        if (this.lp) {
            if (i10 >= Integer.MAX_VALUE) {
                this.NOt.ZRu(C5091z.f220373j, false);
                return;
            } else {
                this.NOt.ZRu(i10, true);
                return;
            }
        }
        if (i10 < 0 || i10 >= this.ZRu.size()) {
            return;
        }
        this.NOt.ZRu(i10, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.ZH) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                NOt();
            } else if (action == 0) {
                mZ();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public com.bytedance.adsdk.ugeno.FA.NOt getAdapter() {
        return this.NOt.getAdapter();
    }

    public int getCurrentItem() {
        return this.NOt.getCurrentItem();
    }

    public com.bytedance.adsdk.ugeno.FA.mZ getViewPager() {
        return this.NOt;
    }

    public void setOnPageChangeListener(mZ mZVar) {
        this.om = mZVar;
    }

    public ZRu Ht(int i10) {
        this.Mm = i10;
        ZRu(this.FA, this.TFq, this.Ht, i10, true);
        return this;
    }

    public ZRu NOt(boolean z10) {
        this.aT = z10;
        return this;
    }

    public ZRu TFq(int i10) {
        this.Ht = i10;
        ZRu(this.FA, this.TFq, i10, this.Mm, true);
        return this;
    }

    public ZRu ZRu(boolean z10) {
        this.ZH = z10;
        NOt();
        return this;
    }

    public ZRu mZ(int i10) {
        this.WMI.setUnSelectedColor(i10);
        return this;
    }

    public ZRu uR(int i10) {
        this.TFq = i10;
        ZRu(this.FA, i10, this.Ht, this.Mm, true);
        return this;
    }

    public ZRu NOt(int i10) {
        this.WMI.setSelectedColor(i10);
        return this;
    }

    public ZRu mZ(boolean z10) {
        this.WMI.setLoop(z10);
        if (this.lp != z10) {
            int iZRu = uR.ZRu(z10, this.NOt.getCurrentItem(), this.ZRu.size());
            this.lp = z10;
            C0387ZRu c0387ZRu = this.qF;
            if (c0387ZRu != null) {
                c0387ZRu.mZ();
                this.NOt.setCurrentItem(iZRu);
            }
        }
        return this;
    }

    public void NOt() {
        removeCallbacks(this.to);
        postDelayed(this.to, this.mZ);
    }

    public ZRu ZRu(int i10) {
        this.mZ = i10;
        NOt();
        return this;
    }

    public ZRu ZRu(float f10) {
        this.Vor = f10;
        return this;
    }

    public ZRu ZRu(String str) {
        this.FA = str;
        ZRu(str, this.TFq, this.Ht, this.Mm, true);
        return this;
    }

    public void ZRu(String str, int i10, int i11, int i12, boolean z10) {
        C0387ZRu c0387ZRu = this.qF;
        if (c0387ZRu != null) {
            c0387ZRu.mZ();
        }
        setClipChildren(false);
        this.NOt.setClipChildren(false);
        this.NOt.setPageMargin(i10);
        ViewGroup.LayoutParams layoutParams = this.NOt.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = i11 + i10;
            marginLayoutParams.rightMargin = i12 + i10;
            this.NOt.setLayoutParams(layoutParams);
        }
        if (TextUtils.equals(str, C5563e.f238016l)) {
            this.NOt.ZRu(false, (mZ.TFq) new com.bytedance.adsdk.ugeno.Ht.NOt.ZRu());
        } else {
            this.NOt.ZRu(false, (mZ.TFq) null);
        }
        this.NOt.setOffscreenPageLimit((int) this.Vor);
    }

    public void mZ() {
        removeCallbacks(this.to);
    }

    public void ZRu() {
        int i10;
        ZRu(this.FA, this.TFq, this.Ht, this.Mm, true);
        if (this.qF == null) {
            this.qF = new C0387ZRu();
            this.NOt.ZRu((mZ.uR) this);
            this.NOt.setAdapter(this.qF);
        }
        int i11 = this.edo;
        if (i11 < 0 || i11 >= this.ZRu.size()) {
            this.edo = 0;
        }
        if (this.lp) {
            i10 = this.edo + C5091z.f220373j;
        } else {
            i10 = this.edo;
        }
        this.NOt.ZRu(i10, true);
        if (!this.lp) {
            FA(i10);
        }
        if (this.ZH) {
            NOt();
        }
    }

    public View ZRu(int i10, int i11) {
        if (this.ZRu.size() == 0) {
            return new View(getContext());
        }
        View viewMm = Mm(i11);
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (viewMm instanceof ViewGroup) {
            frameLayout.setClipChildren(true);
        }
        if (viewMm.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewMm.getParent()).removeView(viewMm);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(viewMm, layoutParams);
        frameLayout.addView(new View(getContext()), new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public ZRu<T> ZRu(T t10) {
        if (t10 != null) {
            this.ZRu.add(t10);
            if (this.aT) {
                this.WMI.NOt();
            }
        }
        C0387ZRu c0387ZRu = this.qF;
        if (c0387ZRu != null) {
            c0387ZRu.mZ();
            this.WMI.ZRu(this.edo, this.NOt.getCurrentItem());
        }
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.FA.mZ.uR
    public void ZRu(int i10, float f10, int i11) {
        if (this.om != null) {
            uR.ZRu(this.lp, i10, this.ZRu.size());
        }
    }
}
