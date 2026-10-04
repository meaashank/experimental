package com.prism.gaia.naked.metadata.android.view;

import W6.c;
import W6.m;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.view.ThreadedRendererCAGI;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ThreadedRendererCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165967C = new Impl_C();

    @m
    public static final class Impl_C implements ThreadedRendererCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.view.ThreadedRenderer");
        private InitOnceTry<NakedStaticMethod<Void>> __setupDiskCache = new InitOnceTry<>(new InitOnce.Init() { // from class: l9.h
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f220965a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "setupDiskCache", (Class<?>[]) new Class[]{File.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.view.ThreadedRendererCAGI.C
        public NakedStaticMethod<Void> setupDiskCache() {
            return this.__setupDiskCache.get();
        }
    }
}
