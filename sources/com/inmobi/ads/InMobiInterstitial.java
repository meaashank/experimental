package com.inmobi.ads;

import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.media.AbstractC3666o6;
import com.inmobi.media.AbstractC3706r5;
import com.inmobi.media.AbstractC3760v3;
import com.inmobi.media.C3511d5;
import com.inmobi.media.C3657nb;
import com.inmobi.media.C3671ob;
import com.inmobi.media.C3720s5;
import com.inmobi.media.C3790x5;
import com.inmobi.media.C3804y5;
import com.inmobi.media.I9;
import com.inmobi.media.K4;
import com.inmobi.media.L4;
import e.e0;
import e.f0;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class InMobiInterstitial {

    @NotNull
    public static final L4 Companion = new L4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f151687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f151688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f151689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I9 f151690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f151691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f151692f;
    public C3804y5 mAdManager;
    public AbstractC3706r5 mPubListener;

    public static final class a extends C3790x5 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull InMobiInterstitial interstitial) {
            super(interstitial);
            G.p(interstitial, "interstitial");
        }

        @Override // com.inmobi.media.C3790x5, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.media.C3790x5, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(@NotNull InMobiAdRequestStatus status) {
            AbstractC3706r5 mPubListener$media_release;
            G.p(status, "status");
            InMobiInterstitial inMobiInterstitial = this.f153522a.get();
            if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
                return;
            }
            mPubListener$media_release.a(inMobiInterstitial, status);
        }

        @Override // com.inmobi.media.C3790x5, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(@NotNull AdMetaInfo info) {
            G.p(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiInterstitial inMobiInterstitial = this.f153522a.get();
            if (inMobiInterstitial != null) {
                try {
                    inMobiInterstitial.getMAdManager$media_release().D();
                } catch (IllegalStateException e10) {
                    String strAccess$getTAG$cp = InMobiInterstitial.access$getTAG$cp();
                    G.o(strAccess$getTAG$cp, "access$getTAG$cp(...)");
                    AbstractC3666o6.a((byte) 1, strAccess$getTAG$cp, e10.getMessage());
                    inMobiInterstitial.getMPubListener$media_release().a(inMobiInterstitial, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    public InMobiInterstitial(@NotNull Context context, long j10, @NotNull InterstitialAdEventListener listener) {
        G.p(context, "context");
        G.p(listener, "listener");
        I9 i92 = new I9();
        this.f151690d = i92;
        this.f151691e = new a(this);
        this.f151692f = new f(this);
        if (!C3657nb.q()) {
            throw new SdkNotInitializedException("InMobiInterstitial");
        }
        Context applicationContext = context.getApplicationContext();
        G.o(applicationContext, "getApplicationContext(...)");
        this.f151687a = applicationContext;
        i92.f152050a = j10;
        this.f151689c = new WeakReference(context);
        setMPubListener$media_release(new C3720s5(listener));
        setMAdManager$media_release(new C3804y5());
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiInterstitial";
    }

    public final void disableHardwareAcceleration() {
        this.f151690d.f152053d = true;
    }

    @NotNull
    public final C3804y5 getMAdManager$media_release() {
        C3804y5 c3804y5 = this.mAdManager;
        if (c3804y5 != null) {
            return c3804y5;
        }
        G.S("mAdManager");
        throw null;
    }

    @NotNull
    public final AbstractC3706r5 getMPubListener$media_release() {
        AbstractC3706r5 abstractC3706r5 = this.mPubListener;
        if (abstractC3706r5 != null) {
            return abstractC3706r5;
        }
        G.S("mPubListener");
        throw null;
    }

    @NotNull
    public final PreloadManager getPreloadManager() {
        return this.f151692f;
    }

    public final void getSignals() {
        this.f151690d.f152054e = "AB";
        C3804y5 mAdManager$media_release = getMAdManager$media_release();
        I9 i92 = this.f151690d;
        Context context = this.f151687a;
        if (context == null) {
            G.S("mContext");
            throw null;
        }
        mAdManager$media_release.a(i92, context, false, "getToken");
        getMAdManager$media_release().a(this.f151691e);
    }

    public final boolean isReady() {
        boolean zB = getMAdManager$media_release().B();
        if (!zB) {
            getMAdManager$media_release().E();
        }
        return zB;
    }

    public final void load(@Nullable byte[] bArr) {
        this.f151688b = true;
        this.f151690d.f152054e = "AB";
        C3804y5 mAdManager$media_release = getMAdManager$media_release();
        I9 i92 = this.f151690d;
        Context context = this.f151687a;
        if (context == null) {
            G.S("mContext");
            throw null;
        }
        C3804y5.a(mAdManager$media_release, i92, context, false, null, 12, null);
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC3760v3.c((Context) this.f151689c.get());
        }
        getMAdManager$media_release().a(bArr, this.f151691e);
    }

    @f0
    public final void loadAdUnit() {
        getMAdManager$media_release().c(this.f151691e);
    }

    public final void setContentUrl(@NotNull String contentUrl) {
        G.p(contentUrl, "contentUrl");
        this.f151690d.f152055f = contentUrl;
    }

    public final void setExtras(@Nullable Map<String, String> map) {
        if (map != null) {
            C3671ob.a(map.get("tp"));
            C3671ob.b(map.get("tp-v"));
        }
        this.f151690d.f152052c = map;
    }

    public final void setKeywords(@Nullable String str) {
        this.f151690d.f152051b = str;
    }

    public final void setListener(@NotNull InterstitialAdEventListener listener) {
        G.p(listener, "listener");
        setMPubListener$media_release(new C3720s5(listener));
    }

    public final void setMAdManager$media_release(@NotNull C3804y5 c3804y5) {
        G.p(c3804y5, "<set-?>");
        this.mAdManager = c3804y5;
    }

    public final void setMPubListener$media_release(@NotNull AbstractC3706r5 abstractC3706r5) {
        G.p(abstractC3706r5, "<set-?>");
        this.mPubListener = abstractC3706r5;
    }

    public final void setWatermarkData(@NotNull WatermarkData watermarkData) {
        G.p(watermarkData, "watermarkData");
        getMAdManager$media_release().a(watermarkData);
    }

    @e0
    public final void show() {
        try {
            if (this.f151688b) {
                getMAdManager$media_release().F();
            } else {
                AbstractC3666o6.a((byte) 1, "InMobiInterstitial", "load() must be called before trying to show the ad");
            }
        } catch (Exception e10) {
            AbstractC3666o6.a((byte) 1, "InMobiInterstitial", "Unable to show ad; SDK encountered an unexpected error");
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    @e0
    public final void load() {
        try {
            this.f151688b = true;
            this.f151690d.f152054e = "NonAB";
            C3804y5 mAdManager$media_release = getMAdManager$media_release();
            I9 i92 = this.f151690d;
            Context context = this.f151687a;
            if (context != null) {
                C3804y5.a(mAdManager$media_release, i92, context, false, null, 12, null);
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC3760v3.c((Context) this.f151689c.get());
                }
                loadAdUnit();
                return;
            }
            G.S("mContext");
            throw null;
        } catch (Exception e10) {
            AbstractC3666o6.a((byte) 1, "InMobiInterstitial", "Unable to load ad; SDK encountered an unexpected error");
            getMAdManager$media_release().a((short) 2000);
            getMAdManager$media_release().a(getMAdManager$media_release().j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }
}
