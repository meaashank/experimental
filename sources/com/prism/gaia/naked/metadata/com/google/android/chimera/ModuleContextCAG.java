package com.prism.gaia.naked.metadata.com.google.android.chimera;

import W6.c;
import W6.l;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.metadata.com.google.android.chimera.ModuleContextCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ModuleContextCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f166006G = new Impl_G();

    @l
    public static final class Impl_G implements ModuleContextCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("com.google.android.chimera.ModuleContext");

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }
}
