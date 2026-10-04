package com.prism.gaia.naked.metadata.android.content.pm;

import android.content.pm.SharedLibraryInfo;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.content.pm.SharedLibraryInfoCAGI;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class SharedLibraryInfoCAG {
    public static Impl_O26 O26 = new Impl_O26();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165678C = new Impl_C();

    @W6.m
    public static final class Impl_C implements SharedLibraryInfoCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.content.pm.SharedLibraryInfo");
        private InitOnceTry<NakedBoolean> __mIsNative = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.s2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165776a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedObject<List<SharedLibraryInfo>>> __mDependencies = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.t2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165780a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedBoolean lambda$new$0() throws Exception {
            return new NakedBoolean((Class<?>) ORG_CLASS(), "mIsNative");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mDependencies");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.SharedLibraryInfoCAGI.C
        public NakedObject<List<SharedLibraryInfo>> mDependencies() {
            return this.__mDependencies.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.SharedLibraryInfoCAGI.C
        public NakedBoolean mIsNative() {
            return this.__mIsNative.get();
        }
    }

    @W6.l
    public static final class Impl_O26 implements SharedLibraryInfoCAGI.O26 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.SharedLibraryInfo");
        private InitOnce<NakedObject<String>> __mPackageName = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.u2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165784a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<String>> __mPath = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.v2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165788a.lambda$new$1();
            }
        });
        private InitOnce<NakedObject<List<String>>> __mCodePaths = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.w2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165792a.lambda$new$2();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mPackageName");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mPath");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$2() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mCodePaths");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.SharedLibraryInfoCAGI.O26
        public NakedObject<List<String>> mCodePaths() {
            return this.__mCodePaths.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.SharedLibraryInfoCAGI.O26
        public NakedObject<String> mPackageName() {
            return this.__mPackageName.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.SharedLibraryInfoCAGI.O26
        public NakedObject<String> mPath() {
            return this.__mPath.get();
        }
    }
}
