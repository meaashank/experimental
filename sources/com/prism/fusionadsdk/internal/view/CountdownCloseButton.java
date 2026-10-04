package com.prism.fusionadsdk.internal.view;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class CountdownCloseButton extends View {
    private static final int BACKGROUND_COLOR = -1894770397;
    private static final int PROGRESS_COLOR = -1;
    private static final float START_ANGLE = -90.0f;
    private static final int TRACK_COLOR = 872415231;
    private final RectF arcBounds;
    private final Paint backgroundPaint;
    private float countdownProgress;
    private final Paint progressPaint;
    private boolean ready;
    private final Paint textPaint;
    private final Paint trackPaint;

    public CountdownCloseButton(Context context) {
        super(context);
        this.backgroundPaint = new Paint(1);
        this.trackPaint = new Paint(1);
        this.progressPaint = new Paint(1);
        this.textPaint = new Paint(1);
        this.arcBounds = new RectF();
        this.countdownProgress = 1.0f;
        init();
    }

    private void init() {
        setLayerType(1, null);
        Paint paint = this.backgroundPaint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.backgroundPaint.setColor(BACKGROUND_COLOR);
        Paint paint2 = this.trackPaint;
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        Paint paint3 = this.trackPaint;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        this.trackPaint.setColor(TRACK_COLOR);
        this.progressPaint.setStyle(style2);
        this.progressPaint.setStrokeCap(cap);
        this.progressPaint.setColor(-1);
        this.textPaint.setStyle(style);
        this.textPaint.setColor(-1);
        this.textPaint.setTextAlign(Paint.Align.CENTER);
        this.textPaint.setFakeBoldText(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0078  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDraw(android.graphics.Canvas r12) {
        /*
            r11 = this;
            super.onDraw(r12)
            int r0 = r11.getWidth()
            float r0 = (float) r0
            int r1 = r11.getHeight()
            float r1 = (float) r1
            float r2 = java.lang.Math.min(r0, r1)
            r3 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r3
            float r1 = r1 / r3
            r4 = 1032805417(0x3d8f5c29, float:0.07)
            float r4 = r4 * r2
            r5 = 1077936128(0x40400000, float:3.0)
            float r4 = java.lang.Math.max(r5, r4)
            float r5 = r2 / r3
            float r6 = r4 / r3
            float r5 = r5 - r6
            android.graphics.Paint r6 = r11.trackPaint
            r6.setStrokeWidth(r4)
            android.graphics.Paint r6 = r11.progressPaint
            r6.setStrokeWidth(r4)
            android.graphics.Paint r4 = r11.textPaint
            r6 = 1056293519(0x3ef5c28f, float:0.48)
            float r2 = r2 * r6
            r4.setTextSize(r2)
            android.graphics.Paint r2 = r11.textPaint
            boolean r4 = r11.ready
            if (r4 == 0) goto L40
            r4 = 255(0xff, float:3.57E-43)
            goto L42
        L40:
            r4 = 210(0xd2, float:2.94E-43)
        L42:
            r2.setAlpha(r4)
            android.graphics.Paint r2 = r11.backgroundPaint
            r12.drawCircle(r0, r1, r5, r2)
            android.graphics.RectF r2 = r11.arcBounds
            float r4 = r0 - r5
            float r6 = r1 - r5
            float r7 = r0 + r5
            float r5 = r5 + r1
            r2.set(r4, r6, r7, r5)
            android.graphics.RectF r2 = r11.arcBounds
            android.graphics.Paint r4 = r11.trackPaint
            r12.drawOval(r2, r4)
            boolean r2 = r11.ready
            if (r2 != 0) goto L78
            float r2 = r11.countdownProgress
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L78
            android.graphics.RectF r6 = r11.arcBounds
            r4 = 1135869952(0x43b40000, float:360.0)
            float r8 = r2 * r4
            r9 = 0
            android.graphics.Paint r10 = r11.progressPaint
            r7 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r5 = r12
            r5.drawArc(r6, r7, r8, r9, r10)
            goto L79
        L78:
            r5 = r12
        L79:
            android.graphics.Paint r12 = r11.textPaint
            android.graphics.Paint$FontMetrics r12 = r12.getFontMetrics()
            float r2 = r12.ascent
            float r12 = r12.descent
            float r2 = r2 + r12
            float r2 = r2 / r3
            float r1 = r1 - r2
            java.lang.String r12 = "×"
            android.graphics.Paint r2 = r11.textPaint
            r5.drawText(r12, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.fusionadsdk.internal.view.CountdownCloseButton.onDraw(android.graphics.Canvas):void");
    }

    public void setCountdownProgress(float f10) {
        this.countdownProgress = Math.max(0.0f, Math.min(1.0f, f10));
        invalidate();
    }

    public void setReady(boolean z10) {
        this.ready = z10;
        invalidate();
    }

    public CountdownCloseButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.backgroundPaint = new Paint(1);
        this.trackPaint = new Paint(1);
        this.progressPaint = new Paint(1);
        this.textPaint = new Paint(1);
        this.arcBounds = new RectF();
        this.countdownProgress = 1.0f;
        init();
    }

    public CountdownCloseButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.backgroundPaint = new Paint(1);
        this.trackPaint = new Paint(1);
        this.progressPaint = new Paint(1);
        this.textPaint = new Paint(1);
        this.arcBounds = new RectF();
        this.countdownProgress = 1.0f;
        init();
    }
}
