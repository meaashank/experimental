package com.prism.gaia.naked.metadata.android.net.wifi;

import W6.c;
import W6.l;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.net.wifi.WifiScannerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class WifiScannerCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165850G = new Impl_G();

    @l
    public static final class Impl_G implements WifiScannerCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.net.wifi.WifiScanner");
        private InitOnce<NakedStaticObject<String>> __GET_AVAILABLE_CHANNELS_EXTRA = new InitOnce<>(new InitOnce.Init() { // from class: Y8.m
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f79345a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "GET_AVAILABLE_CHANNELS_EXTRA");
        }

        @Override // com.prism.gaia.naked.metadata.android.net.wifi.WifiScannerCAGI.G
        public NakedStaticObject<String> GET_AVAILABLE_CHANNELS_EXTRA() {
            return this.__GET_AVAILABLE_CHANNELS_EXTRA.get();
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }
}
