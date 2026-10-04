package androidx.compose.material;

import android.view.View;
import android.view.ViewTreeObserver;
import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.material.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1863j0 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f98629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<kotlin.L0> f98630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f98631c;

    public ViewOnAttachStateChangeListenerC1863j0(@NotNull View view, @NotNull InterfaceC4376a<kotlin.L0> interfaceC4376a) {
        this.f98629a = view;
        this.f98630b = interfaceC4376a;
        view.addOnAttachStateChangeListener(this);
        b();
    }

    public final void a() {
        c();
        this.f98629a.removeOnAttachStateChangeListener(this);
    }

    public final void b() {
        if (this.f98631c || !this.f98629a.isAttachedToWindow()) {
            return;
        }
        this.f98629a.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f98631c = true;
    }

    public final void c() {
        if (this.f98631c) {
            this.f98629a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f98631c = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f98630b.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View view) {
        b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View view) {
        c();
    }
}
