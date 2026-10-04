package com.prism.gaia.naked.metadata.android.net.wifi;

import W6.b;
import W6.c;
import W6.j;
import W6.l;
import W6.s;
import android.annotation.TargetApi;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticMethod;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
@TargetApi(19)
public final class WifiSsidCAGI {

    @l
    @j("android.net.wifi.WifiSsid")
    public interface G extends ClassAccessor {
        @s("createFromAsciiEncoded")
        NakedStaticMethod<Object> createFromAsciiEncoded();
    }
}
