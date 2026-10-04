package com.prism.gaia.naked.metadata.android.os;

import android.os.Parcelable;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.metadata.android.os.ParcelCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class ParcelCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165886G = new Impl_G();

    @W6.l
    public static final class Impl_G implements ParcelCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.os.Parcel");
        private InitOnce<NakedBoolean> __mRecycled = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.O
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165884a.lambda$new$0();
            }
        });
        private InitOnce<NakedMethod<Parcelable.Creator<?>>> __readParcelableCreator = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.P
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165885a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedBoolean lambda$new$0() throws Exception {
            return new NakedBoolean((Class<?>) ORG_CLASS(), "mRecycled");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "readParcelableCreator", (Class<?>[]) new Class[]{ClassLoader.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.ParcelCAGI.G
        public NakedBoolean mRecycled() {
            return this.__mRecycled.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.ParcelCAGI.G
        public NakedMethod<Parcelable.Creator<?>> readParcelableCreator() {
            return this.__readParcelableCreator.get();
        }
    }
}
