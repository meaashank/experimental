package com.prism.gaia.naked.metadata.android.app;

import android.os.IBinder;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.app.BindUpdateInfoCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class BindUpdateInfoCAG {
    public static Impl_C37 C37 = new Impl_C37();

    @W6.m
    public static final class Impl_C37 implements BindUpdateInfoCAGI.C37 {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.app.BindUpdateInfo");
        private InitOnceTry<NakedObject<IBinder>> __connection = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.V1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165395a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedBoolean> __unbind = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.W1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165399a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "connection");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedBoolean lambda$new$1() throws Exception {
            return new NakedBoolean((Class<?>) ORG_CLASS(), "unbind");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.BindUpdateInfoCAGI.C37
        public NakedObject<IBinder> connection() {
            return this.__connection.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.BindUpdateInfoCAGI.C37
        public NakedBoolean unbind() {
            return this.__unbind.get();
        }
    }
}
