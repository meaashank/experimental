package com.prism.gaia.naked.metadata.android.compat;

import W6.l;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.compat.CompatibilityCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class CompatibilityCAG {
    public static Impl_S31 S31 = new Impl_S31();
    public static Impl_R30 R30 = new Impl_R30();

    @l
    public static final class Impl_R30 implements CompatibilityCAGI.R30 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.compat.Compatibility");
        private InitOnce<NakedStaticObject<Object>> __sCallbacks = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.compat.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165580a.lambda$new$0();
            }
        });
        public Impl_Callbacks Callbacks = new Impl_Callbacks();

        @l
        public static final class Impl_Callbacks implements CompatibilityCAGI.R30.Callbacks {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.compat.Compatibility$Callbacks");
            private InitOnce<NakedMethod<Void>> __reportChange = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.compat.b
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165581a.lambda$new$0();
                }
            });
            private InitOnce<NakedMethod<Boolean>> __isChangeEnabled = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.compat.c
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165582a.lambda$new$1();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
                return new NakedMethod((Class<?>) ORG_CLASS(), "reportChange", (Class<?>[]) new Class[]{Long.TYPE});
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
                return new NakedMethod((Class<?>) ORG_CLASS(), "isChangeEnabled", (Class<?>[]) new Class[]{Long.TYPE});
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.compat.CompatibilityCAGI.R30.Callbacks
            public NakedMethod<Boolean> isChangeEnabled() {
                return this.__isChangeEnabled.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.compat.CompatibilityCAGI.R30.Callbacks
            public NakedMethod<Void> reportChange() {
                return this.__reportChange.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "sCallbacks");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.compat.CompatibilityCAGI.R30
        public NakedStaticObject<Object> sCallbacks() {
            return this.__sCallbacks.get();
        }
    }

    @l
    public static final class Impl_S31 implements CompatibilityCAGI.S31 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.compat.Compatibility");
        private InitOnce<NakedStaticObject<Object>> __DEFAULT_CALLBACKS = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.compat.d
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165583a.lambda$new$0();
            }
        });
        private InitOnce<NakedStaticObject<Object>> __sCallbacks = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.compat.e
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165584a.lambda$new$1();
            }
        });
        public Impl_BehaviorChangeDelegate BehaviorChangeDelegate = new Impl_BehaviorChangeDelegate();

        @l
        public static final class Impl_BehaviorChangeDelegate implements CompatibilityCAGI.S31.BehaviorChangeDelegate {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.compat.Compatibility$BehaviorChangeDelegate");
            private InitOnce<NakedMethod<Void>> __onChangeReported = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.compat.f
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165585a.lambda$new$0();
                }
            });
            private InitOnce<NakedMethod<Boolean>> __isChangeEnabled = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.compat.g
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165586a.lambda$new$1();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
                return new NakedMethod((Class<?>) ORG_CLASS(), "onChangeReported", (Class<?>[]) new Class[]{Long.TYPE});
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
                return new NakedMethod((Class<?>) ORG_CLASS(), "isChangeEnabled", (Class<?>[]) new Class[]{Long.TYPE});
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.compat.CompatibilityCAGI.S31.BehaviorChangeDelegate
            public NakedMethod<Boolean> isChangeEnabled() {
                return this.__isChangeEnabled.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.compat.CompatibilityCAGI.S31.BehaviorChangeDelegate
            public NakedMethod<Void> onChangeReported() {
                return this.__onChangeReported.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "DEFAULT_CALLBACKS");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$1() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "sCallbacks");
        }

        @Override // com.prism.gaia.naked.metadata.android.compat.CompatibilityCAGI.S31
        public NakedStaticObject<Object> DEFAULT_CALLBACKS() {
            return this.__DEFAULT_CALLBACKS.get();
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.compat.CompatibilityCAGI.S31
        public NakedStaticObject<Object> sCallbacks() {
            return this.__sCallbacks.get();
        }
    }
}
