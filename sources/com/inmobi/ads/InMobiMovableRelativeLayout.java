package com.inmobi.ads;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.media.S4;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class InMobiMovableRelativeLayout extends RelativeLayout {

    @NotNull
    public static final S4 Companion = new S4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f151693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup.LayoutParams f151694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f151695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f151696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f151697e;

    public InMobiMovableRelativeLayout(@Nullable Context context) {
        super(context);
        this.f151693a = new WeakReference(null);
        this.f151695c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }

    private final void setParentView(ViewGroup viewGroup) {
        this.f151693a = new WeakReference(viewGroup);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        G.n(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        setParentView((ViewGroup) parent);
        if (this.f151694b == null) {
            this.f151694b = getLayoutParams();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setParentView(null);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        ViewGroup viewGroup;
        G.p(ev, "ev");
        if (this.f151695c) {
            float rawX = ev.getRawX();
            float rawY = ev.getRawY();
            int action = ev.getAction();
            if (action == 0) {
                this.f151696d = rawX;
                this.f151697e = rawY;
            } else if (action == 2 && (viewGroup = (ViewGroup) this.f151693a.get()) != null) {
                float f10 = rawX - this.f151696d;
                int top = (int) (getTop() + (rawY - this.f151697e));
                int paddingLeft = viewGroup.getPaddingLeft();
                int paddingTop = viewGroup.getPaddingTop();
                int width = viewGroup.getWidth() - viewGroup.getPaddingRight();
                int height = viewGroup.getHeight() - viewGroup.getPaddingBottom();
                int iMax = Math.max(paddingLeft, Math.min((int) (getLeft() + f10), width - getWidth()));
                int iMax2 = Math.max(paddingTop, Math.min(top, height - getHeight()));
                layout(iMax, iMax2, getWidth() + iMax, getHeight() + iMax2);
                this.f151696d = rawX;
                this.f151697e = rawY;
            }
        }
        return super.onInterceptTouchEvent(ev);
    }

    public final void resetPosition() {
        setLayoutParams(this.f151694b);
    }

    public final void setIsMovable(boolean z10) {
        this.f151695c = z10;
    }

    public InMobiMovableRelativeLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f151693a = new WeakReference(null);
        this.f151695c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }

    public InMobiMovableRelativeLayout(@Nullable Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f151693a = new WeakReference(null);
        this.f151695c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }
}
