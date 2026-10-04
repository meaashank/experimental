package com.prism.gaia.naked.metadata.android.os.storage;

import W6.c;
import W6.l;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.os.storage.StorageVolumeCAGI;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class StorageVolumeCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165926G = new Impl_G();
    public static Impl_P28 P28 = new Impl_P28();

    @l
    public static final class Impl_G implements StorageVolumeCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.os.storage.StorageVolume");
        private InitOnce<NakedMethod<String>> __getPath = new InitOnce<>(new InitOnce.Init() { // from class: a9.f
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f84809a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<File>> __mPath = new InitOnce<>(new InitOnce.Init() { // from class: a9.g
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f84810a.lambda$new$1();
            }
        });
        private InitOnce<NakedObject<String>> __mState = new InitOnce<>(new InitOnce.Init() { // from class: a9.h
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f84811a.lambda$new$2();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getPath");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mPath");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$2() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mState");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.storage.StorageVolumeCAGI.G
        public NakedMethod<String> getPath() {
            return this.__getPath.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.storage.StorageVolumeCAGI.G
        public NakedObject<File> mPath() {
            return this.__mPath.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.storage.StorageVolumeCAGI.G
        public NakedObject<String> mState() {
            return this.__mState.get();
        }
    }

    @l
    public static final class Impl_P28 implements StorageVolumeCAGI.P28 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.os.storage.StorageVolume");
        private InitOnce<NakedObject<File>> __mInternalPath = new InitOnce<>(new InitOnce.Init() { // from class: a9.i
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f84812a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mInternalPath");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.storage.StorageVolumeCAGI.P28
        public NakedObject<File> mInternalPath() {
            return this.__mInternalPath.get();
        }
    }
}
