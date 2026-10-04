package com.inmobi.commons.core.configs;

import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.A5;
import com.inmobi.media.C3484b6;
import com.inmobi.media.C3645n;
import com.inmobi.media.C3659o;
import com.inmobi.media.C3673p;
import com.inmobi.media.C3777w6;
import com.inmobi.media.Ua;
import com.inmobi.media.Va;
import u4.g;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public static A5 a() {
        return new A5().a(new Va(g.f239565h, AdConfig.class), (Ua) new C3777w6(new a(), AdConfig.CacheConfig.class)).a(new Va("allowedContentType", AdConfig.VastVideoConfig.class), (Ua) new C3484b6(new C3645n(), String.class)).a(new Va("gestures", AdConfig.RenderingConfig.class), (Ua) new C3484b6(new C3659o(), Integer.TYPE)).a(new Va("skipFields", AdConfig.ContextualDataConfig.class), (Ua) new C3484b6(new C3673p(), String.class));
    }
}
