package com.prism.gaia.naked.metadata.dalvik.system;

import W6.b;
import W6.c;
import W6.f;
import W6.i;
import W6.k;
import W6.l;
import W6.n;
import W6.p;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import dalvik.system.BaseDexClassLoader;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class BaseDexClassLoaderCAGI {

    @l
    @i(BaseDexClassLoader.class)
    public interface G extends ClassAccessor {
        @p("findClass")
        @f({String.class})
        NakedMethod<Class<?>> findClass();

        @p("findLibrary")
        @f({String.class})
        NakedMethod<String> findLibrary();

        @p("findResource")
        @f({String.class})
        NakedMethod<URL> findResource();

        @p("findResources")
        @f({String.class})
        NakedMethod<Enumeration<URL>> findResources();

        @n("pathList")
        NakedObject<Object> pathList();
    }

    @l
    @i(BaseDexClassLoader.class)
    public interface O26 extends ClassAccessor {
        @f({ByteBuffer[].class, ClassLoader.class})
        @k
        NakedConstructor<Object> ctor();
    }

    @l
    @i(BaseDexClassLoader.class)
    public interface Q29 extends ClassAccessor {
        @f({ByteBuffer[].class, String.class, ClassLoader.class})
        @k
        NakedConstructor<Object> ctor();
    }
}
