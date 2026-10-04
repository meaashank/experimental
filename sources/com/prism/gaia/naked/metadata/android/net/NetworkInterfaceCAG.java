package com.prism.gaia.naked.metadata.android.net;

import W6.m;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.net.NetworkInterfaceCAGI;
import java.net.NetworkInterface;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class NetworkInterfaceCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165835C = new Impl_C();

    @m
    public static final class Impl_C implements NetworkInterfaceCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) NetworkInterface.class);
        private InitOnceTry<NakedObject<byte[]>> __hardwareAddr = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.net.l
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165847a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "hardwareAddr");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.net.NetworkInterfaceCAGI.C
        public NakedObject<byte[]> hardwareAddr() {
            return this.__hardwareAddr.get();
        }
    }
}
