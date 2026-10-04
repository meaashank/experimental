package com.prism.gaia.naked.metadata.java.lang;

import W6.c;
import W6.l;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.java.lang.ProxyCAGI;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ProxyCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f166014G = new Impl_G();

    @l
    public static final class Impl_G implements ProxyCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Proxy.class);
        public Impl_ProxyClassFactory ProxyClassFactory = new Impl_ProxyClassFactory();

        @l
        public static final class Impl_ProxyClassFactory implements ProxyCAGI.G.ProxyClassFactory {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("java.lang.reflect.Proxy$ProxyClassFactory");
            private InitOnce<NakedStaticObject<String>> __proxyClassNamePrefix = new InitOnce<>(new InitOnce.Init() { // from class: B9.c
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f17446a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
                return new NakedStaticObject((Class<?>) ORG_CLASS(), "proxyClassNamePrefix");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.java.lang.ProxyCAGI.G.ProxyClassFactory
            public NakedStaticObject<String> proxyClassNamePrefix() {
                return this.__proxyClassNamePrefix.get();
            }
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }
}
