package com.prism.gaia.naked.metadata.android.net;

import W6.m;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.net.ITetheringConnectorCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class ITetheringConnectorCAG {
    public static Impl_R30 R30 = new Impl_R30();

    @m
    public static final class Impl_R30 implements ITetheringConnectorCAGI.R30 {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.net.ITetheringConnector");
        public Impl_Stub Stub = new Impl_Stub();

        @m
        public static final class Impl_Stub implements ITetheringConnectorCAGI.R30.Stub {
            private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.net.ITetheringConnector$Stub");
            private InitOnceTry<NakedStaticMethod<IInterface>> __asInterface = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.net.c
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165838a.lambda$new$0();
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

            @Override // com.prism.gaia.naked.metadata.android.net.ITetheringConnectorCAGI.R30.Stub
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
