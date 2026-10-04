package com.prism.gaia.naked.metadata.android.os;

import android.os.Handler;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.os.HandlerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class HandlerCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165871G = new Impl_G();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165870C = new Impl_C();

    @W6.m
    public static final class Impl_C implements HandlerCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) Handler.class);
        private InitOnceTry<NakedBoolean> __mAsynchronous = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.D
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165862a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedBoolean lambda$new$0() throws Exception {
            return new NakedBoolean((Class<?>) ORG_CLASS(), "mAsynchronous");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.HandlerCAGI.C
        public NakedBoolean mAsynchronous() {
            return this.__mAsynchronous.get();
        }
    }

    @W6.l
    public static final class Impl_G implements HandlerCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Handler.class);
        private InitOnce<NakedObject<Handler.Callback>> __mCallback = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.E
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165863a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mCallback");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.HandlerCAGI.G
        public NakedObject<Handler.Callback> mCallback() {
            return this.__mCallback.get();
        }
    }
}
