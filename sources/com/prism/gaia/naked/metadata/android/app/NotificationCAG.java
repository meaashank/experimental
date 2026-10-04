package com.prism.gaia.naked.metadata.android.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.app.NotificationCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class NotificationCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165357G = new Impl_G();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static Impl_L f165358L = new Impl_L();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static Impl_M f165359M = new Impl_M();
    public static Impl_O26 O26 = new Impl_O26();

    @W6.l
    public static final class Impl_G implements NotificationCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Notification.class);
        private InitOnce<NakedObject<Uri>> __sound = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.r3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165536a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<Bundle>> __extras = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.s3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165542a.lambda$new$1();
            }
        });
        private InitOnce<NakedMethod<Void>> __setLatestEventInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.t3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165547a.lambda$new$2();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "sound");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "extras");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$2() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "setLatestEventInfo", (Class<?>[]) new Class[]{Context.class, CharSequence.class, CharSequence.class, PendingIntent.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.NotificationCAGI.G
        public NakedObject<Bundle> extras() {
            return this.__extras.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.NotificationCAGI.G
        public NakedMethod<Void> setLatestEventInfo() {
            return this.__setLatestEventInfo.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.NotificationCAGI.G
        public NakedObject<Uri> sound() {
            return this.__sound.get();
        }
    }

    @W6.l
    public static final class Impl_L implements NotificationCAGI.L {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Notification.class);
        public Impl_Builder Builder = new Impl_Builder();

        @W6.l
        public static final class Impl_Builder implements NotificationCAGI.L.Builder {
            private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Notification.Builder.class);
            private InitOnce<NakedStaticMethod<Notification>> __rebuild = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.u3
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165552a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
                return new NakedStaticMethod((Class<?>) ORG_CLASS(), "rebuild", (Class<?>[]) new Class[]{Context.class, Notification.class});
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.NotificationCAGI.L.Builder
            public NakedStaticMethod<Notification> rebuild() {
                return this.__rebuild.get();
            }
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }

    @W6.l
    public static final class Impl_M implements NotificationCAGI.M {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Notification.class);
        private InitOnce<NakedObject<Icon>> __mLargeIcon = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.v3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165557a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<Icon>> __mSmallIcon = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.w3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165562a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mLargeIcon");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mSmallIcon");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.NotificationCAGI.M
        public NakedObject<Icon> mLargeIcon() {
            return this.__mLargeIcon.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.NotificationCAGI.M
        public NakedObject<Icon> mSmallIcon() {
            return this.__mSmallIcon.get();
        }
    }

    @W6.l
    public static final class Impl_O26 implements NotificationCAGI.O26 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Notification.class);
        private InitOnce<NakedObject<String>> __mChannelId = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.x3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165567a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mChannelId");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.NotificationCAGI.O26
        public NakedObject<String> mChannelId() {
            return this.__mChannelId.get();
        }
    }
}
