package com.prism.gaia.naked.metadata.android.app;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.app.PendingIntentCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class PendingIntentCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165369G = new Impl_G();
    public static Impl_J18 J18 = new Impl_J18();

    @W6.l
    public static final class Impl_G implements PendingIntentCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) PendingIntent.class);
        private InitOnce<NakedObject<IInterface>> __mTarget = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.A3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165268a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mTarget");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.PendingIntentCAGI.G
        public NakedObject<IInterface> mTarget() {
            return this.__mTarget.get();
        }
    }

    @W6.l
    public static final class Impl_J18 implements PendingIntentCAGI.J18 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) PendingIntent.class);
        private InitOnce<NakedMethod<Intent>> __getIntent = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.B3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165283a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getIntent");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.PendingIntentCAGI.J18
        public NakedMethod<Intent> getIntent() {
            return this.__getIntent.get();
        }
    }
}
