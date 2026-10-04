package com.prism.gaia.naked.metadata.android.net.wifi;

import W6.c;
import W6.l;
import android.annotation.TargetApi;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.net.wifi.WifiSsidCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
@TargetApi(19)
public final class WifiSsidCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165851G = new Impl_G();

    @l
    public static final class Impl_G implements WifiSsidCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.net.wifi.WifiSsid");
        private InitOnce<NakedStaticMethod<Object>> __createFromAsciiEncoded = new InitOnce<>(new InitOnce.Init() { // from class: Y8.n
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f79346a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "createFromAsciiEncoded");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.net.wifi.WifiSsidCAGI.G
        public NakedStaticMethod<Object> createFromAsciiEncoded() {
            return this.__createFromAsciiEncoded.get();
        }
    }
}
