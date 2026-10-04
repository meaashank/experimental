package com.prism.gaia.naked.metadata.com.android.internal.view;

import W6.c;
import W6.l;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.metadata.com.android.internal.view.IInputMethodManagerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class IInputMethodManagerCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165997G = new Impl_G();

    @l
    public static final class Impl_G implements IInputMethodManagerCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("com.android.internal.view.IInputMethodManager");

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }
}
