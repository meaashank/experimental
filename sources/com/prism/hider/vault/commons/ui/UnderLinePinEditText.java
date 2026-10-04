package com.prism.hider.vault.commons.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import com.prism.hider.vault.commons.ui.e;

/* JADX INFO: loaded from: classes6.dex */
public class UnderLinePinEditText extends FixedLengthPinEditText {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f173637j = "UnderLinePinEditText";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f173638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f173639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f173640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f173641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f173642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Paint f173643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Paint f173644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Paint.FontMetrics f173645i;

    public UnderLinePinEditText(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int iB = b();
        int size = View.MeasureSpec.getSize(getMeasuredHeight());
        int size2 = View.MeasureSpec.getSize(getMeasuredWidth());
        float f10 = size;
        float f11 = f10 - (this.f173640d / 2.0f);
        int i10 = 0;
        while (i10 < iB) {
            float f12 = this.f173638b;
            float f13 = this.f173641e;
            int i11 = i10 + 1;
            canvas.drawLine((i10 * f12) + f13, f11, (i11 * f12) - f13, f11, this.f173643g);
            i10 = i11;
        }
        float f14 = this.f173638b / 2.0f;
        Editable text = getText();
        if (text != null) {
            float f15 = ((f10 - this.f173639c) - (this.f173640d / 2.0f)) - this.f173645i.descent;
            for (int i12 = 0; i12 < iB && i12 < text.length(); i12++) {
                canvas.drawText(Character.toString(text.charAt(i12)), ((size2 / iB) * i12) + f14, f15, this.f173644h);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        Paint.FontMetrics fontMetrics = this.f173645i;
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec((int) (b() * this.f173638b), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (((this.f173640d + this.f173639c) * 2.0f) + (fontMetrics.descent - fontMetrics.ascent)), 1073741824));
    }

    public UnderLinePinEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UnderLinePinEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f173642f = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.o.Ez, i10, 0);
        this.f173638b = typedArrayObtainStyledAttributes.getDimension(e.o.Fz, 0.0f);
        this.f173639c = typedArrayObtainStyledAttributes.getDimension(e.o.Gz, 0.0f);
        this.f173640d = typedArrayObtainStyledAttributes.getDimension(e.o.Iz, 0.0f);
        this.f173641e = typedArrayObtainStyledAttributes.getDimension(e.o.Hz, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        setPadding(0, 0, 0, 0);
        int currentTextColor = getCurrentTextColor();
        Paint paint = new Paint();
        this.f173643g = paint;
        paint.setAntiAlias(true);
        this.f173643g.setStyle(Paint.Style.STROKE);
        this.f173643g.setColor(currentTextColor);
        this.f173643g.setStrokeWidth(this.f173640d);
        Paint paint2 = new Paint();
        this.f173644h = paint2;
        paint2.setAntiAlias(true);
        this.f173644h.setStyle(Paint.Style.FILL);
        this.f173644h.setColor(currentTextColor);
        this.f173644h.setTextAlign(Paint.Align.CENTER);
        this.f173644h.setTextSize(getTextSize());
        this.f173645i = this.f173644h.getFontMetrics();
    }
}
