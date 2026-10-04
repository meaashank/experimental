package com.prism.gaia.naked.metadata.android.media;

import W6.c;
import W6.l;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.media.MediaRouterCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class MediaRouterCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165829G = new Impl_G();

    @l
    public static final class Impl_G implements MediaRouterCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.media.MediaRouter");
        private InitOnce<NakedStaticObject> __sStatic = new InitOnce<>(new InitOnce.Init() { // from class: W8.e
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f76639a.lambda$new$0();
            }
        });
        public Impl_Static Static = new Impl_Static();

        @l
        public static final class Impl_Static implements MediaRouterCAGI.G.Static {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.media.MediaRouter$Static");
            private InitOnce<NakedObject<IInterface>> __mAudioService = new InitOnce<>(new InitOnce.Init() { // from class: W8.f
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76640a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mAudioService");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.media.MediaRouterCAGI.G.Static
            public NakedObject<IInterface> mAudioService() {
                return this.__mAudioService.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "sStatic");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.media.MediaRouterCAGI.G
        public NakedStaticObject sStatic() {
            return this.__sStatic.get();
        }
    }
}
