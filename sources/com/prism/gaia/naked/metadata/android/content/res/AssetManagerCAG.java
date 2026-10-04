package com.prism.gaia.naked.metadata.android.content.res;

import W6.c;
import W6.l;
import android.content.res.AssetManager;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.metadata.android.content.res.AssetManagerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class AssetManagerCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165804G = new Impl_G();

    @l
    public static final class Impl_G implements AssetManagerCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) AssetManager.class);
        private InitOnce<NakedConstructor<AssetManager>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: O8.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f65214a.lambda$new$0();
            }
        });
        private InitOnce<NakedMethod<Integer>> __addAssetPath = new InitOnce<>(new InitOnce.Init() { // from class: O8.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f65215a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor(ORG_CLASS());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "addAssetPath", (Class<?>[]) new Class[]{String.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.res.AssetManagerCAGI.G
        public NakedMethod<Integer> addAssetPath() {
            return this.__addAssetPath.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.res.AssetManagerCAGI.G
        public NakedConstructor<AssetManager> ctor() {
            return this.__ctor.get();
        }
    }
}
