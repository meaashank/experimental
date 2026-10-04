package com.prism.gaia.naked.metadata.java.lang;

import W6.b;
import W6.c;
import W6.i;
import W6.j;
import W6.l;
import W6.q;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticObject;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class ProxyCAGI {

    @l
    @i(Proxy.class)
    public interface G extends ClassAccessor {

        @l
        @j("java.lang.reflect.Proxy$ProxyClassFactory")
        public interface ProxyClassFactory extends ClassAccessor {
            @q("proxyClassNamePrefix")
            NakedStaticObject<String> proxyClassNamePrefix();
        }
    }
}
