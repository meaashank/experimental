package com.prism.gaia.naked.metadata.android.media;

import W6.c;
import W6.l;
import android.media.AudioManager;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.media.AudioManagerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class AudioManagerCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165826G = new Impl_G();

    @l
    public static final class Impl_G implements AudioManagerCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) AudioManager.class);
        private InitOnce<NakedStaticMethod> __getService = new InitOnce<>(new InitOnce.Init() { // from class: W8.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f76635a.lambda$new$0();
            }
        });
        private InitOnce<NakedStaticObject<IInterface>> __sService = new InitOnce<>(new InitOnce.Init() { // from class: W8.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f76636a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "getService");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$1() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "sService");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.media.AudioManagerCAGI.G
        public NakedStaticMethod getService() {
            return this.__getService.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.media.AudioManagerCAGI.G
        public NakedStaticObject<IInterface> sService() {
            return this.__sService.get();
        }
    }
}
