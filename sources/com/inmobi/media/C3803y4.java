package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.lang.ref.WeakReference;
import java.util.Objects;
import k0.C4812c;

/* JADX INFO: renamed from: com.inmobi.media.y4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3803y4 implements InterfaceC3766v9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f153545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f153546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public B f153547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RelativeLayout f153548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C3788x3 f153549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EnumC3724s9 f153550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f153551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public N4 f153552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3789x4 f153553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3775w4 f153554j;

    public C3803y4(Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
        this.f153545a = new WeakReference(activity);
        this.f153550f = AbstractC3738t9.a(AbstractC3760v3.g());
        this.f153551g = 1.0f;
        this.f153553i = new C3789x4(this);
        this.f153554j = new C3775w4(this);
    }

    public final void a(Intent intent, SparseArray adContainers) {
        C3788x3 c3788x3;
        Window window;
        kotlin.jvm.internal.G.p(intent, "intent");
        kotlin.jvm.internal.G.p(adContainers, "adContainers");
        if (!intent.hasExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX")) {
            b();
            return;
        }
        r rVar = (r) adContainers.get(intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", -1));
        if (rVar == null) {
            b();
            return;
        }
        int intExtra = intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 0);
        if (intExtra == 0) {
            InterfaceC3687q fullScreenEventsListener = rVar.getFullScreenEventsListener();
            if (fullScreenEventsListener != null) {
                fullScreenEventsListener.a();
            }
            b();
            return;
        }
        if (intent.getBooleanExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", false) && (this.f153545a.get() instanceof InMobiAdActivity)) {
            Object obj = this.f153545a.get();
            kotlin.jvm.internal.G.n(obj, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
            if (!((InMobiAdActivity) obj).f151726g) {
                Object obj2 = this.f153545a.get();
                kotlin.jvm.internal.G.n(obj2, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
                ((InMobiAdActivity) obj2).f151726g = true;
                if (!(rVar instanceof GestureDetectorOnGestureListenerC3809ya) ? false : ((GestureDetectorOnGestureListenerC3809ya) rVar).f153579F0) {
                    N4 n42 = this.f153552h;
                    if (n42 != null) {
                        ((O4) n42).a("InMobiActivityViewHandler", "showInImmersiveMode");
                    }
                    Object obj3 = this.f153545a.get();
                    InMobiAdActivity inMobiAdActivity = obj3 instanceof InMobiAdActivity ? (InMobiAdActivity) obj3 : null;
                    if (inMobiAdActivity != null && (window = inMobiAdActivity.getWindow()) != null) {
                        C3635m3 c3635m3 = C3635m3.f153124a;
                        if (c3635m3.E()) {
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            attributes.layoutInDisplayCutoutMode = 3;
                            window.setAttributes(attributes);
                            androidx.core.view.N0.c(window, false);
                        }
                        if (c3635m3.C()) {
                            WindowManager.LayoutParams attributes2 = window.getAttributes();
                            attributes2.layoutInDisplayCutoutMode = 1;
                            window.setAttributes(attributes2);
                            androidx.core.view.N0.c(window, false);
                        }
                        if (c3635m3.E()) {
                            androidx.core.view.M1 m12 = new androidx.core.view.M1(window, window.getDecorView());
                            m12.j(2);
                            m12.d(7);
                            m12.d(128);
                        } else if (c3635m3.x()) {
                            window.getDecorView().setSystemUiVisibility(5638);
                        }
                    }
                } else {
                    Activity activity = (Activity) this.f153545a.get();
                    if (activity != null) {
                        try {
                            activity.requestWindowFeature(1);
                            activity.getWindow().setFlags(1024, 1024);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        if ((200 == intExtra && !"html".equals(rVar.getMarkupType())) || ((202 == intExtra && !"htmlUrl".equals(rVar.getMarkupType())) || (201 == intExtra && !"inmobiJson".equals(rVar.getMarkupType())))) {
            InterfaceC3687q fullScreenEventsListener2 = rVar.getFullScreenEventsListener();
            if (fullScreenEventsListener2 != null) {
                fullScreenEventsListener2.a();
            }
            b();
            return;
        }
        try {
            this.f153546b = rVar;
            rVar.setFullScreenActivityContext((Activity) this.f153545a.get());
            a();
            Activity activity2 = (Activity) this.f153545a.get();
            if (activity2 != null) {
                RelativeLayout relativeLayout = new RelativeLayout(activity2);
                relativeLayout.setId(C4812c.f214295k);
                this.f153548d = relativeLayout;
            }
            a(rVar);
            B b10 = this.f153547c;
            if (b10 != null) {
                b10.f();
            }
            Activity activity3 = (Activity) this.f153545a.get();
            if (activity3 != null) {
                FrameLayout frameLayout = (FrameLayout) activity3.findViewById(R.id.content);
                RelativeLayout relativeLayout2 = frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null;
                RelativeLayout relativeLayout3 = this.f153548d;
                if (relativeLayout3 != null && relativeLayout2 != null) {
                    RelativeLayout relativeLayout4 = (RelativeLayout) relativeLayout2.findViewById(C4812c.f214295k);
                    if (relativeLayout4 != null) {
                        relativeLayout2.removeView(relativeLayout4);
                    }
                    relativeLayout2.addView(relativeLayout3);
                    B b11 = this.f153547c;
                    if (b11 != null) {
                        b11.e();
                    }
                }
            }
            if (rVar instanceof GestureDetectorOnGestureListenerC3809ya) {
                ((GestureDetectorOnGestureListenerC3809ya) rVar).setEmbeddedBrowserJSCallbacks(this.f153554j);
            }
            if ((rVar instanceof GestureDetectorOnGestureListenerC3809ya) && (c3788x3 = this.f153549e) != null) {
                c3788x3.setUserLeftApplicationListener(((GestureDetectorOnGestureListenerC3809ya) rVar).getListener());
            }
        } catch (Exception e10) {
            rVar.setFullScreenActivityContext(null);
            InterfaceC3687q fullScreenEventsListener3 = rVar.getFullScreenEventsListener();
            if (fullScreenEventsListener3 != null) {
                fullScreenEventsListener3.a();
            }
            b();
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public final void b() {
        Activity activity = (Activity) this.f153545a.get();
        if (activity instanceof InMobiAdActivity) {
            ((InMobiAdActivity) activity).finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r5 = this;
            com.inmobi.media.x3 r0 = r5.f153549e
            if (r0 != 0) goto L5
            return
        L5:
            com.inmobi.media.r r0 = r5.f153546b
            r1 = 1
            if (r0 == 0) goto L1b
            boolean r2 = r0 instanceof com.inmobi.media.GestureDetectorOnGestureListenerC3809ya
            if (r2 != 0) goto L10
            r0 = 0
            goto L14
        L10:
            com.inmobi.media.ya r0 = (com.inmobi.media.GestureDetectorOnGestureListenerC3809ya) r0
            boolean r0 = r0.f153579F0
        L14:
            if (r0 != r1) goto L1b
            com.inmobi.media.w3 r0 = com.inmobi.media.AbstractC3760v3.h()
            goto L1f
        L1b:
            com.inmobi.media.w3 r0 = com.inmobi.media.AbstractC3760v3.d()
        L1f:
            int r2 = r0.f153495a
            float r2 = (float) r2
            float r3 = r0.f153497c
            float r2 = r2 * r3
            int r0 = r0.f153496b
            float r0 = (float) r0
            float r0 = r0 * r3
            com.inmobi.media.s9 r3 = r5.f153550f
            boolean r3 = com.inmobi.media.AbstractC3738t9.b(r3)
            r4 = -1
            if (r3 == 0) goto L3f
            float r0 = (float) r1
            float r1 = r5.f153551g
            float r0 = r0 - r1
            float r0 = r0 * r2
            int r0 = jd.C4806d.L0(r0)
            r5.a(r0, r4)
            return
        L3f:
            float r1 = (float) r1
            float r2 = r5.f153551g
            float r1 = r1 - r2
            float r1 = r1 * r0
            int r0 = jd.C4806d.L0(r1)
            r5.a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3803y4.c():void");
    }

    public final void a() {
        Activity activity = (Activity) this.f153545a.get();
        if (activity == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.content);
        if ((frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null) != null) {
            return;
        }
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        relativeLayout.setId(65519);
        relativeLayout.setBackgroundColor(0);
        frameLayout.removeAllViews();
        frameLayout.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r1 = new com.inmobi.media.C3608k4(r4.f153545a, r5, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.inmobi.media.r r5) {
        /*
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.f153545a
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto Lc
            goto Lac
        Lc:
            android.widget.RelativeLayout r0 = r4.f153548d
            if (r0 != 0) goto L12
            goto Lac
        L12:
            java.lang.String r1 = r5.getMarkupType()
            int r2 = r1.hashCode()
            r3 = -1084172778(0xffffffffbf60d616, float:-0.8782667)
            if (r2 == r3) goto L42
            r3 = 3213227(0x3107ab, float:4.50269E-39)
            if (r2 == r3) goto L32
            r3 = 1236050372(0x49aca1c4, float:1414200.5)
            if (r2 != r3) goto Lad
            java.lang.String r2 = "htmlUrl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lad
            goto L3a
        L32:
            java.lang.String r2 = "html"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lad
        L3a:
            com.inmobi.media.k4 r1 = new com.inmobi.media.k4
            java.lang.ref.WeakReference r2 = r4.f153545a
            r1.<init>(r2, r5, r0)
            goto L51
        L42:
            java.lang.String r2 = "inmobiJson"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lad
            com.inmobi.media.H5 r1 = new com.inmobi.media.H5
            java.lang.ref.WeakReference r2 = r4.f153545a
            r1.<init>(r2, r5, r0)
        L51:
            r4.f153547c = r1
            com.inmobi.media.s9 r0 = r4.f153550f
            r1.a(r0)
            float r0 = r4.f153551g
            r1.f151758c = r0
            boolean r0 = r5 instanceof com.inmobi.media.GestureDetectorOnGestureListenerC3809ya
            r2 = 0
            if (r0 != 0) goto L63
            r3 = r2
            goto L68
        L63:
            r3 = r5
            com.inmobi.media.ya r3 = (com.inmobi.media.GestureDetectorOnGestureListenerC3809ya) r3
            boolean r3 = r3.f153579F0
        L68:
            r1.f151759d = r3
            boolean r3 = r1 instanceof com.inmobi.media.C3608k4
            if (r3 == 0) goto Lac
            if (r0 != 0) goto L71
            goto L75
        L71:
            com.inmobi.media.ya r5 = (com.inmobi.media.GestureDetectorOnGestureListenerC3809ya) r5
            boolean r2 = r5.f153579F0
        L75:
            if (r2 == 0) goto Lac
            com.inmobi.media.k4 r1 = (com.inmobi.media.C3608k4) r1
            com.inmobi.media.gb r5 = new com.inmobi.media.gb
            java.lang.ref.WeakReference r0 = r1.f153077e
            com.inmobi.media.r r2 = r1.f153078f
            java.lang.String r3 = "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView"
            kotlin.jvm.internal.G.n(r2, r3)
            com.inmobi.media.ya r2 = (com.inmobi.media.GestureDetectorOnGestureListenerC3809ya) r2
            r5.<init>(r0, r2)
            boolean r2 = com.inmobi.media.AbstractC3760v3.f153441i
            if (r2 != 0) goto L8e
            goto Laa
        L8e:
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto L97
            goto Laa
        L97:
            android.view.Window r0 = r0.getWindow()
            if (r0 != 0) goto L9e
            goto Laa
        L9e:
            android.view.View r0 = r0.getDecorView()
            java.lang.String r2 = "getDecorView(...)"
            kotlin.jvm.internal.G.o(r0, r2)
            r5.a(r0)
        Laa:
            r1.f153081i = r5
        Lac:
            return
        Lad:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "InMobiActivityViewHandler: Unknown Markup type"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3803y4.a(com.inmobi.media.r):void");
    }

    @Override // com.inmobi.media.InterfaceC3766v9
    public final void a(EnumC3724s9 orientation) {
        kotlin.jvm.internal.G.p(orientation, "orientation");
        if (((Activity) this.f153545a.get()) == null) {
            return;
        }
        B b10 = this.f153547c;
        if (b10 != null) {
            b10.a(orientation);
        }
        EnumC3724s9 enumC3724s9 = this.f153550f;
        if (enumC3724s9 != orientation && AbstractC3738t9.b(enumC3724s9) != AbstractC3738t9.b(orientation)) {
            Objects.toString(orientation);
            this.f153550f = orientation;
            B b11 = this.f153547c;
            if (b11 != null) {
                b11.e();
            }
            c();
            return;
        }
        Objects.toString(orientation);
        this.f153550f = orientation;
    }

    public static final void a(C3803y4 c3803y4) {
        C3788x3 c3788x3 = c3803y4.f153549e;
        if (c3788x3 != null) {
            c3788x3.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
        }
        C3788x3 c3788x32 = c3803y4.f153549e;
        if (c3788x32 != null) {
            ViewParent parent = c3788x32.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(c3788x32);
            }
        }
        C3788x3 c3788x33 = c3803y4.f153549e;
        if (c3788x33 != null) {
            F3 f32 = c3788x33.f153517b;
            if (f32 != null) {
                f32.destroy();
            }
            c3788x33.f153517b = null;
            c3788x33.f153518c = null;
            c3788x33.f153519d = null;
            c3788x33.removeAllViews();
        }
        c3803y4.f153549e = null;
        c3803y4.f153551g = 1.0f;
        B b10 = c3803y4.f153547c;
        if (b10 != null) {
            b10.f151758c = 1.0f;
            b10.e();
        }
    }

    public final void a(int i10, int i11) {
        RelativeLayout.LayoutParams layoutParamsA;
        Activity activity = (Activity) this.f153545a.get();
        if (activity == null) {
            return;
        }
        AbstractC3738t9.b(this.f153550f);
        if (AbstractC3738t9.b(this.f153550f)) {
            layoutParamsA = E3.a.a(i10, i11, 11);
        } else {
            layoutParamsA = E3.a.a(i10, i11, 12);
        }
        RelativeLayout relativeLayout = (RelativeLayout) ((FrameLayout) activity.findViewById(R.id.content)).findViewById(65519);
        kotlin.jvm.internal.G.m(relativeLayout);
        if (((RelativeLayout) relativeLayout.findViewById(65518)) != null) {
            C3788x3 c3788x3 = this.f153549e;
            if (c3788x3 == null) {
                return;
            }
            c3788x3.setLayoutParams(layoutParamsA);
            return;
        }
        C3788x3 c3788x32 = this.f153549e;
        if (c3788x32 != null) {
            relativeLayout.addView(c3788x32, layoutParamsA);
        }
    }
}
