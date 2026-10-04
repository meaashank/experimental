package com.prism.gaia.naked.metadata.android.app;

import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Instrumentation;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.os.Handler;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class LoadedApkCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165347G = new Impl_G();
    public static Impl__T33 _T33 = new Impl__T33();
    public static Impl_T33 T33 = new Impl_T33();
    public static Impl_U34 U34 = new Impl_U34();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165345C = new Impl_C();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static Impl_D f165346D = new Impl_D();

    @W6.m
    public static final class Impl_C implements LoadedApkCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.app.LoadedApk");
        private InitOnceTry<NakedObject<AppComponentFactory>> __mAppComponentFactory = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.T2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165388a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mAppComponentFactory");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.C
        public NakedObject<AppComponentFactory> mAppComponentFactory() {
            return this.__mAppComponentFactory.get();
        }
    }

    public static final class Impl_D implements LoadedApkCAGI.D {
        public Impl_HuaWei HuaWei = new Impl_HuaWei();

        public static final class Impl_HuaWei implements LoadedApkCAGI.D.HuaWei {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            public Impl_C f165348C = new Impl_C();

            @W6.m
            public static final class Impl_C implements LoadedApkCAGI.D.HuaWei.C {
                private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.app.LoadedApk");
                private InitOnceTry<NakedObject<Object>> __mReceiverResource = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.U2
                    @Override // com.prism.gaia.naked.core.InitOnce.Init
                    public final Object onInit() {
                        return this.f165392a.lambda$new$0();
                    }
                });

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                    return new NakedObject((Class<?>) ORG_CLASS(), "mReceiverResource");
                }

                @Override // com.prism.gaia.naked.core.ClassAccessor
                public Class ORG_CLASS() {
                    return this.__ORG_CLASS.get();
                }

                @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.D.HuaWei.C
                public NakedObject<Object> mReceiverResource() {
                    return this.__mReceiverResource.get();
                }
            }
        }
    }

    @W6.l
    public static final class Impl_G implements LoadedApkCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.LoadedApk");
        private InitOnce<NakedObject<ApplicationInfo>> __mApplicationInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.V2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165396a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<Application>> __mApplication = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.c3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165431a.lambda$new$1();
            }
        });
        private InitOnce<NakedObject<ClassLoader>> __mBaseClassLoader = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.d3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165436a.lambda$new$2();
            }
        });
        private InitOnce<NakedObject<ClassLoader>> __mDefaultClassLoader = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.e3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165441a.lambda$new$3();
            }
        });
        private InitOnce<NakedObject<ClassLoader>> __mClassLoader = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.f3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165446a.lambda$new$4();
            }
        });
        private InitOnce<NakedObject<Resources>> __mResources = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.g3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165451a.lambda$new$5();
            }
        });
        private InitOnce<NakedObject<Object>> __mServices = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.h3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165456a.lambda$new$6();
            }
        });
        private InitOnce<NakedBoolean> __mIncludeCode = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.W2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165400a.lambda$new$7();
            }
        });
        private InitOnce<NakedMethod<Application>> __makeApplication = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.X2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165404a.lambda$new$8();
            }
        });
        private InitOnce<NakedMethod<ClassLoader>> __getClassLoader = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.Y2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165408a.lambda$new$9();
            }
        });
        private InitOnce<NakedMethod<IInterface>> __forgetServiceDispatcher = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.Z2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165412a.lambda$new$10();
            }
        });
        private InitOnce<NakedMethod<IInterface>> __getReceiverDispatcher = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.a3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165417a.lambda$new$11();
            }
        });
        private InitOnce<NakedMethod<IInterface>> __forgetReceiverDispatcher = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.b3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165425a.lambda$new$12();
            }
        });
        public Impl_ServiceDispatcher ServiceDispatcher = new Impl_ServiceDispatcher();
        public Impl_ReceiverDispatcher ReceiverDispatcher = new Impl_ReceiverDispatcher();

        @W6.l
        public static final class Impl_ReceiverDispatcher implements LoadedApkCAGI.G.ReceiverDispatcher {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.LoadedApk$ReceiverDispatcher");
            private InitOnce<NakedObject<BroadcastReceiver>> __mReceiver = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.i3
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165461a.lambda$new$0();
                }
            });
            private InitOnce<NakedObject<Context>> __mContext = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.j3
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165466a.lambda$new$1();
                }
            });
            private InitOnce<NakedObject<Handler>> __mActivityThread = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.k3
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165501a.lambda$new$2();
                }
            });
            public Impl_InnerReceiver InnerReceiver = new Impl_InnerReceiver();

            @W6.l
            public static final class Impl_InnerReceiver implements LoadedApkCAGI.G.ReceiverDispatcher.InnerReceiver {
                private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.LoadedApk$ReceiverDispatcher$InnerReceiver");
                private InitOnce<NakedObject<WeakReference<Object>>> __mDispatcher = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.l3
                    @Override // com.prism.gaia.naked.core.InitOnce.Init
                    public final Object onInit() {
                        return this.f165506a.lambda$new$0();
                    }
                });

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                    return new NakedObject((Class<?>) ORG_CLASS(), "mDispatcher");
                }

                @Override // com.prism.gaia.naked.core.ClassAccessor
                public Class ORG_CLASS() {
                    return this.__ORG_CLASS.get();
                }

                @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.G.ReceiverDispatcher.InnerReceiver
                public NakedObject<WeakReference<Object>> mDispatcher() {
                    return this.__mDispatcher.get();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mReceiver");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$1() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mContext");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$2() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mActivityThread");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.G.ReceiverDispatcher
            public NakedObject<Handler> mActivityThread() {
                return this.__mActivityThread.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.G.ReceiverDispatcher
            public NakedObject<Context> mContext() {
                return this.__mContext.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.G.ReceiverDispatcher
            public NakedObject<BroadcastReceiver> mReceiver() {
                return this.__mReceiver.get();
            }
        }

        @W6.l
        public static final class Impl_ServiceDispatcher implements LoadedApkCAGI.G.ServiceDispatcher {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.LoadedApk$ServiceDispatcher");
            private InitOnce<NakedObject<ServiceConnection>> __mConnection = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.m3
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165511a.lambda$new$0();
                }
            });
            public Impl_InnerConnection InnerConnection = new Impl_InnerConnection();

            @W6.l
            public static final class Impl_InnerConnection implements LoadedApkCAGI.G.ServiceDispatcher.InnerConnection {
                private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.LoadedApk$ServiceDispatcher$InnerConnection");
                private InitOnce<NakedObject<WeakReference<Object>>> __mDispatcher = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.n3
                    @Override // com.prism.gaia.naked.core.InitOnce.Init
                    public final Object onInit() {
                        return this.f165516a.lambda$new$0();
                    }
                });

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                    return new NakedObject((Class<?>) ORG_CLASS(), "mDispatcher");
                }

                @Override // com.prism.gaia.naked.core.ClassAccessor
                public Class ORG_CLASS() {
                    return this.__ORG_CLASS.get();
                }

                @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.G.ServiceDispatcher.InnerConnection
                public NakedObject<WeakReference<Object>> mDispatcher() {
                    return this.__mDispatcher.get();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mConnection");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.G.ServiceDispatcher
            public NakedObject<ServiceConnection> mConnection() {
                return this.__mConnection.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mApplicationInfo");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mApplication");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$10() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "forgetServiceDispatcher", (Class<?>[]) new Class[]{Context.class, ServiceConnection.class});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$11() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getReceiverDispatcher", (Class<?>[]) new Class[]{BroadcastReceiver.class, Context.class, Handler.class, Instrumentation.class, Boolean.TYPE});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$12() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "forgetReceiverDispatcher", (Class<?>[]) new Class[]{Context.class, BroadcastReceiver.class});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$2() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mBaseClassLoader");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$3() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mDefaultClassLoader");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$4() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mClassLoader");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$5() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mResources");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$6() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mServices");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedBoolean lambda$new$7() throws Exception {
            return new NakedBoolean((Class<?>) ORG_CLASS(), "mIncludeCode");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$8() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "makeApplication", (Class<?>[]) new Class[]{Boolean.TYPE, Instrumentation.class});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$9() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getClassLoader");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.G
        public NakedMethod<IInterface> forgetReceiverDispatcher() {
            return this.__forgetReceiverDispatcher.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.G
        public NakedMethod<IInterface> forgetServiceDispatcher() {
            return this.__forgetServiceDispatcher.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.G
        public NakedMethod<ClassLoader> getClassLoader() {
            return this.__getClassLoader.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.G
        public NakedMethod<IInterface> getReceiverDispatcher() {
            return this.__getReceiverDispatcher.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.G
        public NakedObject<Application> mApplication() {
            return this.__mApplication.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.G
        public NakedObject<ApplicationInfo> mApplicationInfo() {
            return this.__mApplicationInfo.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.G
        public NakedObject<ClassLoader> mBaseClassLoader() {
            return this.__mBaseClassLoader.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.G
        public NakedObject<ClassLoader> mClassLoader() {
            return this.__mClassLoader.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.G
        public NakedObject<ClassLoader> mDefaultClassLoader() {
            return this.__mDefaultClassLoader.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.G
        public NakedBoolean mIncludeCode() {
            return this.__mIncludeCode.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.G
        public NakedObject<Resources> mResources() {
            return this.__mResources.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.G
        public NakedObject<Object> mServices() {
            return this.__mServices.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.G
        public NakedMethod<Application> makeApplication() {
            return this.__makeApplication.get();
        }
    }

    @W6.l
    public static final class Impl_T33 implements LoadedApkCAGI.T33 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.LoadedApk");
        private InitOnce<NakedMethod<Application>> __makeApplicationInner = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.o3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165521a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            Class clsORG_CLASS = ORG_CLASS();
            Class cls = Boolean.TYPE;
            return new NakedMethod((Class<?>) clsORG_CLASS, "makeApplicationInner", (Class<?>[]) new Class[]{cls, Instrumentation.class, cls});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.T33
        public NakedMethod<Application> makeApplicationInner() {
            return this.__makeApplicationInner.get();
        }
    }

    @W6.l
    public static final class Impl_U34 implements LoadedApkCAGI.U34 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.LoadedApk");
        private InitOnce<NakedMethod<IInterface>> __getServiceDispatcher = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.p3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165526a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getServiceDispatcher", (Class<?>[]) new Class[]{ServiceConnection.class, Context.class, Handler.class, Long.TYPE});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI.U34
        public NakedMethod<IInterface> getServiceDispatcher() {
            return this.__getServiceDispatcher.get();
        }
    }

    @W6.l
    public static final class Impl__T33 implements LoadedApkCAGI._T33 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.LoadedApk");
        private InitOnce<NakedMethod<IInterface>> __getServiceDispatcher = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.q3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165531a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getServiceDispatcher", (Class<?>[]) new Class[]{ServiceConnection.class, Context.class, Handler.class, Integer.TYPE});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.LoadedApkCAGI._T33
        public NakedMethod<IInterface> getServiceDispatcher() {
            return this.__getServiceDispatcher.get();
        }
    }
}
