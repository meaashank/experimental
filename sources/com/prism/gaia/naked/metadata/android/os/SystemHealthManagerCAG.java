package com.prism.gaia.naked.metadata.android.os;

import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.os.SystemHealthManagerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class SystemHealthManagerCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165892G = new Impl_G();

    @W6.l
    public static final class Impl_G implements SystemHealthManagerCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.os.health.SystemHealthManager");
        private InitOnce<NakedObject<IInterface>> __mBatteryStats = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.a0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165902a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mBatteryStats");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.SystemHealthManagerCAGI.G
        public NakedObject<IInterface> mBatteryStats() {
            return this.__mBatteryStats.get();
        }
    }
}
