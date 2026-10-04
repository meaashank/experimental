package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.e0;

/* JADX INFO: loaded from: classes2.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f112037g = 500;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f112038h = 500;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f112039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f112040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f112041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f112042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Runnable f112043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runnable f112044f;

    public ContentLoadingProgressBar(@NonNull Context context) {
        this(context, null);
    }

    public static /* synthetic */ void c(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f112041c = false;
        if (contentLoadingProgressBar.f112042d) {
            return;
        }
        contentLoadingProgressBar.f112039a = System.currentTimeMillis();
        contentLoadingProgressBar.setVisibility(0);
    }

    public static /* synthetic */ void d(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f112040b = false;
        contentLoadingProgressBar.f112039a = -1L;
        contentLoadingProgressBar.setVisibility(8);
    }

    public void e() {
        post(new Runnable() { // from class: androidx.core.widget.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f112148a.f();
            }
        });
    }

    @e0
    public final void f() {
        this.f112042d = true;
        removeCallbacks(this.f112044f);
        this.f112041c = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f112039a;
        long j11 = jCurrentTimeMillis - j10;
        if (j11 >= 500 || j10 == -1) {
            setVisibility(8);
        } else {
            if (this.f112040b) {
                return;
            }
            postDelayed(this.f112043e, 500 - j11);
            this.f112040b = true;
        }
    }

    public final void g() {
        removeCallbacks(this.f112043e);
        removeCallbacks(this.f112044f);
    }

    public void h() {
        post(new Runnable() { // from class: androidx.core.widget.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f112147a.i();
            }
        });
    }

    @e0
    public final void i() {
        this.f112039a = -1L;
        this.f112042d = false;
        removeCallbacks(this.f112043e);
        this.f112040b = false;
        if (this.f112041c) {
            return;
        }
        postDelayed(this.f112044f, 500L);
        this.f112041c = true;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    public ContentLoadingProgressBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f112039a = -1L;
        this.f112040b = false;
        this.f112041c = false;
        this.f112042d = false;
        this.f112043e = new Runnable() { // from class: androidx.core.widget.e
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.d(this.f112145a);
            }
        };
        this.f112044f = new Runnable() { // from class: androidx.core.widget.f
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.c(this.f112146a);
            }
        };
    }
}
