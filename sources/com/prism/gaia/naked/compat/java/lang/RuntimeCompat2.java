package com.prism.gaia.naked.compat.java.lang;

import com.prism.gaia.naked.metadata.java.lang.RuntimeCAG;

/* JADX INFO: loaded from: classes6.dex */
public class RuntimeCompat2 {

    public static class Util {
        public static String load(String str, ClassLoader classLoader) {
            return RuntimeCAG.f166015G.nativeLoad().call(str, classLoader);
        }

        public static void loadByGuest(String str, Class<?> cls) {
            RuntimeCAG.f166015G.load0().call(Runtime.getRuntime(), cls, str);
        }
    }
}
