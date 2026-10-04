package androidx.compose.ui.semantics;

import O.B;
import O.C;
import a8.C1453a;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.S;
import androidx.compose.ui.text.Z;
import androidx.compose.ui.text.input.C2348q;
import ed.InterfaceC4376a;
import java.util.List;
import kotlin.A;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlin.collections.H;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.P;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsPropertiesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f104090a;

    static {
        kotlin.reflect.l lVarK = O.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1));
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1);
        P p10 = O.f217893a;
        f104090a = new kotlin.reflect.n[]{lVarK, p10.i(mutablePropertyReference1Impl), s.a(SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, p10), s.a(SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, p10), s.a(SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, p10), s.a(SemanticsPropertiesKt.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, p10), s.a(SemanticsPropertiesKt.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, p10), s.a(SemanticsPropertiesKt.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1, p10), s.a(SemanticsPropertiesKt.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, p10), s.a(SemanticsPropertiesKt.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1, p10), s.a(SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, p10), s.a(SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, p10), s.a(SemanticsPropertiesKt.class, C1453a.f84803e, "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, p10), s.a(SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, p10), s.a(SemanticsPropertiesKt.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, p10), s.a(SemanticsPropertiesKt.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, p10), s.a(SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, p10), s.a(SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1, p10), s.a(SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, p10), s.a(SemanticsPropertiesKt.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, p10), s.a(SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1, p10), s.a(SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1, p10), s.a(SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1, p10), s.a(SemanticsPropertiesKt.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, p10), s.a(SemanticsPropertiesKt.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, p10), s.a(SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1, p10)};
        SemanticsProperties.f104049a.getClass();
        k.f104145a.getClass();
    }

    @NotNull
    public static final C A(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<C> semanticsPropertyKey = SemanticsProperties.f104063o;
        kotlin.reflect.n<Object> nVar = f104090a[7];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static final boolean A0(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<Boolean> semanticsPropertyKey = SemanticsProperties.f104046I;
        kotlin.reflect.n<Object> nVar = f104090a[23];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static /* synthetic */ void A1(u uVar, String str, ed.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        z1(uVar, str, lVar);
    }

    public static Object B(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104063o;
    }

    public static Object B0(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104046I;
    }

    public static final void B1(@NotNull u uVar, @NotNull h hVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<h> semanticsPropertyKey = SemanticsProperties.f104052d;
        kotlin.reflect.n<Object> nVar = f104090a[1];
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, hVar);
    }

    @NotNull
    public static final List<e> C(@NotNull u uVar) {
        k.f104145a.getClass();
        SemanticsPropertyKey<List<e>> semanticsPropertyKey = k.f104169y;
        kotlin.reflect.n<Object> nVar = f104090a[25];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static final boolean C0(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<Boolean> semanticsPropertyKey = SemanticsProperties.f104074z;
        kotlin.reflect.n<Object> nVar = f104090a[15];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static final void C1(@NotNull u uVar, int i10) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<i> semanticsPropertyKey = SemanticsProperties.f104070v;
        kotlin.reflect.n<Object> nVar = f104090a[12];
        i iVar = new i(i10);
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, iVar);
    }

    public static Object D(u uVar) {
        k.f104145a.getClass();
        return k.f104169y;
    }

    public static Object D0(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104074z;
    }

    public static final void D1(@NotNull u uVar, boolean z10) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<Boolean> semanticsPropertyKey = SemanticsProperties.f104041D;
        kotlin.reflect.n<Object> nVar = f104090a[19];
        Boolean boolValueOf = Boolean.valueOf(z10);
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, boolValueOf);
    }

    @NotNull
    public static final AnnotatedString E(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<AnnotatedString> semanticsPropertyKey = SemanticsProperties.f104038A;
        kotlin.reflect.n<Object> nVar = f104090a[16];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static final boolean E0(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<Boolean> semanticsPropertyKey = SemanticsProperties.f104061m;
        kotlin.reflect.n<Object> nVar = f104090a[6];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static final void E1(@NotNull u uVar, @Nullable String str, @Nullable ed.q<? super Integer, ? super Integer, ? super Boolean, Boolean> qVar) {
        k.f104145a.getClass();
        uVar.b(k.f104154j, new a(str, qVar));
    }

    public static Object F(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104038A;
    }

    public static Object F0(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104061m;
    }

    public static /* synthetic */ void F1(u uVar, String str, ed.q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        E1(uVar, str, qVar);
    }

    public static final boolean G(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<Boolean> semanticsPropertyKey = SemanticsProperties.f104060l;
        kotlin.reflect.n<Object> nVar = f104090a[4];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static final void G0(@NotNull u uVar, @Nullable String str, @Nullable ed.l<? super AnnotatedString, Boolean> lVar) {
        k.f104145a.getClass();
        uVar.b(k.f104152h, new a(str, lVar));
    }

    public static final void G1(@NotNull u uVar, boolean z10) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<Boolean> semanticsPropertyKey = SemanticsProperties.f104074z;
        kotlin.reflect.n<Object> nVar = f104090a[15];
        Boolean boolValueOf = Boolean.valueOf(z10);
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, boolValueOf);
    }

    public static Object H(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104060l;
    }

    public static /* synthetic */ void H0(u uVar, String str, ed.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        G0(uVar, str, lVar);
    }

    public static final void H1(@NotNull u uVar, @NotNull String str) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<String> semanticsPropertyKey = SemanticsProperties.f104051c;
        kotlin.reflect.n<Object> nVar = f104090a[0];
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, str);
    }

    @NotNull
    public static final j I(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<j> semanticsPropertyKey = SemanticsProperties.f104066r;
        kotlin.reflect.n<Object> nVar = f104090a[10];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static final void I0(@NotNull u uVar, @Nullable String str, @Nullable InterfaceC4376a<Boolean> interfaceC4376a) {
        k.f104145a.getClass();
        uVar.b(k.f104147c, new a(str, interfaceC4376a));
    }

    public static final void I1(@NotNull u uVar, @NotNull String str) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<String> semanticsPropertyKey = SemanticsProperties.f104071w;
        kotlin.reflect.n<Object> nVar = f104090a[13];
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, str);
    }

    public static Object J(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104066r;
    }

    public static /* synthetic */ void J0(u uVar, String str, InterfaceC4376a interfaceC4376a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        I0(uVar, str, interfaceC4376a);
    }

    public static final void J1(@NotNull u uVar, @NotNull AnnotatedString annotatedString) {
        SemanticsProperties.f104049a.getClass();
        uVar.b(SemanticsProperties.f104072x, H.l(annotatedString));
    }

    @InterfaceC4982o(message = "Pass the ImeAction to onImeAction instead.")
    public static final int K(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<C2348q> semanticsPropertyKey = SemanticsProperties.f104040C;
        kotlin.reflect.n<Object> nVar = f104090a[18];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static final void K0(@NotNull u uVar, int i10, @Nullable String str, @Nullable InterfaceC4376a<Boolean> interfaceC4376a) {
        SemanticsProperties.f104049a.getClass();
        uVar.b(SemanticsProperties.f104040C, new C2348q(i10));
        k.f104145a.getClass();
        uVar.b(k.f104160p, new a(str, interfaceC4376a));
    }

    public static final void K1(@NotNull u uVar, @Nullable String str, @Nullable ed.l<? super AnnotatedString, Boolean> lVar) {
        k.f104145a.getClass();
        uVar.b(k.f104155k, new a(str, lVar));
    }

    @InterfaceC4982o(message = "Pass the ImeAction to onImeAction instead.")
    public static /* synthetic */ void L(u uVar) {
    }

    public static /* synthetic */ void L0(u uVar, int i10, String str, InterfaceC4376a interfaceC4376a, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        K0(uVar, i10, str, interfaceC4376a);
    }

    public static /* synthetic */ void L1(u uVar, String str, ed.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        K1(uVar, str, lVar);
    }

    public static Object M(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104040C;
    }

    public static final void M0(@NotNull u uVar, @Nullable String str, @Nullable InterfaceC4376a<Boolean> interfaceC4376a) {
        k.f104145a.getClass();
        uVar.b(k.f104148d, new a(str, interfaceC4376a));
    }

    public static final void M1(@NotNull u uVar, long j10) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<Z> semanticsPropertyKey = SemanticsProperties.f104039B;
        kotlin.reflect.n<Object> nVar = f104090a[17];
        Z zB = Z.b(j10);
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, zB);
    }

    public static final int N(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<g> semanticsPropertyKey = SemanticsProperties.f104059k;
        kotlin.reflect.n<Object> nVar = f104090a[3];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static /* synthetic */ void N0(u uVar, String str, InterfaceC4376a interfaceC4376a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        M0(uVar, str, interfaceC4376a);
    }

    public static final void N1(@NotNull u uVar, @NotNull AnnotatedString annotatedString) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<AnnotatedString> semanticsPropertyKey = SemanticsProperties.f104073y;
        kotlin.reflect.n<Object> nVar = f104090a[14];
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, annotatedString);
    }

    public static Object O(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104059k;
    }

    public static final void O0(@NotNull u uVar, @Nullable String str, @Nullable InterfaceC4376a<Boolean> interfaceC4376a) {
        k.f104145a.getClass();
        uVar.b(k.f104141B, new a(str, interfaceC4376a));
    }

    public static final void O1(@NotNull u uVar, @Nullable String str, @Nullable ed.l<? super AnnotatedString, Boolean> lVar) {
        k.f104145a.getClass();
        uVar.b(k.f104156l, new a(str, lVar));
    }

    public static final int P(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<Integer> semanticsPropertyKey = SemanticsProperties.f104047J;
        kotlin.reflect.n<Object> nVar = f104090a[24];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static /* synthetic */ void P0(u uVar, String str, InterfaceC4376a interfaceC4376a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        O0(uVar, str, interfaceC4376a);
    }

    public static /* synthetic */ void P1(u uVar, String str, ed.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        O1(uVar, str, lVar);
    }

    public static Object Q(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104047J;
    }

    public static final void Q0(@NotNull u uVar, @Nullable String str, @Nullable InterfaceC4376a<Boolean> interfaceC4376a) {
        k.f104145a.getClass();
        uVar.b(k.f104140A, new a(str, interfaceC4376a));
    }

    public static final void Q1(@NotNull u uVar, @NotNull ToggleableState toggleableState) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<ToggleableState> semanticsPropertyKey = SemanticsProperties.f104042E;
        kotlin.reflect.n<Object> nVar = f104090a[22];
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, toggleableState);
    }

    @NotNull
    public static final String R(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<String> semanticsPropertyKey = SemanticsProperties.f104053e;
        kotlin.reflect.n<Object> nVar = f104090a[2];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static /* synthetic */ void R0(u uVar, String str, InterfaceC4376a interfaceC4376a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        Q0(uVar, str, interfaceC4376a);
    }

    public static final void R1(@NotNull u uVar, boolean z10) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<Boolean> semanticsPropertyKey = SemanticsProperties.f104061m;
        kotlin.reflect.n<Object> nVar = f104090a[6];
        Boolean boolValueOf = Boolean.valueOf(z10);
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, boolValueOf);
    }

    public static Object S(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104053e;
    }

    public static final void S0(@NotNull u uVar, @Nullable String str, @Nullable InterfaceC4376a<Boolean> interfaceC4376a) {
        k.f104145a.getClass();
        uVar.b(k.f104142C, new a(str, interfaceC4376a));
    }

    public static final void S1(@NotNull u uVar, float f10) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<Float> semanticsPropertyKey = SemanticsProperties.f104065q;
        kotlin.reflect.n<Object> nVar = f104090a[9];
        Float fValueOf = Float.valueOf(f10);
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, fValueOf);
    }

    @NotNull
    public static final h T(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<h> semanticsPropertyKey = SemanticsProperties.f104052d;
        kotlin.reflect.n<Object> nVar = f104090a[1];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static /* synthetic */ void T0(u uVar, String str, InterfaceC4376a interfaceC4376a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        S0(uVar, str, interfaceC4376a);
    }

    public static final void T1(@NotNull u uVar, @NotNull j jVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<j> semanticsPropertyKey = SemanticsProperties.f104067s;
        kotlin.reflect.n<Object> nVar = f104090a[11];
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, jVar);
    }

    public static Object U(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104052d;
    }

    public static final void U0(@NotNull u uVar, @Nullable String str, @Nullable InterfaceC4376a<Boolean> interfaceC4376a) {
        k.f104145a.getClass();
        uVar.b(k.f104170z, new a(str, interfaceC4376a));
    }

    public static final void U1(@NotNull u uVar, @Nullable String str, @Nullable ed.l<? super Boolean, Boolean> lVar) {
        k.f104145a.getClass();
        uVar.b(k.f104157m, new a(str, lVar));
    }

    public static final int V(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<i> semanticsPropertyKey = SemanticsProperties.f104070v;
        kotlin.reflect.n<Object> nVar = f104090a[12];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static /* synthetic */ void V0(u uVar, String str, InterfaceC4376a interfaceC4376a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        U0(uVar, str, interfaceC4376a);
    }

    public static /* synthetic */ void V1(u uVar, String str, ed.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        U1(uVar, str, lVar);
    }

    public static Object W(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104070v;
    }

    public static final void W0(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        uVar.b(SemanticsProperties.f104043F, L0.f217464a);
    }

    public static final <T> T W1() {
        throw new UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }

    public static final void X(@NotNull u uVar, @Nullable String str, @NotNull final InterfaceC4376a<Float> interfaceC4376a) {
        k.f104145a.getClass();
        uVar.b(k.f104143D, new a(str, new ed.l<List<Float>, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$getScrollViewportLength$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull List<Float> list) {
                boolean z10;
                Float fInvoke = interfaceC4376a.invoke();
                if (fInvoke == null) {
                    z10 = false;
                } else {
                    list.add(fInvoke);
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        }));
    }

    public static final void X0(@NotNull u uVar, @Nullable String str, @Nullable InterfaceC4376a<Boolean> interfaceC4376a) {
        k.f104145a.getClass();
        uVar.b(k.f104164t, new a(str, interfaceC4376a));
    }

    public static /* synthetic */ void Y(u uVar, String str, InterfaceC4376a interfaceC4376a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        X(uVar, str, interfaceC4376a);
    }

    public static /* synthetic */ void Y0(u uVar, String str, InterfaceC4376a interfaceC4376a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        X0(uVar, str, interfaceC4376a);
    }

    public static final boolean Z(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<Boolean> semanticsPropertyKey = SemanticsProperties.f104041D;
        kotlin.reflect.n<Object> nVar = f104090a[19];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Use `SemanticsPropertyReceiver.onImeAction` instead.", replaceWith = @InterfaceC4852c0(expression = "onImeAction(imeActionType = ImeAction.Default, label = label, action = action)", imports = {"androidx.compose.ui.semantics.onImeAction", "androidx.compose.ui.text.input.ImeAction"}))
    public static final void Z0(@NotNull u uVar, @Nullable String str, @Nullable InterfaceC4376a<Boolean> interfaceC4376a) {
        k.f104145a.getClass();
        uVar.b(k.f104160p, new a(str, interfaceC4376a));
    }

    @NotNull
    public static final <T> SemanticsPropertyKey<T> a(@NotNull String str) {
        return new SemanticsPropertyKey<>(str, true);
    }

    public static Object a0(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104041D;
    }

    public static /* synthetic */ void a1(u uVar, String str, InterfaceC4376a interfaceC4376a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        Z0(uVar, str, interfaceC4376a);
    }

    @NotNull
    public static final <T> SemanticsPropertyKey<T> b(@NotNull String str, @NotNull ed.p<? super T, ? super T, ? extends T> pVar) {
        return new SemanticsPropertyKey<>(str, true, pVar);
    }

    @NotNull
    public static final String b0(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<String> semanticsPropertyKey = SemanticsProperties.f104051c;
        kotlin.reflect.n<Object> nVar = f104090a[0];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static final void b1(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        uVar.b(SemanticsProperties.f104068t, L0.f217464a);
    }

    public static final <T extends A<? extends Boolean>> SemanticsPropertyKey<a<T>> c(String str) {
        return b(str, SemanticsPropertiesKt$ActionPropertyKey$1.f104091d);
    }

    public static Object c0(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104051c;
    }

    public static final void c1(@NotNull u uVar, @Nullable String str, @Nullable InterfaceC4376a<Boolean> interfaceC4376a) {
        k.f104145a.getClass();
        uVar.b(k.f104168x, new a(str, interfaceC4376a));
    }

    public static final /* synthetic */ Object d() {
        W1();
        throw null;
    }

    @NotNull
    public static final String d0(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<String> semanticsPropertyKey = SemanticsProperties.f104071w;
        kotlin.reflect.n<Object> nVar = f104090a[13];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static /* synthetic */ void d1(u uVar, String str, InterfaceC4376a interfaceC4376a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        c1(uVar, str, interfaceC4376a);
    }

    public static final void e(@NotNull u uVar, @Nullable String str, @Nullable InterfaceC4376a<Boolean> interfaceC4376a) {
        k.f104145a.getClass();
        uVar.b(k.f104158n, new a(str, interfaceC4376a));
    }

    public static Object e0(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104071w;
    }

    public static final void e1(@NotNull u uVar, @Nullable String str, @Nullable ed.p<? super Float, ? super Float, Boolean> pVar) {
        k.f104145a.getClass();
        uVar.b(k.f104149e, new a(str, pVar));
    }

    public static /* synthetic */ void f(u uVar, String str, InterfaceC4376a interfaceC4376a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        e(uVar, str, interfaceC4376a);
    }

    @NotNull
    public static final AnnotatedString f0(@NotNull u uVar) {
        W1();
        throw null;
    }

    public static /* synthetic */ void f1(u uVar, String str, ed.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        e1(uVar, str, pVar);
    }

    public static final void g(@NotNull u uVar, @Nullable String str, @Nullable InterfaceC4376a<Boolean> interfaceC4376a) {
        k.f104145a.getClass();
        uVar.b(k.f104166v, new a(str, interfaceC4376a));
    }

    public static final void g0(@NotNull u uVar, @Nullable String str, @Nullable ed.l<? super List<S>, Boolean> lVar) {
        k.f104145a.getClass();
        uVar.b(k.f104146b, new a(str, lVar));
    }

    public static final void g1(@NotNull u uVar, @NotNull ed.p<? super P.g, ? super kotlin.coroutines.e<? super P.g>, ? extends Object> pVar) {
        k.f104145a.getClass();
        uVar.b(k.f104150f, pVar);
    }

    public static /* synthetic */ void h(u uVar, String str, InterfaceC4376a interfaceC4376a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        g(uVar, str, interfaceC4376a);
    }

    public static /* synthetic */ void h0(u uVar, String str, ed.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        g0(uVar, str, lVar);
    }

    public static final void h1(@NotNull u uVar, @Nullable String str, @NotNull ed.l<? super Integer, Boolean> lVar) {
        k.f104145a.getClass();
        uVar.b(k.f104151g, new a(str, lVar));
    }

    public static final void i(@NotNull u uVar, @Nullable String str, @Nullable InterfaceC4376a<Boolean> interfaceC4376a) {
        k.f104145a.getClass();
        uVar.b(k.f104162r, new a(str, interfaceC4376a));
    }

    public static final long i0(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<Z> semanticsPropertyKey = SemanticsProperties.f104039B;
        kotlin.reflect.n<Object> nVar = f104090a[17];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static /* synthetic */ void i1(u uVar, String str, ed.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        h1(uVar, str, lVar);
    }

    public static /* synthetic */ void j(u uVar, String str, InterfaceC4376a interfaceC4376a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        i(uVar, str, interfaceC4376a);
    }

    public static Object j0(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104039B;
    }

    public static final void j1(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        uVar.b(SemanticsProperties.f104054f, L0.f217464a);
    }

    public static final void k(@NotNull u uVar, @Nullable String str, @Nullable InterfaceC4376a<Boolean> interfaceC4376a) {
        k.f104145a.getClass();
        uVar.b(k.f104163s, new a(str, interfaceC4376a));
    }

    @NotNull
    public static final AnnotatedString k0(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<AnnotatedString> semanticsPropertyKey = SemanticsProperties.f104073y;
        kotlin.reflect.n<Object> nVar = f104090a[14];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static final void k1(@NotNull u uVar, @NotNull b bVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<b> semanticsPropertyKey = SemanticsProperties.f104055g;
        kotlin.reflect.n<Object> nVar = f104090a[20];
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, bVar);
    }

    public static /* synthetic */ void l(u uVar, String str, InterfaceC4376a interfaceC4376a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        k(uVar, str, interfaceC4376a);
    }

    public static Object l0(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104073y;
    }

    public static final void l1(@NotNull u uVar, @NotNull c cVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<c> semanticsPropertyKey = SemanticsProperties.f104056h;
        kotlin.reflect.n<Object> nVar = f104090a[21];
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, cVar);
    }

    public static final void m(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        uVar.b(SemanticsProperties.f104069u, L0.f217464a);
    }

    @NotNull
    public static final ToggleableState m0(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<ToggleableState> semanticsPropertyKey = SemanticsProperties.f104042E;
        kotlin.reflect.n<Object> nVar = f104090a[22];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static final void m1(@NotNull u uVar, boolean z10) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<Boolean> semanticsPropertyKey = SemanticsProperties.f104061m;
        kotlin.reflect.n<Object> nVar = f104090a[5];
        Boolean boolValueOf = Boolean.valueOf(z10);
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, boolValueOf);
    }

    public static final void n(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        uVar.b(SemanticsProperties.f104058j, L0.f217464a);
    }

    public static Object n0(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104042E;
    }

    public static final void n1(@NotNull u uVar, int i10) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<B> semanticsPropertyKey = SemanticsProperties.f104064p;
        kotlin.reflect.n<Object> nVar = f104090a[8];
        B b10 = new B(i10);
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, b10);
    }

    public static final void o(@NotNull u uVar, @Nullable String str, @Nullable InterfaceC4376a<Boolean> interfaceC4376a) {
        k.f104145a.getClass();
        uVar.b(k.f104167w, new a(str, interfaceC4376a));
    }

    public static final float o0(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<Float> semanticsPropertyKey = SemanticsProperties.f104065q;
        kotlin.reflect.n<Object> nVar = f104090a[9];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static final void o1(@NotNull u uVar, @NotNull String str) {
        SemanticsProperties.f104049a.getClass();
        uVar.b(SemanticsProperties.f104050b, H.l(str));
    }

    public static /* synthetic */ void p(u uVar, String str, InterfaceC4376a interfaceC4376a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        o(uVar, str, interfaceC4376a);
    }

    public static Object p0(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104065q;
    }

    public static final void p1(@NotNull u uVar, @NotNull C c10) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<C> semanticsPropertyKey = SemanticsProperties.f104063o;
        kotlin.reflect.n<Object> nVar = f104090a[7];
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, c10);
    }

    public static final void q(@NotNull u uVar, @NotNull String str) {
        SemanticsProperties.f104049a.getClass();
        uVar.b(SemanticsProperties.f104044G, str);
    }

    @NotNull
    public static final j q0(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<j> semanticsPropertyKey = SemanticsProperties.f104067s;
        kotlin.reflect.n<Object> nVar = f104090a[11];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static final void q1(@NotNull u uVar, @NotNull List<e> list) {
        k.f104145a.getClass();
        SemanticsPropertyKey<List<e>> semanticsPropertyKey = k.f104169y;
        kotlin.reflect.n<Object> nVar = f104090a[25];
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, list);
    }

    public static final void r(@NotNull u uVar, @Nullable String str, @Nullable InterfaceC4376a<Boolean> interfaceC4376a) {
        k.f104145a.getClass();
        uVar.b(k.f104165u, new a(str, interfaceC4376a));
    }

    public static Object r0(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104067s;
    }

    public static final void r1(@NotNull u uVar, boolean z10) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<Boolean> semanticsPropertyKey = SemanticsProperties.f104046I;
        kotlin.reflect.n<Object> nVar = f104090a[23];
        Boolean boolValueOf = Boolean.valueOf(z10);
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, boolValueOf);
    }

    public static /* synthetic */ void s(u uVar, String str, InterfaceC4376a interfaceC4376a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        r(uVar, str, interfaceC4376a);
    }

    public static final void s0(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        uVar.b(SemanticsProperties.f104057i, L0.f217464a);
    }

    public static final void s1(@NotNull u uVar, @NotNull AnnotatedString annotatedString) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<AnnotatedString> semanticsPropertyKey = SemanticsProperties.f104038A;
        kotlin.reflect.n<Object> nVar = f104090a[16];
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, annotatedString);
    }

    @NotNull
    public static final b t(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<b> semanticsPropertyKey = SemanticsProperties.f104055g;
        kotlin.reflect.n<Object> nVar = f104090a[20];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static final void t0(@NotNull u uVar, @NotNull ed.l<Object, Integer> lVar) {
        SemanticsProperties.f104049a.getClass();
        uVar.b(SemanticsProperties.f104045H, lVar);
    }

    public static final void t1(@NotNull u uVar, boolean z10) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<Boolean> semanticsPropertyKey = SemanticsProperties.f104060l;
        kotlin.reflect.n<Object> nVar = f104090a[4];
        Boolean boolValueOf = Boolean.valueOf(z10);
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, boolValueOf);
    }

    public static Object u(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104055g;
    }

    public static final void u0(@NotNull u uVar, @Nullable String str, @Nullable ed.l<? super AnnotatedString, Boolean> lVar) {
        k.f104145a.getClass();
        uVar.b(k.f104159o, new a(str, lVar));
    }

    public static final void u1(@NotNull u uVar, @NotNull j jVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<j> semanticsPropertyKey = SemanticsProperties.f104066r;
        kotlin.reflect.n<Object> nVar = f104090a[10];
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, jVar);
    }

    @NotNull
    public static final c v(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<c> semanticsPropertyKey = SemanticsProperties.f104056h;
        kotlin.reflect.n<Object> nVar = f104090a[21];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static /* synthetic */ void v0(u uVar, String str, ed.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        u0(uVar, str, lVar);
    }

    @InterfaceC4982o(message = "Pass the ImeAction to onImeAction instead.")
    public static final void v1(@NotNull u uVar, int i10) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<C2348q> semanticsPropertyKey = SemanticsProperties.f104040C;
        kotlin.reflect.n<Object> nVar = f104090a[18];
        C2348q c2348q = new C2348q(i10);
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, c2348q);
    }

    public static Object w(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104056h;
    }

    @androidx.compose.ui.i
    public static final void w0(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        uVar.b(SemanticsProperties.f104062n, L0.f217464a);
    }

    public static final void w1(@NotNull u uVar, int i10) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<g> semanticsPropertyKey = SemanticsProperties.f104059k;
        kotlin.reflect.n<Object> nVar = f104090a[3];
        g gVar = new g(i10);
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, gVar);
    }

    public static final int x(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<B> semanticsPropertyKey = SemanticsProperties.f104064p;
        kotlin.reflect.n<Object> nVar = f104090a[8];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static final boolean x0(@NotNull u uVar) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<Boolean> semanticsPropertyKey = SemanticsProperties.f104061m;
        kotlin.reflect.n<Object> nVar = f104090a[5];
        semanticsPropertyKey.getClass();
        d();
        throw null;
    }

    public static final void x1(@NotNull u uVar, int i10) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<Integer> semanticsPropertyKey = SemanticsProperties.f104047J;
        kotlin.reflect.n<Object> nVar = f104090a[24];
        Integer numValueOf = Integer.valueOf(i10);
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, numValueOf);
    }

    public static Object y(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104064p;
    }

    @InterfaceC4982o(message = "Use `isTraversalGroup` instead.", replaceWith = @InterfaceC4852c0(expression = "isTraversalGroup", imports = {}))
    public static /* synthetic */ void y0(u uVar) {
    }

    public static final void y1(@NotNull u uVar, @NotNull String str) {
        SemanticsProperties.f104049a.getClass();
        SemanticsPropertyKey<String> semanticsPropertyKey = SemanticsProperties.f104053e;
        kotlin.reflect.n<Object> nVar = f104090a[2];
        semanticsPropertyKey.getClass();
        uVar.b(semanticsPropertyKey, str);
    }

    @NotNull
    public static final String z(@NotNull u uVar) {
        W1();
        throw null;
    }

    public static Object z0(u uVar) {
        SemanticsProperties.f104049a.getClass();
        return SemanticsProperties.f104061m;
    }

    public static final void z1(@NotNull u uVar, @Nullable String str, @Nullable ed.l<? super Float, Boolean> lVar) {
        k.f104145a.getClass();
        uVar.b(k.f104153i, new a(str, lVar));
    }
}
