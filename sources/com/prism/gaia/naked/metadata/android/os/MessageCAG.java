package com.prism.gaia.naked.metadata.android.os;

import android.os.Message;
import androidx.core.graphics.drawable.IconCompat;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.os.MessageCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class MessageCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165882G = new Impl_G();
    public static Impl_L21 L21 = new Impl_L21();

    @W6.l
    public static final class Impl_G implements MessageCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Message.class);
        private InitOnce<NakedObject<Object>> __obj = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.M
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165881a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), IconCompat.f111190A);
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.MessageCAGI.G
        public NakedObject<Object> obj() {
            return this.__obj.get();
        }
    }

    @W6.l
    public static final class Impl_L21 implements MessageCAGI.L21 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Message.class);
        private InitOnce<NakedStaticMethod<Void>> __updateCheckRecycle = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.N
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165883a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "updateCheckRecycle", (Class<?>[]) new Class[]{Integer.TYPE});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.MessageCAGI.L21
        public NakedStaticMethod<Void> updateCheckRecycle() {
            return this.__updateCheckRecycle.get();
        }
    }
}
