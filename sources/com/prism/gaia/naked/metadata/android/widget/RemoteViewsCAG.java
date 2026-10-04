package com.prism.gaia.naked.metadata.android.widget;

import W6.c;
import W6.l;
import android.content.pm.ApplicationInfo;
import android.widget.RemoteViews;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.widget.RemoteViewsCAGI;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class RemoteViewsCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165972G = new Impl_G();
    public static Impl__L21 _L21 = new Impl__L21();
    public static Impl_L21 L21 = new Impl_L21();

    @l
    public static final class Impl_G implements RemoteViewsCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) RemoteViews.class);
        private InitOnce<NakedObject<ArrayList<Object>>> __mActions = new InitOnce<>(new InitOnce.Init() { // from class: o9.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f223388a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mActions");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.widget.RemoteViewsCAGI.G
        public NakedObject<ArrayList<Object>> mActions() {
            return this.__mActions.get();
        }
    }

    @l
    public static final class Impl_L21 implements RemoteViewsCAGI.L21 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) RemoteViews.class);
        private InitOnce<NakedObject<ApplicationInfo>> __mApplication = new InitOnce<>(new InitOnce.Init() { // from class: o9.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f223389a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mApplication");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.widget.RemoteViewsCAGI.L21
        public NakedObject<ApplicationInfo> mApplication() {
            return this.__mApplication.get();
        }
    }

    @l
    public static final class Impl__L21 implements RemoteViewsCAGI._L21 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) RemoteViews.class);
        private InitOnce<NakedObject<String>> __mPackage = new InitOnce<>(new InitOnce.Init() { // from class: o9.c
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f223390a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mPackage");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.widget.RemoteViewsCAGI._L21
        public NakedObject<String> mPackage() {
            return this.__mPackage.get();
        }
    }
}
