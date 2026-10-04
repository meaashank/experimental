package com.prism.gaia.naked.metadata.android.content;

import W6.c;
import W6.m;
import android.content.ContentProvider;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.metadata.android.content.ContentProviderCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ContentProviderCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165590C = new Impl_C();

    @m
    public static final class Impl_C implements ContentProviderCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) ContentProvider.class);
        private InitOnceTry<NakedMethod<IInterface>> __getIContentProvider = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.Y
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64781a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getIContentProvider");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.ContentProviderCAGI.C
        public NakedMethod<IInterface> getIContentProvider() {
            return this.__getIContentProvider.get();
        }
    }
}
