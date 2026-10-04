package com.inmobi.media;

import com.android.launcher3.IconCache;
import com.iab.omid.library.inmobi.adsession.Partner;

/* JADX INFO: renamed from: com.inmobi.media.r9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3710r9 extends AbstractC3697q9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Partner f153317b = Partner.createPartner("Inmobi", "a".concat(kotlin.text.F.B2("10.8.0", IconCache.EMPTY_CLASS_NAME, "", false, 4, null)));

    /* JADX WARN: Removed duplicated region for block: B:11:0x0014 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x0004, B:6:0x000a, B:12:0x0019, B:11:0x0014), top: B:16:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.inmobi.commons.core.configs.AdConfig r9) {
        /*
            r8 = this;
            java.lang.String r0 = "a"
            if (r9 == 0) goto L14
            com.inmobi.commons.core.configs.AdConfig$ViewabilityConfig r9 = r9.getViewability()     // Catch: java.lang.Exception -> L11
            if (r9 == 0) goto L14
            com.inmobi.commons.core.configs.AdConfig$OmidConfig r9 = r9.getOmidConfig()     // Catch: java.lang.Exception -> L11
            if (r9 != 0) goto L19
            goto L14
        L11:
            r0 = move-exception
            r9 = r0
            goto L38
        L14:
            com.inmobi.commons.core.configs.AdConfig$OmidConfig r9 = new com.inmobi.commons.core.configs.AdConfig$OmidConfig     // Catch: java.lang.Exception -> L11
            r9.<init>()     // Catch: java.lang.Exception -> L11
        L19:
            java.lang.String r1 = r9.getPartnerKey()     // Catch: java.lang.Exception -> L11
            java.lang.String r2 = "10.8.0"
            java.lang.String r3 = "."
            java.lang.String r4 = ""
            r6 = 4
            r7 = 0
            r5 = 0
            java.lang.String r2 = kotlin.text.F.B2(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L11
            java.lang.String r0 = r0.concat(r2)     // Catch: java.lang.Exception -> L11
            com.iab.omid.library.inmobi.adsession.Partner r0 = com.iab.omid.library.inmobi.adsession.Partner.createPartner(r1, r0)     // Catch: java.lang.Exception -> L11
            r8.f153317b = r0     // Catch: java.lang.Exception -> L11
            com.inmobi.media.AbstractC3627l9.a(r9)     // Catch: java.lang.Exception -> L11
            return
        L38:
            com.inmobi.media.d5 r0 = com.inmobi.media.C3511d5.f152815a
            java.lang.String r0 = "event"
            com.inmobi.media.R1 r9 = com.inmobi.media.K4.a(r9, r0)
            com.inmobi.media.M5 r0 = com.inmobi.media.C3511d5.f152817c
            r0.a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3710r9.a(com.inmobi.commons.core.configs.AdConfig):void");
    }
}
