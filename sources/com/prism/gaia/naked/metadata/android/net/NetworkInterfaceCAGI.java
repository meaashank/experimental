package com.prism.gaia.naked.metadata.android.net;

import W6.m;
import W6.n;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;
import java.net.NetworkInterface;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class NetworkInterfaceCAGI {

    @W6.i(NetworkInterface.class)
    @m
    public interface C extends ClassAccessor {
        @n("hardwareAddr")
        NakedObject<byte[]> hardwareAddr();
    }
}
