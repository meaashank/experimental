package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;

/* JADX INFO: loaded from: classes5.dex */
public final class F2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Config f151915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f151916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3815z2 f151917c;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[PHI: r5
      0x0027: PHI (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:9:0x0020, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public F2(org.json.JSONObject r7, com.inmobi.commons.core.configs.Config r8) {
        /*
            r6 = this;
            java.lang.String r0 = "config"
            kotlin.jvm.internal.G.p(r8, r0)
            r6.<init>()
            r6.f151915a = r8
            r0 = -1
            r6.f151916b = r0
            if (r7 == 0) goto La8
            r1 = 2
            java.lang.String r2 = "status"
            int r2 = r7.getInt(r2)     // Catch: org.json.JSONException -> L5b
            r3 = 304(0x130, float:4.26E-43)
            r4 = 200(0xc8, float:2.8E-43)
            if (r2 == r4) goto L2b
            if (r2 == r3) goto L29
            r5 = 404(0x194, float:5.66E-43)
            if (r2 == r5) goto L27
            r5 = 500(0x1f4, float:7.0E-43)
            if (r2 == r5) goto L27
            goto L2c
        L27:
            r0 = r5
            goto L2c
        L29:
            r0 = r3
            goto L2c
        L2b:
            r0 = r4
        L2c:
            r6.f151916b = r0     // Catch: org.json.JSONException -> L5b
            if (r0 != r4) goto L80
            java.lang.String r0 = "content"
            org.json.JSONObject r7 = r7.getJSONObject(r0)     // Catch: org.json.JSONException -> L5b
            com.inmobi.media.o2 r0 = com.inmobi.commons.core.configs.Config.Companion     // Catch: org.json.JSONException -> L5b
            java.lang.String r2 = r8.getType()     // Catch: org.json.JSONException -> L5b
            kotlin.jvm.internal.G.m(r7)     // Catch: org.json.JSONException -> L5b
            java.lang.String r8 = r8.getAccountId$media_release()     // Catch: org.json.JSONException -> L5b
            long r3 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L5b
            r0.getClass()     // Catch: org.json.JSONException -> L5b
            com.inmobi.commons.core.configs.Config r7 = com.inmobi.media.C3662o2.a(r2, r7, r8, r3)     // Catch: org.json.JSONException -> L5b
            if (r7 != 0) goto L5d
            com.inmobi.media.z2 r7 = new com.inmobi.media.z2     // Catch: org.json.JSONException -> L5b
            java.lang.String r8 = "The received config has failed backend contract."
            r0 = 3
            r7.<init>(r0, r8)     // Catch: org.json.JSONException -> L5b
            r6.f151917c = r7     // Catch: org.json.JSONException -> L5b
            goto L5f
        L5b:
            r7 = move-exception
            goto L94
        L5d:
            r6.f151915a = r7     // Catch: org.json.JSONException -> L5b
        L5f:
            com.inmobi.commons.core.configs.Config r7 = r6.f151915a     // Catch: org.json.JSONException -> L5b
            r7.getType()     // Catch: org.json.JSONException -> L5b
            com.inmobi.commons.core.configs.Config r7 = r6.f151915a     // Catch: org.json.JSONException -> L5b
            r7.isValid()     // Catch: org.json.JSONException -> L5b
            com.inmobi.commons.core.configs.Config r7 = r6.f151915a     // Catch: org.json.JSONException -> L5b
            boolean r7 = r7.isValid()     // Catch: org.json.JSONException -> L5b
            if (r7 != 0) goto La8
            com.inmobi.media.z2 r7 = new com.inmobi.media.z2     // Catch: org.json.JSONException -> L5b
            java.lang.String r8 = "The received config has failed validation."
            r7.<init>(r1, r8)     // Catch: org.json.JSONException -> L5b
            com.inmobi.commons.core.configs.Config r8 = r6.f151915a     // Catch: org.json.JSONException -> L5b
            r8.getType()     // Catch: org.json.JSONException -> L5b
            r6.f151917c = r7     // Catch: org.json.JSONException -> L5b
            return
        L80:
            if (r0 != r3) goto L86
            r8.getType()     // Catch: org.json.JSONException -> L5b
            return
        L86:
            com.inmobi.media.z2 r7 = new com.inmobi.media.z2     // Catch: org.json.JSONException -> L5b
            java.lang.String r0 = "Internal error"
            r2 = 1
            r7.<init>(r2, r0)     // Catch: org.json.JSONException -> L5b
            r8.getType()     // Catch: org.json.JSONException -> L5b
            r6.f151917c = r7     // Catch: org.json.JSONException -> L5b
            return
        L94:
            com.inmobi.media.z2 r8 = new com.inmobi.media.z2
            java.lang.String r7 = r7.getLocalizedMessage()
            if (r7 != 0) goto L9e
            java.lang.String r7 = "Exception in config validation"
        L9e:
            r8.<init>(r1, r7)
            com.inmobi.commons.core.configs.Config r7 = r6.f151915a
            r7.getType()
            r6.f151917c = r8
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.F2.<init>(org.json.JSONObject, com.inmobi.commons.core.configs.Config):void");
    }
}
