package com.prism.gaia.naked.metadata.android.os;

import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.os.EnvironmentCAGI;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class EnvironmentCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165865G = new Impl_G();
    public static Impl_K19 K19 = new Impl_K19();
    public static Impl_Q29 Q29 = new Impl_Q29();
    public static Impl_S31 S31 = new Impl_S31();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165864C = new Impl_C();

    @W6.m
    public static final class Impl_C implements EnvironmentCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.os.Environment");
        private InitOnceTry<NakedStaticObject<String>> __DIR_ANDROID = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.l
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165915a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedStaticObject<String>> __DIRECTORY_ANDROID = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.m
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165916a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "DIR_ANDROID");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$1() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "DIRECTORY_ANDROID");
        }

        @Override // com.prism.gaia.naked.metadata.android.os.EnvironmentCAGI.C
        public NakedStaticObject<String> DIRECTORY_ANDROID() {
            return this.__DIRECTORY_ANDROID.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.EnvironmentCAGI.C
        public NakedStaticObject<String> DIR_ANDROID() {
            return this.__DIR_ANDROID.get();
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }

    @W6.l
    public static final class Impl_G implements EnvironmentCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.os.Environment");
        private InitOnce<NakedStaticObject<Object>> __sCurrentUser = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.n
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165918a.lambda$new$0();
            }
        });
        private InitOnce<NakedStaticObject<String>> __DIRECTORY_MUSIC = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.o
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165919a.lambda$new$1();
            }
        });
        private InitOnce<NakedStaticObject<String>> __DIRECTORY_PODCASTS = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.p
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165920a.lambda$new$2();
            }
        });
        private InitOnce<NakedStaticObject<String>> __DIRECTORY_RINGTONES = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.q
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165921a.lambda$new$3();
            }
        });
        private InitOnce<NakedStaticObject<String>> __DIRECTORY_ALARMS = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.r
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165922a.lambda$new$4();
            }
        });
        private InitOnce<NakedStaticObject<String>> __DIRECTORY_NOTIFICATIONS = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.s
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165923a.lambda$new$5();
            }
        });
        private InitOnce<NakedStaticObject<String>> __DIRECTORY_PICTURES = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.t
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165927a.lambda$new$6();
            }
        });
        private InitOnce<NakedStaticObject<String>> __DIRECTORY_MOVIES = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.u
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165928a.lambda$new$7();
            }
        });
        private InitOnce<NakedStaticObject<String>> __DIRECTORY_DOWNLOADS = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.v
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165929a.lambda$new$8();
            }
        });
        private InitOnce<NakedStaticObject<String>> __DIRECTORY_DCIM = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.w
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165930a.lambda$new$9();
            }
        });
        public Impl_UserEnvironmentN UserEnvironmentN = new Impl_UserEnvironmentN();

        public static final class Impl_UserEnvironmentN implements EnvironmentCAGI.G.UserEnvironmentN {

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            public Impl_L f165866L = new Impl_L();

            @W6.l
            public static final class Impl_L implements EnvironmentCAGI.G.UserEnvironmentN.L {
                private InitOnceClass __ORG_CLASS = new InitOnceClass("android.os.Environment$UserEnvironment");
                private InitOnce<NakedObject<File[]>> __mExternalDirsForApp = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.x
                    @Override // com.prism.gaia.naked.core.InitOnce.Init
                    public final Object onInit() {
                        return this.f165931a.lambda$new$0();
                    }
                });

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                    return new NakedObject((Class<?>) ORG_CLASS(), "mExternalDirsForApp");
                }

                @Override // com.prism.gaia.naked.core.ClassAccessor
                public Class ORG_CLASS() {
                    return this.__ORG_CLASS.get();
                }

                @Override // com.prism.gaia.naked.metadata.android.os.EnvironmentCAGI.G.UserEnvironmentN.L
                public NakedObject<File[]> mExternalDirsForApp() {
                    return this.__mExternalDirsForApp.get();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "sCurrentUser");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$1() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "DIRECTORY_MUSIC");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$2() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "DIRECTORY_PODCASTS");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$3() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "DIRECTORY_RINGTONES");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$4() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "DIRECTORY_ALARMS");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$5() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "DIRECTORY_NOTIFICATIONS");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$6() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "DIRECTORY_PICTURES");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$7() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "DIRECTORY_MOVIES");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$8() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "DIRECTORY_DOWNLOADS");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$9() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "DIRECTORY_DCIM");
        }

        @Override // com.prism.gaia.naked.metadata.android.os.EnvironmentCAGI.G
        public NakedStaticObject<String> DIRECTORY_ALARMS() {
            return this.__DIRECTORY_ALARMS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.EnvironmentCAGI.G
        public NakedStaticObject<String> DIRECTORY_DCIM() {
            return this.__DIRECTORY_DCIM.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.EnvironmentCAGI.G
        public NakedStaticObject<String> DIRECTORY_DOWNLOADS() {
            return this.__DIRECTORY_DOWNLOADS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.EnvironmentCAGI.G
        public NakedStaticObject<String> DIRECTORY_MOVIES() {
            return this.__DIRECTORY_MOVIES.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.EnvironmentCAGI.G
        public NakedStaticObject<String> DIRECTORY_MUSIC() {
            return this.__DIRECTORY_MUSIC.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.EnvironmentCAGI.G
        public NakedStaticObject<String> DIRECTORY_NOTIFICATIONS() {
            return this.__DIRECTORY_NOTIFICATIONS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.EnvironmentCAGI.G
        public NakedStaticObject<String> DIRECTORY_PICTURES() {
            return this.__DIRECTORY_PICTURES.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.EnvironmentCAGI.G
        public NakedStaticObject<String> DIRECTORY_PODCASTS() {
            return this.__DIRECTORY_PODCASTS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.EnvironmentCAGI.G
        public NakedStaticObject<String> DIRECTORY_RINGTONES() {
            return this.__DIRECTORY_RINGTONES.get();
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.EnvironmentCAGI.G
        public NakedStaticObject<Object> sCurrentUser() {
            return this.__sCurrentUser.get();
        }
    }

    @W6.l
    public static final class Impl_K19 implements EnvironmentCAGI.K19 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.os.Environment");
        private InitOnce<NakedStaticObject<String>> __DIRECTORY_DOCUMENTS = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.y
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165932a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "DIRECTORY_DOCUMENTS");
        }

        @Override // com.prism.gaia.naked.metadata.android.os.EnvironmentCAGI.K19
        public NakedStaticObject<String> DIRECTORY_DOCUMENTS() {
            return this.__DIRECTORY_DOCUMENTS.get();
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }

    @W6.l
    public static final class Impl_Q29 implements EnvironmentCAGI.Q29 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.os.Environment");
        private InitOnce<NakedStaticObject<String>> __DIRECTORY_SCREENSHOTS = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.z
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165933a.lambda$new$0();
            }
        });
        private InitOnce<NakedStaticObject<String>> __DIRECTORY_AUDIOBOOKS = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.A
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165852a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "DIRECTORY_SCREENSHOTS");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$1() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "DIRECTORY_AUDIOBOOKS");
        }

        @Override // com.prism.gaia.naked.metadata.android.os.EnvironmentCAGI.Q29
        public NakedStaticObject<String> DIRECTORY_AUDIOBOOKS() {
            return this.__DIRECTORY_AUDIOBOOKS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.EnvironmentCAGI.Q29
        public NakedStaticObject<String> DIRECTORY_SCREENSHOTS() {
            return this.__DIRECTORY_SCREENSHOTS.get();
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }

    @W6.l
    public static final class Impl_S31 implements EnvironmentCAGI.S31 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.os.Environment");
        private InitOnce<NakedStaticObject<String>> __DIR_DATA = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.B
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165853a.lambda$new$0();
            }
        });
        private InitOnce<NakedStaticObject<String>> __DIRECTORY_RECORDINGS = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.C
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165861a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "DIR_DATA");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$1() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "DIRECTORY_RECORDINGS");
        }

        @Override // com.prism.gaia.naked.metadata.android.os.EnvironmentCAGI.S31
        public NakedStaticObject<String> DIRECTORY_RECORDINGS() {
            return this.__DIRECTORY_RECORDINGS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.EnvironmentCAGI.S31
        public NakedStaticObject<String> DIR_DATA() {
            return this.__DIR_DATA.get();
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }
}
