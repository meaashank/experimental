package com.inmobi.media;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.inmobi.media.N8;
import com.squareup.picasso.Callback;
import com.squareup.picasso.RequestCreator;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class N8 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile WeakReference f152321d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f152326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f152320c = kotlin.collections.n0.M(new Pair(T7.class, (byte) 0), new Pair(C3629lb.class, (byte) 1), new Pair(C3615kb.class, (byte) 2), new Pair(C3736t7.class, (byte) 3), new Pair(ImageView.class, (byte) 6), new Pair(C3779w8.class, (byte) 7), new Pair(C3821z8.class, (byte) 4), new Pair(Button.class, (byte) 5), new Pair(C3528e8.class, (byte) 8), new Pair(GestureDetectorOnGestureListenerC3809ya.class, (byte) 9), new Pair(C3524e4.class, (byte) 10));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static WeakReference f152322e = new WeakReference(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f152323f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f152324g = 1;

    public N8(Context context) {
        f152322e = new WeakReference(context);
        this.f152326b = kotlin.collections.n0.M(new Pair((byte) 0, new G8(this)), new Pair((byte) 3, new C8(this)), new Pair((byte) 1, new L8(this)), new Pair((byte) 2, new H8(this)), new Pair((byte) 6, new F8(this)), new Pair((byte) 10, new E8(this)), new Pair((byte) 7, new K8(this)), new Pair((byte) 4, new I8(this)), new Pair((byte) 5, new D8(this)), new Pair((byte) 8, new J8(this)), new Pair((byte) 9, new M8(this)));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View a(android.content.Context r6, com.inmobi.media.C3639m7 r7, com.inmobi.commons.core.configs.AdConfig r8) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.N8.a(android.content.Context, com.inmobi.media.m7, com.inmobi.commons.core.configs.AdConfig):android.view.View");
    }

    public final void b(View view) {
        Byte b10 = (Byte) f152320c.get(view.getClass());
        byte bByteValue = b10 != null ? b10.byteValue() : (byte) -1;
        if (-1 == bByteValue) {
            view.toString();
            return;
        }
        B8 b82 = (B8) this.f152326b.get(Byte.valueOf(bByteValue));
        if (b82 == null) {
            return;
        }
        if (this.f152325a >= 300) {
            Iterator it = this.f152326b.entrySet().iterator();
            int size = 0;
            B8 b83 = null;
            while (it.hasNext()) {
                B8 b84 = (B8) ((Map.Entry) it.next()).getValue();
                if (b84.f151786a.size() > size) {
                    size = b84.f151786a.size();
                    b83 = b84;
                }
            }
            if (b83 != null && b83.f151786a.size() > 0) {
                b83.f151786a.removeFirst();
            }
        }
        b82.a(view);
    }

    public static final void a(N8 n82, Button button, C3639m7 c3639m7) {
        n82.getClass();
        C3653n7 c3653n7 = c3639m7.f153147d;
        kotlin.jvm.internal.G.n(c3653n7, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeCtaAsset.NativeCtaAssetStyle");
        C3750u7 c3750u7 = (C3750u7) c3653n7;
        button.setLayoutParams(new ViewGroup.LayoutParams(C3793x8.a(c3750u7.f153190a.x), C3793x8.a(c3750u7.f153190a.y)));
        Object obj = c3639m7.f153148e;
        button.setText(obj instanceof CharSequence ? (CharSequence) obj : null);
        button.setTextSize(1, C3793x8.a(c3750u7.f152592l));
        int color = Color.parseColor("#ff000000");
        try {
            String str = c3750u7.f152594n;
            Locale US = Locale.US;
            kotlin.jvm.internal.G.o(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.G.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            color = Color.parseColor(lowerCase);
        } catch (IllegalArgumentException e10) {
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(new R1(e10));
        }
        button.setTextColor(color);
        int color2 = Color.parseColor("#00000000");
        try {
            color2 = Color.parseColor(c3750u7.a());
        } catch (IllegalArgumentException e11) {
            C3511d5 c3511d52 = C3511d5.f152815a;
            C3511d5.f152817c.a(new R1(e11));
        }
        button.setBackgroundColor(color2);
        button.setTextAlignment(4);
        button.setGravity(17);
        C3793x8.a(button, c3750u7.f152595o);
        C3793x8.a(button, c3750u7);
    }

    public static final void a(N8 n82, ImageView imageView, C3639m7 c3639m7) {
        int i10;
        int i11;
        int i12;
        String str;
        n82.getClass();
        Object obj = c3639m7.f153148e;
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 != null) {
            int iA = C3793x8.a(c3639m7.f153147d.f153190a.x);
            int iA2 = C3793x8.a(c3639m7.f153147d.f153190a.y);
            String str3 = c3639m7.f153147d.f153196g;
            if (kotlin.jvm.internal.G.g(str3, "aspectFit")) {
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else if (kotlin.jvm.internal.G.g(str3, "aspectFill")) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            Context context = (Context) f152322e.get();
            if (context != null && iA > 0 && iA2 > 0) {
                int length = str2.length() - 1;
                int i13 = 0;
                boolean z10 = false;
                while (i13 <= length) {
                    boolean z11 = kotlin.jvm.internal.G.t(str2.charAt(!z10 ? i13 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z11) {
                        i13++;
                    } else {
                        z10 = true;
                    }
                }
                if (str2.subSequence(i13, length + 1).toString().length() > 0) {
                    B9 b92 = B9.f151790a;
                    RequestCreator requestCreatorLoad = b92.a(context).load(str2);
                    Object objA = b92.a(new A8(context, imageView, c3639m7));
                    kotlin.jvm.internal.G.n(objA, "null cannot be cast to non-null type com.squareup.picasso.Callback");
                    requestCreatorLoad.into(imageView, (Callback) objA);
                    if ("cross_button".equalsIgnoreCase(c3639m7.f153145b) && ((str = c3639m7.f153159p) == null || str.length() == 0)) {
                        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC3807y8(context, imageView), 2000L);
                    }
                }
            }
            C3639m7 c3639m72 = c3639m7.f153161r;
            if (c3639m72 == null || !"line".equals(c3639m72.f153147d.f153194e)) {
                i10 = 0;
                i11 = 0;
                i12 = 0;
            } else {
                C3653n7 c3653n7 = c3639m72.f153147d;
                int i14 = c3653n7.f153192c.x == c3639m7.f153147d.f153192c.x ? 1 : 0;
                i11 = C3793x8.a(c3653n7.f153190a.x) == C3793x8.a(c3639m7.f153147d.f153190a.x) + c3639m7.f153147d.f153192c.x ? 1 : 0;
                i12 = C3793x8.a(c3639m72.f153147d.f153192c.y) == C3793x8.a(c3639m7.f153147d.f153192c.y) ? 1 : 0;
                i = C3793x8.a(c3639m72.f153147d.f153190a.y) == C3793x8.a(c3639m7.f153147d.f153192c.y) + C3793x8.a(c3639m7.f153147d.f153190a.y) ? 1 : 0;
                if (C3793x8.a(c3639m72.f153147d.f153190a.x) == C3793x8.a(c3639m7.f153147d.f153190a.x)) {
                    i10 = i;
                    i11 = 1;
                    i = 1;
                } else {
                    i10 = i;
                    i = i14;
                }
            }
            imageView.setPaddingRelative(i, i12, i11, i10);
            C3793x8.a(imageView, c3639m7.f153147d);
        }
    }

    public static final void a(N8 n82, TextView textView, C3639m7 c3639m7) {
        n82.getClass();
        C3653n7 c3653n7 = c3639m7.f153147d;
        kotlin.jvm.internal.G.n(c3653n7, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeTextAsset.NativeTextAssetStyle");
        X7 x72 = (X7) c3653n7;
        textView.setLayoutParams(new ViewGroup.LayoutParams(C3793x8.a(x72.f153190a.x), C3793x8.a(x72.f153190a.y)));
        Object obj = c3639m7.f153148e;
        textView.setText(obj instanceof CharSequence ? (CharSequence) obj : null);
        textView.setTypeface(Typeface.DEFAULT);
        byte b10 = x72.f152593m;
        if (b10 == 0) {
            textView.setGravity(8388627);
        } else if (b10 == 1) {
            textView.setGravity(8388629);
        } else if (b10 == 2) {
            textView.setGravity(17);
        } else {
            textView.setGravity(8388627);
        }
        textView.setTextSize(1, C3793x8.a(x72.f152592l));
        int color = Color.parseColor("#ff000000");
        try {
            String str = x72.f152594n;
            Locale US = Locale.US;
            kotlin.jvm.internal.G.o(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.G.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            color = Color.parseColor(lowerCase);
        } catch (IllegalArgumentException e10) {
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(new R1(e10));
        }
        textView.setTextColor(color);
        int color2 = Color.parseColor("#00000000");
        try {
            color2 = Color.parseColor(x72.a());
        } catch (IllegalArgumentException e11) {
            C3511d5 c3511d52 = C3511d5.f152815a;
            C3511d5.f152817c.a(new R1(e11));
        }
        textView.setBackgroundColor(color2);
        textView.setTextAlignment(1);
        C3793x8.a(textView, x72.f152595o);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setHorizontallyScrolling(true);
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(true);
        C3793x8.a(textView, x72);
    }

    public final void a(View view) {
        kotlin.jvm.internal.G.p(view, "view");
        if (!(view instanceof T7) && !(view instanceof C3736t7)) {
            b(view);
            return;
        }
        C3736t7 c3736t7 = (C3736t7) view;
        if (c3736t7.getChildCount() == 0) {
            b(view);
            return;
        }
        Stack stack = new Stack();
        stack.push(c3736t7);
        while (!stack.isEmpty()) {
            C3736t7 c3736t72 = (C3736t7) stack.pop();
            int childCount = c3736t72.getChildCount();
            while (true) {
                childCount--;
                if (-1 < childCount) {
                    View childAt = c3736t72.getChildAt(childCount);
                    c3736t72.removeViewAt(childCount);
                    if (childAt instanceof C3736t7) {
                        stack.push(childAt);
                    } else {
                        kotlin.jvm.internal.G.m(childAt);
                        b(childAt);
                    }
                }
            }
            b(c3736t72);
        }
    }

    public static void a(final C3528e8 c3528e8, C3639m7 c3639m7) {
        long jA;
        c3528e8.setVisibility(4);
        kotlin.jvm.internal.G.n(c3639m7, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeTimerAsset");
        final C3486b8 c3486b8 = (C3486b8) c3639m7;
        C3472a8 c3472a8 = c3486b8.f152727x;
        Z7 z72 = c3472a8.f152702a;
        Z7 z73 = c3472a8.f152703b;
        if (z72 != null) {
            try {
                jA = z72.a();
            } catch (Exception e10) {
                C3511d5 c3511d5 = C3511d5.f152815a;
                C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
                return;
            }
        } else {
            jA = 0;
        }
        long jA2 = z73 != null ? z73.a() : 0L;
        if (jA2 >= 0) {
            c3528e8.setTimerValue(jA2);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: F5.m0
                @Override // java.lang.Runnable
                public final void run() {
                    N8.a(c3486b8, c3528e8);
                }
            }, jA * ((long) 1000));
        }
    }

    public static final void a(C3486b8 timerAsset, C3528e8 timerView) {
        kotlin.jvm.internal.G.p(timerAsset, "$timerAsset");
        kotlin.jvm.internal.G.p(timerView, "$timerView");
        if (f152322e.get() != null) {
            if (timerAsset.f152728y) {
                timerView.setVisibility(0);
            }
            timerView.d();
        }
    }
}
