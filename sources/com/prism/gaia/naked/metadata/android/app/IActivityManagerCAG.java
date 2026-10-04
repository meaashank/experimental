package com.prism.gaia.naked.metadata.android.app;

import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.app.IActivityManagerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class IActivityManagerCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165322G = new Impl_G();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165321C = new Impl_C();
    public static Impl__K20 _K20 = new Impl__K20();
    public static Impl__N25 _N25 = new Impl__N25();
    public static Impl_L21_M23 L21_M23 = new Impl_L21_M23();
    public static Impl_N24 N24 = new Impl_N24();
    public static Impl_N21_ N21_ = new Impl_N21_();

    @W6.m
    public static final class Impl_C implements IActivityManagerCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.app.IActivityManager");
        private InitOnceTry<NakedMethod<Integer>> __startActivity = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.r2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165535a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedMethod<Integer>> __startActivityWithFeature = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.s2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165541a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "startActivity");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "startActivityWithFeature");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.IActivityManagerCAGI.C
        public NakedMethod<Integer> startActivity() {
            return this.__startActivity.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.IActivityManagerCAGI.C
        public NakedMethod<Integer> startActivityWithFeature() {
            return this.__startActivityWithFeature.get();
        }
    }

    @W6.l
    public static final class Impl_G implements IActivityManagerCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.IActivityManager");
        private InitOnce<NakedMethod<Integer>> __getTaskForActivity = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.t2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165546a.lambda$new$0();
            }
        });
        private InitOnce<NakedMethod<Void>> __setRequestedOrientation = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.u2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165551a.lambda$new$1();
            }
        });
        private InitOnce<NakedMethod<Void>> __overridePendingTransition = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.v2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165556a.lambda$new$2();
            }
        });
        private InitOnce<NakedMethod<Integer>> __startActivities = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.w2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165561a.lambda$new$3();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getTaskForActivity", (Class<?>[]) new Class[]{IBinder.class, Boolean.TYPE});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "setRequestedOrientation", (Class<?>[]) new Class[]{IBinder.class, Integer.TYPE});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$2() throws Exception {
            Class clsORG_CLASS = ORG_CLASS();
            Class cls = Integer.TYPE;
            return new NakedMethod((Class<?>) clsORG_CLASS, "overridePendingTransition", (Class<?>[]) new Class[]{IBinder.class, String.class, cls, cls});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$3() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "startActivities");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.IActivityManagerCAGI.G
        public NakedMethod<Integer> getTaskForActivity() {
            return this.__getTaskForActivity.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.IActivityManagerCAGI.G
        public NakedMethod<Void> overridePendingTransition() {
            return this.__overridePendingTransition.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.IActivityManagerCAGI.G
        public NakedMethod<Void> setRequestedOrientation() {
            return this.__setRequestedOrientation.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.IActivityManagerCAGI.G
        public NakedMethod<Integer> startActivities() {
            return this.__startActivities.get();
        }
    }

    @W6.l
    public static final class Impl_L21_M23 implements IActivityManagerCAGI.L21_M23 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.IActivityManager");
        private InitOnce<NakedMethod<Boolean>> __finishActivity = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.x2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165566a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "finishActivity", (Class<?>[]) new Class[]{IBinder.class, Integer.TYPE, Intent.class, Boolean.TYPE});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.IActivityManagerCAGI.L21_M23
        public NakedMethod<Boolean> finishActivity() {
            return this.__finishActivity.get();
        }
    }

    @W6.l
    public static final class Impl_N21_ implements IActivityManagerCAGI.N21_ {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.IActivityManager");
        private InitOnce<NakedMethod<Void>> __addPackageDependency = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.y2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165571a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "addPackageDependency", (Class<?>[]) new Class[]{String.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.IActivityManagerCAGI.N21_
        public NakedMethod<Void> addPackageDependency() {
            return this.__addPackageDependency.get();
        }
    }

    @W6.l
    public static final class Impl_N24 implements IActivityManagerCAGI.N24 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.IActivityManager");
        private InitOnce<NakedMethod<Boolean>> __finishActivity = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.z2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165576a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            Class clsORG_CLASS = ORG_CLASS();
            Class cls = Integer.TYPE;
            return new NakedMethod((Class<?>) clsORG_CLASS, "finishActivity", (Class<?>[]) new Class[]{IBinder.class, cls, Intent.class, cls});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.IActivityManagerCAGI.N24
        public NakedMethod<Boolean> finishActivity() {
            return this.__finishActivity.get();
        }
    }

    @W6.l
    public static final class Impl__K20 implements IActivityManagerCAGI._K20 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.IActivityManager");
        private InitOnce<NakedMethod<Boolean>> __finishActivity = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.A2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165267a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "finishActivity", (Class<?>[]) new Class[]{IBinder.class, Integer.TYPE, Intent.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.IActivityManagerCAGI._K20
        public NakedMethod<Boolean> finishActivity() {
            return this.__finishActivity.get();
        }
    }

    public static final class Impl__N25 implements IActivityManagerCAGI._N25 {
        public Impl_ContentProviderHolder ContentProviderHolder = new Impl_ContentProviderHolder();

        @W6.l
        public static final class Impl_ContentProviderHolder implements IActivityManagerCAGI._N25.ContentProviderHolder {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.IActivityManager$ContentProviderHolder");
            private InitOnce<NakedConstructor<Object>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.B2
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165282a.lambda$new$0();
                }
            });
            private InitOnce<NakedObject<ProviderInfo>> __info = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.C2
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165287a.lambda$new$1();
                }
            });
            private InitOnce<NakedObject<IInterface>> __provider = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.D2
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165293a.lambda$new$2();
                }
            });
            private InitOnce<NakedObject<IBinder>> __connection = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.E2
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165299a.lambda$new$3();
                }
            });
            private InitOnce<NakedBoolean> __noReleaseNeeded = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.F2
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165304a.lambda$new$4();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
                return new NakedConstructor((Class<?>) ORG_CLASS(), (Class<?>[]) new Class[]{ProviderInfo.class});
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$1() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "info");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$2() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "provider");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$3() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "connection");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedBoolean lambda$new$4() throws Exception {
                return new NakedBoolean((Class<?>) ORG_CLASS(), "noReleaseNeeded");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.IActivityManagerCAGI._N25.ContentProviderHolder
            public NakedObject<IBinder> connection() {
                return this.__connection.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.IActivityManagerCAGI._N25.ContentProviderHolder
            public NakedConstructor<Object> ctor() {
                return this.__ctor.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.IActivityManagerCAGI._N25.ContentProviderHolder
            public NakedObject<ProviderInfo> info() {
                return this.__info.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.IActivityManagerCAGI._N25.ContentProviderHolder
            public NakedBoolean noReleaseNeeded() {
                return this.__noReleaseNeeded.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.IActivityManagerCAGI._N25.ContentProviderHolder
            public NakedObject<IInterface> provider() {
                return this.__provider.get();
            }
        }
    }
}
