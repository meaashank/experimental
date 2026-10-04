package com.prism.gaia.naked.metadata.androidx.core.app;

import W6.c;
import W6.l;
import android.app.Notification;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.androidx.core.app.NotificationCompatCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class NotificationCompatCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165974G = new Impl_G();

    @l
    public static final class Impl_G implements NotificationCompatCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("androidx.core.app.NotificationCompat");
        public Impl_Builder Builder = new Impl_Builder();

        @l
        public static final class Impl_Builder implements NotificationCompatCAGI.G.Builder {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("androidx.core.app.NotificationCompat$Builder");
            private InitOnce<NakedObject<Notification>> __mNotification = new InitOnce<>(new InitOnce.Init() { // from class: p9.a
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226379a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mNotification");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.androidx.core.app.NotificationCompatCAGI.G.Builder
            public NakedObject<Notification> mNotification() {
                return this.__mNotification.get();
            }
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }
}
