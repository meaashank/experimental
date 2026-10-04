package com.prism.gaia.naked.compat.android.net;

import W6.c;
import com.prism.gaia.naked.metadata.android.net.NetworkInterfaceCAG;
import java.net.NetworkInterface;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class NetworkInterfaceCompat2 {

    public static class Util {
        public static void setHardwareAddr(NetworkInterface networkInterface, byte[] bArr) {
            if (NetworkInterfaceCAG.f165835C.hardwareAddr() != null) {
                NetworkInterfaceCAG.f165835C.hardwareAddr().set(networkInterface, bArr);
            }
        }
    }
}
