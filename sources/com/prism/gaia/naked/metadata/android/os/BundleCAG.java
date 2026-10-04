package com.prism.gaia.naked.metadata.android.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.os.BundleCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class BundleCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165859G = new Impl_G();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static Impl_A f165858A = new Impl_A();

    public static final class Impl_A implements BundleCAGI.A {
        public Impl_BaseBundle BaseBundle = new Impl_BaseBundle();

        public static final class Impl_BaseBundle implements BundleCAGI.A.BaseBundle {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            public Impl_C f165860C = new Impl_C();

            @W6.m
            public static final class Impl_C implements BundleCAGI.A.BaseBundle.C {
                private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) Bundle.class);
                private InitOnceTry<NakedObject<Parcel>> __mParcelledData = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.h
                    @Override // com.prism.gaia.naked.core.InitOnce.Init
                    public final Object onInit() {
                        return this.f165911a.lambda$new$0();
                    }
                });

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                    return new NakedObject((Class<?>) ORG_CLASS(), "mParcelledData");
                }

                @Override // com.prism.gaia.naked.core.ClassAccessor
                public Class ORG_CLASS() {
                    return this.__ORG_CLASS.get();
                }

                @Override // com.prism.gaia.naked.metadata.android.os.BundleCAGI.A.BaseBundle.C
                public NakedObject<Parcel> mParcelledData() {
                    return this.__mParcelledData.get();
                }
            }
        }
    }

    @W6.l
    public static final class Impl_G implements BundleCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Bundle.class);
        private InitOnce<NakedMethod<Void>> __putIBinder = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.i
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165912a.lambda$new$0();
            }
        });
        private InitOnce<NakedMethod<IBinder>> __getIBinder = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.j
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165913a.lambda$new$1();
            }
        });
        private InitOnce<NakedMethod<Void>> __setDefusable = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.k
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165914a.lambda$new$2();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "putIBinder", (Class<?>[]) new Class[]{String.class, IBinder.class});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getIBinder", (Class<?>[]) new Class[]{String.class});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$2() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "setDefusable", (Class<?>[]) new Class[]{Boolean.TYPE});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.BundleCAGI.G
        public NakedMethod<IBinder> getIBinder() {
            return this.__getIBinder.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.BundleCAGI.G
        public NakedMethod<Void> putIBinder() {
            return this.__putIBinder.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.BundleCAGI.G
        public NakedMethod<Void> setDefusable() {
            return this.__setDefusable.get();
        }
    }
}
