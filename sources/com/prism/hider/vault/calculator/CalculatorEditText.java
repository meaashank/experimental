package com.prism.hider.vault.calculator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import rb.C5548b;

/* JADX INFO: loaded from: classes6.dex */
public class CalculatorEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ActionMode.Callback f168457h = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f168458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f168459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f168460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f168461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f168462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f168463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f168464g;

    public class a implements ActionMode.Callback {
        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    public interface b {
        void m0(TextView textView, float f10);
    }

    public CalculatorEditText(Context context) {
        this(context, null);
    }

    public float b(String str) {
        if (this.f168463f < 0 || this.f168458a <= this.f168459b) {
            return getTextSize();
        }
        this.f168461d.set(getPaint());
        float f10 = this.f168459b;
        while (true) {
            float f11 = this.f168458a;
            if (f10 >= f11) {
                break;
            }
            float fMin = Math.min(this.f168460c + f10, f11);
            this.f168461d.setTextSize(fMin);
            if (this.f168461d.measureText(str) > this.f168463f) {
                break;
            }
            f10 = fMin;
        }
        return f10;
    }

    public void c(b bVar) {
        this.f168464g = bVar;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() - Math.min(getPaddingBottom(), getPaint().getFontMetricsInt().descent);
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        getPaint().getTextBounds("H", 0, 1, this.f168462e);
        return super.getCompoundPaddingTop() - Math.min(getPaddingTop(), -(this.f168462e.height() + getPaint().getFontMetricsInt().ascent));
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f168463f = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        setTextSize(0, b(getText().toString()));
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        return null;
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        int length = charSequence.length();
        if (getSelectionStart() != length || getSelectionEnd() != length) {
            setSelection(length);
        }
        setTextSize(0, b(charSequence.toString()));
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            cancelLongPress();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        float textSize = getTextSize();
        super.setTextSize(i10, f10);
        if (this.f168464g == null || getTextSize() == textSize) {
            return;
        }
        this.f168464g.m0(this, textSize);
    }

    public CalculatorEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CalculatorEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f168461d = new TextPaint();
        this.f168462e = new Rect();
        this.f168463f = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5548b.o.f237087V5, i10, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(C5548b.o.f237101W5, getTextSize());
        this.f168458a = dimension;
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(C5548b.o.f237115X5, getTextSize());
        this.f168459b = dimension2;
        this.f168460c = typedArrayObtainStyledAttributes.getDimension(C5548b.o.f237129Y5, (dimension - dimension2) / 3.0f);
        typedArrayObtainStyledAttributes.recycle();
        setCustomSelectionActionModeCallback(f168457h);
        if (isFocusable()) {
            setMovementMethod(ScrollingMovementMethod.getInstance());
        }
        setTextSize(0, dimension);
        setMinHeight(getCompoundPaddingTop() + getCompoundPaddingBottom() + getLineHeight());
    }
}
