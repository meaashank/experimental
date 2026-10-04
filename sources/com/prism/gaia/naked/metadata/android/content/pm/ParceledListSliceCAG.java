package com.prism.gaia.naked.metadata.android.content.pm;

import android.os.Parcelable;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.content.pm.ParceledListSliceCAGI;
import java.util.List;
import org.jacoco.core.runtime.AgentOptions;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class ParceledListSliceCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165669C = new Impl_C();
    public static Impl_CJ18 CJ18 = new Impl_CJ18();

    @W6.m
    public static final class Impl_C implements ParceledListSliceCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.content.pm.ParceledListSlice");
        private InitOnceTry<NakedStaticObject<Parcelable.Creator>> __CREATOR = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.i2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165736a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedMethod<Boolean>> __append = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.j2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165740a.lambda$new$1();
            }
        });
        private InitOnceTry<NakedConstructor<Parcelable>> __ctor = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.k2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165744a.lambda$new$2();
            }
        });
        private InitOnceTry<NakedMethod<Boolean>> __isLastSlice = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.l2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165748a.lambda$new$3();
            }
        });
        private InitOnceTry<NakedMethod<Parcelable>> __populateList = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.m2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165752a.lambda$new$4();
            }
        });
        private InitOnceTry<NakedMethod<Void>> __setLastSlice = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.n2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165756a.lambda$new$5();
            }
        });
        private InitOnceTry<NakedMethod<List<?>>> __getList = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.o2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165760a.lambda$new$6();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "CREATOR");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), AgentOptions.APPEND);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$2() throws Exception {
            return new NakedConstructor(ORG_CLASS());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$3() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "isLastSlice");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$4() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "populateList");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$5() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "setLastSlice");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$6() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getList");
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ParceledListSliceCAGI.C
        public NakedStaticObject<Parcelable.Creator> CREATOR() {
            return this.__CREATOR.get();
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ParceledListSliceCAGI.C
        public NakedMethod<Boolean> append() {
            return this.__append.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ParceledListSliceCAGI.C
        public NakedConstructor<Parcelable> ctor() {
            return this.__ctor.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ParceledListSliceCAGI.C
        public NakedMethod<List<?>> getList() {
            return this.__getList.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ParceledListSliceCAGI.C
        public NakedMethod<Boolean> isLastSlice() {
            return this.__isLastSlice.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ParceledListSliceCAGI.C
        public NakedMethod<Parcelable> populateList() {
            return this.__populateList.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ParceledListSliceCAGI.C
        public NakedMethod<Void> setLastSlice() {
            return this.__setLastSlice.get();
        }
    }

    @W6.m
    public static final class Impl_CJ18 implements ParceledListSliceCAGI.CJ18 {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.content.pm.ParceledListSlice");
        private InitOnceTry<NakedStaticObject<Parcelable.Creator>> __CREATOR = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.p2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165764a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedConstructor<Parcelable>> __ctor = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.q2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165768a.lambda$new$1();
            }
        });
        private InitOnceTry<NakedMethod<List>> __getList = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.r2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165772a.lambda$new$2();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "CREATOR");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$1() throws Exception {
            return new NakedConstructor((Class<?>) ORG_CLASS(), (Class<?>[]) new Class[]{List.class});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$2() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getList");
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ParceledListSliceCAGI.CJ18
        public NakedStaticObject<Parcelable.Creator> CREATOR() {
            return this.__CREATOR.get();
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ParceledListSliceCAGI.CJ18
        public NakedConstructor<Parcelable> ctor() {
            return this.__ctor.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ParceledListSliceCAGI.CJ18
        public NakedMethod<List> getList() {
            return this.__getList.get();
        }
    }
}
