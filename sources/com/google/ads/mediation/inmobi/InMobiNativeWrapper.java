package com.google.ads.mediation.inmobi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.VideoEventListener;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class InMobiNativeWrapper {
    private final InMobiNative inMobiNative;

    public InMobiNativeWrapper(InMobiNative inMobiNative) {
        this.inMobiNative = inMobiNative;
    }

    @Nullable
    public String getAdCtaText() {
        return this.inMobiNative.getAdCtaText();
    }

    @Nullable
    public String getAdDescription() {
        return this.inMobiNative.getAdDescription();
    }

    @Nullable
    public String getAdIconUrl() {
        return this.inMobiNative.getAdIconUrl();
    }

    @Nullable
    public String getAdLandingPageUrl() {
        return this.inMobiNative.getAdLandingPageUrl();
    }

    @Nullable
    public String getAdTitle() {
        return this.inMobiNative.getAdTitle();
    }

    @Nullable
    public JSONObject getCustomAdContent() {
        return this.inMobiNative.getCustomAdContent();
    }

    public InMobiNative getInMobiNative() {
        return this.inMobiNative;
    }

    @Nullable
    public View getPrimaryViewOfWidth(Context context, View view, ViewGroup viewGroup, Integer num) {
        return this.inMobiNative.getPrimaryViewOfWidth(context, view, viewGroup, num.intValue());
    }

    @Nullable
    public Boolean isVideo() {
        return this.inMobiNative.isVideo();
    }

    public void load() {
        this.inMobiNative.load();
    }

    public void pause() {
        this.inMobiNative.pause();
    }

    public void reportAdClickAndOpenLandingPage() {
        this.inMobiNative.reportAdClickAndOpenLandingPage();
    }

    public void resume() {
        this.inMobiNative.resume();
    }

    public void setExtras(Map<String, String> map) {
        this.inMobiNative.setExtras(map);
    }

    public void setKeywords(String str) {
        this.inMobiNative.setKeywords(str);
    }

    public void setVideoEventListener(VideoEventListener videoEventListener) {
        this.inMobiNative.setVideoEventListener(videoEventListener);
    }

    public void load(byte[] bArr) {
        this.inMobiNative.load(bArr);
    }
}
