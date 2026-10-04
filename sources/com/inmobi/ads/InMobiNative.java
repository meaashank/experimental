package com.inmobi.ads;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.AbstractC3513d7;
import com.inmobi.media.AbstractC3666o6;
import com.inmobi.media.AbstractC3760v3;
import com.inmobi.media.C3511d5;
import com.inmobi.media.C3527e7;
import com.inmobi.media.C3556g8;
import com.inmobi.media.C3625l7;
import com.inmobi.media.C3657nb;
import com.inmobi.media.C3671ob;
import com.inmobi.media.I9;
import com.inmobi.media.K4;
import com.inmobi.media.N4;
import com.inmobi.media.O4;
import com.inmobi.media.R7;
import com.inmobi.media.Xb;
import e.f0;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class InMobiNative {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f151698j = "InMobiNative";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3556g8 f151699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NativeCallbacks f151700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC3513d7 f151701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public VideoEventListener f151702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference f151703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f151704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final I9 f151705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WeakReference f151706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LockScreenListener f151707i;

    public static final class Companion {
        public Companion(C4969v c4969v) {
        }
    }

    public interface LockScreenListener {
        void onActionRequired(@Nullable InMobiNative inMobiNative);
    }

    public static final class NativeCallbacks extends R7 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f151708b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NativeCallbacks(@NotNull InMobiNative inMobiNative) {
            super(inMobiNative);
            G.p(inMobiNative, "inMobiNative");
            this.f151708b = true;
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdClicked(@NotNull Map<Object, ? extends Object> params) {
            G.p(params, "params");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f151698j;
                G.o(str, "access$getTAG$cp(...)");
                AbstractC3666o6.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                AbstractC3513d7 mPubListener = inMobiNative.getMPubListener();
                if (mPubListener != null) {
                    ((C3527e7) mPubListener).f152850a.onAdClicked(inMobiNative);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdDismissed() {
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f151698j;
                G.o(str, "access$getTAG$cp(...)");
                AbstractC3666o6.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                AbstractC3513d7 mPubListener = inMobiNative.getMPubListener();
                if (mPubListener != null) {
                    ((C3527e7) mPubListener).f152850a.onAdFullScreenDismissed(inMobiNative);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdDisplayed(@NotNull AdMetaInfo info) {
            G.p(info, "info");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f151698j;
                G.o(str, "access$getTAG$cp(...)");
                AbstractC3666o6.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                AbstractC3513d7 mPubListener = inMobiNative.getMPubListener();
                if (mPubListener != null) {
                    ((C3527e7) mPubListener).f152850a.onAdFullScreenDisplayed(inMobiNative);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(@NotNull InMobiAdRequestStatus status) {
            G.p(status, "status");
            onAdLoadFailed(status);
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(@NotNull AdMetaInfo info) {
            G.p(info, "info");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f151698j;
                G.o(str, "access$getTAG$cp(...)");
                AbstractC3666o6.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                AbstractC3513d7 mPubListener = inMobiNative.getMPubListener();
                if (mPubListener != null) {
                    mPubListener.a(inMobiNative, info);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdImpressed() {
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f151698j;
                G.o(str, "access$getTAG$cp(...)");
                AbstractC3666o6.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                AbstractC3513d7 mPubListener = inMobiNative.getMPubListener();
                if (mPubListener != null) {
                    ((C3527e7) mPubListener).f152850a.onAdImpressed(inMobiNative);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdImpression(@Nullable Xb xb2) {
            InMobiNative inMobiNative = getNativeRef().get();
            AbstractC3513d7 mPubListener = inMobiNative != null ? inMobiNative.getMPubListener() : null;
            if (mPubListener != null) {
                mPubListener.a(inMobiNative);
                if (xb2 != null) {
                    xb2.d();
                    return;
                }
                return;
            }
            String str = InMobiNative.f151698j;
            G.o(str, "access$getTAG$cp(...)");
            AbstractC3666o6.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            if (xb2 != null) {
                xb2.c();
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdLoadFailed(@NotNull InMobiAdRequestStatus status) {
            G.p(status, "status");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f151698j;
                G.o(str, "access$getTAG$cp(...)");
                AbstractC3666o6.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                if (this.f151708b) {
                    return;
                }
                this.f151708b = true;
                AbstractC3513d7 mPubListener = inMobiNative.getMPubListener();
                if (mPubListener != null) {
                    mPubListener.a(inMobiNative, status);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdLoadSucceeded(@NotNull AdMetaInfo info) {
            G.p(info, "info");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f151698j;
                G.o(str, "access$getTAG$cp(...)");
                AbstractC3666o6.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                if (this.f151708b) {
                    return;
                }
                this.f151708b = true;
                AbstractC3513d7 mPubListener = inMobiNative.getMPubListener();
                if (mPubListener != null) {
                    mPubListener.b(inMobiNative, info);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdWillDisplay() {
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f151698j;
                G.o(str, "access$getTAG$cp(...)");
                AbstractC3666o6.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            LockScreenListener lockScreenListener = inMobiNative.f151707i;
            if (lockScreenListener != null) {
                lockScreenListener.onActionRequired(inMobiNative);
            }
            AbstractC3513d7 mPubListener = inMobiNative.getMPubListener();
            if (mPubListener != null) {
                ((C3527e7) mPubListener).f152850a.onAdFullScreenWillDisplay(inMobiNative);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAudioStateChanged(boolean z10) {
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f151698j;
                G.o(str, "access$getTAG$cp(...)");
                AbstractC3666o6.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                VideoEventListener videoEventListener = inMobiNative.f151702d;
                if (videoEventListener != null) {
                    videoEventListener.onAudioStateChanged(inMobiNative, z10);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onRequestPayloadCreated(@NotNull byte[] request) {
            G.p(request, "request");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f151698j;
                G.o(str, "access$getTAG$cp(...)");
                AbstractC3666o6.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                AbstractC3513d7 mPubListener = inMobiNative.getMPubListener();
                if (mPubListener != null) {
                    ((C3527e7) mPubListener).f152850a.onRequestPayloadCreated(request);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onRequestPayloadCreationFailed(@NotNull InMobiAdRequestStatus reason) {
            G.p(reason, "reason");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f151698j;
                G.o(str, "access$getTAG$cp(...)");
                AbstractC3666o6.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                AbstractC3513d7 mPubListener = inMobiNative.getMPubListener();
                if (mPubListener != null) {
                    ((C3527e7) mPubListener).f152850a.onRequestPayloadCreationFailed(reason);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onUserLeftApplication() {
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f151698j;
                G.o(str, "access$getTAG$cp(...)");
                AbstractC3666o6.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            LockScreenListener lockScreenListener = inMobiNative.f151707i;
            if (lockScreenListener != null) {
                lockScreenListener.onActionRequired(inMobiNative);
            }
            AbstractC3513d7 mPubListener = inMobiNative.getMPubListener();
            if (mPubListener != null) {
                ((C3527e7) mPubListener).f152850a.onUserWillLeaveApplication(inMobiNative);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onVideoCompleted() {
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f151698j;
                G.o(str, "access$getTAG$cp(...)");
                AbstractC3666o6.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                VideoEventListener videoEventListener = inMobiNative.f151702d;
                if (videoEventListener != null) {
                    videoEventListener.onVideoCompleted(inMobiNative);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onVideoSkipped() {
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f151698j;
                G.o(str, "access$getTAG$cp(...)");
                AbstractC3666o6.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                VideoEventListener videoEventListener = inMobiNative.f151702d;
                if (videoEventListener != null) {
                    videoEventListener.onVideoSkipped(inMobiNative);
                }
            }
        }

        public final void resetHasGivenCallbackFlag() {
            this.f151708b = false;
        }
    }

    public InMobiNative(@NotNull Context context, long j10, @NotNull NativeAdEventListener listener) {
        G.p(context, "context");
        G.p(listener, "listener");
        I9 i92 = new I9();
        this.f151705g = i92;
        if (!C3657nb.q()) {
            String TAG = f151698j;
            G.o(TAG, "TAG");
            throw new SdkNotInitializedException(TAG);
        }
        i92.f152050a = j10;
        this.f151706h = new WeakReference(context);
        this.f151701c = new C3527e7(listener);
        NativeCallbacks nativeCallbacks = new NativeCallbacks(this);
        this.f151700b = nativeCallbacks;
        this.f151699a = new C3556g8(nativeCallbacks);
    }

    public final boolean a(boolean z10) {
        if (!z10 && this.f151701c == null) {
            String TAG = f151698j;
            G.o(TAG, "TAG");
            AbstractC3666o6.a((byte) 1, TAG, "Listener supplied is null, your call is ignored.");
            return false;
        }
        if (this.f151706h.get() != null) {
            return true;
        }
        String TAG2 = f151698j;
        G.o(TAG2, "TAG");
        AbstractC3666o6.a((byte) 1, TAG2, "Context supplied is null, your call is ignored.");
        return false;
    }

    public final void destroy() {
        try {
            WeakReference weakReference = this.f151703e;
            View view = weakReference == null ? null : (View) weakReference.get();
            if (view != null) {
                ((ViewGroup) view).removeAllViews();
            }
            this.f151699a.x();
            this.f151701c = null;
            this.f151702d = null;
            this.f151704f = false;
        } catch (Exception e10) {
            String TAG = f151698j;
            G.o(TAG, "TAG");
            AbstractC3666o6.a((byte) 1, TAG, "Failed to destroy ad; SDK encountered an unexpected error");
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    @Nullable
    public final String getAdCtaText() {
        try {
            return this.f151699a.y();
        } catch (Exception e10) {
            String TAG = f151698j;
            G.o(TAG, "TAG");
            AbstractC3666o6.a((byte) 1, TAG, "Could not get the ctaText; SDK encountered unexpected error");
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
            return null;
        }
    }

    @Nullable
    public final String getAdDescription() {
        try {
            return this.f151699a.z();
        } catch (Exception e10) {
            String TAG = f151698j;
            G.o(TAG, "TAG");
            AbstractC3666o6.a((byte) 1, TAG, "Could not get the description; SDK encountered unexpected error");
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
            return null;
        }
    }

    @Nullable
    public final String getAdIconUrl() {
        try {
            return this.f151699a.A();
        } catch (Exception e10) {
            String TAG = f151698j;
            G.o(TAG, "TAG");
            AbstractC3666o6.a((byte) 1, TAG, "Could not get the iconUrl; SDK encountered unexpected error");
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
            return null;
        }
    }

    @Nullable
    public final String getAdLandingPageUrl() {
        try {
            return this.f151699a.B();
        } catch (Exception e10) {
            String TAG = f151698j;
            G.o(TAG, "TAG");
            AbstractC3666o6.a((byte) 1, TAG, "Could not get the adLandingPageUrl; SDK encountered unexpected error");
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
            return null;
        }
    }

    public final float getAdRating() {
        try {
            return this.f151699a.C();
        } catch (Exception e10) {
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
            AbstractC3666o6.a((byte) 1, "InMobi", "Could not get rating; SDK encountered an unexpected error");
            String TAG = f151698j;
            G.o(TAG, "TAG");
            return 0.0f;
        }
    }

    @Nullable
    public final String getAdTitle() {
        try {
            return this.f151699a.D();
        } catch (Exception e10) {
            String TAG = f151698j;
            G.o(TAG, "TAG");
            AbstractC3666o6.a((byte) 1, TAG, "Could not get the ad title; SDK encountered unexpected error");
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
            return null;
        }
    }

    @Nullable
    public final JSONObject getCustomAdContent() {
        try {
            return this.f151699a.E();
        } catch (Exception e10) {
            String TAG = f151698j;
            G.o(TAG, "TAG");
            AbstractC3666o6.a((byte) 1, TAG, "Could not get the ad customJson ; SDK encountered unexpected error");
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
            return null;
        }
    }

    @Nullable
    public final AbstractC3513d7 getMPubListener() {
        return this.f151701c;
    }

    @Nullable
    public final View getPrimaryViewOfWidth(@Nullable Context context, @Nullable View view, @Nullable ViewGroup viewGroup, int i10) {
        try {
            if (context == null) {
                String TAG = f151698j;
                G.o(TAG, "TAG");
                AbstractC3666o6.a((byte) 1, TAG, "View can not be rendered using null context");
                return null;
            }
            C3625l7 c3625l7 = this.f151699a.j() == null ? null : (C3625l7) this.f151699a.j();
            if (c3625l7 == null) {
                String TAG2 = f151698j;
                G.o(TAG2, "TAG");
                AbstractC3666o6.a((byte) 1, TAG2, "InMobiNative is not initialized. Ignoring InMobiNative.getPrimaryView()");
                return null;
            }
            this.f151706h = new WeakReference(context);
            c3625l7.a(context);
            G.m(viewGroup);
            WeakReference weakReference = new WeakReference(c3625l7.a(view, viewGroup, i10));
            this.f151703e = weakReference;
            View view2 = (View) weakReference.get();
            if (view2 != null) {
                this.f151704f = true;
                return view2;
            }
            String TAG3 = f151698j;
            G.o(TAG3, "TAG");
            return null;
        } catch (Exception e10) {
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
            AbstractC3666o6.a((byte) 1, "InMobi", "Could not pause ad; SDK encountered an unexpected error");
            String TAG4 = f151698j;
            G.o(TAG4, "TAG");
            return null;
        }
    }

    public final void getSignals() {
        if (a(false)) {
            this.f151700b.resetHasGivenCallbackFlag();
            Context context = (Context) this.f151706h.get();
            if (context != null) {
                this.f151699a.a(this.f151705g, context, false, "getToken");
            }
            this.f151699a.a(this.f151700b);
        }
    }

    public final boolean isAppDownload() {
        try {
            return this.f151699a.G();
        } catch (Exception e10) {
            String TAG = f151698j;
            G.o(TAG, "TAG");
            AbstractC3666o6.a((byte) 1, TAG, "Could not get isAppDownload; SDK encountered unexpected error");
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
            return false;
        }
    }

    public final boolean isReady() {
        return this.f151699a.F();
    }

    @Nullable
    public final Boolean isVideo() {
        try {
            return this.f151699a.I();
        } catch (Exception e10) {
            String TAG = f151698j;
            G.o(TAG, "TAG");
            AbstractC3666o6.a((byte) 1, TAG, "Could not get isVideo; SDK encountered unexpected error");
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
            return null;
        }
    }

    public final void load(@Nullable byte[] bArr) {
        if (a(false)) {
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC3760v3.c((Context) this.f151706h.get());
            }
            this.f151705g.f152054e = "AB";
            Context context = (Context) this.f151706h.get();
            if (context != null) {
                this.f151699a.a(this.f151705g, context, true, "native");
            }
            this.f151700b.resetHasGivenCallbackFlag();
            this.f151699a.a(bArr, this.f151700b);
        }
    }

    public final void pause() {
        try {
            this.f151699a.K();
        } catch (Exception unused) {
            String TAG = f151698j;
            G.o(TAG, "TAG");
            AbstractC3666o6.a((byte) 1, TAG, "Could not pause ad; SDK encountered an unexpected error");
        }
    }

    public final void reportAdClickAndOpenLandingPage() {
        try {
            this.f151699a.L();
        } catch (Exception e10) {
            String TAG = f151698j;
            G.o(TAG, "TAG");
            AbstractC3666o6.a((byte) 1, TAG, "reportAdClickAndOpenLandingPage failed; SDK encountered unexpected error");
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public final void resume() {
        try {
            this.f151699a.M();
        } catch (Exception unused) {
            String TAG = f151698j;
            G.o(TAG, "TAG");
            AbstractC3666o6.a((byte) 1, TAG, "Could not resume ad; SDK encountered an unexpected error");
        }
    }

    public final void setContentUrl(@Nullable String str) {
        this.f151705g.f152055f = str;
    }

    public final void setExtras(@Nullable Map<String, String> map) {
        if (map != null) {
            C3671ob.a(map.get("tp"));
            C3671ob.b(map.get("tp-v"));
        }
        this.f151705g.f152052c = map;
    }

    public final void setKeywords(@Nullable String str) {
        this.f151705g.f152051b = str;
    }

    public final void setListener(@NotNull NativeAdEventListener listener) {
        G.p(listener, "listener");
        this.f151701c = new C3527e7(listener);
    }

    public final void setMPubListener(@Nullable AbstractC3513d7 abstractC3513d7) {
        this.f151701c = abstractC3513d7;
    }

    @f0
    public final void setPrimaryViewReturned(boolean z10) {
        this.f151704f = z10;
    }

    public final void setVideoEventListener(@NotNull VideoEventListener listener) {
        G.p(listener, "listener");
        this.f151702d = listener;
    }

    public final void showOnLockScreen(@NotNull LockScreenListener lockScreenListener) {
        G.p(lockScreenListener, "lockScreenListener");
        if (this.f151706h.get() == null) {
            String TAG = f151698j;
            G.o(TAG, "TAG");
            AbstractC3666o6.a((byte) 1, TAG, "InMobiNative is not initialized. Provided context is null. Ignoring showOnLockScreen");
            return;
        }
        try {
            C3556g8 c3556g8 = this.f151699a;
            I9 i92 = this.f151705g;
            Object obj = this.f151706h.get();
            G.m(obj);
            c3556g8.a(i92, (Context) obj);
            this.f151707i = lockScreenListener;
        } catch (Exception unused) {
            String TAG2 = f151698j;
            G.o(TAG2, "TAG");
            AbstractC3666o6.a((byte) 1, TAG2, "SDK encountered unexpected error in showOnLockScreen");
        }
    }

    public final void takeAction() {
        try {
            this.f151699a.N();
        } catch (Exception unused) {
            String TAG = f151698j;
            G.o(TAG, "TAG");
            AbstractC3666o6.a((byte) 1, TAG, "SDK encountered unexpected error in takeAction");
        }
    }

    public final void load() {
        try {
            if (a(true)) {
                this.f151700b.resetHasGivenCallbackFlag();
                if (this.f151704f) {
                    C3556g8 c3556g8 = this.f151699a;
                    c3556g8.a(c3556g8.j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
                    String TAG = f151698j;
                    G.o(TAG, "TAG");
                    AbstractC3666o6.a((byte) 1, TAG, "You can call load() on an instance of InMobiNative only once if the ad request has been successful. Ignoring InMobiNative.load()");
                    return;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC3760v3.c((Context) this.f151706h.get());
                }
                this.f151705g.f152054e = "NonAB";
                Context context = (Context) this.f151706h.get();
                if (context != null) {
                    this.f151699a.a(this.f151705g, context, true, "native");
                }
                this.f151699a.J();
            }
        } catch (Exception e10) {
            this.f151699a.a((short) 2192);
            AbstractC3513d7 abstractC3513d7 = this.f151701c;
            if (abstractC3513d7 != null) {
                abstractC3513d7.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            N4 n4P = this.f151699a.p();
            if (n4P != null) {
                String TAG2 = f151698j;
                G.o(TAG2, "TAG");
                ((O4) n4P).a(TAG2, "Load failed with unexpected error: ", e10);
            }
        }
    }

    public final void load(@NotNull Context context) {
        G.p(context, "context");
        if (a(true)) {
            this.f151706h = new WeakReference(context);
            load();
        }
    }
}
