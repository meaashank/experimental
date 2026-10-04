package com.prism.gaia.naked.metadata.android.os;

import android.os.IBinder;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.metadata.android.os.IBinderCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class IBinderCAG {
    public static Impl_R30 R30 = new Impl_R30();

    @W6.m
    public static final class Impl_R30 implements IBinderCAGI.R30 {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) IBinder.class);
        private InitOnceTry<NakedMethod<IBinder>> __getExtension = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.F
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165867a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getExtension");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.IBinderCAGI.R30
        public NakedMethod<IBinder> getExtension() {
            return this.__getExtension.get();
        }
    }
}
