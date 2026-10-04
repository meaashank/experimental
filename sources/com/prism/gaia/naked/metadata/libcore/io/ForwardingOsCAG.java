package com.prism.gaia.naked.metadata.libcore.io;

import W6.c;
import W6.m;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.libcore.io.ForwardingOsCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ForwardingOsCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f166016C = new Impl_C();

    @m
    public static final class Impl_C implements ForwardingOsCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("libcore.io.ForwardingOs");
        private InitOnceTry<NakedObject<Object>> __os = new InitOnceTry<>(new InitOnce.Init() { // from class: C9.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f17597a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "os");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.libcore.io.ForwardingOsCAGI.C
        public NakedObject<Object> os() {
            return this.__os.get();
        }
    }
}
