package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.g;

/* JADX INFO: loaded from: classes2.dex */
public class Placeholder extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f107784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f107785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107786c;

    public Placeholder(Context context) {
        super(context);
        this.f107784a = -1;
        this.f107785b = null;
        this.f107786c = 4;
        c(null);
    }

    public View a() {
        return this.f107785b;
    }

    public int b() {
        return this.f107786c;
    }

    public final void c(AttributeSet attrs) {
        super.setVisibility(this.f107786c);
        this.f107784a = -1;
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.f110029P8);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.m.f110044Q8) {
                    this.f107784a = typedArrayObtainStyledAttributes.getResourceId(index, this.f107784a);
                } else if (index == g.m.f110059R8) {
                    this.f107786c = typedArrayObtainStyledAttributes.getInt(index, this.f107786c);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void d(int id2) {
        View viewFindViewById;
        if (this.f107784a == id2) {
            return;
        }
        View view = this.f107785b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.f107785b.getLayoutParams()).f107668j0 = false;
            this.f107785b = null;
        }
        this.f107784a = id2;
        if (id2 == -1 || (viewFindViewById = ((View) getParent()).findViewById(id2)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void e(int visibility) {
        this.f107786c = visibility;
    }

    public void f(ConstraintLayout container) {
        if (this.f107785b == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f107785b.getLayoutParams();
        layoutParams2.f107692v0.b2(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourH = layoutParams.f107692v0.H();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviourH != dimensionBehaviour) {
            layoutParams.f107692v0.c2(layoutParams2.f107692v0.m0());
        }
        if (layoutParams.f107692v0.j0() != dimensionBehaviour) {
            layoutParams.f107692v0.y1(layoutParams2.f107692v0.D());
        }
        layoutParams2.f107692v0.b2(8);
    }

    public void g(ConstraintLayout container) {
        if (this.f107784a == -1 && !isInEditMode()) {
            setVisibility(this.f107786c);
        }
        View viewFindViewById = container.findViewById(this.f107784a);
        this.f107785b = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.LayoutParams) viewFindViewById.getLayoutParams()).f107668j0 = true;
            this.f107785b.setVisibility(0);
            setVisibility(0);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    public Placeholder(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f107784a = -1;
        this.f107785b = null;
        this.f107786c = 4;
        c(attrs);
    }

    public Placeholder(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f107784a = -1;
        this.f107785b = null;
        this.f107786c = 4;
        c(attrs);
    }

    public Placeholder(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        this.f107784a = -1;
        this.f107785b = null;
        this.f107786c = 4;
        c(attrs);
    }
}
