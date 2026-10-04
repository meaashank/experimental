package q1;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.D;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
@T(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class n extends h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static Paint f226736g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TextPaint f226737f;

    public n(@NonNull m mVar) {
        super(mVar);
    }

    @NonNull
    public static Paint h() {
        if (f226736g == null) {
            TextPaint textPaint = new TextPaint();
            f226736g = textPaint;
            textPaint.setColor(androidx.emoji2.text.c.c().g());
            f226736g.setStyle(Paint.Style.FILL);
        }
        return f226736g;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, @D(from = 0) int i10, @D(from = 0) int i11, float f10, int i12, int i13, int i14, @NonNull Paint paint) {
        TextPaint textPaintF = f(charSequence, i10, i11, paint);
        if (textPaintF != null && textPaintF.bgColor != 0) {
            g(canvas, textPaintF, f10, f10 + this.f226708c, i12, i14);
        }
        Paint paint2 = textPaintF;
        if (androidx.emoji2.text.c.c().r()) {
            canvas.drawRect(f10, i12, f10 + this.f226708c, i14, h());
        }
        m mVar = this.f226707b;
        float f11 = i13;
        if (paint2 == null) {
            paint2 = paint;
        }
        mVar.a(canvas, f10, f11, paint2);
    }

    @Nullable
    public final TextPaint f(@Nullable CharSequence charSequence, int i10, int i11, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f226737f;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f226737f = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    characterStyle.updateDrawState(textPaint);
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    public void g(Canvas canvas, TextPaint textPaint, float f10, float f11, float f12, float f13) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f10, f12, f11, f13, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }
}
