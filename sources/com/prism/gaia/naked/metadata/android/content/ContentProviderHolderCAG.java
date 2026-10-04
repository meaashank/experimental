package com.prism.gaia.naked.metadata.android.content;

import W6.c;
import W6.l;
import android.content.pm.ProviderInfo;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.content.ContentProviderHolderCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ContentProviderHolderCAG {
    public static Impl_O26 O26 = new Impl_O26();
    public static Impl_S31 S31 = new Impl_S31();

    @l
    public static final class Impl_O26 implements ContentProviderHolderCAGI.O26 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ContentProviderHolder");
        private InitOnce<NakedConstructor<Object>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: N8.a0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64783a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<ProviderInfo>> __info = new InitOnce<>(new InitOnce.Init() { // from class: N8.b0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64785a.lambda$new$1();
            }
        });
        private InitOnce<NakedObject<IInterface>> __provider = new InitOnce<>(new InitOnce.Init() { // from class: N8.c0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64787a.lambda$new$2();
            }
        });
        private InitOnce<NakedObject<IBinder>> __connection = new InitOnce<>(new InitOnce.Init() { // from class: N8.d0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64789a.lambda$new$3();
            }
        });
        private InitOnce<NakedBoolean> __noReleaseNeeded = new InitOnce<>(new InitOnce.Init() { // from class: N8.e0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64791a.lambda$new$4();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor((Class<?>) ORG_CLASS(), (Class<?>[]) new Class[]{ProviderInfo.class});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "info");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$2() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "provider");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$3() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "connection");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedBoolean lambda$new$4() throws Exception {
            return new NakedBoolean((Class<?>) ORG_CLASS(), "noReleaseNeeded");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.ContentProviderHolderCAGI.O26
        public NakedObject<IBinder> connection() {
            return this.__connection.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.ContentProviderHolderCAGI.O26
        public NakedConstructor<Object> ctor() {
            return this.__ctor.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.ContentProviderHolderCAGI.O26
        public NakedObject<ProviderInfo> info() {
            return this.__info.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.ContentProviderHolderCAGI.O26
        public NakedBoolean noReleaseNeeded() {
            return this.__noReleaseNeeded.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.ContentProviderHolderCAGI.O26
        public NakedObject<IInterface> provider() {
            return this.__provider.get();
        }
    }

    @l
    public static final class Impl_S31 implements ContentProviderHolderCAGI.S31 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ContentProviderHolder");
        private InitOnce<NakedBoolean> __mLocal = new InitOnce<>(new InitOnce.Init() { // from class: N8.f0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64793a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedBoolean lambda$new$0() throws Exception {
            return new NakedBoolean((Class<?>) ORG_CLASS(), "mLocal");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.ContentProviderHolderCAGI.S31
        public NakedBoolean mLocal() {
            return this.__mLocal.get();
        }
    }
}
