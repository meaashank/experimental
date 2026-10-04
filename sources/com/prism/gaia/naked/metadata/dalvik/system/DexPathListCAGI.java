package com.prism.gaia.naked.metadata.dalvik.system;

import W6.b;
import W6.c;
import W6.f;
import W6.j;
import W6.k;
import W6.l;
import W6.m;
import W6.n;
import W6.p;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class DexPathListCAGI {

    @m
    @j("dalvik.system.DexPathList")
    public interface C extends ClassAccessor {
        @n("dexElements")
        NakedObject<Object> dexElements();

        @n("nativeLibraryDirectories")
        NakedObject<Object> nativeLibraryDirectories();

        @n("nativeLibraryPathElements")
        NakedObject<Object> nativeLibraryPathElements();

        @n("systemNativeLibraryDirectories")
        NakedObject<Object> systemNativeLibraryDirectories();
    }

    @l
    @j("dalvik.system.DexPathList")
    public interface G extends ClassAccessor {
        @f({ClassLoader.class, String.class})
        @k
        NakedConstructor<Object> ctor();

        @p("initByteBufferDexPath")
        @f({ByteBuffer[].class})
        NakedMethod<Void> initByteBufferDexPath();
    }

    @l
    @j("dalvik.system.DexPathList")
    public interface S31 extends ClassAccessor {
        @p("maybeRunBackgroundVerification")
        @f({ClassLoader.class})
        NakedMethod<Void> maybeRunBackgroundVerification();
    }
}
