package com.cookiegames.smartcookie.settings.fragment;

import U6.b;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.webkit.URLUtil;
import c4.C2902i;
import com.cookiegames.smartcookie.browser.HomepageTypeChoice;
import com.cookiegames.smartcookie.p;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import ed.InterfaceC4376a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.V({"SMAP\nHomepageSettingsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomepageSettingsFragment.kt\ncom/cookiegames/smartcookie/settings/fragment/HomepageSettingsFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,173:1\n11065#2:174\n11400#2,3:175\n*S KotlinDebug\n*F\n+ 1 HomepageSettingsFragment.kt\ncom/cookiegames/smartcookie/settings/fragment/HomepageSettingsFragment\n*L\n64#1:174\n64#1:175,3\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class HomepageSettingsFragment extends AbstractC3170i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final a f147969r = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f147970s = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final String f147971t = "home";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final String f147972u = "homepage_type";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final String f147973v = "image_url";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final String f147974w = "show_shortcuts";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String[] f147975p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Inject
    public u4.e f147976q;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f147977a;

        static {
            int[] iArr = new int[HomepageTypeChoice.values().length];
            try {
                iArr[HomepageTypeChoice.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomepageTypeChoice.FOCUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomepageTypeChoice.INFORMATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f147977a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.cookiegames.smartcookie.settings.fragment.HomepageSettingsFragment$onCreate$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements InterfaceC4376a<kotlin.L0> {
        public AnonymousClass1(Object obj) {
            super(0, obj, HomepageSettingsFragment.class, "showImageUrlPicker", "showImageUrlPicker()V", 0);
        }

        public final void V() {
            ((HomepageSettingsFragment) this.receiver).w0();
        }

        @Override // ed.InterfaceC4376a
        public /* bridge */ /* synthetic */ kotlin.L0 invoke() {
            V();
            return kotlin.L0.f217464a;
        }
    }

    /* JADX INFO: renamed from: com.cookiegames.smartcookie.settings.fragment.HomepageSettingsFragment$onCreate$2, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements ed.l<C2, kotlin.L0> {
        public AnonymousClass2(Object obj) {
            super(1, obj, HomepageSettingsFragment.class, "showHomePageDialog", "showHomePageDialog(Lcom/cookiegames/smartcookie/settings/fragment/SummaryUpdater;)V", 0);
        }

        public final void e(C2 p02) {
            kotlin.jvm.internal.G.p(p02, "p0");
            ((HomepageSettingsFragment) this.receiver).q0(p02);
        }

        @Override // ed.l
        public /* bridge */ /* synthetic */ kotlin.L0 invoke(C2 c22) {
            e(c22);
            return kotlin.L0.f217464a;
        }
    }

    /* JADX INFO: renamed from: com.cookiegames.smartcookie.settings.fragment.HomepageSettingsFragment$onCreate$3, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements ed.l<C2, kotlin.L0> {
        public AnonymousClass3(Object obj) {
            super(1, obj, HomepageSettingsFragment.class, "showHomepageTypePicker", "showHomepageTypePicker(Lcom/cookiegames/smartcookie/settings/fragment/SummaryUpdater;)V", 0);
        }

        public final void e(C2 p02) {
            kotlin.jvm.internal.G.p(p02, "p0");
            ((HomepageSettingsFragment) this.receiver).t0(p02);
        }

        @Override // ed.l
        public /* bridge */ /* synthetic */ kotlin.L0 invoke(C2 c22) {
            e(c22);
            return kotlin.L0.f217464a;
        }
    }

    public static final kotlin.L0 l0(HomepageSettingsFragment homepageSettingsFragment, boolean z10) {
        homepageSettingsFragment.i0().S2(z10);
        return kotlin.L0.f217464a;
    }

    public static final kotlin.L0 p0(HomepageSettingsFragment homepageSettingsFragment, C2 c22, String url) {
        kotlin.jvm.internal.G.p(url, "url");
        if (kotlin.text.F.L2(url, "http", false, 2, null) || kotlin.text.F.L2(url, b.h.f68653a, false, 2, null)) {
            homepageSettingsFragment.i0().L1(url);
            c22.a(url);
        } else {
            homepageSettingsFragment.i0().L1(R3.a.f67726d.concat(url));
            c22.a(R3.a.f67726d.concat(url));
        }
        return kotlin.L0.f217464a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.L0 r0(final com.cookiegames.smartcookie.settings.fragment.HomepageSettingsFragment r2, final com.cookiegames.smartcookie.settings.fragment.C2 r3, com.google.android.material.dialog.MaterialAlertDialogBuilder r4, android.app.Activity r5) {
        /*
            java.lang.String r0 = "$this$showCustomDialog"
            kotlin.jvm.internal.G.p(r4, r0)
            java.lang.String r0 = "it"
            kotlin.jvm.internal.G.p(r5, r0)
            int r5 = com.cookiegames.smartcookie.p.s.f145702Y6
            r4.setTitle(r5)
            u4.e r5 = r2.i0()
            java.lang.String r5 = r5.E()
            int r0 = r5.hashCode()
            r1 = -1145275824(0xffffffffbbbc7a50, float:-0.0057518855)
            if (r0 == r1) goto L41
            r1 = 322841383(0x133e2b27, float:2.4002647E-27)
            if (r0 == r1) goto L36
            r1 = 1396069548(0x533654ac, float:7.831046E11)
            if (r0 == r1) goto L2b
            goto L49
        L2b:
            java.lang.String r0 = "about:home"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L34
            goto L49
        L34:
            r5 = 0
            goto L4c
        L36:
            java.lang.String r0 = "about:blank"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L3f
            goto L49
        L3f:
            r5 = 1
            goto L4c
        L41:
            java.lang.String r0 = "about:bookmarks"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L4b
        L49:
            r5 = 3
            goto L4c
        L4b:
            r5 = 2
        L4c:
            int r0 = com.cookiegames.smartcookie.p.c.f141480l
            com.cookiegames.smartcookie.settings.fragment.I1 r1 = new com.cookiegames.smartcookie.settings.fragment.I1
            r1.<init>()
            r4.setSingleChoiceItems(r0, r5, r1)
            android.content.res.Resources r2 = r2.getResources()
            int r3 = com.cookiegames.smartcookie.p.s.f145769d0
            java.lang.String r2 = r2.getString(r3)
            r3 = 0
            r4.setPositiveButton(r2, r3)
            kotlin.L0 r2 = kotlin.L0.f217464a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cookiegames.smartcookie.settings.fragment.HomepageSettingsFragment.r0(com.cookiegames.smartcookie.settings.fragment.HomepageSettingsFragment, com.cookiegames.smartcookie.settings.fragment.C2, com.google.android.material.dialog.MaterialAlertDialogBuilder, android.app.Activity):kotlin.L0");
    }

    public static final void s0(HomepageSettingsFragment homepageSettingsFragment, C2 c22, DialogInterface dialogInterface, int i10) {
        if (i10 == 0) {
            homepageSettingsFragment.i0().L1(R3.a.f67730h);
            String string = homepageSettingsFragment.getResources().getString(p.s.f145667W);
            kotlin.jvm.internal.G.o(string, "getString(...)");
            c22.a(string);
            return;
        }
        if (i10 == 1) {
            homepageSettingsFragment.i0().L1(R3.a.f67732j);
            String string2 = homepageSettingsFragment.getResources().getString(p.s.f145430G);
            kotlin.jvm.internal.G.o(string2, "getString(...)");
            c22.a(string2);
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            homepageSettingsFragment.o0(c22);
        } else {
            homepageSettingsFragment.i0().L1(R3.a.f67733k);
            String string3 = homepageSettingsFragment.getResources().getString(p.s.f145445H);
            kotlin.jvm.internal.G.o(string3, "getString(...)");
            c22.a(string3);
        }
    }

    public static final kotlin.L0 u0(final HomepageSettingsFragment homepageSettingsFragment, final C2 c22, MaterialAlertDialogBuilder showCustomDialog, Activity it) {
        String str;
        kotlin.jvm.internal.G.p(showCustomDialog, "$this$showCustomDialog");
        kotlin.jvm.internal.G.p(it, "it");
        showCustomDialog.setTitle(p.s.f145731a7);
        String[] stringArray = homepageSettingsFragment.getResources().getStringArray(p.c.f141481m);
        kotlin.jvm.internal.G.o(stringArray, "getStringArray(...)");
        HomepageTypeChoice[] homepageTypeChoiceArrValues = HomepageTypeChoice.values();
        ArrayList arrayList = new ArrayList(homepageTypeChoiceArrValues.length);
        for (HomepageTypeChoice homepageTypeChoice : homepageTypeChoiceArrValues) {
            int i10 = b.f147977a[homepageTypeChoice.ordinal()];
            if (i10 == 1) {
                str = stringArray[0];
            } else if (i10 == 2) {
                str = stringArray[1];
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = stringArray[2];
            }
            arrayList.add(new Pair(homepageTypeChoice, str));
        }
        d4.c.c(showCustomDialog, arrayList, homepageSettingsFragment.i0().F(), new ed.l() { // from class: com.cookiegames.smartcookie.settings.fragment.F1
            @Override // ed.l
            public final Object invoke(Object obj) {
                return HomepageSettingsFragment.v0(this.f147926a, c22, (HomepageTypeChoice) obj);
            }
        });
        showCustomDialog.setPositiveButton(p.s.f145769d0, (DialogInterface.OnClickListener) null);
        return kotlin.L0.f217464a;
    }

    public static final kotlin.L0 v0(HomepageSettingsFragment homepageSettingsFragment, C2 c22, HomepageTypeChoice it) {
        kotlin.jvm.internal.G.p(it, "it");
        homepageSettingsFragment.i0().M1(it);
        c22.a(homepageSettingsFragment.j0(it));
        return kotlin.L0.f217464a;
    }

    public static final kotlin.L0 x0(HomepageSettingsFragment homepageSettingsFragment, String s10) {
        kotlin.jvm.internal.G.p(s10, "s");
        homepageSettingsFragment.i0().Q1(s10);
        return kotlin.L0.f217464a;
    }

    @NotNull
    public final u4.e i0() {
        u4.e eVar = this.f147976q;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.G.S("userPreferences");
        throw null;
    }

    public final String j0(HomepageTypeChoice homepageTypeChoice) {
        int i10 = b.f147977a[homepageTypeChoice.ordinal()];
        if (i10 == 1) {
            String string = getResources().getString(p.s.f145979r0);
            kotlin.jvm.internal.G.o(string, "getString(...)");
            return string;
        }
        if (i10 == 2) {
            String string2 = getResources().getString(p.s.f145910m6);
            kotlin.jvm.internal.G.o(string2, "getString(...)");
            return string2;
        }
        if (i10 != 3) {
            return homepageTypeChoice.toString();
        }
        String string3 = getResources().getString(p.s.f146061w7);
        kotlin.jvm.internal.G.o(string3, "getString(...)");
        return string3;
    }

    public final String k0(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1145275824) {
            if (iHashCode != 322841383) {
                if (iHashCode == 1396069548 && str.equals(R3.a.f67730h)) {
                    String string = getResources().getString(p.s.f145667W);
                    kotlin.jvm.internal.G.o(string, "getString(...)");
                    return string;
                }
            } else if (str.equals(R3.a.f67732j)) {
                String string2 = getResources().getString(p.s.f145430G);
                kotlin.jvm.internal.G.o(string2, "getString(...)");
                return string2;
            }
        } else if (str.equals(R3.a.f67733k)) {
            String string3 = getResources().getString(p.s.f145445H);
            kotlin.jvm.internal.G.o(string3, "getString(...)");
            return string3;
        }
        return str;
    }

    public final void n0(@NotNull u4.e eVar) {
        kotlin.jvm.internal.G.p(eVar, "<set-?>");
        this.f147976q = eVar;
    }

    public final void o0(final C2 c22) {
        String strE = !URLUtil.isAboutUrl(i0().E()) ? i0().E() : "https://www.google.com";
        androidx.fragment.app.r activity = getActivity();
        if (activity != null) {
            int i10 = p.s.Eh;
            C2902i.p(activity, i10, i10, strE, p.s.f145769d0, new ed.l() { // from class: com.cookiegames.smartcookie.settings.fragment.L1
                @Override // ed.l
                public final Object invoke(Object obj) {
                    return HomepageSettingsFragment.p0(this.f148000a, c22, (String) obj);
                }
            });
        }
    }

    @Override // com.cookiegames.smartcookie.settings.fragment.AbstractC3170i, androidx.preference.n, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        com.cookiegames.smartcookie.di.K.c(this).f(this);
        AbstractC3170i.P(this, "image_url", false, null, new AnonymousClass1(this), 6, null);
        AbstractC3170i.M(this, "home", false, k0(i0().E()), new AnonymousClass2(this), 2, null);
        L(f147972u, kotlin.jvm.internal.G.g(i0().E(), R3.a.f67730h), j0(i0().F()), new AnonymousClass3(this));
        AbstractC3170i.S(this, f147974w, i0().L0(), false, null, new ed.l() { // from class: com.cookiegames.smartcookie.settings.fragment.G1
            @Override // ed.l
            public final Object invoke(Object obj) {
                return HomepageSettingsFragment.l0(this.f147932a, ((Boolean) obj).booleanValue());
            }
        }, 12, null);
    }

    public final void q0(final C2 c22) {
        C2902i.f126148a.n(getActivity(), new ed.p() { // from class: com.cookiegames.smartcookie.settings.fragment.K1
            @Override // ed.p
            public final Object invoke(Object obj, Object obj2) {
                return HomepageSettingsFragment.r0(this.f147995a, c22, (MaterialAlertDialogBuilder) obj, (Activity) obj2);
            }
        });
    }

    public final void t0(final C2 c22) {
        C2902i.f126148a.n(getActivity(), new ed.p() { // from class: com.cookiegames.smartcookie.settings.fragment.J1
            @Override // ed.p
            public final Object invoke(Object obj, Object obj2) {
                return HomepageSettingsFragment.u0(this.f147986a, c22, (MaterialAlertDialogBuilder) obj, (Activity) obj2);
            }
        });
    }

    @Override // androidx.preference.n
    public void u(@Nullable Bundle bundle, @Nullable String str) {
        l(p.v.f147672l);
    }

    public final void w0() {
        androidx.fragment.app.r activity = getActivity();
        if (activity != null) {
            C2902i.p(activity, p.s.f145866j7, p.s.f145674W6, i0().J(), p.s.f145769d0, new ed.l() { // from class: com.cookiegames.smartcookie.settings.fragment.H1
                @Override // ed.l
                public final Object invoke(Object obj) {
                    return HomepageSettingsFragment.x0(this.f147966a, (String) obj);
                }
            });
        }
    }
}
