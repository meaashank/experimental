package com.prism.gaia.naked.compat.dalvik.system;

import U6.j;
import W6.c;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.naked.metadata.dalvik.system.DexPathListCAG;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class DexPathListCompat2 {

    public static class Util {
        public static Object create(ClassLoader classLoader, ByteBuffer[] byteBufferArr, String str) {
            Object objNewInstance = DexPathListCAG.f166009G.ctor().newInstance(classLoader, str);
            DexPathListCAG.f166009G.initByteBufferDexPath().call(objNewInstance, byteBufferArr);
            if (C3841e.z()) {
                DexPathListCAG.S31.maybeRunBackgroundVerification().call(objNewInstance, classLoader);
            }
            return objNewInstance;
        }

        public static String toString(Object obj) {
            if (obj == null) {
                return "DexPathList(null)";
            }
            StringBuilder sb2 = new StringBuilder("DexPathList(");
            if (DexPathListCAG.f166008C.dexElements() != null) {
                sb2.append("dexElements: ");
                sb2.append(j.I(DexPathListCAG.f166008C.dexElements().get(obj)));
                sb2.append(j.f68738d);
            }
            if (DexPathListCAG.f166008C.nativeLibraryPathElements() != null) {
                sb2.append("nativeLibPathElements: ");
                sb2.append(j.I(DexPathListCAG.f166008C.nativeLibraryPathElements().get(obj)));
                sb2.append(j.f68738d);
            }
            if (DexPathListCAG.f166008C.nativeLibraryDirectories() != null) {
                sb2.append("nativeLibDirs: ");
                sb2.append(j.I(DexPathListCAG.f166008C.nativeLibraryDirectories().get(obj)));
                sb2.append(j.f68738d);
            }
            if (DexPathListCAG.f166008C.systemNativeLibraryDirectories() != null) {
                sb2.append("systemNativeLibDirs: ");
                sb2.append(j.I(DexPathListCAG.f166008C.systemNativeLibraryDirectories().get(obj)));
                sb2.append(j.f68738d);
            }
            sb2.append(")");
            return sb2.toString();
        }
    }
}
