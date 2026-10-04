package com.prism.gaia.naked.metadata.android.system;

import W6.c;
import W6.m;
import android.annotation.TargetApi;
import android.system.OsConstants;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedStaticInt;
import com.prism.gaia.naked.metadata.android.system.OsConstantsCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class OsConstantsCAG {
    public static Impl_L21 L21 = new Impl_L21();

    @m
    @TargetApi(21)
    public static final class Impl_L21 implements OsConstantsCAGI.L21 {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) OsConstants.class);
        private InitOnceTry<NakedStaticInt> __MAP_POPULATE = new InitOnceTry<>(new InitOnce.Init() { // from class: i9.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f202913a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticInt lambda$new$0() throws Exception {
            return new NakedStaticInt((Class<?>) ORG_CLASS(), "MAP_POPULATE");
        }

        @Override // com.prism.gaia.naked.metadata.android.system.OsConstantsCAGI.L21
        public NakedStaticInt MAP_POPULATE() {
            return this.__MAP_POPULATE.get();
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }
}
