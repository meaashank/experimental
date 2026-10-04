package com.prism.gaia.naked.metadata.libcore.io;

import W6.c;
import W6.l;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.libcore.io.LibcoreCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class LibcoreCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f166017G = new Impl_G();

    @l
    public static final class Impl_G implements LibcoreCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("libcore.io.Libcore");
        private InitOnce<NakedStaticObject<Object>> __os = new InitOnce<>(new InitOnce.Init() { // from class: C9.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f17598a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "os");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.libcore.io.LibcoreCAGI.G
        public NakedStaticObject<Object> os() {
            return this.__os.get();
        }
    }
}
