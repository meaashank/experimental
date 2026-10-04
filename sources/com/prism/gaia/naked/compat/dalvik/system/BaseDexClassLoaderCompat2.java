package com.prism.gaia.naked.compat.dalvik.system;

import W6.c;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.naked.compat.dalvik.system.DexPathListCompat2;
import com.prism.gaia.naked.metadata.dalvik.system.BaseDexClassLoaderCAG;
import dalvik.system.BaseDexClassLoader;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class BaseDexClassLoaderCompat2 {

    public static class Util {
        public static BaseDexClassLoader ctor(@NonNull ByteBuffer[] byteBufferArr, @Nullable String str, @Nullable ClassLoader classLoader) {
            if (C3841e.w()) {
                return (BaseDexClassLoader) BaseDexClassLoaderCAG.Q29.ctor().newInstance(byteBufferArr, str, classLoader);
            }
            if (C3841e.s()) {
                return (BaseDexClassLoader) BaseDexClassLoaderCAG.O26.ctor().newInstance(byteBufferArr, classLoader);
            }
            return null;
        }

        public static Class<?> findClass(@NonNull BaseDexClassLoader baseDexClassLoader, String str) {
            return BaseDexClassLoaderCAG.f166007G.findClass().call(baseDexClassLoader, str);
        }

        public static String findLibrary(@NonNull BaseDexClassLoader baseDexClassLoader, String str) {
            return BaseDexClassLoaderCAG.f166007G.findLibrary().call(baseDexClassLoader, str);
        }

        public static URL findResource(@NonNull BaseDexClassLoader baseDexClassLoader, String str) {
            return BaseDexClassLoaderCAG.f166007G.findResource().call(baseDexClassLoader, str);
        }

        public static Enumeration<URL> findResources(@NonNull BaseDexClassLoader baseDexClassLoader, String str) {
            return BaseDexClassLoaderCAG.f166007G.findResources().call(baseDexClassLoader, str);
        }

        public static String getPathListStr(BaseDexClassLoader baseDexClassLoader) {
            return baseDexClassLoader == null ? "(null)" : DexPathListCompat2.Util.toString(BaseDexClassLoaderCAG.f166007G.pathList().get(baseDexClassLoader));
        }

        public static void setPathList(BaseDexClassLoader baseDexClassLoader, Object obj) {
            BaseDexClassLoaderCAG.f166007G.pathList().set(baseDexClassLoader, obj);
        }
    }
}
