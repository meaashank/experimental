package com.prism.gaia.naked.metadata.android.app.servertransaction;

import W6.c;
import W6.l;
import android.os.IBinder;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.app.servertransaction.ClientTransactionCAGI;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ClientTransactionCAG {
    public static Impl_P28 P28 = new Impl_P28();

    @l
    public static final class Impl_P28 implements ClientTransactionCAGI.P28 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.servertransaction.ClientTransaction");
        private InitOnce<NakedObject<IBinder>> __mActivityToken = new InitOnce<>(new InitOnce.Init() { // from class: L8.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f58689a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<List<Object>>> __mActivityCallbacks = new InitOnce<>(new InitOnce.Init() { // from class: L8.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f58690a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mActivityToken");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mActivityCallbacks");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.servertransaction.ClientTransactionCAGI.P28
        public NakedObject<List<Object>> mActivityCallbacks() {
            return this.__mActivityCallbacks.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.servertransaction.ClientTransactionCAGI.P28
        public NakedObject<IBinder> mActivityToken() {
            return this.__mActivityToken.get();
        }
    }
}
