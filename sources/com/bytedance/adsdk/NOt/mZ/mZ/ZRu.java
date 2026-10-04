package com.bytedance.adsdk.NOt.mZ.mZ;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.bytedance.adsdk.NOt.TFq.aT;
import com.bytedance.adsdk.NOt.ZRu.NOt.ZRu;
import com.bytedance.adsdk.NOt.ZRu.NOt.yBV;
import com.bytedance.adsdk.NOt.mZ.NOt.FA;
import com.bytedance.adsdk.NOt.mZ.NOt.edo;
import com.bytedance.adsdk.NOt.mZ.mZ.TFq;
import com.bytedance.component.sdk.annotation.FloatRange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZRu implements ZRu.InterfaceC0381ZRu, com.bytedance.adsdk.NOt.ZRu.ZRu.TFq {
    BlurMaskFilter Ht;
    private final List<com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<?, ?>> MR;
    final com.bytedance.adsdk.NOt.Vor NOt;

    /* JADX INFO: renamed from: Nb, reason: collision with root package name */
    private boolean f140634Nb;
    private final String OCA;
    float TFq;
    private Paint VdW;
    private float WD;
    private final RectF WMI;
    private final Paint ZH;
    final Matrix ZRu;
    private ZRu Zf;
    private final Paint edo;
    private boolean fcs;
    private List<ZRu> le;
    private final Paint lp;
    final TFq mZ;
    private final RectF oK;
    private final RectF om;
    private final RectF qF;
    private ZRu ru;
    private final Paint sAl;
    private final Matrix th;
    private com.bytedance.adsdk.NOt.ZRu.NOt.FA to;
    final yBV uR;
    private com.bytedance.adsdk.NOt.ZRu.NOt.uR xY;
    private final RectF yBV;
    private final Path Mm = new Path();
    private final Matrix FA = new Matrix();
    private final Matrix Vor = new Matrix();
    private final Paint aT = new com.bytedance.adsdk.NOt.ZRu.ZRu(1);

    /* JADX INFO: renamed from: com.bytedance.adsdk.NOt.mZ.mZ.ZRu$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] NOt;
        static final /* synthetic */ int[] ZRu;

        static {
            int[] iArr = new int[FA.ZRu.values().length];
            NOt = iArr;
            try {
                iArr[FA.ZRu.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                NOt[FA.ZRu.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                NOt[FA.ZRu.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                NOt[FA.ZRu.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[TFq.ZRu.values().length];
            ZRu = iArr2;
            try {
                iArr2[TFq.ZRu.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ZRu[TFq.ZRu.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ZRu[TFq.ZRu.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ZRu[TFq.ZRu.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ZRu[TFq.ZRu.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                ZRu[TFq.ZRu.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                ZRu[TFq.ZRu.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public ZRu(com.bytedance.adsdk.NOt.Vor vor, TFq tFq) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.ZH = new com.bytedance.adsdk.NOt.ZRu.ZRu(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.lp = new com.bytedance.adsdk.NOt.ZRu.ZRu(1, mode2);
        com.bytedance.adsdk.NOt.ZRu.ZRu zRu = new com.bytedance.adsdk.NOt.ZRu.ZRu(1);
        this.sAl = zRu;
        this.edo = new com.bytedance.adsdk.NOt.ZRu.ZRu(PorterDuff.Mode.CLEAR);
        this.oK = new RectF();
        this.yBV = new RectF();
        this.WMI = new RectF();
        this.qF = new RectF();
        this.om = new RectF();
        this.ZRu = new Matrix();
        this.MR = new ArrayList();
        this.fcs = true;
        this.TFq = 0.0f;
        this.th = new Matrix();
        this.WD = 1.0f;
        this.NOt = vor;
        this.mZ = tFq;
        this.OCA = tFq.Ht() + "#draw";
        if (tFq.lp() == TFq.NOt.INVERT) {
            zRu.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            zRu.setXfermode(new PorterDuffXfermode(mode));
        }
        yBV ybvAT = tFq.oK().aT();
        this.uR = ybvAT;
        ybvAT.ZRu((ZRu.InterfaceC0381ZRu) this);
        if (tFq.aT() != null && !tFq.aT().isEmpty()) {
            com.bytedance.adsdk.NOt.ZRu.NOt.FA fa2 = new com.bytedance.adsdk.NOt.ZRu.NOt.FA(tFq.aT());
            this.to = fa2;
            Iterator<com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<edo, Path>> it = fa2.NOt().iterator();
            while (it.hasNext()) {
                it.next().ZRu(this);
            }
            for (com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<Integer, Integer> zRu2 : this.to.mZ()) {
                ZRu(zRu2);
                zRu2.ZRu(this);
            }
        }
        lp();
    }

    private boolean edo() {
        if (this.to.NOt().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.to.ZRu().size(); i10++) {
            if (this.to.ZRu().get(i10).ZRu() != FA.ZRu.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void lp() {
        if (this.mZ.uR().isEmpty()) {
            NOt(true);
            return;
        }
        com.bytedance.adsdk.NOt.ZRu.NOt.uR uRVar = new com.bytedance.adsdk.NOt.ZRu.NOt.uR(this.mZ.uR());
        this.xY = uRVar;
        uRVar.ZRu();
        this.xY.ZRu(new ZRu.InterfaceC0381ZRu() { // from class: com.bytedance.adsdk.NOt.mZ.mZ.ZRu.1
            @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.InterfaceC0381ZRu
            public void ZRu() {
                ZRu zRu = ZRu.this;
                zRu.NOt(zRu.xY.Vor() == 1.0f);
            }
        });
        NOt(this.xY.Mm().floatValue() == 1.0f);
        ZRu(this.xY);
    }

    private void oK() {
        if (this.le != null) {
            return;
        }
        if (this.ru == null) {
            this.le = Collections.EMPTY_LIST;
            return;
        }
        this.le = new ArrayList();
        for (ZRu zRu = this.ru; zRu != null; zRu = zRu.ru) {
            this.le.add(zRu);
        }
    }

    private void sAl() {
        this.NOt.invalidateSelf();
    }

    public boolean FA() {
        return this.fcs;
    }

    public float Ht() {
        return this.WD;
    }

    public boolean Mm() {
        com.bytedance.adsdk.NOt.ZRu.NOt.FA fa2 = this.to;
        return (fa2 == null || fa2.NOt().isEmpty()) ? false : true;
    }

    public TFq NOt() {
        return this.mZ;
    }

    public String TFq() {
        TFq tFq = this.mZ;
        if (tFq != null) {
            return tFq.Mm();
        }
        return null;
    }

    public String Vor() {
        return this.mZ.Ht();
    }

    public aT ZH() {
        return this.mZ.ru();
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.ZRu.mZ
    public void ZRu(List<com.bytedance.adsdk.NOt.ZRu.ZRu.mZ> list, List<com.bytedance.adsdk.NOt.ZRu.ZRu.mZ> list2) {
    }

    public com.bytedance.adsdk.NOt.mZ.NOt.ZRu aT() {
        return this.mZ.Zf();
    }

    public Matrix uR() {
        return this.th;
    }

    private void uR(Canvas canvas, Matrix matrix, com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<edo, Path> zRu, com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<Integer, Integer> zRu2) {
        com.bytedance.adsdk.NOt.Ht.Ht.ZRu(canvas, this.oK, this.ZH);
        this.Mm.set(zRu.Mm());
        this.Mm.transform(matrix);
        this.aT.setAlpha((int) (zRu2.Mm().intValue() * 2.55f));
        canvas.drawPath(this.Mm, this.aT);
        canvas.restore();
    }

    public void NOt(ZRu zRu) {
        this.ru = zRu;
    }

    public boolean mZ() {
        return this.Zf != null;
    }

    private void NOt(RectF rectF, Matrix matrix) {
        if (mZ() && this.mZ.lp() != TFq.NOt.INVERT) {
            this.qF.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.Zf.ZRu(this.qF, matrix, true);
            if (rectF.intersect(this.qF)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void TFq(Canvas canvas, Matrix matrix, com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<edo, Path> zRu, com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<Integer, Integer> zRu2) {
        com.bytedance.adsdk.NOt.Ht.Ht.ZRu(canvas, this.oK, this.ZH);
        canvas.drawRect(this.oK, this.aT);
        this.lp.setAlpha((int) (zRu2.Mm().intValue() * 2.55f));
        this.Mm.set(zRu.Mm());
        this.Mm.transform(matrix);
        canvas.drawPath(this.Mm, this.lp);
        canvas.restore();
    }

    public static ZRu ZRu(NOt nOt, TFq tFq, com.bytedance.adsdk.NOt.Vor vor, com.bytedance.adsdk.NOt.Mm mm, Context context) {
        switch (AnonymousClass2.ZRu[tFq.ZH().ordinal()]) {
            case 1:
                return new Mm(vor, tFq, nOt, mm);
            case 2:
                return new NOt(vor, tFq, mm.NOt(tFq.Mm()), mm, context);
            case 3:
                return new FA(vor, tFq);
            case 4:
                if (ZRu(vor, tFq)) {
                    return new mZ(vor, tFq, context);
                }
                return new uR(vor, tFq);
            case 5:
                return new Ht(vor, tFq);
            case 6:
                return new Vor(vor, tFq);
            default:
                Objects.toString(tFq.ZH());
                return null;
        }
    }

    private void mZ(float f10) {
        this.NOt.ru().mZ().ZRu(this.mZ.Ht(), f10);
    }

    private void mZ(Canvas canvas, Matrix matrix, com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<edo, Path> zRu, com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<Integer, Integer> zRu2) {
        com.bytedance.adsdk.NOt.Ht.Ht.ZRu(canvas, this.oK, this.lp);
        canvas.drawRect(this.oK, this.aT);
        this.lp.setAlpha((int) (zRu2.Mm().intValue() * 2.55f));
        this.Mm.set(zRu.Mm());
        this.Mm.transform(matrix);
        canvas.drawPath(this.Mm, this.lp);
        canvas.restore();
    }

    public void NOt(Canvas canvas, Matrix matrix, int i10) {
        ZRu(i10);
    }

    private void NOt(Canvas canvas, Matrix matrix, com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<edo, Path> zRu, com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<Integer, Integer> zRu2) {
        com.bytedance.adsdk.NOt.Ht.Ht.ZRu(canvas, this.oK, this.aT);
        canvas.drawRect(this.oK, this.aT);
        this.Mm.set(zRu.Mm());
        this.Mm.transform(matrix);
        this.aT.setAlpha((int) (zRu2.Mm().intValue() * 2.55f));
        canvas.drawPath(this.Mm, this.lp);
        canvas.restore();
    }

    private static boolean ZRu(com.bytedance.adsdk.NOt.Vor vor, TFq tFq) {
        com.bytedance.adsdk.NOt.aT aTVarHt;
        if (vor == null || tFq == null || (aTVarHt = vor.Ht(tFq.Mm())) == null) {
            return false;
        }
        return "text:".equals(aTVarHt.Vor());
    }

    public void ZRu(boolean z10) {
        if (z10 && this.VdW == null) {
            this.VdW = new com.bytedance.adsdk.NOt.ZRu.ZRu();
        }
        this.f140634Nb = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(boolean z10) {
        if (z10 != this.fcs) {
            this.fcs = z10;
            sAl();
        }
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.InterfaceC0381ZRu
    public void ZRu() {
        sAl();
    }

    public void ZRu(ZRu zRu) {
        this.Zf = zRu;
    }

    public BlurMaskFilter NOt(float f10) {
        if (this.TFq == f10) {
            return this.Ht;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.Ht = blurMaskFilter;
        this.TFq = f10;
        return blurMaskFilter;
    }

    public void ZRu(com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<?, ?> zRu) {
        if (zRu == null) {
            return;
        }
        this.MR.add(zRu);
    }

    public void ZRu(RectF rectF, Matrix matrix, boolean z10) {
        this.oK.set(0.0f, 0.0f, 0.0f, 0.0f);
        oK();
        this.ZRu.set(matrix);
        if (z10) {
            List<ZRu> list = this.le;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.ZRu.preConcat(this.le.get(size).uR.uR());
                }
            } else {
                ZRu zRu = this.ru;
                if (zRu != null) {
                    this.ZRu.preConcat(zRu.uR.uR());
                }
            }
        }
        this.ZRu.preConcat(this.uR.uR());
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.ZRu.TFq
    public void ZRu(Canvas canvas, Matrix matrix, int i10) {
        Paint paint;
        Integer numMm;
        com.bytedance.adsdk.NOt.TFq.ZRu(this.OCA);
        if (this.fcs && !this.mZ.xY()) {
            oK();
            com.bytedance.adsdk.NOt.TFq.ZRu("Layer#parentMatrix");
            this.th.set(matrix);
            this.FA.reset();
            this.FA.set(matrix);
            for (int size = this.le.size() - 1; size >= 0; size--) {
                this.FA.preConcat(this.le.get(size).uR.uR());
            }
            com.bytedance.adsdk.NOt.TFq.NOt("Layer#parentMatrix");
            com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<?, Integer> ZRu = this.uR.ZRu();
            int iIntValue = (int) ((((i10 / 255.0f) * ((ZRu == null || (numMm = ZRu.Mm()) == null) ? 100 : numMm.intValue())) / 100.0f) * 255.0f);
            if (!mZ() && !Mm()) {
                this.FA.preConcat(this.uR.uR());
                com.bytedance.adsdk.NOt.TFq.ZRu("Layer#drawLayer");
                NOt(canvas, this.FA, iIntValue);
                com.bytedance.adsdk.NOt.TFq.NOt("Layer#drawLayer");
                mZ(com.bytedance.adsdk.NOt.TFq.NOt(this.OCA));
                return;
            }
            com.bytedance.adsdk.NOt.TFq.ZRu("Layer#computeBounds");
            ZRu(this.oK, this.FA, false);
            NOt(this.oK, matrix);
            this.FA.preConcat(this.uR.uR());
            ZRu(this.oK, this.FA);
            this.yBV.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.Vor);
            if (!this.Vor.isIdentity()) {
                Matrix matrix2 = this.Vor;
                matrix2.invert(matrix2);
                this.Vor.mapRect(this.yBV);
            }
            if (!this.oK.intersect(this.yBV)) {
                this.oK.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            com.bytedance.adsdk.NOt.TFq.NOt("Layer#computeBounds");
            if (this.oK.width() >= 1.0f && this.oK.height() >= 1.0f) {
                com.bytedance.adsdk.NOt.TFq.ZRu("Layer#saveLayer");
                this.aT.setAlpha(255);
                com.bytedance.adsdk.NOt.Ht.Ht.ZRu(canvas, this.oK, this.aT);
                com.bytedance.adsdk.NOt.TFq.NOt("Layer#saveLayer");
                ZRu(canvas);
                com.bytedance.adsdk.NOt.TFq.ZRu("Layer#drawLayer");
                NOt(canvas, this.FA, iIntValue);
                com.bytedance.adsdk.NOt.TFq.NOt("Layer#drawLayer");
                if (Mm()) {
                    ZRu(canvas, this.FA);
                }
                if (mZ()) {
                    com.bytedance.adsdk.NOt.TFq.ZRu("Layer#drawMatte");
                    com.bytedance.adsdk.NOt.TFq.ZRu("Layer#saveLayer");
                    com.bytedance.adsdk.NOt.Ht.Ht.ZRu(canvas, this.oK, this.sAl, 19);
                    com.bytedance.adsdk.NOt.TFq.NOt("Layer#saveLayer");
                    ZRu(canvas);
                    this.Zf.ZRu(canvas, matrix, iIntValue);
                    com.bytedance.adsdk.NOt.TFq.ZRu("Layer#restoreLayer");
                    canvas.restore();
                    com.bytedance.adsdk.NOt.TFq.NOt("Layer#restoreLayer");
                    com.bytedance.adsdk.NOt.TFq.NOt("Layer#drawMatte");
                }
                com.bytedance.adsdk.NOt.TFq.ZRu("Layer#restoreLayer");
                canvas.restore();
                com.bytedance.adsdk.NOt.TFq.NOt("Layer#restoreLayer");
            }
            if (this.f140634Nb && (paint = this.VdW) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.VdW.setColor(-251901);
                this.VdW.setStrokeWidth(4.0f);
                canvas.drawRect(this.oK, this.VdW);
                this.VdW.setStyle(Paint.Style.FILL);
                this.VdW.setColor(1357638635);
                canvas.drawRect(this.oK, this.VdW);
            }
            mZ(com.bytedance.adsdk.NOt.TFq.NOt(this.OCA));
            return;
        }
        com.bytedance.adsdk.NOt.TFq.NOt(this.OCA);
    }

    private void ZRu(Canvas canvas) {
        com.bytedance.adsdk.NOt.TFq.ZRu("Layer#clearLayer");
        RectF rectF = this.oK;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.edo);
        com.bytedance.adsdk.NOt.TFq.NOt("Layer#clearLayer");
    }

    private void ZRu(RectF rectF, Matrix matrix) {
        this.WMI.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (Mm()) {
            int size = this.to.ZRu().size();
            for (int i10 = 0; i10 < size; i10++) {
                com.bytedance.adsdk.NOt.mZ.NOt.FA fa2 = this.to.ZRu().get(i10);
                Path pathMm = this.to.NOt().get(i10).Mm();
                if (pathMm != null) {
                    this.Mm.set(pathMm);
                    this.Mm.transform(matrix);
                    int i11 = AnonymousClass2.NOt[fa2.ZRu().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        return;
                    }
                    if ((i11 == 3 || i11 == 4) && fa2.uR()) {
                        return;
                    }
                    this.Mm.computeBounds(this.om, false);
                    if (i10 == 0) {
                        this.WMI.set(this.om);
                    } else {
                        RectF rectF2 = this.WMI;
                        rectF2.set(Math.min(rectF2.left, this.om.left), Math.min(this.WMI.top, this.om.top), Math.max(this.WMI.right, this.om.right), Math.max(this.WMI.bottom, this.om.bottom));
                    }
                }
            }
            if (rectF.intersect(this.WMI)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public void ZRu(int i10) {
        this.WD = (i10 / 255.0f) * ((this.uR.ZRu() != null ? this.uR.ZRu().Mm().intValue() : 100) / 100.0f);
    }

    private void ZRu(Canvas canvas, Matrix matrix) {
        com.bytedance.adsdk.NOt.TFq.ZRu("Layer#saveLayer");
        com.bytedance.adsdk.NOt.Ht.Ht.ZRu(canvas, this.oK, this.ZH, 19);
        if (Build.VERSION.SDK_INT < 28) {
            ZRu(canvas);
        }
        com.bytedance.adsdk.NOt.TFq.NOt("Layer#saveLayer");
        for (int i10 = 0; i10 < this.to.ZRu().size(); i10++) {
            com.bytedance.adsdk.NOt.mZ.NOt.FA fa2 = this.to.ZRu().get(i10);
            com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<edo, Path> zRu = this.to.NOt().get(i10);
            com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<Integer, Integer> zRu2 = this.to.mZ().get(i10);
            int i11 = AnonymousClass2.NOt[fa2.ZRu().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.aT.setColor(-16777216);
                        this.aT.setAlpha(255);
                        canvas.drawRect(this.oK, this.aT);
                    }
                    if (fa2.uR()) {
                        mZ(canvas, matrix, zRu, zRu2);
                    } else {
                        ZRu(canvas, matrix, zRu);
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (fa2.uR()) {
                            NOt(canvas, matrix, zRu, zRu2);
                        } else {
                            ZRu(canvas, matrix, zRu, zRu2);
                        }
                    }
                } else if (fa2.uR()) {
                    TFq(canvas, matrix, zRu, zRu2);
                } else {
                    uR(canvas, matrix, zRu, zRu2);
                }
            } else if (edo()) {
                this.aT.setAlpha(255);
                canvas.drawRect(this.oK, this.aT);
            }
        }
        com.bytedance.adsdk.NOt.TFq.ZRu("Layer#restoreLayer");
        canvas.restore();
        com.bytedance.adsdk.NOt.TFq.NOt("Layer#restoreLayer");
    }

    private void ZRu(Canvas canvas, Matrix matrix, com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<edo, Path> zRu, com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<Integer, Integer> zRu2) {
        this.Mm.set(zRu.Mm());
        this.Mm.transform(matrix);
        this.aT.setAlpha((int) (zRu2.Mm().intValue() * 2.55f));
        canvas.drawPath(this.Mm, this.aT);
    }

    private void ZRu(Canvas canvas, Matrix matrix, com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<edo, Path> zRu) {
        this.Mm.set(zRu.Mm());
        this.Mm.transform(matrix);
        canvas.drawPath(this.Mm, this.lp);
    }

    public void ZRu(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        this.uR.ZRu(f10);
        if (this.to != null) {
            for (int i10 = 0; i10 < this.to.NOt().size(); i10++) {
                this.to.NOt().get(i10).ZRu(f10);
            }
        }
        com.bytedance.adsdk.NOt.ZRu.NOt.uR uRVar = this.xY;
        if (uRVar != null) {
            uRVar.ZRu(f10);
        }
        ZRu zRu = this.Zf;
        if (zRu != null) {
            zRu.ZRu(f10);
        }
        for (int i11 = 0; i11 < this.MR.size(); i11++) {
            this.MR.get(i11).ZRu(f10);
        }
    }
}
