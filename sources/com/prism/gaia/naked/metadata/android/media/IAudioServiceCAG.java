package com.prism.gaia.naked.metadata.android.media;

import W6.c;
import W6.l;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.media.IAudioServiceCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class IAudioServiceCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165827G = new Impl_G();

    @l
    public static final class Impl_G implements IAudioServiceCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.media.IAudioService");
        public Impl_Stub Stub = new Impl_Stub();

        @l
        public static final class Impl_Stub implements IAudioServiceCAGI.G.Stub {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.media.IAudioService$Stub");
            private InitOnce<NakedStaticMethod<IInterface>> __asInterface = new InitOnce<>(new InitOnce.Init() { // from class: W8.c
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76637a.lambda$new$0();
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

            @Override // com.prism.gaia.naked.metadata.android.media.IAudioServiceCAGI.G.Stub
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
