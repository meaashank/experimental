package com.prism.gaia.naked.metadata.android.app;

import android.content.ComponentName;
import android.os.IBinder;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.metadata.android.app.IServiceConnectionCAGI;
import s0.x;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class IServiceConnectionCAG {
    public static Impl_O26 O26 = new Impl_O26();
    public static Impl__N25 _N25 = new Impl__N25();
    public static Impl_C36 C36 = new Impl_C36();

    @W6.m
    public static final class Impl_C36 implements IServiceConnectionCAGI.C36 {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.app.IServiceConnection");
        private InitOnceTry<NakedMethod<Void>> __connected = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.O2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165364a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "connected", new String[]{"android.content.ComponentName", "android.os.IBinder", "android.app.IBinderSession", x.b.f238265f});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.IServiceConnectionCAGI.C36
        public NakedMethod<Void> connected() {
            return this.__connected.get();
        }
    }

    @W6.l
    public static final class Impl_O26 implements IServiceConnectionCAGI.O26 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.IServiceConnection");
        private InitOnce<NakedMethod<Void>> __connected = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.P2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165368a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "connected", (Class<?>[]) new Class[]{ComponentName.class, IBinder.class, Boolean.TYPE});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.IServiceConnectionCAGI.O26
        public NakedMethod<Void> connected() {
            return this.__connected.get();
        }
    }

    @W6.l
    public static final class Impl__N25 implements IServiceConnectionCAGI._N25 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.IServiceConnection");
        private InitOnce<NakedMethod<Void>> __connected = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.Q2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165374a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "connected", (Class<?>[]) new Class[]{ComponentName.class, IBinder.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.IServiceConnectionCAGI._N25
        public NakedMethod<Void> connected() {
            return this.__connected.get();
        }
    }
}
