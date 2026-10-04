package com.github.ahmadaghazadeh.editor.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.github.ahmadaghazadeh.editor.document.commons.LinesCollection;
import com.github.ahmadaghazadeh.editor.processor.TextProcessor;
import o5.InterfaceC5327a;
import s5.C5574a;

/* JADX INFO: loaded from: classes3.dex */
public class GutterView extends View implements InterfaceC5327a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f150639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextProcessor f150640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5574a f150641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C5574a f150642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f150643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinesCollection f150644f;

    public GutterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150640b = null;
        if (isInEditMode()) {
            return;
        }
        c();
    }

    public final int a(int i10) {
        for (int i11 = this.f150643e; i11 <= this.f150639a; i11++) {
            int lineBounds = (this.f150640b.getLineBounds(i11, null) - this.f150640b.getScrollY()) + 4;
            int lineHeight = this.f150640b.getLineHeight();
            if (i10 < lineBounds && i10 > lineBounds - lineHeight) {
                return this.f150644f.k(this.f150640b.getLayout().getLineStart(i11));
            }
        }
        return -1;
    }

    public void b() {
        TextProcessor textProcessor = this.f150640b;
        if (textProcessor != null) {
            this.f150643e = Math.abs((textProcessor.getScrollY() - this.f150640b.getLayout().getTopPadding()) / this.f150640b.getLineHeight());
            int height = (this.f150640b.getHeight() + this.f150640b.getScrollY()) / this.f150640b.getLineHeight();
            this.f150639a = height;
            if (this.f150643e < 0) {
                this.f150643e = 0;
            }
            if (height > this.f150640b.getLineCount() - 1) {
                this.f150639a = this.f150640b.getLineCount() - 1;
            }
        }
    }

    public void c() {
        C5574a c5574a = new C5574a(true, false);
        this.f150642d = c5574a;
        c5574a.setTextSize(getResources().getDisplayMetrics().density * 11.0f);
        this.f150642d.setColor(Color.rgb(113, 128, 120));
        C5574a c5574a2 = new C5574a(false, false);
        this.f150641c = c5574a2;
        c5574a2.setColor(Color.rgb(113, 128, 120));
        this.f150641c.setStyle(Paint.Style.STROKE);
    }

    public void d(TextProcessor textProcessor, LinesCollection linesCollection) {
        if (textProcessor != null) {
            this.f150640b = textProcessor;
            textProcessor.m(this);
            this.f150644f = linesCollection;
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(getWidth() - 2, 0.0f, getWidth() - 1, getHeight(), this.f150641c);
        if (this.f150640b == null) {
            super.onDraw(canvas);
            return;
        }
        b();
        if (this.f150644f != null) {
            int i10 = this.f150643e;
            int i11 = i10 > 0 ? i10 - 1 : 0;
            while (i11 <= this.f150639a) {
                int iK = this.f150644f.k(this.f150640b.getLayout().getLineStart(i11));
                int iK2 = i11 != 0 ? this.f150644f.k(this.f150640b.getLayout().getLineStart(i11 - 1)) : -1;
                int lineBounds = this.f150640b.getLineBounds(i11, null) - this.f150640b.getScrollY();
                if (iK2 != iK) {
                    canvas.drawText(Integer.toString(iK + 1), 5.0f, lineBounds, this.f150642d);
                }
                i11++;
            }
        }
        this.f150640b.m0();
    }

    @Override // android.view.View, o5.InterfaceC5327a
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        invalidate();
    }

    public GutterView(Context context) {
        super(context);
        this.f150640b = null;
        if (isInEditMode()) {
            return;
        }
        c();
    }
}
