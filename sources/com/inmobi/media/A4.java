package com.inmobi.media;

import android.app.Activity;
import android.view.OrientationEventListener;
import java.util.HashSet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: loaded from: classes5.dex */
public final class A4 extends OrientationEventListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n[] f151739d = {kotlin.jvm.internal.O.k(new MutablePropertyReference1Impl(A4.class, "currentOrientation", "getCurrentOrientation()Lcom/inmobi/ads/rendering/orientation/Orientation;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f151740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f151741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3817z4 f151742c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A4(Activity activity) {
        super(activity);
        kotlin.jvm.internal.G.p(activity, "activity");
        this.f151740a = activity;
        this.f151741b = new HashSet();
        this.f151742c = new C3817z4(AbstractC3738t9.a(AbstractC3760v3.g()), this);
    }

    public final void a(C3752u9 orientationProperties) {
        kotlin.jvm.internal.G.p(orientationProperties, "orientationProperties");
        try {
            if (orientationProperties.f153422a) {
                this.f151740a.setRequestedOrientation(13);
                return;
            }
            String str = orientationProperties.f153423b;
            if (kotlin.jvm.internal.G.g(str, "landscape")) {
                this.f151740a.setRequestedOrientation(6);
            } else if (kotlin.jvm.internal.G.g(str, "portrait")) {
                this.f151740a.setRequestedOrientation(7);
            } else {
                this.f151740a.setRequestedOrientation(13);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final void b() {
        int i10 = this.f151740a.getResources().getConfiguration().orientation;
        byte bG = AbstractC3760v3.g();
        int i11 = 1;
        if (bG != 1 && bG != 2 && (bG == 3 || bG == 4)) {
            i11 = 2;
        }
        if (i10 == i11) {
            this.f151742c.setValue(this, f151739d[0], AbstractC3738t9.a(AbstractC3760v3.g()));
        }
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        b();
    }

    public final void a() {
        if (this.f151741b.isEmpty()) {
            disable();
        } else {
            enable();
        }
    }
}
