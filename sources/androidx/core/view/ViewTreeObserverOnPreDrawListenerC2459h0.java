package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.core.view.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnPreDrawListenerC2459h0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f111910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f111911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f111912c;

    public ViewTreeObserverOnPreDrawListenerC2459h0(View view, Runnable runnable) {
        this.f111910a = view;
        this.f111911b = view.getViewTreeObserver();
        this.f111912c = runnable;
    }

    @NonNull
    public static ViewTreeObserverOnPreDrawListenerC2459h0 a(@NonNull View view, @NonNull Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC2459h0 viewTreeObserverOnPreDrawListenerC2459h0 = new ViewTreeObserverOnPreDrawListenerC2459h0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2459h0);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC2459h0);
        return viewTreeObserverOnPreDrawListenerC2459h0;
    }

    public void b() {
        if (this.f111911b.isAlive()) {
            this.f111911b.removeOnPreDrawListener(this);
        } else {
            this.f111910a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f111910a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f111912c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NonNull View view) {
        this.f111911b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NonNull View view) {
        b();
    }
}
