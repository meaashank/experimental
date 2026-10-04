package com.prism.gaia.naked.metadata.android.view;

import W6.c;
import W6.l;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.view.IGraphicsStatsCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class IGraphicsStatsCAG {
    public static Impl_M23 M23 = new Impl_M23();

    @l
    public static final class Impl_M23 implements IGraphicsStatsCAGI.M23 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.view.IGraphicsStats");
        public Impl_Stub Stub = new Impl_Stub();

        @l
        public static final class Impl_Stub implements IGraphicsStatsCAGI.M23.Stub {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.view.IGraphicsStats$Stub");
            private InitOnce<NakedStaticMethod<IInterface>> __asInterface = new InitOnce<>(new InitOnce.Init() { // from class: l9.d
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f220961a.lambda$new$0();
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

            @Override // com.prism.gaia.naked.metadata.android.view.IGraphicsStatsCAGI.M23.Stub
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
