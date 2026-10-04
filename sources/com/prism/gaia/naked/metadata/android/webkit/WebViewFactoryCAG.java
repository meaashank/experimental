package com.prism.gaia.naked.metadata.android.webkit;

import W6.c;
import W6.l;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.webkit.WebViewFactoryCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class WebViewFactoryCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165971G = new Impl_G();

    @l
    public static final class Impl_G implements WebViewFactoryCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.webkit.WebViewFactory");
        private InitOnce<NakedStaticMethod<Object>> __getUpdateService = new InitOnce<>(new InitOnce.Init() { // from class: n9.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f221252a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "getUpdateService");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.webkit.WebViewFactoryCAGI.G
        public NakedStaticMethod<Object> getUpdateService() {
            return this.__getUpdateService.get();
        }
    }
}
