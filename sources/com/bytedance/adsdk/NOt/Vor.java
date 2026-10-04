package com.bytedance.adsdk.NOt;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.i;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.collection.S0;
import com.android.launcher3.IconCache;
import com.bytedance.adsdk.NOt.TFq.xY;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.bytedance.component.sdk.annotation.IntRange;
import com.bytedance.component.sdk.annotation.MainThread;
import com.bytedance.component.sdk.annotation.RestrictTo;
import com.prism.gaia.download.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class Vor extends Drawable implements Animatable, Drawable.Callback {
    private Matrix AK;
    private Rect Cox;
    private boolean FA;
    private RectF Ho;
    private boolean Ht;
    private boolean MR;
    private boolean Mm;
    mZ NOt;

    /* JADX INFO: renamed from: Nb, reason: collision with root package name */
    private Bitmap f140633Nb;
    private com.bytedance.adsdk.NOt.mZ.mZ.NOt OCA;
    private final com.bytedance.adsdk.NOt.Ht.mZ TFq;
    private Canvas VdW;
    private NOt Vor;
    private boolean Vr;
    private RectF WD;
    private boolean WMI;
    private Rect Yx;
    private final ValueAnimator.AnimatorUpdateListener ZH;
    String ZRu;
    private boolean Zf;
    private final ArrayList<ZRu> aT;
    private Matrix bO;
    private uR edo;
    private Paint fWk;
    private final Matrix fcs;
    private RectF gI;
    private om le;
    private com.bytedance.adsdk.NOt.NOt.NOt lp;
    OCA mZ;
    private com.bytedance.adsdk.NOt.NOt.ZRu oK;
    private boolean om;
    private boolean qF;
    private boolean ru;
    private String sAl;
    private Rect th;
    private int to;
    private Mm uR;
    private boolean xY;
    private Map<String, Typeface> yBV;

    public enum NOt {
        NONE,
        PLAY,
        RESUME
    }

    public interface ZRu {
        void ZRu(Mm mm);
    }

    public Vor() {
        com.bytedance.adsdk.NOt.Ht.mZ mZVar = new com.bytedance.adsdk.NOt.Ht.mZ();
        this.TFq = mZVar;
        this.Ht = true;
        this.Mm = false;
        this.FA = false;
        this.Vor = NOt.NONE;
        this.aT = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.NOt.Vor.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (Vor.this.OCA != null) {
                    Vor.this.OCA.ZRu(Vor.this.TFq.Ht());
                }
            }
        };
        this.ZH = animatorUpdateListener;
        this.qF = false;
        this.om = true;
        this.to = 255;
        this.le = om.AUTOMATIC;
        this.MR = false;
        this.fcs = new Matrix();
        this.Vr = false;
        mZVar.addUpdateListener(animatorUpdateListener);
    }

    private boolean Cox() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        return (parent instanceof ViewGroup) && !((ViewGroup) parent).getClipChildren();
    }

    private void Nb() {
        Mm mm = this.uR;
        if (mm == null) {
            return;
        }
        this.MR = this.le.ZRu(Build.VERSION.SDK_INT, mm.ZRu(), mm.NOt());
    }

    private boolean VdW() {
        return this.Ht || this.Mm;
    }

    private com.bytedance.adsdk.NOt.NOt.ZRu WD() {
        if (getCallback() == null) {
            return null;
        }
        if (this.oK == null) {
            com.bytedance.adsdk.NOt.NOt.ZRu zRu = new com.bytedance.adsdk.NOt.NOt.ZRu(getCallback(), this.NOt);
            this.oK = zRu;
            String str = this.ZRu;
            if (str != null) {
                zRu.ZRu(str);
            }
        }
        return this.oK;
    }

    private void Yx() {
        if (this.VdW != null) {
            return;
        }
        this.VdW = new Canvas();
        this.Ho = new RectF();
        this.bO = new Matrix();
        this.AK = new Matrix();
        this.th = new Rect();
        this.WD = new RectF();
        this.fWk = new com.bytedance.adsdk.NOt.ZRu.ZRu();
        this.Yx = new Rect();
        this.Cox = new Rect();
        this.gI = new RectF();
    }

    private Context fWk() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private com.bytedance.adsdk.NOt.NOt.NOt th() {
        com.bytedance.adsdk.NOt.NOt.NOt nOt = this.lp;
        if (nOt != null && !nOt.ZRu(fWk())) {
            this.lp = null;
        }
        if (this.lp == null) {
            this.lp = new com.bytedance.adsdk.NOt.NOt.NOt(getCallback(), this.sAl, this.edo, this.uR.yBV());
        }
        return this.lp;
    }

    public void FA() {
        if (this.TFq.isRunning()) {
            this.TFq.cancel();
            if (!isVisible()) {
                this.Vor = NOt.NONE;
            }
        }
        this.uR = null;
        this.OCA = null;
        this.lp = null;
        this.TFq.FA();
        invalidateSelf();
    }

    public qF Ht() {
        Mm mm = this.uR;
        if (mm != null) {
            return mm.mZ();
        }
        return null;
    }

    public void MR() {
        this.aT.clear();
        this.TFq.sAl();
        if (isVisible()) {
            return;
        }
        this.Vor = NOt.NONE;
    }

    public boolean Mm() {
        return this.ru;
    }

    public boolean OCA() {
        com.bytedance.adsdk.NOt.Ht.mZ mZVar = this.TFq;
        if (mZVar == null) {
            return false;
        }
        return mZVar.isRunning();
    }

    public om TFq() {
        return this.MR ? om.SOFTWARE : om.HARDWARE;
    }

    @MainThread
    public void Vor() {
        if (this.OCA == null) {
            this.aT.add(new ZRu() { // from class: com.bytedance.adsdk.NOt.Vor.6
                @Override // com.bytedance.adsdk.NOt.Vor.ZRu
                public void ZRu(Mm mm) {
                    Vor.this.Vor();
                }
            });
            return;
        }
        Nb();
        if (VdW() || om() == 0) {
            if (isVisible()) {
                this.TFq.ZH();
                this.Vor = NOt.NONE;
            } else {
                this.Vor = NOt.PLAY;
            }
        }
        if (VdW()) {
            return;
        }
        mZ((int) (edo() < 0.0f ? lp() : sAl()));
        this.TFq.lp();
        if (isVisible()) {
            return;
        }
        this.Vor = NOt.NONE;
    }

    public int WMI() {
        return (int) this.TFq.Mm();
    }

    @MainThread
    public void ZH() {
        if (this.OCA == null) {
            this.aT.add(new ZRu() { // from class: com.bytedance.adsdk.NOt.Vor.7
                @Override // com.bytedance.adsdk.NOt.Vor.ZRu
                public void ZRu(Mm mm) {
                    Vor.this.ZH();
                }
            });
            return;
        }
        Nb();
        if (VdW() || om() == 0) {
            if (isVisible()) {
                this.TFq.edo();
                this.Vor = NOt.NONE;
            } else {
                this.Vor = NOt.RESUME;
            }
        }
        if (VdW()) {
            return;
        }
        mZ((int) (edo() < 0.0f ? lp() : sAl()));
        this.TFq.lp();
        if (isVisible()) {
            return;
        }
        this.Vor = NOt.NONE;
    }

    public boolean Zf() {
        return this.yBV == null && this.mZ == null && this.uR.edo().size() > 0;
    }

    @MainThread
    public void aT() {
        this.aT.clear();
        this.TFq.lp();
        if (isVisible()) {
            return;
        }
        this.Vor = NOt.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        TFq.ZRu("Drawable#draw");
        try {
            if (this.MR) {
                ZRu(canvas, this.OCA);
            } else {
                ZRu(canvas);
            }
        } catch (Throwable unused) {
        }
        this.Vr = false;
        TFq.NOt("Drawable#draw");
    }

    public float edo() {
        return this.TFq.aT();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float fcs() {
        return this.TFq.Ht();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.to;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Mm mm = this.uR;
        if (mm == null) {
            return -1;
        }
        return mm.uR().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Mm mm = this.uR;
        if (mm == null) {
            return -1;
        }
        return mm.uR().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.Vr) {
            return;
        }
        this.Vr = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return OCA();
    }

    public void le() {
        this.aT.clear();
        this.TFq.cancel();
        if (isVisible()) {
            return;
        }
        this.Vor = NOt.NONE;
    }

    public float lp() {
        return this.TFq.oK();
    }

    public String mZ() {
        return this.sAl;
    }

    public void oK() {
        this.TFq.removeAllUpdateListeners();
        this.TFq.addUpdateListener(this.ZH);
    }

    public int om() {
        return this.TFq.getRepeatCount();
    }

    @SuppressLint({"WrongConstant"})
    public int qF() {
        return this.TFq.getRepeatMode();
    }

    public Mm ru() {
        return this.uR;
    }

    public float sAl() {
        return this.TFq.yBV();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = S0.f86828d) int i10) {
        this.to = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            NOt nOt = this.Vor;
            if (nOt == NOt.PLAY) {
                Vor();
                return visible;
            }
            if (nOt == NOt.RESUME) {
                ZH();
                return visible;
            }
        } else {
            if (this.TFq.isRunning()) {
                MR();
                this.Vor = NOt.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.Vor = NOt.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        Vor();
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void stop() {
        aT();
    }

    public boolean to() {
        if (isVisible()) {
            return this.TFq.isRunning();
        }
        NOt nOt = this.Vor;
        return nOt == NOt.PLAY || nOt == NOt.RESUME;
    }

    public boolean uR() {
        return this.qF;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public OCA xY() {
        return this.mZ;
    }

    public void yBV() {
        this.TFq.removeAllListeners();
    }

    public void Mm(boolean z10) {
        this.Mm = z10;
    }

    public boolean NOt() {
        return this.om;
    }

    public void TFq(boolean z10) {
        this.ru = z10;
    }

    public void ZRu(boolean z10, Context context) {
        if (this.WMI == z10) {
            return;
        }
        this.WMI = z10;
        if (this.uR != null) {
            ZRu(context);
        }
    }

    public void mZ(boolean z10) {
        this.xY = z10;
        Mm mm = this.uR;
        if (mm != null) {
            mm.NOt(z10);
        }
    }

    public void uR(boolean z10) {
        if (this.Zf == z10) {
            return;
        }
        this.Zf = z10;
        com.bytedance.adsdk.NOt.mZ.mZ.NOt nOt = this.OCA;
        if (nOt != null) {
            nOt.ZRu(z10);
        }
    }

    public void Ht(boolean z10) {
        this.FA = z10;
    }

    public void Mm(String str) {
        this.ZRu = str;
        com.bytedance.adsdk.NOt.NOt.ZRu zRuWD = WD();
        if (zRuWD != null) {
            zRuWD.ZRu(str);
        }
    }

    public void NOt(boolean z10) {
        this.qF = z10;
    }

    public void TFq(int i10) {
        this.TFq.setRepeatCount(i10);
    }

    public aT Ht(String str) {
        Mm mm = this.uR;
        if (mm == null) {
            return null;
        }
        return mm.yBV().get(str);
    }

    public void NOt(final int i10) {
        if (this.uR == null) {
            this.aT.add(new ZRu() { // from class: com.bytedance.adsdk.NOt.Vor.10
                @Override // com.bytedance.adsdk.NOt.Vor.ZRu
                public void ZRu(Mm mm) {
                    Vor.this.NOt(i10);
                }
            });
        } else {
            this.TFq.NOt(i10 + 0.99f);
        }
    }

    public Bitmap TFq(String str) {
        com.bytedance.adsdk.NOt.NOt.NOt nOtTh = th();
        if (nOtTh != null) {
            return nOtTh.ZRu(str);
        }
        return null;
    }

    public void mZ(final String str) {
        Mm mm = this.uR;
        if (mm == null) {
            this.aT.add(new ZRu() { // from class: com.bytedance.adsdk.NOt.Vor.13
                @Override // com.bytedance.adsdk.NOt.Vor.ZRu
                public void ZRu(Mm mm2) {
                    Vor.this.mZ(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.NOt.mZ.Ht htMZ = mm.mZ(str);
        if (htMZ != null) {
            NOt((int) (htMZ.ZRu + htMZ.NOt));
            return;
        }
        throw new IllegalArgumentException(i.a("Cannot find marker with name ", str, IconCache.EMPTY_CLASS_NAME));
    }

    public void ZRu(boolean z10) {
        if (z10 != this.om) {
            this.om = z10;
            com.bytedance.adsdk.NOt.mZ.mZ.NOt nOt = this.OCA;
            if (nOt != null) {
                nOt.NOt(z10);
            }
            invalidateSelf();
        }
    }

    public void uR(final String str) {
        Mm mm = this.uR;
        if (mm == null) {
            this.aT.add(new ZRu() { // from class: com.bytedance.adsdk.NOt.Vor.2
                @Override // com.bytedance.adsdk.NOt.Vor.ZRu
                public void ZRu(Mm mm2) {
                    Vor.this.uR(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.NOt.mZ.Ht htMZ = mm.mZ(str);
        if (htMZ != null) {
            int i10 = (int) htMZ.ZRu;
            ZRu(i10, ((int) htMZ.NOt) + i10);
            return;
        }
        throw new IllegalArgumentException(i.a("Cannot find marker with name ", str, IconCache.EMPTY_CLASS_NAME));
    }

    public void NOt(@FloatRange(from = 0.0d, to = 1.0d) final float f10) {
        Mm mm = this.uR;
        if (mm == null) {
            this.aT.add(new ZRu() { // from class: com.bytedance.adsdk.NOt.Vor.11
                @Override // com.bytedance.adsdk.NOt.Vor.ZRu
                public void ZRu(Mm mm2) {
                    Vor.this.NOt(f10);
                }
            });
        } else {
            this.TFq.NOt(com.bytedance.adsdk.NOt.Ht.TFq.ZRu(mm.Ht(), this.uR.Mm(), f10));
        }
    }

    public void FA(boolean z10) {
        this.TFq.mZ(z10);
    }

    public void NOt(final String str) {
        Mm mm = this.uR;
        if (mm == null) {
            this.aT.add(new ZRu() { // from class: com.bytedance.adsdk.NOt.Vor.12
                @Override // com.bytedance.adsdk.NOt.Vor.ZRu
                public void ZRu(Mm mm2) {
                    Vor.this.NOt(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.NOt.mZ.Ht htMZ = mm.mZ(str);
        if (htMZ != null) {
            ZRu((int) htMZ.ZRu);
            return;
        }
        throw new IllegalArgumentException(i.a("Cannot find marker with name ", str, IconCache.EMPTY_CLASS_NAME));
    }

    public com.bytedance.adsdk.NOt.mZ.mZ.NOt ZRu() {
        return this.OCA;
    }

    public void ZRu(String str) {
        this.sAl = str;
    }

    public boolean ZRu(Mm mm, Context context) {
        if (this.uR == mm) {
            return false;
        }
        this.Vr = true;
        FA();
        this.uR = mm;
        ZRu(context);
        this.TFq.ZRu(mm);
        uR(this.TFq.getAnimatedFraction());
        Iterator it = new ArrayList(this.aT).iterator();
        while (it.hasNext()) {
            ZRu zRu = (ZRu) it.next();
            if (zRu != null) {
                zRu.ZRu(mm);
            }
            it.remove();
        }
        this.aT.clear();
        mm.NOt(this.xY);
        Nb();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void mZ(float f10) {
        this.TFq.mZ(f10);
    }

    public void mZ(final int i10) {
        if (this.uR == null) {
            this.aT.add(new ZRu() { // from class: com.bytedance.adsdk.NOt.Vor.4
                @Override // com.bytedance.adsdk.NOt.Vor.ZRu
                public void ZRu(Mm mm) {
                    Vor.this.mZ(i10);
                }
            });
        } else {
            this.TFq.ZRu(i10);
        }
    }

    public void uR(@FloatRange(from = 0.0d, to = 1.0d) final float f10) {
        if (this.uR == null) {
            this.aT.add(new ZRu() { // from class: com.bytedance.adsdk.NOt.Vor.5
                @Override // com.bytedance.adsdk.NOt.Vor.ZRu
                public void ZRu(Mm mm) {
                    Vor.this.uR(f10);
                }
            });
            return;
        }
        TFq.ZRu("Drawable#setProgress");
        this.TFq.ZRu(this.uR.ZRu(f10));
        TFq.NOt("Drawable#setProgress");
    }

    public void NOt(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.TFq.removeUpdateListener(animatorUpdateListener);
    }

    public void NOt(Animator.AnimatorListener animatorListener) {
        this.TFq.removeListener(animatorListener);
    }

    private void NOt(int i10, int i11) {
        Bitmap bitmap = this.f140633Nb;
        if (bitmap != null && bitmap.getWidth() >= i10 && this.f140633Nb.getHeight() >= i11) {
            if (this.f140633Nb.getWidth() > i10 || this.f140633Nb.getHeight() > i11) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f140633Nb, 0, 0, i10, i11);
                this.f140633Nb = bitmapCreateBitmap;
                this.VdW.setBitmap(bitmapCreateBitmap);
                this.Vr = true;
                return;
            }
            return;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        this.f140633Nb = bitmapCreateBitmap2;
        this.VdW.setBitmap(bitmapCreateBitmap2);
        this.Vr = true;
    }

    public void uR(int i10) {
        this.TFq.setRepeatMode(i10);
    }

    public void ZRu(om omVar) {
        this.le = omVar;
        Nb();
    }

    private void ZRu(Context context) {
        Mm mm = this.uR;
        if (mm == null) {
            return;
        }
        com.bytedance.adsdk.NOt.mZ.mZ.NOt nOt = new com.bytedance.adsdk.NOt.mZ.mZ.NOt(this, xY.ZRu(mm), mm.sAl(), mm, context);
        this.OCA = nOt;
        if (this.Zf) {
            nOt.ZRu(true);
        }
        this.OCA.NOt(this.om);
    }

    public void ZRu(final int i10) {
        if (this.uR == null) {
            this.aT.add(new ZRu() { // from class: com.bytedance.adsdk.NOt.Vor.8
                @Override // com.bytedance.adsdk.NOt.Vor.ZRu
                public void ZRu(Mm mm) {
                    Vor.this.ZRu(i10);
                }
            });
        } else {
            this.TFq.ZRu(i10);
        }
    }

    public void ZRu(final float f10) {
        Mm mm = this.uR;
        if (mm == null) {
            this.aT.add(new ZRu() { // from class: com.bytedance.adsdk.NOt.Vor.9
                @Override // com.bytedance.adsdk.NOt.Vor.ZRu
                public void ZRu(Mm mm2) {
                    Vor.this.ZRu(f10);
                }
            });
        } else {
            ZRu((int) com.bytedance.adsdk.NOt.Ht.TFq.ZRu(mm.Ht(), this.uR.Mm(), f10));
        }
    }

    public void ZRu(final int i10, final int i11) {
        if (this.uR == null) {
            this.aT.add(new ZRu() { // from class: com.bytedance.adsdk.NOt.Vor.3
                @Override // com.bytedance.adsdk.NOt.Vor.ZRu
                public void ZRu(Mm mm) {
                    Vor.this.ZRu(i10, i11);
                }
            });
        } else {
            this.TFq.ZRu(i10, i11 + 0.99f);
        }
    }

    public void ZRu(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.TFq.addUpdateListener(animatorUpdateListener);
    }

    public void ZRu(Animator.AnimatorListener animatorListener) {
        this.TFq.addListener(animatorListener);
    }

    public void ZRu(Boolean bool) {
        this.Ht = bool.booleanValue();
    }

    public void ZRu(uR uRVar) {
        this.edo = uRVar;
        com.bytedance.adsdk.NOt.NOt.NOt nOt = this.lp;
        if (nOt != null) {
            nOt.ZRu(uRVar);
        }
    }

    public void ZRu(mZ mZVar) {
        this.NOt = mZVar;
        com.bytedance.adsdk.NOt.NOt.ZRu zRu = this.oK;
        if (zRu != null) {
            zRu.ZRu(mZVar);
        }
    }

    public void ZRu(Map<String, Typeface> map) {
        if (map == this.yBV) {
            return;
        }
        this.yBV = map;
        invalidateSelf();
    }

    public void ZRu(OCA oca) {
        this.mZ = oca;
    }

    public Bitmap ZRu(String str, Bitmap bitmap) {
        com.bytedance.adsdk.NOt.NOt.NOt nOtTh = th();
        if (nOtTh == null) {
            return null;
        }
        Bitmap bitmapZRu = nOtTh.ZRu(str, bitmap);
        invalidateSelf();
        return bitmapZRu;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Typeface ZRu(com.bytedance.adsdk.NOt.mZ.mZ mZVar) {
        Map<String, Typeface> map = this.yBV;
        if (map != null) {
            String strZRu = mZVar.ZRu();
            if (map.containsKey(strZRu)) {
                return map.get(strZRu);
            }
            String strNOt = mZVar.NOt();
            if (map.containsKey(strNOt)) {
                return map.get(strNOt);
            }
            String str = mZVar.ZRu() + a.f164606q + mZVar.mZ();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.bytedance.adsdk.NOt.NOt.ZRu zRuWD = WD();
        if (zRuWD != null) {
            return zRuWD.ZRu(mZVar);
        }
        return null;
    }

    private void ZRu(Canvas canvas) {
        com.bytedance.adsdk.NOt.mZ.mZ.NOt nOt = this.OCA;
        Mm mm = this.uR;
        if (nOt == null || mm == null) {
            return;
        }
        this.fcs.reset();
        if (!getBounds().isEmpty()) {
            this.fcs.preScale(r2.width() / mm.uR().width(), r2.height() / mm.uR().height());
            this.fcs.preTranslate(r2.left, r2.top);
        }
        nOt.ZRu(canvas, this.fcs, this.to);
    }

    private void ZRu(Canvas canvas, com.bytedance.adsdk.NOt.mZ.mZ.NOt nOt) {
        if (this.uR == null || nOt == null) {
            return;
        }
        Yx();
        canvas.getMatrix(this.bO);
        canvas.getClipBounds(this.th);
        ZRu(this.th, this.WD);
        this.bO.mapRect(this.WD);
        ZRu(this.WD, this.th);
        if (this.om) {
            this.Ho.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            nOt.ZRu(this.Ho, (Matrix) null, false);
        }
        this.bO.mapRect(this.Ho);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        ZRu(this.Ho, fWidth, fHeight);
        if (!Cox()) {
            RectF rectF = this.Ho;
            Rect rect = this.th;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.Ho.width());
        int iCeil2 = (int) Math.ceil(this.Ho.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        NOt(iCeil, iCeil2);
        if (this.Vr) {
            this.fcs.set(this.bO);
            this.fcs.preScale(fWidth, fHeight);
            Matrix matrix = this.fcs;
            RectF rectF2 = this.Ho;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f140633Nb.eraseColor(0);
            nOt.ZRu(this.VdW, this.fcs, this.to);
            this.bO.invert(this.AK);
            this.AK.mapRect(this.gI, this.Ho);
            ZRu(this.gI, this.Cox);
        }
        this.Yx.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f140633Nb, this.Yx, this.Cox, this.fWk);
    }

    private void ZRu(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void ZRu(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void ZRu(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }
}
