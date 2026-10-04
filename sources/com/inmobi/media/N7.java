package com.inmobi.media;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.N7;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class N7 implements U7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdConfig f152304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3499c7 f152305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3820z7 f152306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G7 f152307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F7 f152308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N4 f152309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f152310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f152311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f152312i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public W7 f152313j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f152314k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final N0 f152315l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final N8 f152316m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f152317n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC3809ya f152318o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public H7 f152319p;

    public N7(Context context, AdConfig adConfig, C3499c7 nativeAdContainer, C3820z7 dataModel, G7 viewEventListener, F7 clickEventListener, H7 timerFinishListener, N4 n42) {
        N8 n82;
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(adConfig, "adConfig");
        kotlin.jvm.internal.G.p(nativeAdContainer, "nativeAdContainer");
        kotlin.jvm.internal.G.p(dataModel, "dataModel");
        kotlin.jvm.internal.G.p(viewEventListener, "viewEventListener");
        kotlin.jvm.internal.G.p(clickEventListener, "clickEventListener");
        kotlin.jvm.internal.G.p(timerFinishListener, "timerFinishListener");
        this.f152304a = adConfig;
        this.f152305b = nativeAdContainer;
        this.f152306c = dataModel;
        this.f152307d = viewEventListener;
        this.f152308e = clickEventListener;
        this.f152309f = n42;
        this.f152310g = "N7";
        this.f152311h = new Handler(Looper.getMainLooper());
        this.f152312i = new WeakReference(context);
        this.f152315l = new N0();
        HashMap map = N8.f152320c;
        WeakReference weakReference = N8.f152321d;
        N8 n83 = weakReference != null ? (N8) weakReference.get() : null;
        if (n83 == null) {
            synchronized (N8.class) {
                try {
                    WeakReference weakReference2 = N8.f152321d;
                    if (weakReference2 == null || (n82 = (N8) weakReference2.get()) == null) {
                        n82 = new N8(context);
                        N8.f152321d = new WeakReference(n82);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            n83 = n82;
        }
        this.f152316m = n83;
        this.f152319p = timerFinishListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.ViewGroup a(android.view.ViewGroup r4, com.inmobi.media.C3708r7 r5) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.G.p(r4, r0)
            java.lang.String r0 = "root"
            kotlin.jvm.internal.G.p(r5, r0)
            java.lang.ref.WeakReference r0 = r3.f152312i
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 == 0) goto L23
            com.inmobi.media.N8 r1 = r3.f152316m
            com.inmobi.commons.core.configs.AdConfig r2 = r3.f152304a
            android.view.View r0 = r1.a(r0, r5, r2)
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L23
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L24
        L23:
            r0 = 0
        L24:
            if (r0 != 0) goto L27
            return r0
        L27:
            java.util.HashMap r1 = com.inmobi.media.N8.f152320c
            android.view.ViewGroup$LayoutParams r4 = com.inmobi.media.C3793x8.a(r5, r4)
            r0.setLayoutParams(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.N7.a(android.view.ViewGroup, com.inmobi.media.r7):android.view.ViewGroup");
    }

    public final void b(View view, final C3639m7 c3639m7) {
        if (c3639m7.f153149f) {
            view.setOnClickListener(new View.OnClickListener() { // from class: F5.k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    N7.a(this.f34509a, c3639m7, view2);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0117, code lost:
    
        if (com.prism.lib_google_billing.q.f194113a.equals(r0.f152374y) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0126, code lost:
    
        if (r11.f153148e == null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.ViewGroup b(android.view.ViewGroup r25, com.inmobi.media.C3708r7 r26) {
        /*
            Method dump skipped, instruction units count: 1059
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.N7.b(android.view.ViewGroup, com.inmobi.media.r7):android.view.ViewGroup");
    }

    public final T7 a(T7 t72, final ViewGroup parent, GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya) {
        kotlin.jvm.internal.G.p(parent, "parent");
        this.f152318o = gestureDetectorOnGestureListenerC3809ya;
        final T7 t7A = a(t72, parent);
        this.f152311h.post(new Runnable() { // from class: F5.l0
            @Override // java.lang.Runnable
            public final void run() {
                N7.a(this.f34518a, t7A, parent);
            }
        });
        return t7A;
    }

    public static final void a(N7 this$0, T7 t72, ViewGroup parent) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        kotlin.jvm.internal.G.p(parent, "$parent");
        if (this$0.f152317n) {
            return;
        }
        C3708r7 c3708r7 = this$0.f152306c.f153676f;
        if (t72 == null || c3708r7 == null) {
            return;
        }
        this$0.b((ViewGroup) t72, c3708r7);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.inmobi.media.T7 a(com.inmobi.media.T7 r5, android.view.ViewGroup r6) {
        /*
            r4 = this;
            com.inmobi.media.z7 r0 = r4.f152306c
            com.inmobi.media.r7 r0 = r0.f153676f
            if (r5 != 0) goto L23
            java.lang.ref.WeakReference r1 = r4.f152312i
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            if (r1 == 0) goto L21
            if (r0 == 0) goto L21
            com.inmobi.media.N8 r2 = r4.f152316m
            com.inmobi.commons.core.configs.AdConfig r3 = r4.f152304a
            android.view.View r1 = r2.a(r1, r0, r3)
            boolean r2 = r1 instanceof com.inmobi.media.T7
            if (r2 == 0) goto L21
            com.inmobi.media.T7 r1 = (com.inmobi.media.T7) r1
            goto L24
        L21:
            r1 = 0
            goto L24
        L23:
            r1 = r5
        L24:
            if (r1 == 0) goto L5c
            if (r5 == 0) goto L5c
            android.view.ViewParent r5 = r1.getParent()
            boolean r2 = r5 instanceof android.view.ViewGroup
            if (r2 == 0) goto L35
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r5.removeView(r1)
        L35:
            com.inmobi.media.N8 r5 = r4.f152316m
            r5.getClass()
            int r2 = r1.getChildCount()
            int r2 = r2 + (-1)
        L40:
            r3 = -1
            if (r3 >= r2) goto L53
            android.view.View r3 = r1.getChildAt(r2)
            r1.removeViewAt(r2)
            kotlin.jvm.internal.G.m(r3)
            r5.a(r3)
            int r2 = r2 + (-1)
            goto L40
        L53:
            if (r0 == 0) goto L5c
            java.util.HashMap r5 = com.inmobi.media.N8.f152320c
            com.inmobi.media.n7 r5 = r0.f153147d
            com.inmobi.media.C3793x8.a(r1, r5)
        L5c:
            if (r0 == 0) goto L6b
            com.inmobi.media.N8 r5 = r4.f152316m
            com.inmobi.media.n7 r2 = r0.f153147d
            android.graphics.Point r2 = r2.f153190a
            int r2 = r2.x
            r5.getClass()
            com.inmobi.media.N8.f152324g = r2
        L6b:
            if (r1 == 0) goto L78
            if (r0 == 0) goto L78
            java.util.HashMap r5 = com.inmobi.media.N8.f152320c
            android.view.ViewGroup$LayoutParams r5 = com.inmobi.media.C3793x8.a(r0, r6)
            r1.setLayoutParams(r5)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.N7.a(com.inmobi.media.T7, android.view.ViewGroup):com.inmobi.media.T7");
    }

    public final void a(View view, C3639m7 nativeAsset) {
        N0 n02 = this.f152315l;
        n02.getClass();
        kotlin.jvm.internal.G.p(view, "view");
        kotlin.jvm.internal.G.p(nativeAsset, "nativeAsset");
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        try {
            HashMap map = N8.f152320c;
            float fA = C3793x8.a(nativeAsset.f153147d.f153192c.x);
            float fA2 = C3793x8.a(nativeAsset.f153147d.f153193d.x);
            if (fA != fA2) {
                arrayList.add(N0.a(N0.a(view, fA, fA2), nativeAsset));
            }
            float fA3 = C3793x8.a(nativeAsset.f153147d.f153192c.y);
            float fA4 = C3793x8.a(nativeAsset.f153147d.f153193d.y);
            if (fA3 != fA4) {
                arrayList.add(N0.a(N0.b(view, fA3, fA4), nativeAsset));
            }
            float fA5 = C3793x8.a(nativeAsset.f153147d.f153190a.x);
            float fA6 = C3793x8.a(nativeAsset.f153147d.f153191b.x);
            if (fA5 != fA6) {
                view.setPivotX(0.0f);
                view.setPivotY(0.0f);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", fA6 / fA5);
                kotlin.jvm.internal.G.o(objectAnimatorOfFloat, "ofFloat(...)");
                arrayList.add(N0.a(objectAnimatorOfFloat, nativeAsset));
            }
            float fA7 = C3793x8.a(nativeAsset.f153147d.f153190a.y);
            float fA8 = C3793x8.a(nativeAsset.f153147d.f153191b.y);
            if (fA7 != fA8) {
                view.setPivotX(0.0f);
                view.setPivotY(0.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", fA8 / fA7);
                kotlin.jvm.internal.G.o(objectAnimatorOfFloat2, "ofFloat(...)");
                arrayList.add(N0.a(objectAnimatorOfFloat2, nativeAsset));
            }
        } catch (Exception unused) {
            String TAG = n02.f152265a;
            kotlin.jvm.internal.G.o(TAG, "TAG");
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        ArrayList arrayList2 = nativeAsset.f153162s;
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = false;
                break;
            }
            Object obj = arrayList2.get(i10);
            i10++;
            if ("creativeView".equals(((C3542f8) obj).f152923c)) {
                break;
            }
        }
        if (arrayList != null || z10) {
            view.addOnAttachStateChangeListener(new I7(this, arrayList, nativeAsset));
        }
    }

    public static final void a(WeakReference childViewRef) {
        kotlin.jvm.internal.G.p(childViewRef, "$childViewRef");
        View view = (View) childViewRef.get();
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public static final void a(N7 this$0, C3639m7 asset, View view) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        kotlin.jvm.internal.G.p(asset, "$asset");
        F7 f72 = this$0.f152308e;
        kotlin.jvm.internal.G.m(view);
        f72.getClass();
        H7 h72 = f72.f151930a;
        if (h72.f152028a) {
            return;
        }
        h72.f152029b.a(view, asset);
        f72.f151930a.f152029b.a(asset, false);
    }

    public static final void b(WeakReference childViewRef) {
        kotlin.jvm.internal.G.p(childViewRef, "$childViewRef");
        View view = (View) childViewRef.get();
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
