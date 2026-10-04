package com.prism.gaia.naked.metadata.android.database;

import W6.l;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.database.ContentObserverCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class ContentObserverCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165807G = new Impl_G();
    public static Impl__I15 _I15 = new Impl__I15();
    public static Impl_J16 J16 = new Impl_J16();

    @l
    public static final class Impl_G implements ContentObserverCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.database.ContentObserver");
        private InitOnce<NakedObject<Handler>> __mHandler = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.database.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165808a.lambda$new$0();
            }
        });
        public Impl_Transport Transport = new Impl_Transport();

        @l
        public static final class Impl_Transport implements ContentObserverCAGI.G.Transport {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.database.ContentObserver$Transport");
            private InitOnce<NakedObject<ContentObserver>> __mContentObserver = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.database.b
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165809a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mContentObserver");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.database.ContentObserverCAGI.G.Transport
            public NakedObject<ContentObserver> mContentObserver() {
                return this.__mContentObserver.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mHandler");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.database.ContentObserverCAGI.G
        public NakedObject<Handler> mHandler() {
            return this.__mHandler.get();
        }
    }

    @l
    public static final class Impl_J16 implements ContentObserverCAGI.J16 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.database.ContentObserver");
        private InitOnce<NakedMethod<Void>> __dispatchChange = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.database.c
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165810a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "dispatchChange", (Class<?>[]) new Class[]{Boolean.TYPE, Uri.class, Integer.TYPE});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.database.ContentObserverCAGI.J16
        public NakedMethod<Void> dispatchChange() {
            return this.__dispatchChange.get();
        }
    }

    @l
    public static final class Impl__I15 implements ContentObserverCAGI._I15 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.database.ContentObserver");
        private InitOnce<NakedMethod<Void>> __dispatchChange = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.database.d
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165811a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "dispatchChange", (Class<?>[]) new Class[]{Boolean.TYPE});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.database.ContentObserverCAGI._I15
        public NakedMethod<Void> dispatchChange() {
            return this.__dispatchChange.get();
        }
    }
}
