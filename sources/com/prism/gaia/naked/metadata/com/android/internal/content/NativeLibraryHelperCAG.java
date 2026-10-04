package com.prism.gaia.naked.metadata.com.android.internal.content;

import W6.c;
import W6.l;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.com.android.internal.content.NativeLibraryHelperCAGI;
import java.io.File;
import w7.i;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class NativeLibraryHelperCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165982G = new Impl_G();
    public static Impl_L21 L21 = new Impl_L21();

    @l
    public static final class Impl_G implements NativeLibraryHelperCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("com.android.internal.content.NativeLibraryHelper");

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }

    @l
    public static final class Impl_L21 implements NativeLibraryHelperCAGI.L21 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("com.android.internal.content.NativeLibraryHelper");
        private InitOnce<NakedStaticMethod<Integer>> __copyNativeBinaries = new InitOnce<>(new InitOnce.Init() { // from class: t9.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f239215a.lambda$new$0();
            }
        });
        private InitOnce<NakedStaticMethod<Integer>> __findSupportedAbi = new InitOnce<>(new InitOnce.Init() { // from class: t9.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f239216a.lambda$new$1();
            }
        });
        public Impl_Handle Handle = new Impl_Handle();

        @l
        public static final class Impl_Handle implements NativeLibraryHelperCAGI.L21.Handle {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("com.android.internal.content.NativeLibraryHelper$Handle");
            private InitOnce<NakedStaticMethod<Object>> __create = new InitOnce<>(new InitOnce.Init() { // from class: t9.c
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f239217a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
                return new NakedStaticMethod((Class<?>) ORG_CLASS(), i.f240159x, (Class<?>[]) new Class[]{File.class});
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.content.NativeLibraryHelperCAGI.L21.Handle
            public NakedStaticMethod<Object> create() {
                return this.__create.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "copyNativeBinaries", new String[]{"com.android.internal.content.NativeLibraryHelper$Handle", "java.io.File", "java.lang.String"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$1() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "findSupportedAbi", new String[]{"com.android.internal.content.NativeLibraryHelper$Handle", "[Ljava.lang.String;"});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.com.android.internal.content.NativeLibraryHelperCAGI.L21
        public NakedStaticMethod<Integer> copyNativeBinaries() {
            return this.__copyNativeBinaries.get();
        }

        @Override // com.prism.gaia.naked.metadata.com.android.internal.content.NativeLibraryHelperCAGI.L21
        public NakedStaticMethod<Integer> findSupportedAbi() {
            return this.__findSupportedAbi.get();
        }
    }
}
