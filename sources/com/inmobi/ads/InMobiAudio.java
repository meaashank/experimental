package com.inmobi.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.AudioAdEventListener;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.media.AbstractC3633m1;
import com.inmobi.media.AbstractC3666o6;
import com.inmobi.media.AbstractC3702r1;
import com.inmobi.media.AbstractC3760v3;
import com.inmobi.media.C3558ga;
import com.inmobi.media.C3619l1;
import com.inmobi.media.C3635m3;
import com.inmobi.media.C3657nb;
import com.inmobi.media.C3671ob;
import com.inmobi.media.C3689q1;
import com.inmobi.media.C3745u2;
import com.inmobi.media.C3773w2;
import com.inmobi.media.C3774w3;
import com.inmobi.media.D4;
import com.inmobi.media.E4;
import com.inmobi.media.EnumC3568h6;
import com.inmobi.media.H;
import com.inmobi.media.I9;
import com.inmobi.media.Ib;
import com.inmobi.media.J;
import com.inmobi.media.N4;
import com.inmobi.media.O4;
import e.D;
import e.e0;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nInMobiAudio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InMobiAudio.kt\ncom/inmobi/ads/InMobiAudio\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,596:1\n107#2:597\n79#2,22:598\n107#2:620\n79#2,22:621\n*S KotlinDebug\n*F\n+ 1 InMobiAudio.kt\ncom/inmobi/ads/InMobiAudio\n*L\n90#1:597\n90#1:598,22\n95#1:620\n95#1:621,22\n*E\n"})
public final class InMobiAudio extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAdEventListener f151665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3689q1 f151666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f151667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I9 f151668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f151669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f151670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f151671g;

    public static final class a extends AbstractC3633m1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull InMobiAudio audio) {
            super(audio);
            G.p(audio, "audio");
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(@NotNull InMobiAdRequestStatus status) {
            AudioAdEventListener mPubListener$media_release;
            G.p(status, "status");
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
                return;
            }
            mPubListener$media_release.onAdLoadFailed(inMobiAudio, status);
        }

        @Override // com.inmobi.media.AbstractC3633m1, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(@NotNull AdMetaInfo info) {
            G.p(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio == null) {
                return;
            }
            try {
                C3689q1 mAdManager$media_release = inMobiAudio.getMAdManager$media_release();
                if (mAdManager$media_release != null) {
                    mAdManager$media_release.y();
                }
            } catch (IllegalStateException e10) {
                AbstractC3666o6.a((byte) 1, "InMobiAudio", e10.getMessage());
                AudioAdEventListener mPubListener$media_release = inMobiAudio.getMPubListener$media_release();
                if (mPubListener$media_release != null) {
                    mPubListener$media_release.onAdLoadFailed(inMobiAudio, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public InMobiAudio(@org.jetbrains.annotations.NotNull android.content.Context r13, @org.jetbrains.annotations.NotNull android.util.AttributeSet r14) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.ads.InMobiAudio.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static final void a(InMobiAudio this$0) {
        C3689q1 c3689q1;
        G.p(this$0, "this$0");
        try {
            if (this$0.b()) {
                if (!this$0.a() || (c3689q1 = this$0.f151666b) == null) {
                    return;
                }
                c3689q1.b(this$0.getFrameSizeString());
                return;
            }
            AbstractC3666o6.a((byte) 1, "InMobiAudio", "The height or width of the audio ad can not be determined");
            C3689q1 c3689q12 = this$0.f151666b;
            if (c3689q12 != null) {
                c3689q12.a((short) 108);
            }
            C3689q1 c3689q13 = this$0.f151666b;
            if (c3689q13 != null) {
                c3689q13.a(c3689q13.j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        } catch (Exception unused) {
            C3689q1 c3689q14 = this$0.f151666b;
            if (c3689q14 != null) {
                c3689q14.a((short) 105);
            }
            AbstractC3666o6.a((byte) 1, "InMobiAudio", "SDK encountered unexpected error while loading an ad");
        }
    }

    private final String getFrameSizeString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f151670f);
        sb2.append('x');
        sb2.append(this.f151671g);
        return sb2.toString();
    }

    public final boolean b() {
        return this.f151670f > 0 && this.f151671g > 0;
    }

    public final boolean c() {
        if (!b()) {
            if (getLayoutParams() == null) {
                AbstractC3666o6.a((byte) 1, "InMobiAudio", "The layout params of the audio ad view must be set before calling load or call setAudioSize(int widthInDp, int heightInDp) before load");
                return false;
            }
            if (getLayoutParams().width == -2 || getLayoutParams().height == -2) {
                AbstractC3666o6.a((byte) 1, "InMobiAudio", "The height or width of a Audio ad can't be WRAP_CONTENT or call setAudioSize(int widthInDp, int heightInDp) before load");
                return false;
            }
            if (getLayoutParams() != null) {
                this.f151670f = AbstractC3760v3.a(getLayoutParams().width);
                this.f151671g = AbstractC3760v3.a(getLayoutParams().height);
            }
        }
        return true;
    }

    public final void d() {
        C3689q1 c3689q1;
        try {
            LinkedHashMap linkedHashMap = C3773w2.f153489a;
            Config configA = C3745u2.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, C3657nb.b(), null);
            G.n(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
            if (!((AdConfig) configA).getAudio().isAudioEnabled()) {
                C3689q1 c3689q12 = this.f151666b;
                if (c3689q12 != null) {
                    c3689q12.a((short) 107);
                }
                C3689q1 c3689q13 = this.f151666b;
                if (c3689q13 != null) {
                    c3689q13.a(c3689q13.j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.FEATURE_DISABLED));
                }
                AbstractC3666o6.a((byte) 1, "InMobi", "");
                return;
            }
            this.f151668d.f152054e = "NonAB";
            Context context = getContext();
            G.o(context, "getContext(...)");
            a(context);
            C3689q1 c3689q14 = this.f151666b;
            if (c3689q14 != null) {
                C3619l1 c3619l1 = c3689q14.f153283q;
                if (c3619l1 != null ? c3619l1.D0() : false) {
                    C3689q1 c3689q15 = this.f151666b;
                    if (c3689q15 != null) {
                        N4 n4P = c3689q15.p();
                        if (n4P != null) {
                            String str = AbstractC3702r1.f153301a;
                            G.o(str, "access$getTAG$p(...)");
                            ((O4) n4P).b(str, "submitAdLoadFailed " + c3689q15);
                        }
                        C3619l1 c3619l12 = c3689q15.f153284r;
                        if (c3619l12 != null) {
                            c3619l12.b((short) 15);
                        }
                    }
                    AudioAdEventListener audioAdEventListener = this.f151665a;
                    if (audioAdEventListener != null) {
                        audioAdEventListener.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                    }
                    AbstractC3666o6.a((byte) 1, "InMobiAudio", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                    return;
                }
            }
            if (!c()) {
                C3689q1 c3689q16 = this.f151666b;
                if (c3689q16 != null) {
                    c3689q16.a((short) 108);
                }
                C3689q1 c3689q17 = this.f151666b;
                if (c3689q17 != null) {
                    c3689q17.a(c3689q17.j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
                    return;
                }
                return;
            }
            Config configA2 = C3745u2.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, C3657nb.b(), null);
            G.n(configA2, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
            if (((AdConfig) configA2).getAudio().getMinDeviceVolume() > C3635m3.f153124a.a(C3657nb.d(), C3657nb.o())) {
                C3689q1 c3689q18 = this.f151666b;
                if (c3689q18 != null) {
                    c3689q18.a((short) 106);
                }
                C3689q1 c3689q19 = this.f151666b;
                if (c3689q19 != null) {
                    c3689q19.a(c3689q19.j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.DEVICE_AUDIO_LEVEL_LOW));
                    return;
                }
                return;
            }
            if (!b()) {
                Ib.a(new Runnable() { // from class: D5.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        InMobiAudio.a(this.f17678a);
                    }
                }, 200L);
            } else {
                if (!a() || (c3689q1 = this.f151666b) == null) {
                    return;
                }
                c3689q1.b(getFrameSizeString());
            }
        } catch (Exception unused) {
            C3689q1 c3689q110 = this.f151666b;
            if (c3689q110 != null) {
                c3689q110.a((short) 105);
            }
            AbstractC3666o6.a((byte) 1, "InMobiAudio", "Unable to load ad; SDK encountered an unexpected error");
        }
    }

    @e0
    public final void destroy() {
        removeAllViews();
        C3689q1 c3689q1 = this.f151666b;
        if (c3689q1 != null) {
            N4 n4P = c3689q1.p();
            if (n4P != null) {
                String str = AbstractC3702r1.f153301a;
                G.o(str, "access$getTAG$p(...)");
                ((O4) n4P).a(str, "clear " + c3689q1);
            }
            N4 n4P2 = c3689q1.p();
            if (n4P2 != null) {
                String str2 = AbstractC3702r1.f153301a;
                G.o(str2, "access$getTAG$p(...)");
                ((O4) n4P2).c(str2, "unregisterLifecycleCallbacks " + c3689q1);
            }
            C3619l1 c3619l1 = c3689q1.f153281o;
            if (c3619l1 != null) {
                c3619l1.I0();
            }
            C3619l1 c3619l12 = c3689q1.f153282p;
            if (c3619l12 != null) {
                c3619l12.I0();
            }
            C3619l1 c3619l13 = c3689q1.f153281o;
            if (c3619l13 != null) {
                c3619l13.g();
            }
            c3689q1.f153281o = null;
            C3619l1 c3619l14 = c3689q1.f153282p;
            if (c3619l14 != null) {
                c3619l14.g();
            }
            c3689q1.f153282p = null;
            c3689q1.f153283q = null;
            c3689q1.f153284r = null;
            c3689q1.a((Boolean) null);
        }
        this.f151665a = null;
    }

    public final void disableHardwareAcceleration() {
        this.f151668d.f152053d = true;
    }

    @Nullable
    public final C3689q1 getMAdManager$media_release() {
        return this.f151666b;
    }

    @Nullable
    public final AudioAdEventListener getMPubListener$media_release() {
        return this.f151665a;
    }

    @e0
    public final void load() {
        C3689q1 c3689q1 = this.f151666b;
        if (c3689q1 != null) {
            c3689q1.w();
        }
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            C3689q1 c3689q1 = this.f151666b;
            if (c3689q1 != null) {
                c3689q1.x();
            }
            if (getLayoutParams() != null) {
                this.f151670f = AbstractC3760v3.a(getLayoutParams().width);
                this.f151671g = AbstractC3760v3.a(getLayoutParams().height);
            }
            if (!b()) {
                setupViewSizeObserver();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                C3774w3 c3774w3 = AbstractC3760v3.f153433a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                G.o(rootWindowInsets, "getRootWindowInsets(...)");
                AbstractC3760v3.a(rootWindowInsets, context);
            }
        } catch (Exception unused) {
            AbstractC3666o6.a((byte) 1, "InMobiAudio", "InMobiAudio#onAttachedToWindow() handler threw unexpected error");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            C3689q1 c3689q1 = this.f151666b;
            if (c3689q1 != null) {
                N4 n4P = c3689q1.p();
                if (n4P != null) {
                    String str = AbstractC3702r1.f153301a;
                    G.o(str, "access$getTAG$p(...)");
                    ((O4) n4P).c(str, "unregisterLifecycleCallbacks " + c3689q1);
                }
                C3619l1 c3619l1 = c3689q1.f153281o;
                if (c3619l1 != null) {
                    c3619l1.I0();
                }
                C3619l1 c3619l12 = c3689q1.f153282p;
                if (c3619l12 != null) {
                    c3619l12.I0();
                }
            }
        } catch (Exception unused) {
            AbstractC3666o6.a((byte) 1, "InMobiAudio", "InMobiAudio.onDetachedFromWindow() handler threw unexpected error");
        }
    }

    public final void pause() {
        C3689q1 c3689q1;
        try {
            if (this.f151667c != null || (c3689q1 = this.f151666b) == null) {
                return;
            }
            N4 n4P = c3689q1.p();
            if (n4P != null) {
                String str = AbstractC3702r1.f153301a;
                G.o(str, "access$getTAG$p(...)");
                ((O4) n4P).a(str, "pause " + c3689q1);
            }
            C3619l1 c3619l1 = c3689q1.f153283q;
            if (c3619l1 != null) {
                c3619l1.E0();
            }
        } catch (Exception unused) {
            AbstractC3666o6.a((byte) 1, "InMobi", "Could not pause ad; SDK encountered an unexpected error");
        }
    }

    public final void resume() {
        C3689q1 c3689q1;
        try {
            if (this.f151667c != null || (c3689q1 = this.f151666b) == null) {
                return;
            }
            N4 n4P = c3689q1.p();
            if (n4P != null) {
                String str = AbstractC3702r1.f153301a;
                G.o(str, "access$getTAG$p(...)");
                ((O4) n4P).a(str, "resume " + c3689q1);
            }
            C3619l1 c3619l1 = c3689q1.f153283q;
            if (c3619l1 != null) {
                c3619l1.F0();
            }
        } catch (Exception unused) {
            AbstractC3666o6.a((byte) 1, "InMobi", "Could not resume ad; SDK encountered an unexpected error");
        }
    }

    public final void setAudioSize(@D(from = 1) int i10, @D(from = 1) int i11) {
        this.f151670f = i10;
        this.f151671g = i11;
    }

    public final void setContentUrl(@NotNull String contentUrl) {
        G.p(contentUrl, "contentUrl");
        this.f151668d.f152055f = contentUrl;
    }

    public final void setExtras(@Nullable Map<String, String> map) {
        if (map != null) {
            String str = map.get("tp");
            if (str != null) {
                C3671ob.a(str);
            }
            String str2 = map.get("tp-v");
            if (str2 != null) {
                C3671ob.b(str2);
            }
        }
        this.f151668d.f152052c = map;
    }

    public final void setKeywords(@Nullable String str) {
        this.f151668d.f152051b = str;
    }

    public final void setListener(@NotNull AudioAdEventListener listener) {
        G.p(listener, "listener");
        this.f151665a = listener;
    }

    public final void setMAdManager$media_release(@Nullable C3689q1 c3689q1) {
        this.f151666b = c3689q1;
    }

    public final void setMPubListener$media_release(@Nullable AudioAdEventListener audioAdEventListener) {
        this.f151665a = audioAdEventListener;
    }

    @TargetApi(16)
    public final void setupViewSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new E4(this));
    }

    @e0
    public final void show() {
        C3689q1 c3689q1 = this.f151666b;
        if (c3689q1 != null) {
            N4 n4P = c3689q1.p();
            if (n4P != null) {
                String str = AbstractC3702r1.f153301a;
                G.o(str, "access$getTAG$p(...)");
                ((O4) n4P).a(str, "submitAdShowCalled " + c3689q1);
            }
            C3619l1 c3619l1 = c3689q1.f153284r;
            if (c3619l1 != null) {
                c3619l1.w0();
            }
        }
        C3689q1 c3689q12 = this.f151666b;
        if (c3689q12 != null) {
            c3689q12.a(this);
        }
    }

    public final boolean a() {
        C3689q1 c3689q1;
        long j10 = this.f151669e;
        if (j10 != 0 && (c3689q1 = this.f151666b) != null) {
            N4 n4P = c3689q1.p();
            if (n4P != null) {
                String str = AbstractC3702r1.f153301a;
                G.o(str, "access$getTAG$p(...)");
                ((O4) n4P).c(str, "checkForRefreshRate " + c3689q1);
            }
            if (c3689q1.f153284r == null) {
                return false;
            }
            LinkedHashMap linkedHashMap = C3773w2.f153489a;
            int minRefreshInterval = ((AdConfig) D4.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null)).getAudio().getMinRefreshInterval();
            if (SystemClock.elapsedRealtime() - j10 < minRefreshInterval * 1000) {
                c3689q1.a((short) 2175);
                c3689q1.b(c3689q1.f153284r, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minRefreshInterval + " seconds"));
                String str2 = AbstractC3702r1.f153301a;
                G.o(str2, "access$getTAG$p(...)");
                StringBuilder sb2 = new StringBuilder("Ad cannot be refreshed before ");
                sb2.append(minRefreshInterval);
                sb2.append(" seconds (AdPlacement Id = ");
                C3619l1 c3619l1 = c3689q1.f153284r;
                sb2.append(c3619l1 != null ? c3619l1.I() : null);
                sb2.append(')');
                AbstractC3666o6.a((byte) 1, str2, sb2.toString());
                N4 n4P2 = c3689q1.p();
                if (n4P2 == null) {
                    return false;
                }
                StringBuilder sbA = android.support.v4.media.a.a("Ad cannot be refreshed before ", minRefreshInterval, " seconds (AdPlacement Id = ");
                C3619l1 c3619l12 = c3689q1.f153284r;
                sbA.append(c3619l12 != null ? c3619l12.I() : null);
                sbA.append(')');
                ((O4) n4P2).b(str2, sbA.toString());
                return false;
            }
        }
        this.f151669e = SystemClock.elapsedRealtime();
        return true;
    }

    public final void a(Context context) {
        String str;
        C3689q1 c3689q1 = this.f151666b;
        if (c3689q1 != null) {
            I9 pubSettings = this.f151668d;
            String adSize = getFrameSizeString();
            G.p(context, "context");
            G.p(pubSettings, "pubSettings");
            G.p(adSize, "adSize");
            String str2 = AbstractC3702r1.f153301a;
            G.o(str2, "access$getTAG$p(...)");
            H h10 = new H("audio");
            if (context instanceof Activity) {
                str = "activity";
            } else {
                str = "others";
            }
            J jA = h10.d(str).a(pubSettings.f152050a).c(pubSettings.f152051b).a(pubSettings.f152052c).a(adSize).a(pubSettings.f152053d).e(pubSettings.f152054e).b(pubSettings.f152055f).a();
            C3619l1 c3619l1 = c3689q1.f153281o;
            if (c3619l1 != null && c3689q1.f153282p != null) {
                c3619l1.a(context, jA, c3689q1);
                C3619l1 c3619l12 = c3689q1.f153282p;
                if (c3619l12 != null) {
                    c3619l12.a(context, jA, c3689q1);
                }
            } else {
                c3689q1.f153281o = new C3619l1(context, jA, c3689q1);
                c3689q1.f153282p = new C3619l1(context, jA, c3689q1);
                c3689q1.f153284r = c3689q1.f153281o;
            }
            String str3 = pubSettings.f152054e;
            if (str3 != null) {
                N4 n4P = c3689q1.p();
                if (n4P != null) {
                    ((O4) n4P).a();
                }
                EnumC3568h6 enumC3568h6 = C3558ga.f152942a;
                c3689q1.a(C3558ga.a("audio", str3, false));
                N4 n4P2 = c3689q1.p();
                if (n4P2 != null) {
                    ((O4) n4P2).a(str2, "adding audioAdUnit1 to reference tracker");
                }
                C3619l1 c3619l13 = c3689q1.f153281o;
                G.m(c3619l13);
                C3558ga.a(c3619l13, c3689q1.p());
                N4 n4P3 = c3689q1.p();
                if (n4P3 != null) {
                    ((O4) n4P3).a(str2, "adding audioAdUnit2 to reference tracker");
                }
                C3619l1 c3619l14 = c3689q1.f153282p;
                G.m(c3619l14);
                C3558ga.a(c3619l14, c3689q1.p());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAudio(@NotNull Context context, long j10) {
        super(context);
        G.p(context, "context");
        a aVar = new a(this);
        I9 i92 = new I9();
        this.f151668d = i92;
        if (C3657nb.q()) {
            if (context instanceof Activity) {
                this.f151667c = new WeakReference(context);
            }
            this.f151666b = new C3689q1(aVar);
            i92.f152050a = j10;
            a(context);
            return;
        }
        throw new SdkNotInitializedException("InMobiAudio");
    }
}
