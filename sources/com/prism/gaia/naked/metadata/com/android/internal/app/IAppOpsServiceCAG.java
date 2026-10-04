package com.prism.gaia.naked.metadata.com.android.internal.app;

import W6.c;
import W6.l;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.com.android.internal.app.IAppOpsServiceCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class IAppOpsServiceCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165979G = new Impl_G();

    @l
    public static final class Impl_G implements IAppOpsServiceCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("com.android.internal.app.IAppOpsService");
        public Impl_Stub Stub = new Impl_Stub();

        @l
        public static final class Impl_Stub implements IAppOpsServiceCAGI.G.Stub {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("com.android.internal.app.IAppOpsService$Stub");
            private InitOnce<NakedStaticMethod<IInterface>> __asInterface = new InitOnce<>(new InitOnce.Init() { // from class: r9.a
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f227264a.lambda$new$0();
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

            @Override // com.prism.gaia.naked.metadata.com.android.internal.app.IAppOpsServiceCAGI.G.Stub
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
