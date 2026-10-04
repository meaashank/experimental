package com.bytedance.adsdk.NOt;

import U6.j;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.NOt.Mm;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.bytedance.component.sdk.annotation.MainThread;
import com.bytedance.component.sdk.annotation.RawRes;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public class Ht extends ImageView {
    private static final ZH<Throwable> NOt = new ZH<Throwable>() { // from class: com.bytedance.adsdk.NOt.Ht.1
        @Override // com.bytedance.adsdk.NOt.ZH
        public void ZRu(Throwable th) {
            com.bytedance.adsdk.NOt.Ht.Ht.ZRu(th);
        }
    };
    private static final String ZRu = "Ht";
    private String FA;
    private int Ht;
    private String MR;
    private final Vor Mm;

    /* JADX INFO: renamed from: Nb, reason: collision with root package name */
    private NOt f140632Nb;
    private long OCA;
    private ZH<Throwable> TFq;
    private ZRu VdW;

    @RawRes
    private int Vor;
    private Mm WMI;
    private boolean ZH;
    private int Zf;
    private com.bytedance.adsdk.ugeno.mZ aT;
    private final Set<uR> edo;
    private final Runnable fcs;
    private int le;
    private boolean lp;
    private final ZH<Mm> mZ;
    private final Set<Object> oK;
    private Handler om;
    private final Handler qF;
    private int ru;
    private boolean sAl;
    private com.bytedance.adsdk.NOt.mZ.mZ.mZ to;
    private final ZH<Throwable> uR;
    private int xY;
    private sAl<Mm> yBV;

    /* JADX INFO: renamed from: com.bytedance.adsdk.NOt.Ht$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] ZRu;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            ZRu = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ZRu[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ZRu[ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ZRu[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface NOt {
    }

    public interface ZRu {
    }

    public static class mZ extends View.BaseSavedState {
        public static final Parcelable.Creator<mZ> CREATOR = new Parcelable.Creator<mZ>() { // from class: com.bytedance.adsdk.NOt.Ht.mZ.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
            public mZ createFromParcel(Parcel parcel) {
                return new mZ(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
            public mZ[] newArray(int i10) {
                return new mZ[i10];
            }
        };
        int Ht;
        int Mm;
        int NOt;
        String TFq;
        String ZRu;
        float mZ;
        boolean uR;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.ZRu);
            parcel.writeFloat(this.mZ);
            parcel.writeInt(this.uR ? 1 : 0);
            parcel.writeString(this.TFq);
            parcel.writeInt(this.Ht);
            parcel.writeInt(this.Mm);
        }

        public mZ(Parcelable parcelable) {
            super(parcelable);
        }

        private mZ(Parcel parcel) {
            super(parcel);
            this.ZRu = parcel.readString();
            this.mZ = parcel.readFloat();
            this.uR = parcel.readInt() == 1;
            this.TFq = parcel.readString();
            this.Ht = parcel.readInt();
            this.Mm = parcel.readInt();
        }
    }

    public enum uR {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public Ht(Context context) {
        super(context);
        this.mZ = new ZH<Mm>() { // from class: com.bytedance.adsdk.NOt.Ht.5
            @Override // com.bytedance.adsdk.NOt.ZH
            public void ZRu(Mm mm) {
                Ht.this.setComposition(mm);
            }
        };
        this.uR = new ZH<Throwable>() { // from class: com.bytedance.adsdk.NOt.Ht.6
            @Override // com.bytedance.adsdk.NOt.ZH
            public void ZRu(Throwable th) {
                if (Ht.this.Ht != 0) {
                    Ht ht = Ht.this;
                    ht.setImageResource(ht.Ht);
                }
                (Ht.this.TFq == null ? Ht.NOt : Ht.this.TFq).ZRu(th);
            }
        };
        this.Ht = 0;
        this.Mm = new Vor();
        this.ZH = false;
        this.lp = false;
        this.sAl = true;
        this.edo = new HashSet();
        this.oK = new HashSet();
        this.qF = new Handler(Looper.getMainLooper());
        this.OCA = 0L;
        this.fcs = new Runnable() { // from class: com.bytedance.adsdk.NOt.Ht.3
            @Override // java.lang.Runnable
            public void run() {
                Log.i("TMe", "--==--- timer callback, timer: " + Ht.this.xY + j.f68738d + Ht.this.Zf);
                if (Ht.this.xY > Ht.this.Zf) {
                    Ht.oK(Ht.this);
                    com.bytedance.adsdk.NOt.mZ.mZ.mZ mZVar = Ht.this.to;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Ht.this.xY);
                    mZVar.ZRu(sb2.toString());
                    Ht.this.invalidate();
                    Ht.this.oK();
                    return;
                }
                if (Ht.this.ru < 0 || Ht.this.le < 0) {
                    Log.i("TMe", "--==--- timer end, frame invalid: " + Ht.this.ru + "," + Ht.this.le);
                } else {
                    Log.i("TMe", "--==--- timer end, play anim, startframe: " + Ht.this.ru);
                    Ht.this.ZRu();
                    Ht ht = Ht.this;
                    ht.setFrame(ht.ru);
                    Ht.this.ZRu(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.NOt.Ht.3.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (Ht.this.getFrame() < Ht.this.le - 1 || Ht.this.getFrame() >= Ht.this.le + 2) {
                                return;
                            }
                            Log.i("TMe", "--==--- timer end, play anim, endframe: " + Ht.this.le);
                            Ht.this.NOt(this);
                            Ht.this.Ht();
                        }
                    });
                }
                if (TextUtils.isEmpty(Ht.this.MR) || Ht.this.f140632Nb == null) {
                    return;
                }
                NOt unused = Ht.this.f140632Nb;
                String unused2 = Ht.this.MR;
            }
        };
        FA();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Mm.ZRu getGlobalConfig() {
        Mm mmRu;
        Vor vor = this.Mm;
        if (vor == null || (mmRu = vor.ru()) == null) {
            return null;
        }
        return mmRu.ZH();
    }

    private Mm.NOt getGlobalEvent() {
        Mm mmRu;
        Vor vor = this.Mm;
        if (vor == null || (mmRu = vor.ru()) == null) {
            return null;
        }
        return mmRu.aT();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPlayDelayedELExpressTimeS() {
        Mm mmRu;
        Vor vor = this.Mm;
        if (vor == null || (mmRu = vor.ru()) == null) {
            return null;
        }
        return mmRu.Vor();
    }

    public static /* synthetic */ int oK(Ht ht) {
        int i10 = ht.xY;
        ht.xY = i10 - 1;
        return i10;
    }

    private void setCompositionTask(sAl<Mm> sal) {
        this.edo.add(uR.SET_ANIMATION);
        WMI();
        sAl();
        this.yBV = sal.ZRu(this.mZ).mZ(this.uR);
    }

    public boolean getClipToCompositionBounds() {
        return this.Mm.NOt();
    }

    public Mm getComposition() {
        return this.WMI;
    }

    public long getDuration() {
        Mm mm = this.WMI;
        if (mm != null) {
            return (long) mm.TFq();
        }
        return 0L;
    }

    public int getFrame() {
        return this.Mm.WMI();
    }

    public String getImageAssetsFolder() {
        return this.Mm.mZ();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.Mm.uR();
    }

    public float getMaxFrame() {
        return this.Mm.sAl();
    }

    public float getMinFrame() {
        return this.Mm.lp();
    }

    public qF getPerformanceTracker() {
        return this.Mm.Ht();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.Mm.fcs();
    }

    public om getRenderMode() {
        return this.Mm.TFq();
    }

    public int getRepeatCount() {
        return this.Mm.om();
    }

    public int getRepeatMode() {
        return this.Mm.qF();
    }

    public float getSpeed() {
        return this.Mm.edo();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof Vor) && ((Vor) drawable).TFq() == om.SOFTWARE) {
            this.Mm.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        Vor vor = this.Mm;
        if (drawable2 == vor) {
            super.invalidateDrawable(vor);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.lp) {
            this.Mm.Vor();
        }
        com.bytedance.adsdk.ugeno.mZ mZVar = this.aT;
        if (mZVar != null) {
            mZVar.Mm();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yBV();
        Handler handler = this.om;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        mZ();
        NOt();
        com.bytedance.adsdk.ugeno.mZ mZVar = this.aT;
        if (mZVar != null) {
            mZVar.FA();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof mZ)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        mZ mZVar = (mZ) parcelable;
        super.onRestoreInstanceState(mZVar.getSuperState());
        this.FA = mZVar.ZRu;
        Set<uR> set = this.edo;
        uR uRVar = uR.SET_ANIMATION;
        if (!set.contains(uRVar) && !TextUtils.isEmpty(this.FA)) {
            setAnimation(this.FA);
        }
        this.Vor = mZVar.NOt;
        if (!this.edo.contains(uRVar) && (i10 = this.Vor) != 0) {
            setAnimation(i10);
        }
        if (!this.edo.contains(uR.SET_PROGRESS)) {
            ZRu(mZVar.mZ, false);
        }
        if (!this.edo.contains(uR.PLAY_OPTION) && mZVar.uR) {
            ZRu();
        }
        if (!this.edo.contains(uR.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(mZVar.TFq);
        }
        if (!this.edo.contains(uR.SET_REPEAT_MODE)) {
            setRepeatMode(mZVar.Ht);
        }
        if (this.edo.contains(uR.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(mZVar.Mm);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        mZ mZVar = new mZ(super.onSaveInstanceState());
        mZVar.ZRu = this.FA;
        mZVar.NOt = this.Vor;
        mZVar.mZ = this.Mm.fcs();
        mZVar.uR = this.Mm.to();
        mZVar.TFq = this.Mm.mZ();
        mZVar.Ht = this.Mm.qF();
        mZVar.Mm = this.Mm.om();
        return mZVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int[][] iArr;
        com.bytedance.adsdk.NOt.mZ.mZ.ZRu zRuNOt = NOt(motionEvent);
        if (zRuNOt == null) {
            if (getGlobalConfig() == null || getGlobalConfig().ZRu != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        String strVor = zRuNOt.Vor();
        if (zRuNOt instanceof com.bytedance.adsdk.NOt.mZ.mZ.NOt) {
            if (getGlobalConfig() == null || getGlobalConfig().ZRu != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        if (strVor != null && strVor.startsWith("CSJCLOSE")) {
            yBV();
        }
        aT aTVarZRu = ZRu(zRuNOt.TFq());
        if (aTVarZRu != null && motionEvent.getAction() == 1) {
            if (TextUtils.isEmpty(aTVarZRu.TFq()) && strVor != null && !strVor.endsWith("CSJNO")) {
                ZRu(motionEvent);
            }
            int[][] iArrHt = aTVarZRu.Ht();
            if (iArrHt != null) {
                ZRu(iArrHt);
            } else if (getGlobalEvent() != null && (iArr = getGlobalEvent().NOt) != null) {
                ZRu(iArr);
            }
        }
        if (strVor == null || !strVor.startsWith("CSJNTP")) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setAnimation(@RawRes int i10) {
        this.Vor = i10;
        this.FA = null;
        setCompositionTask(ZRu(i10));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        ZRu(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.sAl ? FA.ZRu(getContext(), str) : FA.ZRu(getContext(), str, (String) null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.Mm.TFq(z10);
    }

    public void setCacheComposition(boolean z10) {
        this.sAl = z10;
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.Mm.ZRu(z10);
    }

    public void setComposition(Mm mm) {
        if (TFq.ZRu) {
            Log.v(ZRu, "Set Composition \n".concat(String.valueOf(mm)));
        }
        this.Mm.setCallback(this);
        this.WMI = mm;
        this.ZH = true;
        boolean zZRu = this.Mm.ZRu(mm, getContext().getApplicationContext());
        this.ZH = false;
        if (getDrawable() != this.Mm || zZRu) {
            if (!zZRu) {
                qF();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<Object> it = this.oK.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.Mm.Mm(str);
    }

    public void setFailureListener(ZH<Throwable> zh) {
        this.TFq = zh;
    }

    public void setFallbackResource(int i10) {
        this.Ht = i10;
    }

    public void setFontAssetDelegate(com.bytedance.adsdk.NOt.mZ mZVar) {
        this.Mm.ZRu(mZVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.Mm.ZRu(map);
    }

    public void setFrame(int i10) {
        this.Mm.mZ(i10);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.Mm.Mm(z10);
    }

    public void setImageAssetDelegate(com.bytedance.adsdk.NOt.uR uRVar) {
        this.Mm.ZRu(uRVar);
    }

    public void setImageAssetsFolder(String str) {
        this.Mm.ZRu(str);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        sAl();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        sAl();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        sAl();
        super.setImageResource(i10);
    }

    public void setLottieAnimListener(ZRu zRu) {
        this.VdW = zRu;
    }

    public void setLottieClicklistener(NOt nOt) {
        this.f140632Nb = nOt;
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.Mm.NOt(z10);
    }

    public void setMaxFrame(int i10) {
        this.Mm.NOt(i10);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        this.Mm.NOt(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.Mm.uR(str);
    }

    public void setMinFrame(int i10) {
        this.Mm.ZRu(i10);
    }

    public void setMinProgress(float f10) {
        this.Mm.ZRu(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.Mm.uR(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.Mm.mZ(z10);
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        ZRu(f10, true);
    }

    public void setRenderMode(om omVar) {
        this.Mm.ZRu(omVar);
    }

    public void setRepeatCount(int i10) {
        this.edo.add(uR.SET_REPEAT_COUNT);
        this.Mm.TFq(i10);
    }

    public void setRepeatMode(int i10) {
        this.edo.add(uR.SET_REPEAT_MODE);
        this.Mm.uR(i10);
    }

    public void setSafeMode(boolean z10) {
        this.Mm.Ht(z10);
    }

    public void setSpeed(float f10) {
        this.Mm.mZ(f10);
    }

    public void setTextDelegate(OCA oca) {
        this.Mm.ZRu(oca);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.Mm.FA(z10);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        Vor vor;
        if (!this.ZH && drawable == (vor = this.Mm) && vor.OCA()) {
            Ht();
        } else if (!this.ZH && (drawable instanceof Vor)) {
            Vor vor2 = (Vor) drawable;
            if (vor2.OCA()) {
                vor2.MR();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    private void FA() {
        setSaveEnabled(false);
        this.sAl = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        ZRu(0.0f, false);
        ZRu(false, getContext().getApplicationContext());
        setIgnoreDisabledSystemAnimations(false);
        this.Mm.ZRu(Boolean.valueOf(com.bytedance.adsdk.NOt.Ht.Ht.ZRu(getContext()) != 0.0f));
        Vor();
        aT();
        lp();
    }

    private com.bytedance.adsdk.NOt.mZ.mZ.ZRu NOt(MotionEvent motionEvent) {
        com.bytedance.adsdk.NOt.mZ.mZ.NOt nOtZRu;
        Vor vor = this.Mm;
        if (vor == null || (nOtZRu = vor.ZRu()) == null) {
            return null;
        }
        return ZRu(nOtZRu, motionEvent);
    }

    private void Vor() {
        ZRu(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.NOt.Ht.7
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Ht.this.NOt(this);
                Ht.this.edo();
            }
        });
    }

    private void WMI() {
        this.WMI = null;
        this.Mm.FA();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZH() {
        Map<String, Object> map;
        Mm.ZRu globalConfig = getGlobalConfig();
        if (globalConfig == null || (map = globalConfig.NOt) == null) {
            return;
        }
        map.isEmpty();
    }

    private void aT() {
        ZRu(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.NOt.Ht.8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Map<String, Object> map;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < 0.98f) {
                    return;
                }
                Ht.this.NOt(this);
                Mm.ZRu globalConfig = Ht.this.getGlobalConfig();
                if (globalConfig == null || (map = globalConfig.mZ) == null || map.isEmpty() || Ht.this.VdW == null) {
                    return;
                }
                ZRu unused = Ht.this.VdW;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void edo() {
        Vor vor;
        int i10;
        int i11;
        final int i12;
        if (this.WMI == null || (vor = this.Mm) == null) {
            return;
        }
        OCA ocaXY = vor.xY();
        Mm.mZ mZVarFA = this.WMI.FA();
        if (mZVarFA == null || ocaXY == null) {
            return;
        }
        final int i13 = mZVarFA.ZRu;
        if (i13 < 0) {
            Log.i("TMe", "--==--- timer fail, ke is invalid: ".concat(String.valueOf(i13)));
            return;
        }
        int[] iArr = mZVarFA.TFq;
        final int i14 = -1;
        if (iArr == null || iArr.length < 2) {
            i10 = -1;
            i11 = -1;
        } else {
            i11 = iArr[0];
            i10 = iArr[1];
        }
        String strZRu = ocaXY.ZRu(mZVarFA.mZ);
        String strZRu2 = ocaXY.ZRu(mZVarFA.uR);
        try {
            i12 = Integer.parseInt(strZRu);
            try {
                i14 = Integer.parseInt(strZRu2);
            } catch (NumberFormatException unused) {
            }
        } catch (NumberFormatException unused2) {
            i12 = -1;
        }
        Log.i("TMe", "--==--- prepare timer, startS: " + i12 + ", lenS: " + i14);
        if (TextUtils.isEmpty(mZVarFA.NOt)) {
            Log.i("TMe", "--==--- timer fail, id is invalid: " + mZVarFA.NOt);
            return;
        }
        Log.i("TMe", "--==--- timer, id:" + mZVarFA.NOt);
        com.bytedance.adsdk.NOt.mZ.mZ.mZ mZVarMZ = mZ(mZVarFA.NOt);
        if (mZVarMZ != null) {
            Log.i("TMe", "--==--- timer success");
            this.MR = mZVarFA.Ht;
            this.to = mZVarMZ;
            this.xY = i12;
            this.Zf = i12 - i14;
            this.ru = i11;
            this.le = i10;
            ZRu(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.NOt.Ht.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (Ht.this.getFrame() < i13 - 1 || Ht.this.getFrame() >= i13 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- enter timer point, frame: " + Ht.this.getFrame());
                    Ht.this.NOt(this);
                    if (i12 < 0 || i14 < 0) {
                        Log.i("TMe", "--==--- enter timer callback, NOT start timer");
                    } else {
                        Log.i("TMe", "--==--- enter timer callback, start timer");
                        Ht.this.oK();
                    }
                    Ht.this.Ht();
                }
            });
        }
    }

    private void lp() {
        ZRu(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.NOt.Ht.9
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                OCA ocaXY;
                Ht.this.NOt(this);
                String playDelayedELExpressTimeS = Ht.this.getPlayDelayedELExpressTimeS();
                if (!TextUtils.isEmpty(playDelayedELExpressTimeS) && (ocaXY = Ht.this.Mm.xY()) != null) {
                    try {
                        int i10 = Integer.parseInt(ocaXY.ZRu(playDelayedELExpressTimeS)) * 1000;
                        if (Ht.this.OCA > 0) {
                            long jElapsedRealtime = (Ht.this.OCA + ((long) i10)) - SystemClock.elapsedRealtime();
                            Log.i("TMe", "--==-- lottie delayed time: ".concat(String.valueOf(jElapsedRealtime)));
                            if (jElapsedRealtime > 0) {
                                Ht.this.Ht();
                                Ht.this.setVisibility(8);
                                if (Ht.this.om == null) {
                                    Ht.this.om = new Handler(Looper.getMainLooper());
                                }
                                Ht.this.om.removeCallbacksAndMessages(null);
                                Ht.this.om.postDelayed(new Runnable() { // from class: com.bytedance.adsdk.NOt.Ht.9.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Log.i("TMe", "--==-- lottie real start play");
                                        Ht.this.setVisibility(0);
                                        Ht.this.ZRu();
                                        Ht.this.ZH();
                                    }
                                }, jElapsedRealtime);
                                return;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                Ht.this.ZH();
            }
        });
    }

    private void mZ(Matrix matrix, float f10, float f11, float f12, float f13) {
        matrix.postTranslate((f10 - f12) / 2.0f, (f11 - f13) / 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oK() {
        this.qF.postDelayed(this.fcs, 1000L);
    }

    private void qF() {
        boolean zUR = uR();
        setImageDrawable(null);
        setImageDrawable(this.Mm);
        if (zUR) {
            this.Mm.ZH();
        }
    }

    private void sAl() {
        sAl<Mm> sal = this.yBV;
        if (sal != null) {
            sal.NOt(this.mZ);
            this.yBV.uR(this.uR);
        }
    }

    private void uR(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 >= f10 || f13 >= f11) {
            if (f12 / f13 >= f10 / f11) {
                float f14 = f10 / f12;
                matrix.preScale(f14, f14);
                matrix.postTranslate(0.0f, (f11 - (f13 * f14)) / 2.0f);
                return;
            } else {
                float f15 = f11 / f13;
                matrix.preScale(f15, f15);
                matrix.postTranslate((f10 - (f12 * f15)) / 2.0f, 0.0f);
                return;
            }
        }
        if (f12 / f13 >= f10 / f11) {
            float f16 = f10 / f12;
            matrix.preScale(f16, f16);
            matrix.postTranslate(0.0f, (f11 - (f13 * f16)) / 2.0f);
        } else {
            float f17 = f11 / f13;
            matrix.preScale(f17, f17);
            matrix.postTranslate((f10 - (f12 * f17)) / 2.0f, 0.0f);
        }
    }

    private void yBV() {
        this.qF.removeCallbacksAndMessages(null);
    }

    @MainThread
    public void Ht() {
        this.lp = false;
        this.Mm.MR();
    }

    @MainThread
    public void TFq() {
        this.edo.add(uR.PLAY_OPTION);
        this.Mm.le();
    }

    public void setMaxFrame(String str) {
        this.Mm.mZ(str);
    }

    public void setMinFrame(String str) {
        this.Mm.NOt(str);
    }

    private com.bytedance.adsdk.NOt.mZ.mZ.mZ mZ(String str) {
        com.bytedance.adsdk.NOt.mZ.mZ.NOt nOtZRu;
        Vor vor = this.Mm;
        if (vor == null || (nOtZRu = vor.ZRu()) == null) {
            return null;
        }
        return ZRu(nOtZRu, str);
    }

    public void ZRu(com.bytedance.adsdk.ugeno.mZ mZVar) {
        this.aT = mZVar;
    }

    private aT ZRu(String str) {
        Vor vor;
        Mm mmRu;
        Map<String, aT> mapYBV;
        if (TextUtils.isEmpty(str) || (vor = this.Mm) == null || (mmRu = vor.ru()) == null || (mapYBV = mmRu.yBV()) == null) {
            return null;
        }
        return mapYBV.get(str);
    }

    public void setAnimation(String str) {
        this.FA = str;
        this.Vor = 0;
        setCompositionTask(NOt(str));
    }

    private void NOt(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 < f10 && f13 < f11) {
            matrix.postTranslate((f10 - f12) / 2.0f, (f11 - f13) / 2.0f);
            return;
        }
        if (f12 / f13 >= f10 / f11) {
            float f14 = f10 / f12;
            matrix.preScale(f14, f14);
            matrix.postTranslate(0.0f, (f11 - (f13 * f14)) / 2.0f);
        } else {
            float f15 = f11 / f13;
            matrix.preScale(f15, f15);
            matrix.postTranslate((f10 - (f12 * f15)) / 2.0f, 0.0f);
        }
    }

    public void mZ() {
        this.Mm.yBV();
    }

    private void ZRu(int[][] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        try {
            int[] iArr2 = iArr[0];
            int i10 = iArr2[0];
            final int i11 = iArr2[1];
            if (i10 < 0 || i11 < 0) {
                return;
            }
            Log.i("TMe", "--==--- inel enter, play anim, startframe: ".concat(String.valueOf(i10)));
            yBV();
            ZRu();
            setFrame(i10);
            ZRu(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.NOt.Ht.10
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (Ht.this.getFrame() < i11 - 1 || Ht.this.getFrame() >= i11 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- inel enter, play anim end, endframe: " + i11 + ", realFrame: " + Ht.this.getFrame());
                    Ht.this.NOt(this);
                    Ht.this.Ht();
                }
            });
        } catch (Throwable unused) {
        }
    }

    private sAl<Mm> NOt(final String str) {
        if (isInEditMode()) {
            return new sAl<>(new Callable<lp<Mm>>() { // from class: com.bytedance.adsdk.NOt.Ht.12
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
                public lp<Mm> call() throws Exception {
                    return Ht.this.sAl ? FA.mZ(Ht.this.getContext(), str) : FA.mZ(Ht.this.getContext(), str, null);
                }
            }, true);
        }
        return this.sAl ? FA.NOt(getContext(), str) : FA.NOt(getContext(), str, (String) null);
    }

    public boolean uR() {
        return this.Mm.OCA();
    }

    public void NOt(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.Mm.NOt(animatorUpdateListener);
    }

    public void NOt() {
        this.Mm.oK();
    }

    public void NOt(Animator.AnimatorListener animatorListener) {
        this.Mm.NOt(animatorListener);
    }

    private boolean ZRu(MotionEvent motionEvent) {
        Mm.NOt globalEvent = getGlobalEvent();
        return (globalEvent == null || TextUtils.isEmpty(globalEvent.ZRu)) ? false : true;
    }

    private com.bytedance.adsdk.NOt.mZ.mZ.ZRu ZRu(com.bytedance.adsdk.NOt.mZ.mZ.NOt nOt, MotionEvent motionEvent) {
        com.bytedance.adsdk.NOt.mZ.mZ.ZRu ZRu2;
        for (com.bytedance.adsdk.NOt.mZ.mZ.ZRu zRu : nOt.lp()) {
            if (zRu instanceof com.bytedance.adsdk.NOt.mZ.mZ.NOt) {
                if (zRu.FA() && zRu.Ht() > 0.0f) {
                    RectF rectF = new RectF();
                    zRu.ZRu(rectF, zRu.uR(), true);
                    if (rectF.width() >= 3.0f && rectF.height() >= 3.0f && (ZRu2 = ZRu((com.bytedance.adsdk.NOt.mZ.mZ.NOt) zRu, motionEvent)) != null) {
                        return ZRu2;
                    }
                }
            } else if (zRu.FA() && zRu.Ht() > 0.0f) {
                RectF rectF2 = new RectF();
                zRu.ZRu(rectF2, zRu.uR(), true);
                RectF rectF3 = new RectF();
                ZRu(rectF3, rectF2);
                if (ZRu(motionEvent, rectF3)) {
                    return zRu;
                }
            }
        }
        return null;
    }

    private boolean ZRu(MotionEvent motionEvent, RectF rectF) {
        if (motionEvent != null && rectF != null) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (x10 >= rectF.left && x10 <= rectF.right && y10 >= rectF.top && y10 <= rectF.bottom) {
                return true;
            }
        }
        return false;
    }

    private void ZRu(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = this.Mm.getBounds().width();
        float fHeight = this.Mm.getBounds().height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i10 = AnonymousClass4.ZRu[getScaleType().ordinal()];
        if (i10 == 1) {
            ZRu(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 2) {
            NOt(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 3) {
            mZ(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 4) {
            uR(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF, rectF2);
    }

    private void ZRu(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 / f13 >= f10 / f11) {
            float f14 = f11 / f13;
            matrix.preScale(f14, f14);
            matrix.postTranslate(-(((f12 * f14) - f10) / 2.0f), 0.0f);
        } else {
            float f15 = f10 / f12;
            matrix.preScale(f15, f15);
            matrix.postTranslate(0.0f, -(((f13 * f15) - f11) / 2.0f));
        }
    }

    public void ZRu(boolean z10, Context context) {
        this.Mm.ZRu(z10, context);
    }

    private sAl<Mm> ZRu(@RawRes final int i10) {
        if (isInEditMode()) {
            return new sAl<>(new Callable<lp<Mm>>() { // from class: com.bytedance.adsdk.NOt.Ht.11
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
                public lp<Mm> call() throws Exception {
                    return Ht.this.sAl ? FA.NOt(Ht.this.getContext(), i10) : FA.NOt(Ht.this.getContext(), i10, (String) null);
                }
            }, true);
        }
        return this.sAl ? FA.ZRu(getContext(), i10) : FA.ZRu(getContext(), i10, (String) null);
    }

    public void ZRu(String str, String str2) {
        ZRu(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void ZRu(InputStream inputStream, String str) {
        setCompositionTask(FA.ZRu(inputStream, str));
    }

    private com.bytedance.adsdk.NOt.mZ.mZ.mZ ZRu(com.bytedance.adsdk.NOt.mZ.mZ.NOt nOt, String str) {
        for (com.bytedance.adsdk.NOt.mZ.mZ.ZRu zRu : nOt.lp()) {
            if (zRu instanceof com.bytedance.adsdk.NOt.mZ.mZ.NOt) {
                com.bytedance.adsdk.NOt.mZ.mZ.mZ mZVarZRu = ZRu((com.bytedance.adsdk.NOt.mZ.mZ.NOt) zRu, str);
                if (mZVarZRu != null) {
                    return mZVarZRu;
                }
            } else if (TextUtils.equals(str, zRu.Vor()) && (zRu instanceof com.bytedance.adsdk.NOt.mZ.mZ.mZ)) {
                return (com.bytedance.adsdk.NOt.mZ.mZ.mZ) zRu;
            }
        }
        return null;
    }

    @MainThread
    public void ZRu() {
        this.edo.add(uR.PLAY_OPTION);
        this.Mm.Vor();
        if (this.OCA == 0) {
            this.OCA = SystemClock.elapsedRealtime();
        }
    }

    public void ZRu(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.Mm.ZRu(animatorUpdateListener);
    }

    public void ZRu(Animator.AnimatorListener animatorListener) {
        this.Mm.ZRu(animatorListener);
    }

    @Deprecated
    public void ZRu(boolean z10) {
        this.Mm.TFq(z10 ? -1 : 0);
    }

    public Bitmap ZRu(String str, Bitmap bitmap) {
        return this.Mm.ZRu(str, bitmap);
    }

    private void ZRu(@FloatRange(from = 0.0d, to = 1.0d) float f10, boolean z10) {
        if (z10) {
            this.edo.add(uR.SET_PROGRESS);
        }
        this.Mm.uR(f10);
    }
}
