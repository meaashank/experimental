package com.prism.gaia.naked.metadata.android.app.assist;

import W6.l;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.app.assist.AssistStructureCAGI;

/* JADX INFO: loaded from: classes6.dex */
public final class AssistStructureCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165420G = new Impl_G();

    @l
    public static final class Impl_G implements AssistStructureCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.assist.AssistStructure");
        public Impl_ViewNode ViewNode = new Impl_ViewNode();

        @l
        public static final class Impl_ViewNode implements AssistStructureCAGI.G.ViewNode {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.assist.AssistStructure$ViewNode");
            private InitOnce<NakedObject<String>> __mWebDomain = new InitOnce<>(new InitOnce.Init() { // from class: I8.a
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f52954a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mWebDomain");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.assist.AssistStructureCAGI.G.ViewNode
            public NakedObject<String> mWebDomain() {
                return this.__mWebDomain.get();
            }
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }
}
