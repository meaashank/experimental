package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.RestrictTo;
import androidx.core.view.C2507z0;
import androidx.core.view.D0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class e0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f86338k = "TooltipCompatHandler";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f86339l = 2500;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f86340m = 15000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f86341n = 3000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static e0 f86342o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static e0 f86343p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f86344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f86345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f86346c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f86350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f0 f86351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f86352i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f86347d = new Runnable() { // from class: androidx.appcompat.widget.c0
        @Override // java.lang.Runnable
        public final void run() {
            this.f86294a.h(false);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Runnable f86348e = new Runnable() { // from class: androidx.appcompat.widget.d0
        @Override // java.lang.Runnable
        public final void run() {
            this.f86331a.d();
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f86353j = true;

    public e0(View view, CharSequence charSequence) {
        this.f86344a = view;
        this.f86345b = charSequence;
        this.f86346c = D0.g(ViewConfiguration.get(view.getContext()));
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void f(e0 e0Var) {
        e0 e0Var2 = f86342o;
        if (e0Var2 != null) {
            e0Var2.b();
        }
        f86342o = e0Var;
        if (e0Var != null) {
            e0Var.e();
        }
    }

    public static void g(View view, CharSequence charSequence) {
        e0 e0Var = f86342o;
        if (e0Var != null && e0Var.f86344a == view) {
            f(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new e0(view, charSequence);
            return;
        }
        e0 e0Var2 = f86343p;
        if (e0Var2 != null && e0Var2.f86344a == view) {
            e0Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public final void b() {
        this.f86344a.removeCallbacks(this.f86347d);
    }

    public final void c() {
        this.f86353j = true;
    }

    public void d() {
        if (f86343p == this) {
            f86343p = null;
            f0 f0Var = this.f86351h;
            if (f0Var != null) {
                f0Var.c();
                this.f86351h = null;
                this.f86353j = true;
                this.f86344a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e(f86338k, "sActiveHandler.mPopup == null");
            }
        }
        if (f86342o == this) {
            f(null);
        }
        this.f86344a.removeCallbacks(this.f86348e);
    }

    public final void e() {
        this.f86344a.postDelayed(this.f86347d, ViewConfiguration.getLongPressTimeout());
    }

    public void h(boolean z10) {
        long longPressTimeout;
        long j10;
        long j11;
        if (C2507z0.R0(this.f86344a)) {
            f(null);
            e0 e0Var = f86343p;
            if (e0Var != null) {
                e0Var.d();
            }
            f86343p = this;
            this.f86352i = z10;
            f0 f0Var = new f0(this.f86344a.getContext());
            this.f86351h = f0Var;
            f0Var.e(this.f86344a, this.f86349f, this.f86350g, this.f86352i, this.f86345b);
            this.f86344a.addOnAttachStateChangeListener(this);
            if (this.f86352i) {
                j11 = f86339l;
            } else {
                if ((this.f86344a.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = f86341n;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            this.f86344a.removeCallbacks(this.f86348e);
            this.f86344a.postDelayed(this.f86348e, j11);
        }
    }

    public final boolean i(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f86353j && Math.abs(x10 - this.f86349f) <= this.f86346c && Math.abs(y10 - this.f86350g) <= this.f86346c) {
            return false;
        }
        this.f86349f = x10;
        this.f86350g = y10;
        this.f86353j = false;
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f86351h != null && this.f86352i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f86344a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f86353j = true;
                d();
            }
        } else if (this.f86344a.isEnabled() && this.f86351h == null && i(motionEvent)) {
            f(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f86349f = view.getWidth() / 2;
        this.f86350g = view.getHeight() / 2;
        h(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
