package com.inmobi.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.media.A1;
import com.inmobi.media.AbstractC3666o6;
import com.inmobi.media.AbstractC3730t1;
import com.inmobi.media.AbstractC3760v3;
import com.inmobi.media.B1;
import com.inmobi.media.C3657nb;
import com.inmobi.media.C3671ob;
import com.inmobi.media.C3744u1;
import com.inmobi.media.C3774w3;
import com.inmobi.media.D1;
import com.inmobi.media.EnumC3675p1;
import com.inmobi.media.G4;
import com.inmobi.media.H4;
import com.inmobi.media.I4;
import com.inmobi.media.I9;
import com.inmobi.media.Ib;
import com.inmobi.media.N4;
import com.inmobi.media.O4;
import e.D;
import e.e0;
import ed.InterfaceC4376a;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nInMobiBanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InMobiBanner.kt\ncom/inmobi/ads/InMobiBanner\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,774:1\n107#2:775\n79#2,22:776\n107#2:798\n79#2,22:799\n107#2:821\n79#2,22:822\n1#3:844\n*S KotlinDebug\n*F\n+ 1 InMobiBanner.kt\ncom/inmobi/ads/InMobiBanner\n*L\n139#1:775\n139#1:776,22\n156#1:798\n156#1:799,22\n161#1:821\n161#1:822,22\n*E\n"})
public final class InMobiBanner extends RelativeLayout {

    @NotNull
    public static final G4 Companion = new G4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC3730t1 f151672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AudioListener f151673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EnumC3675p1 f151674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public D1 f151675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f151676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f151677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f151678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final B1 f151679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f151680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f151681j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AnimationType f151682k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f151683l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public WeakReference f151684m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final I9 f151685n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e f151686o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AnimationType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ AnimationType[] $VALUES;
        public static final AnimationType ANIMATION_OFF = new AnimationType("ANIMATION_OFF", 0);
        public static final AnimationType ROTATE_HORIZONTAL_AXIS = new AnimationType("ROTATE_HORIZONTAL_AXIS", 1);
        public static final AnimationType ANIMATION_ALPHA = new AnimationType("ANIMATION_ALPHA", 2);
        public static final AnimationType ROTATE_VERTICAL_AXIS = new AnimationType("ROTATE_VERTICAL_AXIS", 3);

        private static final /* synthetic */ AnimationType[] $values() {
            return new AnimationType[]{ANIMATION_OFF, ROTATE_HORIZONTAL_AXIS, ANIMATION_ALPHA, ROTATE_VERTICAL_AXIS};
        }

        static {
            AnimationType[] animationTypeArr$values = $values();
            $VALUES = animationTypeArr$values;
            $ENTRIES = kotlin.enums.c.c(animationTypeArr$values);
        }

        private AnimationType(String str, int i10) {
        }

        @NotNull
        public static kotlin.enums.a<AnimationType> getEntries() {
            return $ENTRIES;
        }

