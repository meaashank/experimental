package com.mbridge.msdk.dycreator.baseview.cusview;

import G0.F;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.engine.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.prism.gaia.download.a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class MBCusRoundImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f155449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f155450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f155451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f155452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Xfermode f155453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f155454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f155455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f155456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f155457i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f155458j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f155459k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f155460l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f155461m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f155462n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float[] f155463o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float[] f155464p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private RectF f155465q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private RectF f155466r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f155467s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f155468t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Path f155469u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Paint f155470v;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f155471a;

        static {
            int[] iArr = new int[c.values().length];
            f155471a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f155471a[c.src.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f155471a[c.background.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f155471a[c.contentDescription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f155471a[c.tag.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f155471a[c.visibility.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f155471a[c.scaleType.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f155471a[c.padding.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f155471a[c.paddingTop.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f155471a[c.paddingBottom.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f155471a[c.paddingLeft.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f155471a[c.paddingRight.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f155471a[c.layout_width.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f155471a[c.layout_height.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f155471a[c.gravity.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f155471a[c.layout_gravity.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public MBCusRoundImageView(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        a(canvas, this.f155461m, this.f155462n, this.f155466r, this.f155463o);
    }

    private void b() {
        int i10;
        int i11;
        int i12;
        try {
            if (this.f155463o == null || this.f155464p == null) {
                return;
            }
            int i13 = 0;
            while (true) {
                i10 = 2;
                if (i13 >= 2) {
                    break;
                }
                float[] fArr = this.f155463o;
                float f10 = this.f155457i;
                fArr[i13] = f10;
                this.f155464p[i13] = f10 - (this.f155461m / 2.0f);
                i13++;
            }
            while (true) {
                i11 = 4;
                if (i10 >= 4) {
                    break;
                }
                float[] fArr2 = this.f155463o;
                float f11 = this.f155458j;
                fArr2[i10] = f11;
                this.f155464p[i10] = f11 - (this.f155461m / 2.0f);
                i10++;
            }
            while (true) {
                if (i11 >= 6) {
                    break;
                }
                float[] fArr3 = this.f155463o;
                float f12 = this.f155459k;
                fArr3[i11] = f12;
                this.f155464p[i11] = f12 - (this.f155461m / 2.0f);
                i11++;
            }
            for (i12 = 6; i12 < 8; i12++) {
                float[] fArr4 = this.f155463o;
                float f13 = this.f155460l;
                fArr4[i12] = f13;
                this.f155464p[i12] = f13 - (this.f155461m / 2.0f);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void c() {
        RectF rectF = this.f155466r;
        if (rectF != null) {
            float f10 = this.f155461m / 2.0f;
            rectF.set(f10, f10, this.f155454f - f10, this.f155455g - f10);
        }
    }

    private void d() {
        RectF rectF = this.f155465q;
        if (rectF != null) {
            rectF.set(0.0f, 0.0f, this.f155454f, this.f155455g);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        HashMap<String, c> mapC = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = mapC.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.f155471a[cVar.ordinal()];
                if (i11 == 6) {
                    String attributeValue = attributeSet.getAttributeValue(i10);
                    if (!TextUtils.isEmpty(attributeValue)) {
                        if (attributeValue.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                } else if (i11 == 13) {
                    String attributeValue2 = attributeSet.getAttributeValue(i10);
                    if (attributeValue2.startsWith("f") || attributeValue2.startsWith(F.f40036b)) {
                        layoutParams.width = -1;
                    } else if (attributeValue2.startsWith("wrap")) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.width = b.a().a(attributeValue2);
                    }
                } else if (i11 == 14) {
                    String attributeValue3 = attributeSet.getAttributeValue(i10);
                    if (attributeValue3.startsWith("f") || attributeValue3.startsWith(F.f40036b)) {
                        layoutParams.height = -1;
                    } else if (attributeValue3.startsWith("wrap")) {
                        layoutParams.height = -2;
                    } else {
                        layoutParams.height = b.a().a(attributeValue3);
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f155465q, null, 31);
            int i10 = this.f155454f;
            int i11 = this.f155461m * 2;
            float f10 = (i10 - i11) * 1.0f;
            float f11 = i10;
            float f12 = this.f155455g;
            canvas.scale(f10 / f11, ((r5 - i11) * 1.0f) / f12, f11 / 2.0f, f12 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f155470v;
            if (paint != null) {
                paint.reset();
                this.f155470v.setAntiAlias(true);
                this.f155470v.setStyle(Paint.Style.FILL);
                this.f155470v.setXfermode(this.f155453e);
            }
            Path path = this.f155469u;
            if (path != null) {
                path.reset();
                this.f155469u.addRoundRect(this.f155465q, this.f155464p, Path.Direction.CCW);
            }
            canvas.drawPath(this.f155469u, this.f155470v);
            Paint paint2 = this.f155470v;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f155467s) {
                a(canvas);
            }
        } catch (Exception e10) {
            q0.a("MBridgeImageView", e10.getMessage());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        try {
            this.f155454f = i10;
            this.f155455g = i11;
            if (this.f155468t) {
                b();
            } else {
                a();
            }
            c();
            d();
        } catch (Exception e10) {
            q0.b("MBridgeImageView", e10.getMessage());
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArrSplit;
        HashMap<String, c> mapC = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = mapC.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                switch (AnonymousClass1.f155471a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (attributeValue.startsWith("@+id/")) {
                            setId(attributeValue.substring(5).hashCode());
                        }
                        break;
                    case 2:
                        b.a().a(attributeSet.getAttributeValue(i10), this);
                        break;
                    case 3:
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (attributeValue2.startsWith("#")) {
                            try {
                                strArrSplit = attributeValue2.split(a.f164606q);
                            } catch (Exception unused) {
                                strArrSplit = null;
                            }
                            if (strArrSplit != null && strArrSplit.length <= 2) {
                                setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                            } else if (strArrSplit == null || strArrSplit.length != 3) {
                                setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                            } else {
                                try {
                                    GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArrSplit[2]), new int[]{Color.parseColor(strArrSplit[0]), Color.parseColor(strArrSplit[1])});
                                    gradientDrawable.setGradientType(0);
                                    setBackground(gradientDrawable);
                                } catch (Exception unused2) {
                                    setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                                }
                            }
                        } else {
                            if (attributeValue2.startsWith("@drawable/")) {
                                attributeValue2 = attributeValue2.substring(10);
                            }
                            setBackgroundResource(getResources().getIdentifier(attributeValue2, AppIntroBaseFragmentKt.ARG_DRAWABLE, getContext().getPackageName()));
                        }
                        break;
                    case 4:
                        String attributeValue3 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue3)) {
                            CharSequence charSequence = (String) com.mbridge.msdk.dycreator.utils.b.f155837a.get(attributeValue3.substring(8));
                            if (!TextUtils.isEmpty(charSequence)) {
                                setContentDescription(charSequence);
                            }
                        }
                        break;
                    case 5:
                        String attributeValue4 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue4)) {
                            String str = com.mbridge.msdk.dycreator.utils.b.f155837a.get(attributeValue4.substring(8));
                            if (!TextUtils.isEmpty(str)) {
                                setTag(str);
                            }
                        }
                        break;
                    case 6:
                        String attributeValue5 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue5)) {
                            if (attributeValue5.equals("invisible")) {
                                setVisibility(4);
                            } else if (attributeValue5.equalsIgnoreCase("gone")) {
                                setVisibility(8);
                            }
                        }
                        break;
                    case 7:
                        String attributeValue6 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue6)) {
                            if (attributeValue6.equals("fitXY")) {
                                setScaleType(ImageView.ScaleType.FIT_XY);
                            } else if (attributeValue6.equals("centerInside")) {
                                setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            } else if (attributeValue6.equals("centerCrop")) {
                                setScaleType(ImageView.ScaleType.CENTER_CROP);
                            }
                        }
                        break;
                    case 8:
                        int iA = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f155452d = iA;
                        this.f155451c = iA;
                        this.f155450b = iA;
                        this.f155449a = iA;
                        setPadding(iA, iA, iA, iA);
                        break;
                    case 9:
                        int iA2 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f155450b = iA2;
                        setPadding(this.f155449a, iA2, this.f155451c, this.f155452d);
                        break;
                    case 10:
                        int iA3 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f155452d = iA3;
                        setPadding(this.f155449a, this.f155450b, this.f155451c, iA3);
                        break;
                    case 11:
                        int iA4 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f155449a = iA4;
                        setPadding(iA4, this.f155450b, this.f155451c, this.f155452d);
                        break;
                    case 12:
                        int iA5 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f155451c = iA5;
                        setPadding(this.f155449a, this.f155450b, iA5, this.f155452d);
                        break;
                }
            }
        }
    }

    public void setBorder(int i10, int i11, int i12) {
        this.f155467s = true;
        this.f155461m = i11;
        this.f155462n = i12;
        this.f155456h = i10;
    }

    public void setCornerRadius(int i10) {
        this.f155456h = i10;
    }

    public void setCustomBorder(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f155467s = true;
        this.f155468t = true;
        this.f155461m = i14;
        this.f155462n = i15;
        this.f155457i = i10;
        this.f155459k = i12;
        this.f155458j = i11;
        this.f155460l = i13;
    }

    public MBCusRoundImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        try {
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(context, attributeSet));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void a(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        try {
            a(i10, i11);
            Path path = this.f155469u;
            if (path != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
            if (canvas != null) {
                canvas.drawPath(this.f155469u, this.f155470v);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public MBCusRoundImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f155469u = new Path();
        this.f155470v = new Paint();
        this.f155463o = new float[8];
        this.f155464p = new float[8];
        this.f155466r = new RectF();
        this.f155465q = new RectF();
        this.f155453e = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    private void a(int i10, int i11) {
        Path path = this.f155469u;
        if (path != null) {
            path.reset();
        }
        Paint paint = this.f155470v;
        if (paint != null) {
            paint.setStrokeWidth(i10);
            this.f155470v.setColor(i11);
            this.f155470v.setStyle(Paint.Style.STROKE);
        }
    }

    private void a() {
        if (this.f155463o == null || this.f155464p == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                float[] fArr = this.f155463o;
                if (i10 >= fArr.length) {
                    return;
                }
                float f10 = this.f155456h;
                fArr[i10] = f10;
                this.f155464p[i10] = f10 - (this.f155461m / 2.0f);
                i10++;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
    }
}
