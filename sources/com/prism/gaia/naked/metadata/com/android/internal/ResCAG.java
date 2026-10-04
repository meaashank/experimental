package com.prism.gaia.naked.metadata.com.android.internal;

import W6.c;
import W6.l;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticInt;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.com.android.internal.ResCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ResCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165977G = new Impl_G();

    @l
    public static final class Impl_G implements ResCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("com.android.internal.R");

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public Impl_id f165978id = new Impl_id();
        public Impl_string string = new Impl_string();
        public Impl_layout layout = new Impl_layout();
        public Impl_drawable drawable = new Impl_drawable();
        public Impl_styleable styleable = new Impl_styleable();

        @l
        public static final class Impl_drawable implements ResCAGI.G.drawable {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("com.android.internal.R$drawable");
            private InitOnce<NakedStaticInt> __popup_full_dark = new InitOnce<>(new InitOnce.Init() { // from class: q9.k0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226933a.lambda$new$0();
                }
            });
            private InitOnce<NakedStaticInt> __popup_top_dark = new InitOnce<>(new InitOnce.Init() { // from class: q9.l0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226936a.lambda$new$1();
                }
            });
            private InitOnce<NakedStaticInt> __popup_bottom_dark = new InitOnce<>(new InitOnce.Init() { // from class: q9.m0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226939a.lambda$new$2();
                }
            });
            private InitOnce<NakedStaticInt> __popup_full_bright = new InitOnce<>(new InitOnce.Init() { // from class: q9.n0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226942a.lambda$new$3();
                }
            });
            private InitOnce<NakedStaticInt> __popup_top_bright = new InitOnce<>(new InitOnce.Init() { // from class: q9.o0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226945a.lambda$new$4();
                }
            });
            private InitOnce<NakedStaticInt> __popup_center_bright = new InitOnce<>(new InitOnce.Init() { // from class: q9.p0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226948a.lambda$new$5();
                }
            });
            private InitOnce<NakedStaticInt> __popup_bottom_bright = new InitOnce<>(new InitOnce.Init() { // from class: q9.q0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226951a.lambda$new$6();
                }
            });
            private InitOnce<NakedStaticInt> __popup_bottom_medium = new InitOnce<>(new InitOnce.Init() { // from class: q9.r0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226954a.lambda$new$7();
                }
            });
            private InitOnce<NakedStaticInt> __popup_center_dark = new InitOnce<>(new InitOnce.Init() { // from class: q9.s0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226957a.lambda$new$8();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$0() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "popup_full_dark");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$1() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "popup_top_dark");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$2() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "popup_bottom_dark");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$3() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "popup_full_bright");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$4() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "popup_top_bright");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$5() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "popup_center_bright");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$6() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "popup_bottom_bright");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$7() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "popup_bottom_medium");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$8() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "popup_center_dark");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.drawable
            public NakedStaticInt popup_bottom_bright() {
                return this.__popup_bottom_bright.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.drawable
            public NakedStaticInt popup_bottom_dark() {
                return this.__popup_bottom_dark.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.drawable
            public NakedStaticInt popup_bottom_medium() {
                return this.__popup_bottom_medium.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.drawable
            public NakedStaticInt popup_center_bright() {
                return this.__popup_center_bright.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.drawable
            public NakedStaticInt popup_center_dark() {
                return this.__popup_center_dark.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.drawable
            public NakedStaticInt popup_full_bright() {
                return this.__popup_full_bright.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.drawable
            public NakedStaticInt popup_full_dark() {
                return this.__popup_full_dark.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.drawable
            public NakedStaticInt popup_top_bright() {
                return this.__popup_top_bright.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.drawable
            public NakedStaticInt popup_top_dark() {
                return this.__popup_top_dark.get();
            }
        }

        @l
        public static final class Impl_id implements ResCAGI.G.id {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("com.android.internal.R$id");
            private InitOnce<NakedStaticInt> __icon = new InitOnce<>(new InitOnce.Init() { // from class: q9.t0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226960a.lambda$new$0();
                }
            });
            private InitOnce<NakedStaticInt> __contentPanel = new InitOnce<>(new InitOnce.Init() { // from class: q9.v0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226964a.lambda$new$1();
                }
            });
            private InitOnce<NakedStaticInt> __topPanel = new InitOnce<>(new InitOnce.Init() { // from class: q9.w0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226966a.lambda$new$2();
                }
            });
            private InitOnce<NakedStaticInt> __buttonPanel = new InitOnce<>(new InitOnce.Init() { // from class: q9.x0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226968a.lambda$new$3();
                }
            });
            private InitOnce<NakedStaticInt> __customPanel = new InitOnce<>(new InitOnce.Init() { // from class: q9.y0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226970a.lambda$new$4();
                }
            });
            private InitOnce<NakedStaticInt> __custom = new InitOnce<>(new InitOnce.Init() { // from class: q9.z0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226972a.lambda$new$5();
                }
            });
            private InitOnce<NakedStaticInt> __titleDivider = new InitOnce<>(new InitOnce.Init() { // from class: q9.A0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226852a.lambda$new$6();
                }
            });
            private InitOnce<NakedStaticInt> __titleDividerTop = new InitOnce<>(new InitOnce.Init() { // from class: q9.B0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226854a.lambda$new$7();
                }
            });
            private InitOnce<NakedStaticInt> __title_template = new InitOnce<>(new InitOnce.Init() { // from class: q9.C0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226856a.lambda$new$8();
                }
            });
            private InitOnce<NakedStaticInt> __scrollView = new InitOnce<>(new InitOnce.Init() { // from class: q9.D0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226858a.lambda$new$9();
                }
            });
            private InitOnce<NakedStaticInt> __alertTitle = new InitOnce<>(new InitOnce.Init() { // from class: q9.E0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226860a.lambda$new$10();
                }
            });
            private InitOnce<NakedStaticInt> __message = new InitOnce<>(new InitOnce.Init() { // from class: q9.F0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226862a.lambda$new$11();
                }
            });
            private InitOnce<NakedStaticInt> __button1 = new InitOnce<>(new InitOnce.Init() { // from class: q9.G0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226864a.lambda$new$12();
                }
            });
            private InitOnce<NakedStaticInt> __button2 = new InitOnce<>(new InitOnce.Init() { // from class: q9.H0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226866a.lambda$new$13();
                }
            });
            private InitOnce<NakedStaticInt> __button3 = new InitOnce<>(new InitOnce.Init() { // from class: q9.I0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226868a.lambda$new$14();
                }
            });
            private InitOnce<NakedStaticInt> __text1 = new InitOnce<>(new InitOnce.Init() { // from class: q9.J0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226870a.lambda$new$15();
                }
            });
            private InitOnce<NakedStaticInt> __text2 = new InitOnce<>(new InitOnce.Init() { // from class: q9.K0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226872a.lambda$new$16();
                }
            });
            private InitOnce<NakedStaticInt> __leftSpacer = new InitOnce<>(new InitOnce.Init() { // from class: q9.L0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226874a.lambda$new$17();
                }
            });
            private InitOnce<NakedStaticInt> __rightSpacer = new InitOnce<>(new InitOnce.Init() { // from class: q9.M0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226876a.lambda$new$18();
                }
            });
            private InitOnce<NakedStaticInt> __resolver_list = new InitOnce<>(new InitOnce.Init() { // from class: q9.u0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226962a.lambda$new$19();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$0() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "icon");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$1() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "contentPanel");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$10() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "alertTitle");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$11() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), PglCryptUtils.KEY_MESSAGE);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$12() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "button1");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$13() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "button2");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$14() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "button3");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$15() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "text1");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$16() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "text2");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$17() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "leftSpacer");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$18() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "rightSpacer");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$19() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "resolver_list");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$2() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "topPanel");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$3() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "buttonPanel");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$4() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "customPanel");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$5() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "custom");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$6() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "titleDivider");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$7() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "titleDividerTop");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$8() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "title_template");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$9() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "scrollView");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.id
            public NakedStaticInt alertTitle() {
                return this.__alertTitle.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.id
            public NakedStaticInt button1() {
                return this.__button1.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.id
            public NakedStaticInt button2() {
                return this.__button2.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.id
            public NakedStaticInt button3() {
                return this.__button3.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.id
            public NakedStaticInt buttonPanel() {
                return this.__buttonPanel.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.id
            public NakedStaticInt contentPanel() {
                return this.__contentPanel.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.id
            public NakedStaticInt custom() {
                return this.__custom.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.id
            public NakedStaticInt customPanel() {
                return this.__customPanel.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.id
            public NakedStaticInt icon() {
                return this.__icon.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.id
            public NakedStaticInt leftSpacer() {
                return this.__leftSpacer.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.id
            public NakedStaticInt message() {
                return this.__message.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.id
            public NakedStaticInt resolver_list() {
                return this.__resolver_list.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.id
            public NakedStaticInt rightSpacer() {
                return this.__rightSpacer.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.id
            public NakedStaticInt scrollView() {
                return this.__scrollView.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.id
            public NakedStaticInt text1() {
                return this.__text1.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.id
            public NakedStaticInt text2() {
                return this.__text2.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.id
            public NakedStaticInt titleDivider() {
                return this.__titleDivider.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.id
            public NakedStaticInt titleDividerTop() {
                return this.__titleDividerTop.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.id
            public NakedStaticInt title_template() {
                return this.__title_template.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.id
            public NakedStaticInt topPanel() {
                return this.__topPanel.get();
            }
        }

        @l
        public static final class Impl_layout implements ResCAGI.G.layout {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("com.android.internal.R$layout");
            private InitOnce<NakedStaticInt> __resolver_list = new InitOnce<>(new InitOnce.Init() { // from class: q9.N0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226878a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$0() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "resolver_list");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.layout
            public NakedStaticInt resolver_list() {
                return this.__resolver_list.get();
            }
        }

        @l
        public static final class Impl_string implements ResCAGI.G.string {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("com.android.internal.R$string");
            private InitOnce<NakedStaticInt> __config_chooseAccountActivity = new InitOnce<>(new InitOnce.Init() { // from class: q9.O0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226880a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$0() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "config_chooseAccountActivity");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.string
            public NakedStaticInt config_chooseAccountActivity() {
                return this.__config_chooseAccountActivity.get();
            }
        }

        @l
        public static final class Impl_styleable implements ResCAGI.G.styleable {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("com.android.internal.R$styleable");
            private InitOnce<NakedStaticObject<int[]>> __AccountAuthenticator = new InitOnce<>(new InitOnce.Init() { // from class: q9.P0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226882a.lambda$new$0();
                }
            });
            private InitOnce<NakedStaticInt> __AccountAuthenticator_accountPreferences = new InitOnce<>(new InitOnce.Init() { // from class: q9.R0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226885a.lambda$new$1();
                }
            });
            private InitOnce<NakedStaticInt> __AccountAuthenticator_accountType = new InitOnce<>(new InitOnce.Init() { // from class: q9.d1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226913a.lambda$new$2();
                }
            });
            private InitOnce<NakedStaticInt> __AccountAuthenticator_customTokens = new InitOnce<>(new InitOnce.Init() { // from class: q9.e1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226916a.lambda$new$3();
                }
            });
            private InitOnce<NakedStaticInt> __AccountAuthenticator_icon = new InitOnce<>(new InitOnce.Init() { // from class: q9.f1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226919a.lambda$new$4();
                }
            });
            private InitOnce<NakedStaticInt> __AccountAuthenticator_label = new InitOnce<>(new InitOnce.Init() { // from class: q9.g1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226922a.lambda$new$5();
                }
            });
            private InitOnce<NakedStaticInt> __AccountAuthenticator_smallIcon = new InitOnce<>(new InitOnce.Init() { // from class: q9.h1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226925a.lambda$new$6();
                }
            });
            private InitOnce<NakedStaticObject<int[]>> __SyncAdapter = new InitOnce<>(new InitOnce.Init() { // from class: q9.i1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226928a.lambda$new$7();
                }
            });
            private InitOnce<NakedStaticInt> __SyncAdapter_accountType = new InitOnce<>(new InitOnce.Init() { // from class: q9.j1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226931a.lambda$new$8();
                }
            });
            private InitOnce<NakedStaticInt> __SyncAdapter_allowParallelSyncs = new InitOnce<>(new InitOnce.Init() { // from class: q9.k1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226934a.lambda$new$9();
                }
            });
            private InitOnce<NakedStaticInt> __SyncAdapter_contentAuthority = new InitOnce<>(new InitOnce.Init() { // from class: q9.a1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226904a.lambda$new$10();
                }
            });
            private InitOnce<NakedStaticInt> __SyncAdapter_isAlwaysSyncable = new InitOnce<>(new InitOnce.Init() { // from class: q9.l1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226937a.lambda$new$11();
                }
            });
            private InitOnce<NakedStaticInt> __SyncAdapter_settingsActivity = new InitOnce<>(new InitOnce.Init() { // from class: q9.m1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226940a.lambda$new$12();
                }
            });
            private InitOnce<NakedStaticInt> __SyncAdapter_supportsUploading = new InitOnce<>(new InitOnce.Init() { // from class: q9.n1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226943a.lambda$new$13();
                }
            });
            private InitOnce<NakedStaticInt> __SyncAdapter_userVisible = new InitOnce<>(new InitOnce.Init() { // from class: q9.o1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226946a.lambda$new$14();
                }
            });
            private InitOnce<NakedStaticObject<int[]>> __Window = new InitOnce<>(new InitOnce.Init() { // from class: q9.p1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226949a.lambda$new$15();
                }
            });
            private InitOnce<NakedStaticInt> __Window_windowBackground = new InitOnce<>(new InitOnce.Init() { // from class: q9.q1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226952a.lambda$new$16();
                }
            });
            private InitOnce<NakedStaticInt> __Window_windowFullscreen = new InitOnce<>(new InitOnce.Init() { // from class: q9.r1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226955a.lambda$new$17();
                }
            });
            private InitOnce<NakedStaticInt> __Window_windowIsFloating = new InitOnce<>(new InitOnce.Init() { // from class: q9.s1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226958a.lambda$new$18();
                }
            });
            private InitOnce<NakedStaticInt> __Window_windowIsTranslucent = new InitOnce<>(new InitOnce.Init() { // from class: q9.Q0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226884a.lambda$new$19();
                }
            });
            private InitOnce<NakedStaticInt> __Window_windowShowWallpaper = new InitOnce<>(new InitOnce.Init() { // from class: q9.S0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226887a.lambda$new$20();
                }
            });
            private InitOnce<NakedStaticInt> __AlertDialog_fullDark = new InitOnce<>(new InitOnce.Init() { // from class: q9.T0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226889a.lambda$new$21();
                }
            });
            private InitOnce<NakedStaticInt> __AlertDialog_topDark = new InitOnce<>(new InitOnce.Init() { // from class: q9.U0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226891a.lambda$new$22();
                }
            });
            private InitOnce<NakedStaticInt> __AlertDialog_centerDark = new InitOnce<>(new InitOnce.Init() { // from class: q9.V0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226893a.lambda$new$23();
                }
            });
            private InitOnce<NakedStaticInt> __AlertDialog_bottomDark = new InitOnce<>(new InitOnce.Init() { // from class: q9.W0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226895a.lambda$new$24();
                }
            });
            private InitOnce<NakedStaticInt> __AlertDialog_fullBright = new InitOnce<>(new InitOnce.Init() { // from class: q9.X0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226897a.lambda$new$25();
                }
            });
            private InitOnce<NakedStaticInt> __AlertDialog_topBright = new InitOnce<>(new InitOnce.Init() { // from class: q9.Y0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226899a.lambda$new$26();
                }
            });
            private InitOnce<NakedStaticInt> __AlertDialog_centerBright = new InitOnce<>(new InitOnce.Init() { // from class: q9.Z0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226901a.lambda$new$27();
                }
            });
            private InitOnce<NakedStaticInt> __AlertDialog_bottomBright = new InitOnce<>(new InitOnce.Init() { // from class: q9.b1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226907a.lambda$new$28();
                }
            });
            private InitOnce<NakedStaticInt> __AlertDialog_bottomMedium = new InitOnce<>(new InitOnce.Init() { // from class: q9.c1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f226910a.lambda$new$29();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
                return new NakedStaticObject((Class<?>) ORG_CLASS(), "AccountAuthenticator");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$1() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "AccountAuthenticator_accountPreferences");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$10() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "SyncAdapter_contentAuthority");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$11() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "SyncAdapter_isAlwaysSyncable");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$12() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "SyncAdapter_settingsActivity");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$13() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "SyncAdapter_supportsUploading");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$14() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "SyncAdapter_userVisible");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticObject lambda$new$15() throws Exception {
                return new NakedStaticObject((Class<?>) ORG_CLASS(), "Window");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$16() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "Window_windowBackground");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$17() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "Window_windowFullscreen");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$18() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "Window_windowIsFloating");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$19() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "Window_windowIsTranslucent");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$2() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "AccountAuthenticator_accountType");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$20() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "Window_windowShowWallpaper");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$21() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "AlertDialog_fullDark");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$22() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "AlertDialog_topDark");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$23() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "AlertDialog_centerDark");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$24() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "AlertDialog_bottomDark");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$25() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "AlertDialog_fullBright");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$26() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "AlertDialog_topBright");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$27() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "AlertDialog_centerBright");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$28() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "AlertDialog_bottomBright");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$29() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "AlertDialog_bottomMedium");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$3() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "AccountAuthenticator_customTokens");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$4() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "AccountAuthenticator_icon");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$5() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "AccountAuthenticator_label");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$6() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "AccountAuthenticator_smallIcon");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticObject lambda$new$7() throws Exception {
                return new NakedStaticObject((Class<?>) ORG_CLASS(), "SyncAdapter");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$8() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "SyncAdapter_accountType");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$9() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "SyncAdapter_allowParallelSyncs");
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticObject<int[]> AccountAuthenticator() {
                return this.__AccountAuthenticator.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt AccountAuthenticator_accountPreferences() {
                return this.__AccountAuthenticator_accountPreferences.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt AccountAuthenticator_accountType() {
                return this.__AccountAuthenticator_accountType.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt AccountAuthenticator_customTokens() {
                return this.__AccountAuthenticator_customTokens.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt AccountAuthenticator_icon() {
                return this.__AccountAuthenticator_icon.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt AccountAuthenticator_label() {
                return this.__AccountAuthenticator_label.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt AccountAuthenticator_smallIcon() {
                return this.__AccountAuthenticator_smallIcon.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt AlertDialog_bottomBright() {
                return this.__AlertDialog_bottomBright.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt AlertDialog_bottomDark() {
                return this.__AlertDialog_bottomDark.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt AlertDialog_bottomMedium() {
                return this.__AlertDialog_bottomMedium.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt AlertDialog_centerBright() {
                return this.__AlertDialog_centerBright.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt AlertDialog_centerDark() {
                return this.__AlertDialog_centerDark.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt AlertDialog_fullBright() {
                return this.__AlertDialog_fullBright.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt AlertDialog_fullDark() {
                return this.__AlertDialog_fullDark.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt AlertDialog_topBright() {
                return this.__AlertDialog_topBright.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt AlertDialog_topDark() {
                return this.__AlertDialog_topDark.get();
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticObject<int[]> SyncAdapter() {
                return this.__SyncAdapter.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt SyncAdapter_accountType() {
                return this.__SyncAdapter_accountType.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt SyncAdapter_allowParallelSyncs() {
                return this.__SyncAdapter_allowParallelSyncs.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt SyncAdapter_contentAuthority() {
                return this.__SyncAdapter_contentAuthority.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt SyncAdapter_isAlwaysSyncable() {
                return this.__SyncAdapter_isAlwaysSyncable.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt SyncAdapter_settingsActivity() {
                return this.__SyncAdapter_settingsActivity.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt SyncAdapter_supportsUploading() {
                return this.__SyncAdapter_supportsUploading.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt SyncAdapter_userVisible() {
                return this.__SyncAdapter_userVisible.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticObject<int[]> Window() {
                return this.__Window.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt Window_windowBackground() {
                return this.__Window_windowBackground.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt Window_windowFullscreen() {
                return this.__Window_windowFullscreen.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt Window_windowIsFloating() {
                return this.__Window_windowIsFloating.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt Window_windowIsTranslucent() {
                return this.__Window_windowIsTranslucent.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.ResCAGI.G.styleable
            public NakedStaticInt Window_windowShowWallpaper() {
                return this.__Window_windowShowWallpaper.get();
            }
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }
}
