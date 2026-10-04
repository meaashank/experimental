package com.prism.gaia.naked.metadata.android.content;

import W6.c;
import W6.l;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.metadata.android.content.IContentProviderCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class IContentProviderCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165596G = new Impl_G();

    @l
    public static final class Impl_G implements IContentProviderCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.IContentProvider");

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }
}
