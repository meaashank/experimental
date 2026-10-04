package com.prism.gaia.naked.metadata.android.view.autofill;

import O.C1274c;
import W6.c;
import W6.l;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.view.autofill.AutofillManagerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class AutofillManagerCAG {
    public static Impl_O26 O26 = new Impl_O26();

    @l
    public static final class Impl_O26 implements AutofillManagerCAGI.O26 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) C1274c.a());
        private InitOnce<NakedObject<IInterface>> __mService = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.view.autofill.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165969a.lambda$new$0();
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

        @Override // com.prism.gaia.naked.metadata.android.view.autofill.AutofillManagerCAGI.O26
        public NakedObject<IInterface> mService() {
            return this.__mService.get();
        }
    }
}
