package com.prism.gaia.naked.metadata.android.view;

import W6.c;
import W6.l;
import android.graphics.Bitmap;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.view.SurfaceControlCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class SurfaceControlCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165966G = new Impl_G();

    @l
    public static final class Impl_G implements SurfaceControlCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.view.SurfaceControl");
        private InitOnce<NakedStaticMethod<Bitmap>> __screnshot = new InitOnce<>(new InitOnce.Init() { // from class: l9.g
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f220964a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            Class clsORG_CLASS = ORG_CLASS();
            Class cls = Integer.TYPE;
            return new NakedStaticMethod((Class<?>) clsORG_CLASS, "screnshot", (Class<?>[]) new Class[]{cls, cls});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.view.SurfaceControlCAGI.G
        public NakedStaticMethod<Bitmap> screnshot() {
            return this.__screnshot.get();
        }
    }
}
