package com.prism.lib.media.ui.widget.dock;

import Ga.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.prism.commons.utils.l0;
import com.prism.commons.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public class FloatingRoundDockLayout extends RelativeLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f178711f = l0.b("FloatingRoundDockLayout");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Path f178712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RectF f178713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f178714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f178715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GestureDetector f178716e;

    public static class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }

        public a(b bVar) {
        }
    }

    public FloatingRoundDockLayout(Context context) {
        super(context);
        this.f178713b = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f178716e = new GestureDetector(getContext(), new a());
        setWillNotDraw(false);
    }

    public final Path a(int i10) {
        Path path = new Path();
        float f10 = i10;
        path.addRoundRect(this.f178713b, f10, f10, Path.Direction.CW);
        return path;
    }

    public final void b(Context context, AttributeSet attributeSet, int i10) {
        setWillNotDraw(false);
    }

    public void c() {
        PointF pointFA = Ga.a.a(getContext());
        Log.d(f178711f, "restore to X:" + pointFA.x + " Y:" + pointFA.y + " viewWidth:" + getWidth());
        setX(pointFA.x);
        setY(pointFA.y);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.f178712a == null) {
            this.f178712a = a(canvas.getWidth() / 2);
        }
        canvas.clipPath(this.f178712a);
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f178713b = new RectF(0.0f, 0.0f, i10, i11);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f178716e.onTouchEvent(motionEvent)) {
            Log.d(f178711f, "onTouch single tap");
            performClick();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f178714c = getX() - motionEvent.getRawX();
            this.f178715d = getY() - motionEvent.getRawY();
        } else if (action == 1) {
            float f10 = -(getWidth() / 2.0f);
            float rawY = motionEvent.getRawY() + this.f178715d;
            int iE = r.e(getContext());
            float width = ((getWidth() / 2.0f) + motionEvent.getRawX() + this.f178714c) * 2.0f;
            float f11 = iE;
            if (width > f11) {
                f10 += f11;
            }
            animate().x(f10).y(rawY).setDuration(200L).start();
            Ga.a.b(getContext(), f10, rawY);
            setPressed(false);
        } else if (action == 2) {
            animate().x(motionEvent.getRawX() + this.f178714c).y(motionEvent.getRawY() + this.f178715d).setDuration(0L).start();
        } else if (action == 3) {
            setPressed(false);
        }
        return true;
    }

    public FloatingRoundDockLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f178713b = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f178716e = new GestureDetector(getContext(), new a());
        setWillNotDraw(false);
    }

    public FloatingRoundDockLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f178713b = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f178716e = new GestureDetector(getContext(), new a());
        setWillNotDraw(false);
    }
}
