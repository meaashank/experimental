package com.prism.gaia.naked.metadata.android.os;

import android.os.Binder;
import android.os.IBinder;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.os.BinderCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class BinderCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165855C = new Impl_C();

    @W6.m
    public static final class Impl_C implements BinderCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) Binder.class);
        private InitOnceTry<NakedStaticMethod<IBinder>> __allowBlocking = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165903a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "allowBlocking", (Class<?>[]) new Class[]{IBinder.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.BinderCAGI.C
        public NakedStaticMethod<IBinder> allowBlocking() {
            return this.__allowBlocking.get();
        }
    }
}
