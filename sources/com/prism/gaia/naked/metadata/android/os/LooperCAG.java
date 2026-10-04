package com.prism.gaia.naked.metadata.android.os;

import android.os.Looper;
import android.os.MessageQueue;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.os.LooperCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class LooperCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165880G = new Impl_G();

    @W6.l
    public static final class Impl_G implements LooperCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Looper.class);
        private InitOnce<NakedObject<MessageQueue>> __mQueue = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.L
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165879a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mQueue");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.LooperCAGI.G
        public NakedObject<MessageQueue> mQueue() {
            return this.__mQueue.get();
        }
    }
}
