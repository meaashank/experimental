package com.prism.gaia.naked.metadata.android.content.res;

import W6.c;
import W6.l;
import android.content.res.Resources;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.content.res.ResourcesCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ResourcesCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165806G = new Impl_G();

    @l
    public static final class Impl_G implements ResourcesCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Resources.class);
        private InitOnce<NakedStaticMethod<Resources>> __getSystem = new InitOnce<>(new InitOnce.Init() { // from class: O8.e
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f65218a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "getSystem");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.res.ResourcesCAGI.G
        public NakedStaticMethod<Resources> getSystem() {
            return this.__getSystem.get();
        }
    }
}
