package com.prism.gaia.naked.metadata.android.webkit;

import W6.c;
import W6.l;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.metadata.android.webkit.IWebViewUpdateServiceCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class IWebViewUpdateServiceCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165970G = new Impl_G();

    @l
    public static final class Impl_G implements IWebViewUpdateServiceCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.webkit.IWebViewUpdateService");
        public Impl_Stub Stub = new Impl_Stub();

        @l
        public static final class Impl_Stub implements IWebViewUpdateServiceCAGI.G.Stub {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.webkit.IWebViewUpdateService$Stub");
            public Impl_Proxy Proxy = new Impl_Proxy();

            @l
            public static final class Impl_Proxy implements IWebViewUpdateServiceCAGI.G.Stub.Proxy {
                private InitOnceClass __ORG_CLASS = new InitOnceClass("android.webkit.IWebViewUpdateService$Stub$Proxy");
                private InitOnce<NakedMethod<String>> __getCurrentWebViewPackageName = new InitOnce<>(new InitOnce.Init() { // from class: n9.a
                    @Override // com.prism.gaia.naked.core.InitOnce.Init
                    public final Object onInit() {
                        return this.f221251a.lambda$new$0();
                    }
                });

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
                    return new NakedMethod((Class<?>) ORG_CLASS(), "getCurrentWebViewPackageName");
                }

                @Override // com.prism.gaia.naked.core.ClassAccessor
                public Class ORG_CLASS() {
                    return this.__ORG_CLASS.get();
                }

                @Override // com.prism.gaia.naked.metadata.android.webkit.IWebViewUpdateServiceCAGI.G.Stub.Proxy
                public NakedMethod<String> getCurrentWebViewPackageName() {
                    return this.__getCurrentWebViewPackageName.get();
                }
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }
}
