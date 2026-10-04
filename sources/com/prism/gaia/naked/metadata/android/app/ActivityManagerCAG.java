package com.prism.gaia.naked.metadata.android.app;

import android.app.ActivityManager;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticInt;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.app.ActivityManagerCAGI;
import s0.x;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class ActivityManagerCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165271G = new Impl_G();
    public static Impl_M23 M23 = new Impl_M23();
    public static Impl_O26 O26 = new Impl_O26();
    public static Impl_S31 S31 = new Impl_S31();

    @W6.l
    public static final class Impl_G implements ActivityManagerCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) ActivityManager.class);
        private InitOnce<NakedStaticInt> __START_INTENT_NOT_RESOLVED = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.k
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165497a.lambda$new$0();
            }
        });
        private InitOnce<NakedStaticInt> __START_CANCELED = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.l
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165502a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticInt lambda$new$0() throws Exception {
            return new NakedStaticInt((Class<?>) ORG_CLASS(), "START_INTENT_NOT_RESOLVED");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticInt lambda$new$1() throws Exception {
            return new NakedStaticInt((Class<?>) ORG_CLASS(), "START_CANCELED");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityManagerCAGI.G
        public NakedStaticInt START_CANCELED() {
            return this.__START_CANCELED.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityManagerCAGI.G
        public NakedStaticInt START_INTENT_NOT_RESOLVED() {
            return this.__START_INTENT_NOT_RESOLVED.get();
        }
    }

    @W6.l
    public static final class Impl_M23 implements ActivityManagerCAGI.M23 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) ActivityManager.class);
        private InitOnce<NakedStaticInt> __START_NOT_CURRENT_USER_ACTIVITY = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.m
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165507a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticInt lambda$new$0() throws Exception {
            return new NakedStaticInt((Class<?>) ORG_CLASS(), "START_NOT_CURRENT_USER_ACTIVITY");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityManagerCAGI.M23
        public NakedStaticInt START_NOT_CURRENT_USER_ACTIVITY() {
            return this.__START_NOT_CURRENT_USER_ACTIVITY.get();
        }
    }

    @W6.l
    public static final class Impl_O26 implements ActivityManagerCAGI.O26 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) ActivityManager.class);
        private InitOnce<NakedStaticMethod<IInterface>> __getService = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.n
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165512a.lambda$new$0();
            }
        });
        private InitOnce<NakedStaticObject<Object>> __IActivityManagerSingleton = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.o
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165517a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "getService");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$1() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "IActivityManagerSingleton");
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityManagerCAGI.O26
        public NakedStaticObject<Object> IActivityManagerSingleton() {
            return this.__IActivityManagerSingleton.get();
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityManagerCAGI.O26
        public NakedStaticMethod<IInterface> getService() {
            return this.__getService.get();
        }
    }

    @W6.l
    public static final class Impl_S31 implements ActivityManagerCAGI.S31 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) ActivityManager.class);
        public Impl_PendingIntentInfo PendingIntentInfo = new Impl_PendingIntentInfo();

        @W6.m
        public static final class Impl_PendingIntentInfo implements ActivityManagerCAGI.S31.PendingIntentInfo {
            private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.app.ActivityManager$PendingIntentInfo");
            private InitOnceTry<NakedConstructor<?>> __ctor = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.p
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165522a.lambda$new$0();
                }
            });
            private InitOnceTry<NakedObject<String>> __mCreatorPackage = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.q
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165527a.lambda$new$1();
                }
            });
            private InitOnceTry<NakedInt> __mCreatorUid = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.r
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165532a.lambda$new$2();
                }
            });
            private InitOnceTry<NakedBoolean> __mImmutable = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.s
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165538a.lambda$new$3();
                }
            });
            private InitOnceTry<NakedInt> __mIntentSenderType = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.t
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165543a.lambda$new$4();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
                return new NakedConstructor((Class<?>) ORG_CLASS(), new String[]{"java.lang.String", "int", x.b.f238265f, "int"});
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$1() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mCreatorPackage");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$2() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "mCreatorUid");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedBoolean lambda$new$3() throws Exception {
                return new NakedBoolean((Class<?>) ORG_CLASS(), "mImmutable");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$4() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "mIntentSenderType");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityManagerCAGI.S31.PendingIntentInfo
            public NakedConstructor<?> ctor() {
                return this.__ctor.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityManagerCAGI.S31.PendingIntentInfo
            public NakedObject<String> mCreatorPackage() {
                return this.__mCreatorPackage.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityManagerCAGI.S31.PendingIntentInfo
            public NakedInt mCreatorUid() {
                return this.__mCreatorUid.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityManagerCAGI.S31.PendingIntentInfo
            public NakedBoolean mImmutable() {
                return this.__mImmutable.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityManagerCAGI.S31.PendingIntentInfo
            public NakedInt mIntentSenderType() {
                return this.__mIntentSenderType.get();
            }
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }
}
