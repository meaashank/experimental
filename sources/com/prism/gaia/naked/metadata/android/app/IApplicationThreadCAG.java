package com.prism.gaia.naked.metadata.android.app;

import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.app.IApplicationThreadCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class IApplicationThreadCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165326G = new Impl_G();
    public static Impl_O26 O26 = new Impl_O26();

    @W6.l
    public static final class Impl_G implements IApplicationThreadCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.IApplicationThread");

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }

    @W6.l
    public static final class Impl_O26 implements IApplicationThreadCAGI.O26 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.IApplicationThread");
        public Impl_Stub Stub = new Impl_Stub();

        @W6.l
        public static final class Impl_Stub implements IApplicationThreadCAGI.O26.Stub {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.IApplicationThread$Stub");
            private InitOnce<NakedStaticMethod<IInterface>> __asInterface = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.K2
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165340a.lambda$new$0();
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

            @Override // com.prism.gaia.naked.metadata.android.app.IApplicationThreadCAGI.O26.Stub
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
