package com.inmobi.media;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.widget.RelativeLayout;
import java.util.Objects;
import jd.C4806d;

/* JADX INFO: loaded from: classes5.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f151756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EnumC3724s9 f151757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f151758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f151759d;

    public B(RelativeLayout adBackgroundView) {
        kotlin.jvm.internal.G.p(adBackgroundView, "adBackgroundView");
        this.f151756a = adBackgroundView;
        this.f151757b = AbstractC3738t9.a(AbstractC3760v3.g());
        this.f151758c = 1.0f;
    }

    public abstract void a();

    public void a(EnumC3724s9 orientation) {
        kotlin.jvm.internal.G.p(orientation, "orientation");
        this.f151757b = orientation;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public final void e() {
        C3746u3 c3746u3;
        RelativeLayout.LayoutParams layoutParams;
        if (this.f151758c == 1.0f) {
            this.f151756a.setLayoutParams(E3.a.a(-1, -1, 10));
            return;
        }
        if (this.f151759d) {
            C3774w3 c3774w3 = AbstractC3760v3.f153433a;
            Context context = this.f151756a.getContext();
            kotlin.jvm.internal.G.o(context, "getContext(...)");
            c3746u3 = AbstractC3760v3.b(context);
        } else {
            C3774w3 c3774w32 = AbstractC3760v3.f153433a;
            Context context2 = this.f151756a.getContext();
            kotlin.jvm.internal.G.o(context2, "getContext(...)");
            Display displayA = AbstractC3760v3.a(context2);
            if (displayA == null) {
                c3746u3 = AbstractC3760v3.f153434b;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                displayA.getMetrics(displayMetrics);
                c3746u3 = new C3746u3(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        }
        Objects.toString(this.f151757b);
        if (AbstractC3738t9.b(this.f151757b)) {
            layoutParams = new RelativeLayout.LayoutParams(C4806d.L0(c3746u3.f153413a * this.f151758c), -1);
            layoutParams.addRule(9);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, C4806d.L0(c3746u3.f153414b * this.f151758c));
            layoutParams2.addRule(10);
            layoutParams = layoutParams2;
        }
        this.f151756a.setLayoutParams(layoutParams);
    }

    public abstract void f();

    public abstract void g();
}
