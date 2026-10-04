package com.prism.gaia.naked.metadata.android.app.admin;

import W6.c;
import W6.l;
import android.app.admin.DevicePolicyManager;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.app.admin.DevicePolicyManagerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class DevicePolicyManagerCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165418G = new Impl_G();

    @l
    public static final class Impl_G implements DevicePolicyManagerCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) DevicePolicyManager.class);
        private InitOnce<NakedObject<IInterface>> __mService = new InitOnce<>(new InitOnce.Init() { // from class: H8.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f50666a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mService");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.admin.DevicePolicyManagerCAGI.G
        public NakedObject<IInterface> mService() {
            return this.__mService.get();
        }
    }
}
