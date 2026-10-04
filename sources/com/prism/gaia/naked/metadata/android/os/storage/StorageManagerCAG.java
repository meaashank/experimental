package com.prism.gaia.naked.metadata.android.os.storage;

import W6.c;
import W6.m;
import android.os.IInterface;
import android.os.storage.StorageManager;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.os.storage.StorageManagerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class StorageManagerCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165925C = new Impl_C();

    @m
    public static final class Impl_C implements StorageManagerCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) StorageManager.class);
        private InitOnceTry<NakedStaticObject<IInterface>> __sStorageManager = new InitOnceTry<>(new InitOnce.Init() { // from class: a9.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f84805a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedObject<IInterface>> __mStorageManager = new InitOnceTry<>(new InitOnce.Init() { // from class: a9.c
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f84806a.lambda$new$1();
            }
        });
        private InitOnceTry<NakedObject<Object>> __sVolumeListCache = new InitOnceTry<>(new InitOnce.Init() { // from class: a9.d
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f84807a.lambda$new$2();
            }
        });
        private InitOnceTry<NakedStaticMethod<Void>> __invalidateVolumeListCache = new InitOnceTry<>(new InitOnce.Init() { // from class: a9.e
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f84808a.lambda$new$3();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "sStorageManager");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mStorageManager");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$2() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "sVolumeListCache");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$3() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "invalidateVolumeListCache");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.storage.StorageManagerCAGI.C
        public NakedStaticMethod<Void> invalidateVolumeListCache() {
            return this.__invalidateVolumeListCache.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.storage.StorageManagerCAGI.C
        public NakedObject<IInterface> mStorageManager() {
            return this.__mStorageManager.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.storage.StorageManagerCAGI.C
        public NakedStaticObject<IInterface> sStorageManager() {
            return this.__sStorageManager.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.storage.StorageManagerCAGI.C
        public NakedObject<Object> sVolumeListCache() {
            return this.__sVolumeListCache.get();
        }
    }
}
