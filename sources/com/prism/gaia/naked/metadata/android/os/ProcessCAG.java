package com.prism.gaia.naked.metadata.android.os;

import android.os.Process;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.os.ProcessCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class ProcessCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165887G = new Impl_G();

    @W6.l
    public static final class Impl_G implements ProcessCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Process.class);
        private InitOnce<NakedStaticMethod<Void>> __setArgV0 = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.Q
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165888a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "setArgV0", (Class<?>[]) new Class[]{String.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.ProcessCAGI.G
        public NakedStaticMethod<Void> setArgV0() {
            return this.__setArgV0.get();
        }
    }
}
