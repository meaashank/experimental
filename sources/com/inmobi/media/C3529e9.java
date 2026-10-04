package com.inmobi.media;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;

/* JADX INFO: renamed from: com.inmobi.media.e9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3529e9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f152866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N4 f152867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f152869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SignalsConfig.NovatiqConfig f152870e;

    public C3529e9(Context context, N4 n42) {
        String string;
        kotlin.jvm.internal.G.p(context, "context");
        this.f152866a = context;
        this.f152867b = n42;
        this.f152868c = "";
        LinkedHashMap linkedHashMap = C3773w2.f153489a;
        SignalsConfig.NovatiqConfig novatiqConfig = ((SignalsConfig) D4.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getNovatiqConfig();
        this.f152870e = novatiqConfig;
        if (novatiqConfig.isNovatiqEnabled()) {
            Object systemService = context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
            String str = networkOperatorName != null ? networkOperatorName : "";
            List<String> carrierNames = novatiqConfig.getCarrierNames();
            if (!(carrierNames instanceof Collection) || !carrierNames.isEmpty()) {
                Iterator<T> it = carrierNames.iterator();
                while (it.hasNext()) {
                    if (kotlin.text.M.m3(str, (String) it.next(), true)) {
                        this.f152869d = true;
                        StringBuilder sb2 = new StringBuilder();
                        Random random = new Random();
                        for (int i10 = 0; i10 < 40; i10++) {
                            char cCharAt = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxxxxxx".charAt(i10);
                            if (cCharAt == 'x') {
                                sb2.append(Character.forDigit(random.nextInt(16), 16));
                            } else {
                                sb2.append(cCharAt);
                            }
                        }
                        String string2 = sb2.toString();
                        kotlin.jvm.internal.G.o(string2, "toString(...)");
                        this.f152868c = string2;
                        Context context2 = this.f152866a;
                        kotlin.jvm.internal.G.p(context2, "context");
                        int i11 = context2.getApplicationInfo().labelRes;
                        if (i11 == 0) {
                            string = context2.getApplicationInfo().nonLocalizedLabel.toString();
                        } else {
                            string = context2.getString(i11);
                            kotlin.jvm.internal.G.m(string);
                        }
                        new C3557g9(new C3543f9(string2, android.support.v4.media.e.a(new StringBuilder(), kotlin.text.F.A2(string, ' ', Ra.b.f67799c, false, 4, null), "_app"), this.f152870e), this.f152867b).a(new C3515d9(this));
                        return;
                    }
                }
            }
        }
        N4 n43 = this.f152867b;
        if (n43 != null) {
            ((O4) n43).a("NovatiqDataHandler", "Novatiq disabled.. skipping");
        }
    }
}
