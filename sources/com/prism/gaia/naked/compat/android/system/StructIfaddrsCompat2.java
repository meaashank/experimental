package com.prism.gaia.naked.compat.android.system;

import W6.c;
import com.prism.gaia.naked.metadata.android.system.StructIfaddrsCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class StructIfaddrsCompat2 {

    public static class Util {
        public static byte[] getHardwareAddr(Object obj) {
            if (obj == null || StructIfaddrsCAG.f165952C.hwaddr() == null) {
                return null;
            }
            return StructIfaddrsCAG.f165952C.hwaddr().get(obj);
        }

        public static String getIfaName(Object obj) {
            if (obj == null || StructIfaddrsCAG.f165952C.ifa_name() == null) {
                return null;
            }
            return StructIfaddrsCAG.f165952C.ifa_name().get(obj);
        }

        public static void setHardwareAddr(Object obj, byte[] bArr) {
            if (obj == null || StructIfaddrsCAG.f165952C.hwaddr() == null) {
                return;
            }
            StructIfaddrsCAG.f165952C.hwaddr().set(obj, bArr);
        }
    }
}
