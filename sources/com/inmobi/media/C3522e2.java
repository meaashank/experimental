package com.inmobi.media;

import com.inmobi.commons.core.configs.RootConfig;
import ed.InterfaceC4376a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3522e2 extends Lambda implements InterfaceC4376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3522e2 f152837a = new C3522e2();

    public C3522e2() {
        super(0);
    }

    @Override // ed.InterfaceC4376a
    public final Object invoke() {
        LinkedHashMap linkedHashMap = C3773w2.f153489a;
        return Boolean.valueOf(!((RootConfig) D4.a("root", "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig", null)).isMonetizationDisabled());
    }
}