        public static AnimationType valueOf(String str) {
            return (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) $VALUES.clone();
        }
    }

    public static final class a extends A1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull InMobiBanner banner) {
            super(banner);
            G.p(banner, "banner");
        }

        @Override // com.inmobi.media.A1, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.media.A1, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(@NotNull InMobiAdRequestStatus status) {
            G.p(status, "status");
            InMobiBanner inMobiBanner = a().get();
            if (inMobiBanner == null) {
                return;
            }
            AbstractC3730t1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
            if (mPubListener$media_release != null) {
                mPubListener$media_release.a(inMobiBanner, status);
            }
            inMobiBanner.scheduleRefresh$media_release();
        }

        @Override // com.inmobi.media.A1, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(@NotNull AdMetaInfo info) {
            G.p(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiBanner inMobiBanner = a().get();
            if (inMobiBanner != null) {
                try {
                    D1 mAdManager$media_release = inMobiBanner.getMAdManager$media_release();
                    if (mAdManager$media_release != null) {
                        mAdManager$media_release.G();
                    }
                } catch (IllegalStateException e10) {
                    String strAccess$getTAG$cp = InMobiBanner.access$getTAG$cp();
                    G.o(strAccess$getTAG$cp, "access$getTAG$cp(...)");
                    AbstractC3666o6.a((byte) 1, strAccess$getTAG$cp, e10.getMessage());
                    AbstractC3730t1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
                    if (mPubListener$media_release != null) {
                        mPubListener$media_release.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public InMobiBanner(@org.jetbrains.annotations.NotNull android.content.Context r13, @org.jetbrains.annotations.NotNull android.util.AttributeSet r14) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.ads.InMobiBanner.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static final boolean access$checkForRefreshRate(InMobiBanner inMobiBanner) {
        D1 d12;
        long j10 = inMobiBanner.f151683l;
        if (j10 != 0 && (d12 = inMobiBanner.f151675d) != null && !d12.a(j10)) {
            return false;
        }
        inMobiBanner.f151683l = SystemClock.elapsedRealtime();
        return true;
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiBanner";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFrameSizeString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f151680i);
        sb2.append('x');
        sb2.append(this.f151681j);
        return sb2.toString();
    }

    public final boolean a(boolean z10) {
        N4 n4P;
        N4 n4P2;
        D1 d12 = this.f151675d;
        if (d12 != null && (n4P2 = d12.p()) != null) {
            ((O4) n4P2).c("InMobiBanner", "checkStateAndLogError");
        }
        if (!z10 || this.f151672a != null) {
            return true;
        }
        D1 d13 = this.f151675d;
        if (d13 == null || (n4P = d13.p()) == null) {
            return false;
        }
        ((O4) n4P).b("InMobiBanner", "Listener supplied is null, Ignoring your call.");
        return false;
    }

    public final boolean b() {
        return this.f151680i > 0 && this.f151681j > 0;
    }

    @e0
    public final void destroy() {
        a();
        removeAllViews();
        D1 d12 = this.f151675d;
        if (d12 != null) {
            d12.z();
        }
        this.f151672a = null;
    }

    public final void disableHardwareAcceleration() {
        this.f151685n.f152053d = true;
    }

    @NotNull
    public final EnumC3675p1 getAudioStatusInternal$media_release() {
        return this.f151674c;
    }

    @Nullable
    public final D1 getMAdManager$media_release() {
        return this.f151675d;
    }

    @Nullable
    public final AudioListener getMAudioListener$media_release() {
        return this.f151673b;
    }

    @Nullable
    public final AbstractC3730t1 getMPubListener$media_release() {
        return this.f151672a;
    }

    @NotNull
    public final I9 getMPubSettings$media_release() {
        return this.f151685n;
    }

    public final long getPlacementId() {
        return this.f151685n.f152050a;
    }

    @NotNull
    public final PreloadManager getPreloadManager() {
        return this.f151686o;
    }

    public final void getSignals() {
        N4 n4P;
        if (a(true)) {
            if (!a("getSignals()")) {
                this.f151676e.onRequestPayloadCreationFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
                return;
            }
            D1 d12 = this.f151675d;
            if (d12 == null || !d12.D()) {
                Context context = getContext();
                G.o(context, "getContext(...)");
                a(context, "getToken");
            }
            D1 d13 = this.f151675d;
            if (d13 != null && (n4P = d13.p()) != null) {
                ((O4) n4P).a("InMobiBanner", "getSignals");
            }
            setEnableAutoRefresh(false);
            D1 d14 = this.f151675d;
            if (d14 != null) {
                d14.a(this.f151676e);
            }
        }
    }

    public final boolean isAudioAd() {
        D1 d12 = this.f151675d;
        if (d12 != null) {
            return d12.C();
        }
        return false;
    }

    public final void load(@Nullable byte[] bArr) {
        D1 d12;
        D1 d13;
        if (a(false)) {
            this.f151685n.f152054e = "AB";
            if (getLayoutParams() != null) {
                this.f151680i = AbstractC3760v3.a(getLayoutParams().width);
                this.f151681j = AbstractC3760v3.a(getLayoutParams().height);
            }
            D1 d14 = this.f151675d;
            if (d14 == null || !d14.D() || ((d12 = this.f151675d) != null && d12.D() && (d13 = this.f151675d) != null && d13.q() == 0)) {
                Context context = getContext();
                G.o(context, "getContext(...)");
                a(context, "banner");
            }
            D1 d15 = this.f151675d;
            if (d15 != null) {
                d15.w();
            }
            a("load(byte[])", new d(this, bArr));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        N4 n4P;
        try {
            super.onAttachedToWindow();
            D1 d12 = this.f151675d;
            if (d12 != null) {
                d12.F();
            }
            if (getLayoutParams() != null) {
                this.f151680i = AbstractC3760v3.a(getLayoutParams().width);
                this.f151681j = AbstractC3760v3.a(getLayoutParams().height);
            }
            if (!b()) {
                setupBannerSizeObserver();
            }
            scheduleRefresh$media_release();
            if (Build.VERSION.SDK_INT >= 29) {
                C3774w3 c3774w3 = AbstractC3760v3.f153433a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                G.o(rootWindowInsets, "getRootWindowInsets(...)");
                AbstractC3760v3.a(rootWindowInsets, context);
            }
        } catch (Exception e10) {
            D1 d13 = this.f151675d;
            if (d13 == null || (n4P = d13.p()) == null) {
                return;
            }
            ((O4) n4P).a("InMobiBanner", "InMobiBanner#onAttachedToWindow() handler threw unexpected error: ", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        N4 n4P;
        try {
            super.onDetachedFromWindow();
            a();
            D1 d12 = this.f151675d;
            if (d12 != null) {
                d12.K();
            }
        } catch (Exception e10) {
            D1 d13 = this.f151675d;
            if (d13 == null || (n4P = d13.p()) == null) {
                return;
            }
            ((O4) n4P).a("InMobiBanner", "InMobiBanner.onDetachedFromWindow() handler threw unexpected error: ", e10);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int i10) {
        N4 n4P;
        G.p(changedView, "changedView");
        try {
            super.onVisibilityChanged(changedView, i10);
            if (i10 == 0) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e10) {
            D1 d12 = this.f151675d;
            if (d12 == null || (n4P = d12.p()) == null) {
                return;
            }
            ((O4) n4P).a("InMobiBanner", "InMobiBanner$1.onVisibilityChanged() handler threw unexpected error: ", e10);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        N4 n4P;
        try {
            super.onWindowFocusChanged(z10);
            if (z10) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e10) {
            D1 d12 = this.f151675d;
            if (d12 == null || (n4P = d12.p()) == null) {
                return;
            }
            ((O4) n4P).a("InMobiBanner", "InMobiBanner$1.onWindowFocusChanged() handler threw unexpected error: ", e10);
        }
    }

    public final void pause() {
        N4 n4P;
        D1 d12;
        try {
            if (this.f151684m != null || (d12 = this.f151675d) == null) {
                return;
            }
            d12.E();
        } catch (Exception e10) {
            D1 d13 = this.f151675d;
            if (d13 == null || (n4P = d13.p()) == null) {
                return;
            }
            ((O4) n4P).a("InMobiBanner", "SDK encountered unexpected error in pausing ad; ", e10);
        }
    }

    public final void refreshBanner$media_release() {
        a(this.f151676e, "NonAB", true);
    }

    public final void resume() {
        N4 n4P;
        D1 d12;
        try {
            if (this.f151684m != null || (d12 = this.f151675d) == null) {
                return;
            }
            d12.H();
        } catch (Exception e10) {
            D1 d13 = this.f151675d;
            if (d13 == null || (n4P = d13.p()) == null) {
                return;
            }
            ((O4) n4P).a("InMobiBanner", "SDK encountered unexpected error in resuming ad; ", e10);
        }
    }

    public final void scheduleRefresh$media_release() {
        B1 b12;
        if (isShown() && hasWindowFocus()) {
            B1 b13 = this.f151679h;
            if (b13 != null) {
                b13.removeMessages(1);
            }
            D1 d12 = this.f151675d;
            if (d12 == null || !d12.y() || !this.f151678g || (b12 = this.f151679h) == null) {
                return;
            }
            b12.sendEmptyMessageDelayed(1, this.f151677f * 1000);
        }
    }

    public final void setAnimationType(@NotNull AnimationType animationType) {
        G.p(animationType, "animationType");
        this.f151682k = animationType;
    }

    public final void setAudioListener(@NotNull AudioListener audioListener) {
        G.p(audioListener, "audioListener");
        this.f151673b = audioListener;
        EnumC3675p1 item = this.f151674c;
        if (item != EnumC3675p1.f153253d) {
            EnumC3675p1.f153251b.getClass();
            G.p(item, "item");
            int iOrdinal = item.ordinal();
            audioListener.onAudioStatusChanged(this, iOrdinal != 1 ? iOrdinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED : AudioStatus.PLAYING);
        }
    }

    public final void setAudioStatusInternal$media_release(@NotNull EnumC3675p1 enumC3675p1) {
        G.p(enumC3675p1, "<set-?>");
        this.f151674c = enumC3675p1;
    }

    public final void setBannerSize(@D(from = 1) int i10, @D(from = 1) int i11) {
        this.f151680i = i10;
        this.f151681j = i11;
    }

    public final void setContentUrl(@NotNull String contentUrl) {
        G.p(contentUrl, "contentUrl");
        this.f151685n.f152055f = contentUrl;
    }

    public final void setEnableAutoRefresh(boolean z10) {
        N4 n4P;
        try {
            if (this.f151678g == z10) {
                return;
            }
            this.f151678g = z10;
            if (z10) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e10) {
            D1 d12 = this.f151675d;
            if (d12 == null || (n4P = d12.p()) == null) {
                return;
            }
            ((O4) n4P).a("InMobiBanner", "Setting up auto-refresh failed with unexpected error: ", e10);
        }
    }

    public final void setExtras(@Nullable Map<String, String> map) {
        if (map != null) {
            C3671ob.a(map.get("tp"));
            C3671ob.b(map.get("tp-v"));
        }
        this.f151685n.f152052c = map;
    }

    public final void setKeywords(@Nullable String str) {
        this.f151685n.f152051b = str;
    }

    public final void setListener(@NotNull BannerAdEventListener listener) {
        G.p(listener, "listener");
        this.f151672a = new C3744u1(listener);
    }

    public final void setMAdManager$media_release(@Nullable D1 d12) {
        this.f151675d = d12;
    }

    public final void setMAudioListener$media_release(@Nullable AudioListener audioListener) {
        this.f151673b = audioListener;
    }

    public final void setMPubListener$media_release(@Nullable AbstractC3730t1 abstractC3730t1) {
        this.f151672a = abstractC3730t1;
    }

    public final void setRefreshInterval(int i10) {
        N4 n4P;
        try {
            this.f151685n.f152054e = "NonAB";
            Context context = getContext();
            G.o(context, "getContext(...)");
            a(context, "banner");
            D1 d12 = this.f151675d;
            this.f151677f = d12 != null ? d12.a(i10, this.f151677f) : 0;
        } catch (Exception e10) {
            D1 d13 = this.f151675d;
            if (d13 == null || (n4P = d13.p()) == null) {
                return;
            }
            ((O4) n4P).a("InMobiBanner", "Setting refresh interval failed with unexpected error: ", e10);
        }
    }

    public final void setWatermarkData(@NotNull WatermarkData watermarkData) {
        G.p(watermarkData, "watermarkData");
        D1 d12 = this.f151675d;
        if (d12 != null) {
            d12.a(watermarkData);
        }
    }

    @TargetApi(16)
    public final void setupBannerSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new I4(this));
    }

    @e0
    public final void swapAdUnitsAndDisplayAd$media_release() {
        N4 n4P;
        D1 d12 = this.f151675d;
        if (d12 != null) {
            d12.J();
        }
        try {
            Animation animationA = b.a(this.f151682k, getWidth(), getHeight());
            D1 d13 = this.f151675d;
            if (d13 != null) {
                d13.a(this);
            }
            if (animationA != null) {
                startAnimation(animationA);
            }
        } catch (Exception e10) {
            D1 d14 = this.f151675d;
            if (d14 == null || (n4P = d14.p()) == null) {
                return;
            }
            ((O4) n4P).a("InMobiBanner", "Unexpected error while displaying Banner Ad : ", e10);
        }
    }

    public final void a(PublisherCallbacks publisherCallbacks, String str, boolean z10) {
        N4 n4P;
        N4 n4P2;
        N4 n4P3;
        N4 n4P4;
        N4 n4P5;
        try {
            this.f151685n.f152054e = str;
            D1 d12 = this.f151675d;
            if (d12 != null && d12.B()) {
                D1 d13 = this.f151675d;
                if (d13 != null) {
                    d13.w();
                }
                D1 d14 = this.f151675d;
                if (d14 != null && (n4P5 = d14.p()) != null) {
                    ((O4) n4P5).a("InMobiBanner", "load called - placementType - " + str + ' ' + this);
                }
                D1 d15 = this.f151675d;
                if (d15 != null && (n4P4 = d15.p()) != null) {
                    ((O4) n4P4).b("InMobiBanner", "load already in progress");
                }
                D1 d16 = this.f151675d;
                if (d16 != null) {
                    d16.b((short) 2169);
                }
                AbstractC3730t1 abstractC3730t1 = this.f151672a;
                if (abstractC3730t1 != null) {
                    abstractC3730t1.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                }
                D1 d17 = this.f151675d;
                if (d17 != null && (n4P3 = d17.p()) != null) {
                    ((O4) n4P3).b("InMobiBanner", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                }
                AbstractC3666o6.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                return;
            }
            Context context = getContext();
            G.o(context, "getContext(...)");
            a(context, "banner");
            D1 d18 = this.f151675d;
            if (d18 != null) {
                d18.w();
            }
            D1 d19 = this.f151675d;
            if (d19 != null && (n4P2 = d19.p()) != null) {
                ((O4) n4P2).a("InMobiBanner", "load called - placementType - " + str + ' ' + this);
            }
            a("load", new H4(this, publisherCallbacks, z10));
        } catch (Exception e10) {
            D1 d110 = this.f151675d;
            if (d110 != null) {
                d110.a((short) 2172);
            }
            AbstractC3730t1 abstractC3730t12 = this.f151672a;
            if (abstractC3730t12 != null) {
                abstractC3730t12.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            D1 d111 = this.f151675d;
            if (d111 == null || (n4P = d111.p()) == null) {
                return;
            }
            ((O4) n4P).a("InMobiBanner", "Load failed with unexpected error: ", e10);
        }
    }

    @e0
    public final void load() {
        if (a(false)) {
            a(this.f151676e, "NonAB", false);
        }
    }

    @e0
    public final void load(@NotNull Context context) {
        G.p(context, "context");
        if (a(false)) {
            this.f151684m = context instanceof Activity ? new WeakReference(context) : null;
            a(this.f151676e, "NonAB", false);
        }
    }

    public final void a(String str, final InterfaceC4376a interfaceC4376a) {
        N4 n4P;
        N4 n4P2;
        D1 d12 = this.f151675d;
        if (d12 != null && (n4P2 = d12.p()) != null) {
            ((O4) n4P2).c("InMobiBanner", "validateSizeAndLoad");
        }
        if (!a(str)) {
            D1 d13 = this.f151675d;
            if (d13 != null && (n4P = d13.p()) != null) {
                ((O4) n4P).b("InMobiBanner", "invalid banner size. fail.");
            }
            D1 d14 = this.f151675d;
            if (d14 != null) {
                d14.a((short) 2170);
            }
            AbstractC3730t1 abstractC3730t1 = this.f151672a;
            if (abstractC3730t1 != null) {
                abstractC3730t1.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
                return;
            }
            return;
        }
        if (!b()) {
            Ib.a(new Runnable() { // from class: D5.b
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiBanner.a(this.f17679a, interfaceC4376a);
                }
            }, 200L);
        } else {
            interfaceC4376a.invoke();
        }
    }

    public static final void a(InMobiBanner this$0, InterfaceC4376a onSuccess) {
        N4 n4P;
        N4 n4P2;
        G.p(this$0, "this$0");
        G.p(onSuccess, "$onSuccess");
        try {
            if (this$0.b()) {
                onSuccess.invoke();
                return;
            }
            D1 d12 = this$0.f151675d;
            if (d12 != null && (n4P2 = d12.p()) != null) {
                ((O4) n4P2).b("InMobiBanner", "The height or width of the banner can not be determined");
            }
            D1 d13 = this$0.f151675d;
            if (d13 != null) {
                d13.a((short) 2171);
            }
            AbstractC3730t1 abstractC3730t1 = this$0.f151672a;
            if (abstractC3730t1 != null) {
                abstractC3730t1.a(this$0, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
            }
        } catch (Exception e10) {
            D1 d14 = this$0.f151675d;
            if (d14 != null) {
                d14.a((short) 2172);
            }
            AbstractC3730t1 abstractC3730t12 = this$0.f151672a;
            if (abstractC3730t12 != null) {
                abstractC3730t12.a(this$0, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            D1 d15 = this$0.f151675d;
            if (d15 == null || (n4P = d15.p()) == null) {
                return;
            }
            ((O4) n4P).a("InMobiBanner", "InMobiBanner$4.run() threw unexpected error: ", e10);
        }
    }

    public final boolean a(String str) {
        N4 n4P;
        N4 n4P2;
        if (b()) {
            return true;
        }
        if (getLayoutParams() == null) {
            D1 d12 = this.f151675d;
            if (d12 != null && (n4P2 = d12.p()) != null) {
                ((O4) n4P2).b("InMobiBanner", androidx.fragment.app.G.a("The layout params of the banner must be set before calling ", str, " or call setBannerSize(int widthInDp, int heightInDp) before ", str));
            }
            return false;
        }
        if (getLayoutParams().width != -2 && getLayoutParams().height != -2) {
            if (getLayoutParams() == null) {
                return true;
            }
            this.f151680i = AbstractC3760v3.a(getLayoutParams().width);
            this.f151681j = AbstractC3760v3.a(getLayoutParams().height);
            return true;
        }
        D1 d13 = this.f151675d;
        if (d13 != null && (n4P = d13.p()) != null) {
            ((O4) n4P).b("InMobiBanner", "The height or width of a Banner ad can't be WRAP_CONTENT or call setBannerSize(int widthInDp, int heightInDp) before ".concat(str));
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiBanner(@NotNull Context context, long j10) {
        super(context);
        G.p(context, "context");
        this.f151674c = EnumC3675p1.f153253d;
        this.f151676e = new a(this);
        this.f151678g = true;
        this.f151682k = AnimationType.ROTATE_HORIZONTAL_AXIS;
        I9 i92 = new I9();
        this.f151685n = i92;
        this.f151686o = new e(this);
        if (C3657nb.q()) {
            if (context instanceof Activity) {
                this.f151684m = new WeakReference(context);
            }
            this.f151675d = new D1();
            i92.f152050a = j10;
            a(context, "banner");
            D1 d12 = this.f151675d;
            this.f151677f = d12 != null ? d12.A() : 0;
            this.f151679h = new B1(this);
            return;
        }
        throw new SdkNotInitializedException("InMobiBanner");
    }

    public final void a(Context context, String str) {
        int iA;
        D1 d12 = this.f151675d;
        if (d12 != null) {
            d12.a(context, this.f151685n, getFrameSizeString(), str);
        }
        D1 d13 = this.f151675d;
        if (d13 != null) {
            int i10 = this.f151677f;
            iA = d13.a(i10, i10);
        } else {
            iA = 0;
        }
        this.f151677f = iA;
    }

    public final void a() {
        B1 b12 = this.f151679h;
        if (b12 != null) {
            b12.removeMessages(1);
        }
    }
}
