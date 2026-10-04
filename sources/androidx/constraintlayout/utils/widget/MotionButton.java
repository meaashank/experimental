package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.g;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
public class MotionButton extends AppCompatButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f107502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f107503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Path f107504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewOutlineProvider f107505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RectF f107506e;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), (MotionButton.this.f107502a * Math.min(r3, r4)) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.f107503b);
        }
    }

    public MotionButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f107502a = 0.0f;
        this.f107503b = Float.NaN;
        f(context, attrs);
    }

    private void f(Context context, AttributeSet attrs) {
        setPadding(0, 0, 0, 0);
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.ve);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.m.Ge) {
                    g(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == g.m.He) {
                    h(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public float d() {
        return this.f107503b;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float e() {
        return this.f107502a;
    }

    @T(21)
    public void g(float round) {
        if (Float.isNaN(round)) {
            this.f107503b = round;
            float f10 = this.f107502a;
            this.f107502a = -1.0f;
            h(f10);
            return;
        }
        boolean z10 = this.f107503b != round;
        this.f107503b = round;
        if (round != 0.0f) {
            if (this.f107504c == null) {
                this.f107504c = new Path();
            }
            if (this.f107506e == null) {
                this.f107506e = new RectF();
            }
            if (this.f107505d == null) {
                b bVar = new b();
                this.f107505d = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f107506e.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f107504c.reset();
            Path path = this.f107504c;
            RectF rectF = this.f107506e;
            float f11 = this.f107503b;
            path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    @T(21)
    public void h(float round) {
        boolean z10 = this.f107502a != round;
        this.f107502a = round;
        if (round != 0.0f) {
            if (this.f107504c == null) {
                this.f107504c = new Path();
            }
            if (this.f107506e == null) {
                this.f107506e = new RectF();
            }
            if (this.f107505d == null) {
                a aVar = new a();
                this.f107505d = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f107502a) / 2.0f;
            this.f107506e.set(0.0f, 0.0f, width, height);
            this.f107504c.reset();
            this.f107504c.addRoundRect(this.f107506e, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context) {
        super(context, null);
        this.f107502a = 0.0f;
        this.f107503b = Float.NaN;
        setPadding(0, 0, 0, 0);
    }

    public MotionButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f107502a = 0.0f;
        this.f107503b = Float.NaN;
        f(context, attrs);
    }
}
