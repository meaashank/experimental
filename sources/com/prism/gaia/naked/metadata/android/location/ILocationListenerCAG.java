package com.prism.gaia.naked.metadata.android.location;

import W6.c;
import W6.l;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.location.ILocationListenerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ILocationListenerCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165818G = new Impl_G();

    @l
    public static final class Impl_G implements ILocationListenerCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.location.ILocationListener");
        private InitOnce<NakedMethod<Void>> __onLocationChanged = new InitOnce<>(new InitOnce.Init() { // from class: V8.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f76370a.lambda$new$0();
            }
        });
        public Impl_Stub Stub = new Impl_Stub();

        @l
        public static final class Impl_Stub implements ILocationListenerCAGI.G.Stub {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.location.ILocationListener$Stub");
            private InitOnce<NakedStaticMethod<IInterface>> __asInterface = new InitOnce<>(new InitOnce.Init() { // from class: V8.b
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76371a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
                return new NakedStaticMethod((Class<?>) ORG_CLASS(), "asInterface", (Class<?>[]) new Class[]{IBinder.class});
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.location.ILocationListenerCAGI.G.Stub
            public NakedStaticMethod<IInterface> asInterface() {
                return this.__asInterface.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "onLocationChanged", (Class<?>[]) new Class[]{Location.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.location.ILocationListenerCAGI.G
        public NakedMethod<Void> onLocationChanged() {
            return this.__onLocationChanged.get();
        }
    }
}
