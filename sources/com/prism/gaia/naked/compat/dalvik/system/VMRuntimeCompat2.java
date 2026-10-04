package com.prism.gaia.naked.compat.dalvik.system;

import W6.c;
import com.prism.gaia.helper.compat.NativeLibraryHelperCompat;
import com.prism.gaia.naked.metadata.dalvik.system.VMRuntimeCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class VMRuntimeCompat2 {

    public static class Util {
        public static String getCurrentInstructionSet() {
            return VMRuntimeCAG.f166010C.getCurrentInstructionSet() != null ? VMRuntimeCAG.f166010C.getCurrentInstructionSet().call(new Object[0]) : NativeLibraryHelperCompat.f164950c;
        }

        public static Object getInstance() {
            return VMRuntimeCAG.f166011G.getRuntime().call(new Object[0]);
        }

        public static boolean isRunning64BitVM() {
            return VMRuntimeCAG.L21.is64Bit().call(getInstance(), new Object[0]).booleanValue();
        }
    }
}
