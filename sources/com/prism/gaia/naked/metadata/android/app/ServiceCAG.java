package com.prism.gaia.naked.metadata.android.app;

import android.os.IBinder;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.app.ServiceCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class ServiceCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165383G = new Impl_G();

    @W6.l
    public static final class Impl_G implements ServiceCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.Service");
        private InitOnce<NakedObject<IBinder>> __mToken = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.I3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165320a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mToken");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ServiceCAGI.G
        public NakedObject<IBinder> mToken() {
            return this.__mToken.get();
        }
    }
}
