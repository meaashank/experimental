package com.prism.gaia.naked.metadata.android.content;

import W6.c;
import W6.l;
import android.content.IntentFilter;
import android.util.ArraySet;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.content.IntentFilterCAGI;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class IntentFilterCAG {
    public static Impl__T33 _T33 = new Impl__T33();
    public static Impl_U34 U34 = new Impl_U34();

    @l
    public static final class Impl_U34 implements IntentFilterCAGI.U34 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) IntentFilter.class);
        private InitOnce<NakedObject<ArraySet<String>>> __mActions = new InitOnce<>(new InitOnce.Init() { // from class: N8.q0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64815a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mActions");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.IntentFilterCAGI.U34
        public NakedObject<ArraySet<String>> mActions() {
            return this.__mActions.get();
        }
    }

    @l
    public static final class Impl__T33 implements IntentFilterCAGI._T33 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) IntentFilter.class);
        private InitOnce<NakedObject<List<String>>> __mActions = new InitOnce<>(new InitOnce.Init() { // from class: N8.r0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64817a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mActions");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.IntentFilterCAGI._T33
        public NakedObject<List<String>> mActions() {
            return this.__mActions.get();
        }
    }
}
