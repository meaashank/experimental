package com.prism.gaia.naked.metadata.com.android.internal.view.inputmethod;

import W6.c;
import W6.l;
import android.os.IInterface;
import android.view.inputmethod.InputMethodManager;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.com.android.internal.view.inputmethod.InputMethodManagerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class InputMethodManagerCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165998G = new Impl_G();

    @l
    public static final class Impl_G implements InputMethodManagerCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) InputMethodManager.class);
        private InitOnce<NakedObject<IInterface>> __mService = new InitOnce<>(new InitOnce.Init() { // from class: z9.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f241260a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mService");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.com.android.internal.view.inputmethod.InputMethodManagerCAGI.G
        public NakedObject<IInterface> mService() {
            return this.__mService.get();
        }
    }
}
