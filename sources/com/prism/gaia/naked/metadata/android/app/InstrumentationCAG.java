package com.prism.gaia.naked.metadata.android.app;

import android.app.Instrumentation;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.app.InstrumentationCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class InstrumentationCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165331C = new Impl_C();

    @W6.m
    public static final class Impl_C implements InstrumentationCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) Instrumentation.class);
        private InitOnceTry<NakedObject<Object>> __mThread = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.S2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165382a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mThread");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.InstrumentationCAGI.C
        public NakedObject<Object> mThread() {
            return this.__mThread.get();
        }
    }
}
