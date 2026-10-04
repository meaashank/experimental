package com.prism.gaia.naked.metadata.android.content;

import W6.c;
import W6.m;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.content.AttributionSourceStateCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class AttributionSourceStateCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165588C = new Impl_C();

    @m
    public static final class Impl_C implements AttributionSourceStateCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.content.AttributionSourceState");
        private InitOnceTry<NakedInt> __uid = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.d
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64788a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedObject<String>> __packageName = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.e
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64790a.lambda$new$1();
            }
        });
        private InitOnceTry<NakedObject<Object[]>> __next = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.f
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64792a.lambda$new$2();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$0() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "uid");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "packageName");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$2() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "next");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.AttributionSourceStateCAGI.C
        public NakedObject<Object[]> next() {
            return this.__next.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.AttributionSourceStateCAGI.C
        public NakedObject<String> packageName() {
            return this.__packageName.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.AttributionSourceStateCAGI.C
        public NakedInt uid() {
            return this.__uid.get();
        }
    }
}
