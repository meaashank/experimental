package com.prism.gaia.naked.metadata.android.net;

import android.net.NetworkInfo;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.net.NetworkInfoCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class NetworkInfoCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165834G = new Impl_G();

    @W6.l
    public static final class Impl_G implements NetworkInfoCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) NetworkInfo.class);
        private InitOnce<NakedConstructor<NetworkInfo>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.net.e
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165840a.lambda$new$0();
            }
        });
        private InitOnce<NakedConstructor<NetworkInfo>> __ctorOld = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.net.f
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165841a.lambda$new$1();
            }
        });
        private InitOnce<NakedInt> __mNetworkType = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.net.g
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165842a.lambda$new$2();
            }
        });
        private InitOnce<NakedObject<String>> __mTypeName = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.net.h
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165843a.lambda$new$3();
            }
        });
        private InitOnce<NakedObject<NetworkInfo.State>> __mState = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.net.i
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165844a.lambda$new$4();
            }
        });
        private InitOnce<NakedObject<NetworkInfo.DetailedState>> __mDetailedState = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.net.j
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165845a.lambda$new$5();
            }
        });
        private InitOnce<NakedBoolean> __mIsAvailable = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.net.k
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165846a.lambda$new$6();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            Class clsORG_CLASS = ORG_CLASS();
            Class cls = Integer.TYPE;
            return new NakedConstructor((Class<?>) clsORG_CLASS, (Class<?>[]) new Class[]{cls, cls, String.class, String.class});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$1() throws Exception {
            return new NakedConstructor((Class<?>) ORG_CLASS(), (Class<?>[]) new Class[]{Integer.TYPE});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$2() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mNetworkType");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$3() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mTypeName");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$4() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mState");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$5() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mDetailedState");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedBoolean lambda$new$6() throws Exception {
            return new NakedBoolean((Class<?>) ORG_CLASS(), "mIsAvailable");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.net.NetworkInfoCAGI.G
        public NakedConstructor<NetworkInfo> ctor() {
            return this.__ctor.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.net.NetworkInfoCAGI.G
        public NakedConstructor<NetworkInfo> ctorOld() {
            return this.__ctorOld.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.net.NetworkInfoCAGI.G
        public NakedObject<NetworkInfo.DetailedState> mDetailedState() {
            return this.__mDetailedState.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.net.NetworkInfoCAGI.G
        public NakedBoolean mIsAvailable() {
            return this.__mIsAvailable.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.net.NetworkInfoCAGI.G
        public NakedInt mNetworkType() {
            return this.__mNetworkType.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.net.NetworkInfoCAGI.G
        public NakedObject<NetworkInfo.State> mState() {
            return this.__mState.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.net.NetworkInfoCAGI.G
        public NakedObject<String> mTypeName() {
            return this.__mTypeName.get();
        }
    }
}
