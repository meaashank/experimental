package com.prism.gaia.naked.metadata.android.content;

import W6.c;
import W6.l;
import android.content.ContentProviderClient;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.content.ContentProviderClientCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ContentProviderClientCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165591G = new Impl_G();

    @l
    public static final class Impl_G implements ContentProviderClientCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) ContentProviderClient.class);
        private InitOnce<NakedObject<IInterface>> __mContentProvider = new InitOnce<>(new InitOnce.Init() { // from class: N8.Z
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64782a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mContentProvider");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.ContentProviderClientCAGI.G
        public NakedObject<IInterface> mContentProvider() {
            return this.__mContentProvider.get();
        }
    }
}
