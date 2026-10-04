package com.prism.gaia.naked.metadata.android.content.pm;

import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.content.pm.ILauncherAppsCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class ILauncherAppsCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165638G = new Impl_G();

    public static final class Impl_G implements ILauncherAppsCAGI.G {
        public Impl_Stub Stub = new Impl_Stub();

        @W6.l
        public static final class Impl_Stub implements ILauncherAppsCAGI.G.Stub {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.ILauncherApps$Stub");
            private InitOnce<NakedStaticMethod<IInterface>> __asInterface = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.x
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165793a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
                return new NakedStaticMethod((Class<?>) ORG_CLASS(), "asInterface");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.ILauncherAppsCAGI.G.Stub
            public NakedStaticMethod<IInterface> asInterface() {
                return this.__asInterface.get();
            }
        }
    }
}
