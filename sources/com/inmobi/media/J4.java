package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class J4 extends E1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final J4 f152122c = new J4();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f152123d = new AtomicBoolean(true);

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        AtomicBoolean atomicBoolean = f152123d;
        jSONObject.put("a-audioBannerEnabled", String.valueOf(atomicBoolean.get()));
        if (atomicBoolean.get()) {
            long j10 = this.f151896a / 1000;
            if (j10 != 0) {
                jSONObject.put("a-lastAudioBannerPlayedTs", String.valueOf(j10));
            }
            int i10 = this.f151897b;
            if (i10 > 0) {
                jSONObject.put("a-audioBannerFreq", String.valueOf(i10));
            }
            Context contextD = C3657nb.d();
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = K5.f152164b;
                int i11 = J5.a(contextD, "banner_audio_pref_file").f152165a.getInt("user_mute_count", -1);
                if (i11 > 0) {
                    jSONObject.put("a-b-umc", String.valueOf(i11));
                }
            }
        }
        return jSONObject;
    }
}
