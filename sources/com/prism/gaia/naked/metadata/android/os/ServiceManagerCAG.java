package com.prism.gaia.naked.metadata.android.os;

import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.os.ServiceManagerCAGI;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class ServiceManagerCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165890G = new Impl_G();

    @W6.l
    public static final class Impl_G implements ServiceManagerCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.os.ServiceManager");
        private InitOnce<NakedStaticMethod<Void>> __addService = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.S
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165889a.lambda$new$0();
            }
        });
        private InitOnce<NakedStaticMethod<IBinder>> __checkService = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.T
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165893a.lambda$new$1();
            }
        });
        private InitOnce<NakedStaticMethod<IInterface>> __getIServiceManager = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.U
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165894a.lambda$new$2();
            }
        });
        private InitOnce<NakedStaticMethod<IBinder>> __getService = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.V
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165896a.lambda$new$3();
            }
        });
        private InitOnce<NakedStaticMethod<String[]>> __listServices = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.W
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165897a.lambda$new$4();
            }
        });
        private InitOnce<NakedStaticObject<Map<String, IBinder>>> __sCache = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.X
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165898a.lambda$new$5();
            }
        });
        private InitOnce<NakedStaticObject<IInterface>> __sServiceManager = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.Y
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165899a.lambda$new$6();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "addService", (Class<?>[]) new Class[]{String.class, IBinder.class});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$1() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "checkService");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$2() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "getIServiceManager");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$3() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "getService");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$4() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "listServices");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$5() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "sCache");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$6() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "sServiceManager");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.ServiceManagerCAGI.G
        public NakedStaticMethod<Void> addService() {
            return this.__addService.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.ServiceManagerCAGI.G
        public NakedStaticMethod<IBinder> checkService() {
            return this.__checkService.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.ServiceManagerCAGI.G
        public NakedStaticMethod<IInterface> getIServiceManager() {
            return this.__getIServiceManager.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.ServiceManagerCAGI.G
        public NakedStaticMethod<IBinder> getService() {
            return this.__getService.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.ServiceManagerCAGI.G
        public NakedStaticMethod<String[]> listServices() {
            return this.__listServices.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.ServiceManagerCAGI.G
        public NakedStaticObject<Map<String, IBinder>> sCache() {
            return this.__sCache.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.ServiceManagerCAGI.G
        public NakedStaticObject<IInterface> sServiceManager() {
            return this.__sServiceManager.get();
        }
    }
}
