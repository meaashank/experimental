package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import ed.InterfaceC4376a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class C3 extends Lambda implements InterfaceC4376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3 f151817a = new C3();

    public C3() {
        super(0);
    }

    @Override // ed.InterfaceC4376a
    public final Object invoke() {
        LinkedHashMap linkedHashMap = C3773w2.f153489a;
        return (AdConfig) D4.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null);
    }
}
