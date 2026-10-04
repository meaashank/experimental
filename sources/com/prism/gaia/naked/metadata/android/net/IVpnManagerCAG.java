package com.prism.gaia.naked.metadata.android.net;

import W6.m;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.net.IVpnManagerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class IVpnManagerCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165833G = new Impl_G();

    @m
    public static final class Impl_G implements IVpnManagerCAGI.G {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.net.IVpnManager");
        public Impl_Stub Stub = new Impl_Stub();

        @m
        public static final class Impl_Stub implements IVpnManagerCAGI.G.Stub {
            private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.net.IVpnManager$Stub");
            private InitOnceTry<NakedStaticMethod<IInterface>> __asInterface = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.net.d
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165839a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
                return new NakedStaticMethod((Class<?>) ORG_CLASS(), "asInterface", (Class<?>[]) new Class[]{IBinder.class});
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.net.IVpnManagerCAGI.G.Stub
            public NakedStaticMethod<IInterface> asInterface() {
                return this.__asInterface.get();
            }
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }
}
