package com.prism.gaia.naked.metadata.android.content;

import W6.c;
import W6.l;
import android.content.ContentResolver;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.content.ContentResolverCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ContentResolverCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165594G = new Impl_G();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static Impl_A f165593A = new Impl_A();

    public static final class Impl_A implements ContentResolverCAGI.A {
        public Impl_ContextImpl ContextImpl = new Impl_ContextImpl();

        public static final class Impl_ContextImpl implements ContentResolverCAGI.A.ContextImpl {
            public Impl_J18 J18 = new Impl_J18();

            @l
            public static final class Impl_J18 implements ContentResolverCAGI.A.ContextImpl.J18 {
                private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) ContentResolver.class);
                private InitOnce<NakedObject<String>> __mPackageName = new InitOnce<>(new InitOnce.Init() { // from class: N8.h0
                    @Override // com.prism.gaia.naked.core.InitOnce.Init
                    public final Object onInit() {
                        return this.f64797a.lambda$new$0();
                    }
                });

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                    return new NakedObject((Class<?>) ORG_CLASS(), "mPackageName");
                }

                @Override // com.prism.gaia.naked.core.ClassAccessor
                public Class ORG_CLASS() {
                    return this.__ORG_CLASS.get();
                }

                @Override // com.prism.gaia.naked.metadata.android.content.ContentResolverCAGI.A.ContextImpl.J18
                public NakedObject<String> mPackageName() {
                    return this.__mPackageName.get();
                }
            }
        }
    }

    @l
    public static final class Impl_G implements ContentResolverCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) ContentResolver.class);
        private InitOnce<NakedStaticObject<IInterface>> __sContentService = new InitOnce<>(new InitOnce.Init() { // from class: N8.i0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64799a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "sContentService");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.ContentResolverCAGI.G
        public NakedStaticObject<IInterface> sContentService() {
            return this.__sContentService.get();
        }
    }
}
